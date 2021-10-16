<!-- Created with Liquid Studio 2020 (https://www.liquid-technologies.com) -->
<!--ALT0160 - неразрывный пробел-->
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:import href="reportTemplate.xsl"/>

    <xsl:template match="/">
        <xsl:call-template name="root">
            <xsl:with-param
                    name="title"
                    select='"Сведения Об ИНН физического лица"'/>
        </xsl:call-template>
    </xsl:template>


    <!--Запрос-->
    <xsl:template match="reportRequest">
       <b>Сведения физического лица: </b> <br/>
        Фамилия: <xsl:value-of select="MessagePrimaryContent/FNSINNSingularRequest/СведФЛ/ФИО/@Фамилия"/>
       <br/>
        Имя: <xsl:value-of select="MessagePrimaryContent/FNSINNSingularRequest/СведФЛ/ФИО/@Имя"/>
        <br/>
        <xsl:if test="MessagePrimaryContent/FNSINNSingularRequest/СведФЛ/ФИО/@Отчество !=''">
            Отчество: <xsl:value-of select="MessagePrimaryContent/FNSINNSingularRequest/СведФЛ/ФИО/@Отчество"/>
            <br/>
        </xsl:if>
        Дата рождения:
        <xsl:call-template name="dateMy">
            <xsl:with-param name="value" select="MessagePrimaryContent/FNSINNSingularRequest/СведФЛ/@ДатаРожд"/>
        </xsl:call-template>
        <br/>
        Тип документа:
        <xsl:call-template name="FnsSourceDoc">
            <xsl:with-param name="kodDoc" select="MessagePrimaryContent/FNSINNSingularRequest/СведФЛ/УдЛичнФЛ/@КодВидДок"/>
        </xsl:call-template>
        <br/>
        Серия/Номер:
        <xsl:value-of select="MessagePrimaryContent/FNSINNSingularRequest/СведФЛ/УдЛичнФЛ/@СерНомДок"/>
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
       <xsl:apply-templates select="FNSINNSingularResponse"/>
    </xsl:template>

    <xsl:template match="FNSINNSingularResponse">
        <table class="table1">
            <xsl:call-template name="tableInsertRow">
                <xsl:with-param name="col1"
                                select="'Данные ответа на запрос'"/>
                <xsl:with-param name="col2" select='"title"'/>
                <xsl:with-param name="color" select='"F3B19C"'/>
            </xsl:call-template>

            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"ИНН"'/>
                </td>

                <td class="td1" width="400">
                    <xsl:if test="@ИННФЛ">
                        <xsl:value-of select="@ИННФЛ"/>
                        <br/>
                    </xsl:if>
                    <xsl:if test="not(@ИННФЛ)">
                        Запрашиваемая информация отсутствует
                        <br/>
                    </xsl:if>
                </td>
            </tr>
        </table>
    </xsl:template>
</xsl:stylesheet>
