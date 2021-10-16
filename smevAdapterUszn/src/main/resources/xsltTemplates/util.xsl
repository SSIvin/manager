<!-- Created with Liquid Studio 2020 (https://www.liquid-technologies.com) -->
<!--ALT0160 - неразрывный пробел-->
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:template name="reportStyle">
        <xsl:param name="fileNameCss"/>
        <style type="text/css">
            <xsl:text>&#10;</xsl:text>
            <xsl:copy-of
                    select="unparsed-text($fileNameCss)"/>
        </style>
    </xsl:template>

    <xsl:template name="curr">
        <xsl:param name="value"/>
        <xsl:if test="not(string($value)='')">
            <xsl:value-of select="format-number($value, '###.###,00', 'rub')"/> 
        </xsl:if>

    </xsl:template>

    <xsl:template name="BooleanMy">
        <xsl:param name="value"/>
        <xsl:if test="$value='true'">
            <xsl:value-of select='"Да"'/>
        </xsl:if>
        <xsl:if test="$value='false'">
            <xsl:value-of select='"Нет"'/>
        </xsl:if>
    </xsl:template>

    <xsl:template name="GenderMy">
        <xsl:param name="value"/>
        <xsl:if test="$value='Female'">
            <xsl:value-of select='"Женский"'/>
        </xsl:if>
        <xsl:if test="$value='Male'">
            <xsl:value-of select='"Мужской"'/>
        </xsl:if>
    </xsl:template>

    <xsl:template name="dateMy">
        <xsl:param name="value"/>
        <xsl:if test="not(string($value)='')">
            <xsl:value-of select="format-date($value, '[D01].[M01].[Y0001]', 'en',(),())"/>
        </xsl:if>
    </xsl:template>

    <xsl:template name="dateTimeMy">
        <xsl:param name="value"/>
        <xsl:if test="not(string($value)='')">
            <xsl:value-of select="format-dateTime($value,'[D01].[M01].[Y0001] [H01]:[m01]:[s01]','en',(),())"/>
        </xsl:if>
    </xsl:template>

    <xsl:template name="tableInsertElement">
        <!--<xsl:param name="valueElement"/>-->
        <!--<xsl:param name="valueTitle" select='"dfdfdf"'/>-->
        <xsl:value-of select="."/>
    </xsl:template>

    <xsl:template name="tableInsertRow">
        <xsl:param name="col1"/>
        <xsl:param name="col2"/>
        <xsl:param name="color" select='"FFFFFF"'/>

        <tr class="tr1">
            <xsl:choose>
                <xsl:when test="$col2!='title'">
                    <td class="td1" width="400">
                        <xsl:value-of select="$col1"/>
                    </td>
                </xsl:when>
                <xsl:when test="$col2='title'">
                    <td colspan="2" bgcolor="#{$color}">
                        <br/>
                        <b><xsl:value-of select="$col1"/></b>
                    </td>

                    <!--<xsl:choose>-->
                        <!--<xsl:when test="$color=''">-->
                            <!--<td colspan="2">-->
                                <!--<br/>-->
                                <!--<b><xsl:value-of select="$col1"/></b>-->
                            <!--</td>-->
                        <!--</xsl:when>-->
                        <!--<xsl:when test="$color != ''">-->
                            <!--<td colspan="2" bgcolor="#{$color}">-->
                                <!--<br/>-->
                                <!--<b><xsl:value-of select="$col1"/></b>-->
                            <!--</td>-->
                        <!--</xsl:when>-->

                    <!--</xsl:choose>-->


                </xsl:when>
            </xsl:choose>
            <xsl:choose>
                <xsl:when test="$col2!='title'">
                    <td class="td1" width="400">
                        <xsl:value-of select="$col2"/>
                    </td>
                </xsl:when>
            </xsl:choose>
        </tr>
    </xsl:template>

</xsl:stylesheet>
