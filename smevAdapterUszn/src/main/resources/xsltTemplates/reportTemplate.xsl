<!-- Created with Liquid Studio 2020 (https://www.liquid-technologies.com) -->
<!--ALT0160 - неразрывный пробел-->
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:import href="interactionStatus.xsl"/>
    <xsl:import href="Dic.xsl"/>
    <xsl:import href="util.xsl"/>
    <xsl:output method="html" encoding="UTF-8" doctype-public="-//W3C//DTD HTML 4.01//EN"
                doctype-system="http://www/w3c.org/TR/html4/strict.dtd"
                indent="yes"/>
    <xsl:decimal-format name="rub" decimal-separator="," grouping-separator="."/>

    <xsl:template name="root">
        <xsl:param name="title"/>
        <html>
            <!--оформление отчета-->
            <xsl:call-template name="reportStyle">
                <xsl:with-param name="fileNameCss" select='"style.css"'/>
            </xsl:call-template>
            <body>
                <xsl:call-template name="reportTitle">
                    <xsl:with-param name="value" select="$title"/>
                </xsl:call-template>
                <xsl:call-template name="reportRequestHeader"/>

                <div class="data"><xsl:apply-templates select="ReportPrint/reportRequest"/></div>
                <xsl:apply-templates select="ReportPrint/interactionStatus"/>
                <br/>
                <div><xsl:apply-templates select="ReportPrint/reportResponse"/></div>

                <xsl:call-template name="reportFooter"/>
            </body>
        </html>
    </xsl:template>

    <!--типичный отчет-->
    <xsl:template name="rootOsn">
        <xsl:param name="title"/>
        <html>
            <!--оформление отчета-->
            <xsl:call-template name="reportStyle">
                <xsl:with-param name="fileNameCss" select='"styleOsnReport.css"'/>
            </xsl:call-template>
            <body>
                <xsl:call-template name="OrgName">
                    <xsl:with-param name="value" select="ReportStatSmev/OrgParam/nameOrganization"/>
                </xsl:call-template>

                <div align="center">
                    <b>
                        <xsl:value-of select="$title"/> за период
                        <xsl:call-template name="dateMy">
                            <xsl:with-param name="value" select="ReportStatSmev/dateBegin"/>
                        </xsl:call-template>
                        -
                        <xsl:call-template name="dateMy">
                            <xsl:with-param name="value" select="ReportStatSmev/dateEnd"/>
                        </xsl:call-template>
                    </b>
                </div>
                <!--<xsl:call-template name="reportRequestHeader"/>-->
                <div class="data"><xsl:apply-templates select="ReportStatSmev/Data"/></div>
                <!--<xsl:apply-templates select="ReportPrint/interactionStatus"/>-->
                <br/>
                <!--<div><xsl:apply-templates select="ReportPrint/reportResponse"/></div>-->

                <xsl:call-template name="reportFooter"/>
                <xsl:call-template name="reportFooterDate"/>
            </body>
        </html>
    </xsl:template>


    <xsl:template name="reportRequestHeader">
            <table class="table2">
                <tr class="tr2">
                    <td class="td2" width="400">
                        <b>Запрос: </b>
                        <xsl:value-of select="ReportPrint/reportRequest/@requestId"/>
                    </td>
                    <td class="td2">
                        Исполнитель запроса:
                        <xsl:value-of select="ReportPrint/reportRequest/@userName"/>
                        <br/>
                        Дата создания:
                        <xsl:call-template name="dateTimeMy">
                            <xsl:with-param name="value" select="ReportPrint/reportRequest/@requestCreateDate"/>
                        </xsl:call-template>
                    </td>
                </tr>
            </table>
    </xsl:template>

    <xsl:template name="reportTitle">
        <xsl:param name="value"/>
        <p align="center">
            <b>
                <xsl:value-of select="$value"/>
                <br>от
                    <xsl:call-template name="dateMy">
                        <xsl:with-param name="value" select="current-date()"/>
                    </xsl:call-template>
                </br>
            </b>
        </p>
    </xsl:template>

    <xsl:template name="OrgName">
        <xsl:param name="value"/>
        <div align="center">
                <xsl:value-of select="$value"/>
        </div>
    </xsl:template>


    <xsl:template name="reportFooter">
        <br/>
        <br/>
        <br/>
        <br/>
        <div>
            <xsl:value-of select='"Специалист _________________________________      _________________"'/>
        </div>
    </xsl:template>

    <xsl:template name="reportFooterDate">
        <br/>
        <div>
            Дата: <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="current-date()"/>
            </xsl:call-template>
        </div>
    </xsl:template>

</xsl:stylesheet>
