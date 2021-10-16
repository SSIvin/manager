<!-- Created with Liquid Studio 2020 (https://www.liquid-technologies.com) -->
<!--ALT0160 - неразрывный пробел-->
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:import href="reportTemplate.xsl"/>

    <xsl:template match="/">
        <xsl:call-template name="root">
            <xsl:with-param
                    name="title"
                    select='"Сведения о регистрации по месту жительства граждан РФ"'/>
        </xsl:call-template>
    </xsl:template>


    <!--Запрос-->
    <xsl:template match="reportRequest">
       <b>Сведения физического лица: </b> <br/>
        Фамилия: <xsl:value-of select="MessagePrimaryContent/livingPlaceRegistrationRequest/personInfo/lastName"/>
       <br/>
        Имя: <xsl:value-of select="MessagePrimaryContent/livingPlaceRegistrationRequest/personInfo/firstName"/>
        <br/>
        <xsl:if test="MessagePrimaryContent/livingPlaceRegistrationRequest/personInfo/middleName!=''">
            Отчество: <xsl:value-of select="MessagePrimaryContent/livingPlaceRegistrationRequest/personInfo/middleName"/>
            <br/>
        </xsl:if>
        Дата рождения:
        <xsl:call-template name="dateMy">
            <xsl:with-param name="value" select="MessagePrimaryContent/livingPlaceRegistrationRequest/personInfo/birthDate"/>
        </xsl:call-template>
        <br/>
        Тип документа:
        <xsl:call-template name="TYPE_DOC">
            <xsl:with-param
                    name="t"
                    select="MessagePrimaryContent/livingPlaceRegistrationRequest/document"/>
        </xsl:call-template>
    </xsl:template>

    <xsl:template name="TYPE_DOC">
        <xsl:param name="t"/>
        <!--<xsl:value-of select="$t/russianPassport/series"/>-->
        <xsl:choose>
            <xsl:when test="$t/russianPassport">
                Паспорт гр.РФ:<xsl:call-template name="DOC_PARAM">
                    <xsl:with-param name="param1" select="$t/russianPassport"/>
                </xsl:call-template>
            </xsl:when>
            <xsl:when test="$t/foreignPassport">
                Загранпаспорт гр.РФ:<xsl:call-template name="DOC_PARAM">
                <xsl:with-param name="param1" select="$t/foreignPassport"/>
            </xsl:call-template>
            </xsl:when>
            <xsl:when test="$t/birthCertificate">
                Свидетельство о рождении:<xsl:call-template name="DOC_PARAM">
                <xsl:with-param name="param1" select="$t/birthCertificate"/>
            </xsl:call-template>
            </xsl:when>
        </xsl:choose>
    </xsl:template>

    <xsl:template name="DOC_PARAM">
        <xsl:param name="param1"/>
        <!--<xsl:value-of select="$t/russianPassport/series"/>-->
        <xsl:value-of select="$param1/series"/>/<xsl:value-of select="$param1/number"/>
        <br/>
        Дата выдачи:
        <xsl:call-template name="dateMy">
            <xsl:with-param name="value" select="$param1/issueDate"/>
        </xsl:call-template>
    </xsl:template>

    <!--Запрос****************************************************************************-->


    <!--Ответ**********************************************************************************-->
    <xsl:template match="reportResponse">
        <table class="table2">
            <tr class="tr2">
                <td class="td2" width="400">
                    <b>Ответ:</b>
                    <xsl:value-of select="@responseId"/>
                </td>
                <td class="td2">
                    Дата получения:
                    <xsl:call-template name="dateTimeMy">
                        <xsl:with-param name="value" select="@responseCreateDate"/>
                    </xsl:call-template>
                </td>
            </tr>
        </table>
        <br/>
        <xsl:if test="livingPlaceRegistrationResponse/notFoundRegistration">
            <b>Статус обработки запроса:</b> Информация о регистрации не найдена
            <br/>
        </xsl:if>
       <xsl:apply-templates select="livingPlaceRegistrationResponse/registrationInfo"/>
    </xsl:template>

    <xsl:template match="registrationInfo">
        <table class="table1">
            <xsl:call-template name="tableInsertRow">
                <xsl:with-param name="col1"
                                select="'Описание ответа на запрос о регистрации по месту жительства граждан РФ'"/>
                <xsl:with-param name="col2" select='"title"'/>
                <xsl:with-param name="color" select='"F3B19C"'/>
            </xsl:call-template>

            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"Код субъекта федерации по ОКАТО"'/>
                </td>
                <td class="td1" width="400">
                    <xsl:value-of select="regionOktmo"/>
                </td>
            </tr>
            <xsl:if test="district!=''">
                <tr class="tr1">
                    <td class="td1" width="400">
                        <xsl:value-of select='"Район"'/>
                    </td>
                    <td class="td1" width="400">
                        <xsl:value-of select="district"/>
                    </td>
                </tr>
            </xsl:if>

            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"Населенный пункт"'/>
                </td>
                <td class="td1" width="400">
                    <xsl:value-of select="settlement"/>
                </td>
            </tr>
            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"Улица"'/>
                </td>
                <td class="td1" width="400">
                    <xsl:value-of select="street"/>
                </td>
            </tr>
            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"Дом"'/>
                </td>
                <td class="td1" width="400">
                    <xsl:value-of select="house"/>
                </td>
            </tr>
            <xsl:if test="building!=''">
                <tr class="tr1">
                    <td class="td1" width="400">
                        <xsl:value-of select='"Корпус"'/>
                    </td>
                    <td class="td1" width="400">
                        <xsl:value-of select="building"/>
                    </td>
                </tr>
            </xsl:if>
            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"Квартира"'/>
                </td>
                <td class="td1" width="400">
                    <xsl:value-of select="flat"/>
                </td>
            </tr>

            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"Дата начала срока регистрации"'/>
                </td>
                <td class="td1" width="400">
                    <xsl:call-template name="dateMy">
                        <xsl:with-param name="value" select="registrationDateFrom"/>
                    </xsl:call-template>
                </td>
            </tr>
            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"Регион"'/>
                </td>
                <td class="td1" width="400">
                    <xsl:value-of select="region"/>
                </td>
            </tr>
            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"Неструктурированный адрес"'/>
                </td>
                <td class="td1" width="400">
                    <xsl:value-of select="unstructuredAddress"/>
                </td>
            </tr>
            <xsl:if test="registrationDateTo!=''">
                <tr class="tr1">
                    <td class="td1" width="400">
                        <xsl:value-of select='"Дата окончания срока регистрации"'/>
                    </td>
                    <td class="td1" width="400">
                        <xsl:call-template name="dateMy">
                            <xsl:with-param name="value" select="registrationDateTo"/>
                        </xsl:call-template>
                    </td>
                </tr>
            </xsl:if>

        </table>
    </xsl:template>
</xsl:stylesheet>
