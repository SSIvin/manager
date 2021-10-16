<!-- Created with Liquid Studio 2020 (https://www.liquid-technologies.com) -->
<!--ALT0160 - неразрывный пробел-->
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:import href="../reportRequestHeader.xsl"/>
    <xsl:import href="../xsltTemplates/interactionStatus.xsl"/>
    <xsl:output method="html" encoding="UTF-8" doctype-public="-//W3C//DTD HTML 4.01//EN"
                doctype-system="http://www/w3c.org/TR/html4/strict.dtd"
                indent="yes"/>

    <xsl:decimal-format name="rub" decimal-separator="," grouping-separator="."/>

    <xsl:template match="/">
        <html>
            <style>
                table {
                width: 40%; /* Ширина таблицы */
                border-collapse: collapse; /* Убираем двойные линии между ячейками */
                }
                td, th {
                padding: 4px; /* Поля в ячейках */
                border: 1px solid #000080; /* Граница между ячейками */
                }
                th {
                background: Khaki; /* Цвет фона строки заголовка */
                text-align: left; /* Выравнивание по левому краю */
                font-family: Arial, Helvetica, sans-serif; /* Выбор гарнитуры */
                font-size: 0.9em; /* Размер текста */
                }
            </style>
            <!--<h1>привет</h1>-->
            <body>
                <xsl:apply-templates select="ReportPrint/reportRequest"/>
                <xsl:apply-templates select="ReportPrint/interactionStatus"/>
                <xsl:apply-templates select="ReportPrint/reportResponse"/>
            </body>
        </html>
    </xsl:template>

<!--reportRequest-->
    <xsl:template match="reportRequest">
        <div>
            <xsl:apply-imports/>
        </div>
    </xsl:template>

<!--interactionStatus-->
    <xsl:template match="interactionStatus">
        <xsl:apply-templates select="statusReport"/>
        <xsl:apply-templates select="rejectReport"/>
        <xsl:apply-templates select="errorReport"/>
        <div>
            <!--<xsl:apply-imports/>-->
        </div>
    </xsl:template>

    <xsl:template match="reportResponse">
        <br/>
        <h3>ОТВЕТ</h3>
        <div>
            ID Запроса:
            <xsl:value-of select="DOHFLNAResponse/@ИдЗапрос"/>
            <br/>
            Отчетный год:
            <xsl:value-of select="DOHFLNAResponse/ДохФЛ/@ОтчетГод"/>
        </div>
        <xsl:apply-templates select="DOHFLNAResponse/ДохФЛ"/>
    </xsl:template>

    <xsl:template match="ДохФЛ">
        <br/>
        <xsl:apply-templates select="ДохФЛ_НА"/>
    </xsl:template>

    <xsl:template match="ДохФЛ_НА">
        <br/>
        <b>Доходы ФИЗ лица</b>
        <xsl:apply-templates select="ПолучДох"/>
        <!--<xsl:apply-templates/>-->
        <xsl:apply-templates select="СвНА"/>
    </xsl:template>

    <xsl:template match="ПолучДох">
        <br/>
        <div>
            ИНН:<xsl:value-of select="@ИННФЛ"/>
            Дата рождения:<xsl:value-of select="format-date(@ДатаРожд, '[D01].[M01].[Y0001]', 'en',(),())"/>
            Удост.личности:
        </div>
        <xsl:call-template name="ФИО"/>
    </xsl:template>

    <xsl:template name="ФИО">
        <div>
            ФИО: <xsl:value-of select="./ФИО/@FamilyName"/> <xsl:value-of select="./ФИО/@FirstName"/> <xsl:if test="./ФИО/@Patronymic!=''"> <xsl:value-of select="./ФИО/@Patronymic"/>
        </xsl:if>

        </div>
    </xsl:template>

    <xsl:template match="УдЛичнФЛ">
        <div>
            Код документа:
            <xsl:value-of select="@DocumentCode"/>
            номер документа:
            <xsl:value-of select="@SeriesNumber"/>
        </div>
        <xsl:call-template name="ФИО"/>
    </xsl:template>

    <xsl:template match="СвНА">

        <xsl:apply-templates select="СвНАЮЛ"/>
        <xsl:apply-templates select="СвНАФЛ"/>
        <!-- <xsl:apply-templates></xsl:apply-templates> -->
    </xsl:template>


    <xsl:template match="СвНАЮЛ">
        <div>
            <b>Сведения о налоговом агенте - организации</b>
            <br/>
            Наименование Организации:<xsl:value-of select="@НаимОрг"/>
            ИНН:<xsl:value-of select="@ИННЮЛ"/>
            КПП:<xsl:value-of select="@КПП"/>
        </div>
    </xsl:template>

    <xsl:template match="СвНАФЛ">
        <div>
            <b>Сведения о налоговом агенте - физическом лице</b>
            <br/>
            ИНН:<xsl:value-of select="@ИННФЛ"/>
        </div>
        <xsl:call-template name="ФИО"/>
    </xsl:template>


    <xsl:template match="СведДох_2НДФЛ">
        <br/>
        <div>
            Ставка налога:
            <xsl:value-of select="@Ставка"/>
        </div>

        <table>
            <TR>
                <th>
                    <B>Месяц</B>
                </th>
                <th>
                    <B>Код дохода</B>
                </th>
                <th>
                    <B>Сумма дохода</B>
                </th>
            </TR>
            <xsl:apply-templates select="ДохВыч/СвСумДох">
                <xsl:sort select="@Месяц" data-type="number"/>
            </xsl:apply-templates>
            <tr>
                <td colspan="2" style="text-align:right">
                    <b>сумма:</b>
                </td>
                <td>
                    <sum>
                        <xsl:value-of select="format-number(sum(ДохВыч/СвСумДох/@СумДоход), '###.###,00', 'rub')"/>
                    </sum>
                </td>
            </tr>
        </table>

        <!--СГДНалПер-->
        <xsl:choose>
            <xsl:when test="СГДНалПер">
                <xsl:apply-templates select="СГДНалПер"/>
            </xsl:when>
        </xsl:choose>
    </xsl:template>

    <xsl:template match="СГДНалПер">
        <div>
            Сумма дох.общая:<xsl:value-of select="format-number(@СумДохОбщ, '###.###,00', 'rub')"/>
            Налоговая база:<xsl:value-of select="format-number(@НалБаза, '###.###,00', 'rub')"/>
        </div>
    </xsl:template>

    <xsl:template match="СвСумДох">
        <tr>
            <td>
                <xsl:value-of select="@Месяц"/>
            </td>
            <td>
                <xsl:value-of select="@КодДоход"/>
            </td>
            <td>
                <xsl:value-of select="format-number(@СумДоход, '###.###,00', 'rub')"/>
            </td>
        </tr>
    </xsl:template>

    <xsl:template match="СведДох_НДПриб">
        <xsl:choose>
            <xsl:when test="ДохНалПер">
                <div><b>Сведения о доходах физического лица из налоговой декларации по налогу на прибыль организаций</b></div>
                <xsl:call-template name="ДохНалПер"/>
            </xsl:when>
        </xsl:choose>


    </xsl:template>

    <xsl:template name="ДохНалПер">
        <div>
            Ставка:<xsl:value-of select="format-number(ДохНалПер/@Ставка, '###.###,00', 'rub')"/> 
            Сумма дох.общая:<xsl:value-of select="format-number(ДохНалПер/@СумДохОбщ, '###.###,00', 'rub')"/> 
            Налоговая база:<xsl:value-of select="format-number(ДохНалПер/@НалБаза, '###.###,00', 'rub')"/>
        </div>
    </xsl:template>

</xsl:stylesheet>
