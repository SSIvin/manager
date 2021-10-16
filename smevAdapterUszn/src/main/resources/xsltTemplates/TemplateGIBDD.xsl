<!-- Created with Liquid Studio 2020 (https://www.liquid-technologies.com) -->
<!--ALT0160 - неразрывный пробел-->
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:import href="reportTemplate.xsl"/>

    <xsl:template match="/">
        <xsl:call-template name="root">
            <xsl:with-param
                    name="title"
                    select='"Сведения об отдельных атрибутах зарегистрированных транспортных средств (год выпуска, категория и мощность двигателя)"'/>
        </xsl:call-template>
    </xsl:template>


    <!--Запрос-->
    <xsl:template match="reportRequest">
       <b>Сведения физического лица: </b> <br/>
        Фамилия: <xsl:value-of select="MessagePrimaryContent/RequestBenefit489/OwnerLastName"/>
       <br/>
        Имя: <xsl:value-of select="MessagePrimaryContent/RequestBenefit489/OwnerFirstName"/>
        <br/>
        <xsl:if test="MessagePrimaryContent/RequestBenefit489/OwnerMiddleName!=''">
            Отчество: <xsl:value-of select="MessagePrimaryContent/RequestBenefit489/OwnerMiddleName"/>
            <br/>
        </xsl:if>
        Дата рождения:
        <xsl:call-template name="dateMy">
            <xsl:with-param name="value" select="MessagePrimaryContent/RequestBenefit489/OwnerBirthDate"/>
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
        <b>Статус обработки запроса:</b> <xsl:value-of select="ResponseBenefit489/status"/>
        <br/>
        <xsl:if test="ResponseBenefit489/errorText!=''">
            Ошибка обработки: <xsl:value-of select="ResponseBenefit489/errorText"/>
            <br/>
        </xsl:if>
       <xsl:apply-templates select="ResponseBenefit489/ResponseBenefitData"/>
    </xsl:template>

    <xsl:template match="ResponseBenefitData">
        <table class="table1">
            <xsl:call-template name="tableInsertRow">
                <xsl:with-param name="col1"
                                select="'Описание ответа на запрос'"/>
                <xsl:with-param name="col2" select='"title"'/>
                <xsl:with-param name="color" select='"F3B19C"'/>
            </xsl:call-template>

            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"Уникальный номер ТС в базе ГИБДД"'/>
                </td>
                <td class="td1" width="400">
                    <xsl:value-of select="GUID"/>
                </td>
            </tr>
            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"Уникальный номер записи"'/>
                </td>
                <td class="td1" width="400">
                    <xsl:value-of select="UniqueRowNumber"/>
                </td>
            </tr>
            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"Категория ТС"'/>
                </td>
                <td class="td1" width="400">
                    <xsl:value-of select="Category"/>
                </td>
            </tr>
            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"Год выпуска"'/>
                </td>
                <td class="td1" width="400">
                    <xsl:value-of select="ManufacturedYear"/>
                </td>
            </tr>
            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"Мощность (л.с.)"'/>
                </td>
                <td class="td1" width="400">
                    <xsl:value-of select="EnginePowerHorse"/>
                </td>
            </tr>
            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"Мощность (кВт)"'/>
                </td>
                <td class="td1" width="400">
                   <xsl:value-of select="EnginePowerkVt"/>
                </td>
            </tr>
            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"Серия и номер свидетельства о регистрации"'/>
                </td>
                <td class="td1" width="400">
                    <xsl:value-of select="RegDocSeriesNumber"/>
                </td>
            </tr>
            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"Место рождения собственника"'/>
                </td>
                <td class="td1" width="400">
                    <xsl:value-of select="OwnerBirthPlace"/>
                </td>
            </tr>
        </table>
    </xsl:template>
</xsl:stylesheet>
