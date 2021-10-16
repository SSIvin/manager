<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="2.0" xmlns:xml="http://www.w3.org/XML/1998/namespace" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns="http://www.w3.org/1999/xhtml" exclude-result-prefixes=" xml xsl xs">
    <xsl:output method="html" indent="yes" />


    <xsl:template match="/">
        <html>
            <head>
                <title><xsl:value-of select="/SnilsByAdditionalDataResponse/FamilyName" /></title>
                <meta http-equiv="content-type" content="text/html;charset=utf-8"/>
            </head>
            <body>
               SNILS: <xsl:value-of select="/SnilsByAdditionalDataResponse/Snils" />
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
