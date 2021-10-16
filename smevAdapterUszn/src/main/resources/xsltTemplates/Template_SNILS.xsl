<!-- Created with Liquid Studio 2020 (https://www.liquid-technologies.com) -->
<!--ALT0160 - неразрывный пробел-->
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:import href="reportTemplate.xsl"/>

    <xsl:template match="/">
        <xsl:call-template name="root">
            <xsl:with-param
                    name="title"
                    select='"Сведения о предоставлении страхового номера индивидуального лицевого счёта (СНИЛС) застрахованного лица"'/>
        </xsl:call-template>
    </xsl:template>


    <!--Запрос-->
    <xsl:template match="reportRequest">
       <b>Сведения физического лица: </b> <br/>
        Фамилия: <xsl:value-of select="MessagePrimaryContent/SnilsByAdditionalDataRequest/FamilyName"/>
       <br/>
        Имя: <xsl:value-of select="MessagePrimaryContent/SnilsByAdditionalDataRequest/FirstName"/>
        <br/>
        <xsl:if test="MessagePrimaryContent/SnilsByAdditionalDataRequest/Patronymic!=''">
            Отчество: <xsl:value-of select="MessagePrimaryContent/SnilsByAdditionalDataRequest/Patronymic"/>
            <br/>
        </xsl:if>
        Дата рождения:
        <xsl:call-template name="dateMy">
            <xsl:with-param name="value" select="MessagePrimaryContent/SnilsByAdditionalDataRequest/BirthDate"/>
        </xsl:call-template>
        <br/>

        <xsl:variable name="gender">
            <xsl:call-template name="GenderMy">
                <xsl:with-param name="value" select="MessagePrimaryContent/SnilsByAdditionalDataRequest/Gender"/>
            </xsl:call-template>
        </xsl:variable>
        Пол:
        <xsl:value-of select="$gender"></xsl:value-of>
        <br/>
        Тип документа:
        <xsl:call-template name="TYPE_DOC">
            <xsl:with-param
                    name="t"
                    select="MessagePrimaryContent/SnilsByAdditionalDataRequest"/>
        </xsl:call-template>
    </xsl:template>

    <xsl:template name="TYPE_DOC">
        <xsl:param name="t"/>
        <xsl:choose>
            <xsl:when test="$t/PassportRF">
                ПАСПОРТ РОССИИ:<xsl:call-template name="DOC_PARAM">
                    <xsl:with-param name="param1" select="$t/PassportRF"/>
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
        <xsl:value-of select="$param1/Series"/>/<xsl:value-of select="$param1/Number"/>
        <br/>
        Дата выдачи:
        <xsl:call-template name="dateMy">
            <xsl:with-param name="value" select="$param1/IssueDate"/>
        </xsl:call-template>
        <br/>
        Кем выдан:
        <xsl:value-of select="$param1/Issuer"/>
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
       <xsl:apply-templates select="SnilsByAdditionalDataResponse"/>
    </xsl:template>

    <xsl:template match="SnilsByAdditionalDataResponse">
        <table class="table1">
            <xsl:call-template name="tableInsertRow">
                <xsl:with-param name="col1"
                                select="'Данные ответа на запрос'"/>
                <xsl:with-param name="col2" select='"title"'/>
                <xsl:with-param name="color" select='"9CDEF3"'/>
            </xsl:call-template>

            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"Фамилия"'/>
                </td>
                <td class="td1" width="400">
                    <xsl:value-of select="FamilyName"/>
                </td>
            </tr>
                <tr class="tr1">
                    <td class="td1" width="400">
                        <xsl:value-of select='"Имя"'/>
                    </td>
                    <td class="td1" width="400">
                        <xsl:value-of select="FirstName"/>
                    </td>
                </tr>

            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"Отчество"'/>
                </td>
                <td class="td1" width="400">
                    <xsl:value-of select="Patronymic"/>
                </td>
            </tr>
            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"Дата рождения"'/>
                </td>
                <td class="td1" width="400">
                    <xsl:call-template name="dateMy">
                        <xsl:with-param name="value" select="BirthDate"/>
                    </xsl:call-template>
                </td>
            </tr>

            <tr class="tr1">
                <td class="td1" width="400">
                    <b><xsl:value-of select='"СНИЛС"'/></b>
                </td>
                <td class="td1" width="400">
                    <b><xsl:value-of select="Snils"/></b>
                </td>
            </tr>
        </table>
    </xsl:template>
</xsl:stylesheet>
