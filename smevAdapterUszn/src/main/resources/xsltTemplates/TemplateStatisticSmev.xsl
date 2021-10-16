<!--ALT0160 - неразрывный пробел-->
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:import href="reportTemplate.xsl"/>
    <!--<xsl:import href="reportTemplate.xsl"/>-->

    <xsl:template match="/">
        <xsl:call-template name="rootOsn">
            <xsl:with-param name="title" select='"Статистика запросов в СМЭВ"'/>
        </xsl:call-template>
    </xsl:template>


    <xsl:template match="Data">
        <html>
            <!--оформление отчета-->
            <xsl:call-template name="reportStyle">
                <xsl:with-param name="fileNameCss" select='"styleOsnReport.css"'/>
            </xsl:call-template>
            <xsl:variable name="Req" select="sum(rowStatSmev/kolReq)" />
            <xsl:variable name="Resp" select="sum(rowStatSmev/kolResp)" />
            <body>
                <table width="100%" border="1">
                    <thead>
                        <TR bgcolor="#FFCCCC">
                            <th width="60%" id="nameQ">Наименование вида сведений</th>
                            <th width="20%" id="kolReq">Количество запросов</th>
                            <th width="20%" id="kolResp">Количество ответов*</th>
                        </TR>
                    </thead>
                    <tbody>
                        <xsl:for-each select="rowStatSmev">
                            <TR>
                                <TD width="60%">
                                    <xsl:value-of select="nameQ"/>
                                </TD>
                                <TD width="20%">
                                    <xsl:value-of select="kolReq"/>
                                </TD>
                                <TD width="20%">
                                    <xsl:value-of select="kolResp"/>
                                </TD>
                            </TR>



                        </xsl:for-each>
                        <TR>
                            <TD width="60%" style="text-align:right">
                                <b>
                                    <xsl:value-of select='"Итого"'/>
                                </b>
                            </TD>
                            <TD width="60%">
                                <b><xsl:value-of select="format-number($Req, '0')"/></b>
                            </TD>
                            <TD width="60%">
                                <b><xsl:value-of select="format-number($Resp, '0')"/></b>
                            </TD>
                        </TR>
                    </tbody>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
