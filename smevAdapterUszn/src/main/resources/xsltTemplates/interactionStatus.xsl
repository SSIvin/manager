<!-- Created with Liquid Studio 2020 (https://www.liquid-technologies.com) -->
<!--ALT0160 - неразрывный пробел-->
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <!--interactionStatus-->
    <xsl:template match="interactionStatus">
        <div>
            <u><xsl:apply-templates select="statusReport"/></u>
        </div>
        <xsl:apply-templates select="rejectReport"/>
        <xsl:apply-templates select="errorReport"/>
    </xsl:template>


    <xsl:template match="statusReport" priority="1">
        <p/>
        <div>
            <table class="table2">
                <tr class="tr2">
                    <td class="td2" width="400">
                        <b>Статус:</b>
                    </td>
                    <td class="td2">
                        <xsl:value-of select="desc"/>:
                        <xsl:call-template name="dateTimeMy">
                            <xsl:with-param name="value" select="@statusDate"/>
                        </xsl:call-template>
                    </td>
                </tr>
            </table>
        </div>
    </xsl:template>

    <xsl:template match="rejectReport" priority="2">
        <p/>
        <div>
            <table class="table2">
                <tr class="tr2">
                    <td class="td2" width="400">
                        <b>Возврат:</b>
                    </td>
                    <td class="td2">
                        Дата получения:
                        <xsl:call-template name="dateTimeMy">
                            <xsl:with-param name="value" select="@rejectDate"/>
                        </xsl:call-template>
                        <br/>
                        Код ошибки:<xsl:value-of select="code"/>
                        <br/>
                        Описание ошибки:<xsl:value-of select="desc"/>
                    </td>
                </tr>
            </table>
        </div>
    </xsl:template>

    <xsl:template match="errorReport" priority="3">
        <p/>
        <div>
            <table class="table2">
                <tr class="tr2">
                    <td class="td2" width="400">
                        <b>Ошибка:</b>
                    </td>
                    <td class="td2">
                        Дата получения:
                        <xsl:call-template name="dateTimeMy">
                            <xsl:with-param name="value" select="@errorDate"/>
                        </xsl:call-template>
                        <br/>
                        Описание ошибки:<xsl:value-of select="desc"/>
                        <br/>
                        Код ошибки<xsl:value-of select="code"/>
                    </td>
                </tr>
            </table>
        </div>
    </xsl:template>


</xsl:stylesheet>
