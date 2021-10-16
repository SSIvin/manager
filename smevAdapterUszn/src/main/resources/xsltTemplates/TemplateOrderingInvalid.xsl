<!-- Created with Liquid Studio 2020 (https://www.liquid-technologies.com) -->
<!--ALT0160 - неразрывный пробел-->
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:import href="reportTemplate.xsl"/>

    <xsl:template match="/">
        <xsl:call-template name="root">
            <xsl:with-param
                    name="title"
                    select='"Выписка сведений об инвалиде (ребенке-инвалиде) из ФГИС ФРИ"'/>
        </xsl:call-template>


        <!--<xsl:value-of select="ReportPrint/reportResponse/reportAttachmentData/ВыпискаФРИ/ВсеДокументы"/>-->

    </xsl:template>


    <!--Запрос-->
    <xsl:template match="reportRequest">
        <!--<xsl:apply-templates select="MessagePrimaryContent/ExtractionInvalidDataRequest"/>-->
        <xsl:if test="MessagePrimaryContent/ExtractionInvalidDataRequest/ExtractionPeriod/DocumentsValidOnDate">
            Запрос документа действительным на дату:
            <xsl:variable name="Дата">
                <xsl:call-template name="dateMy">
                    <xsl:with-param name="value"
                                    select="MessagePrimaryContent/ExtractionInvalidDataRequest/ExtractionPeriod/DocumentsValidOnDate"/>
                </xsl:call-template>
            </xsl:variable>
            <xsl:value-of select="$Дата"/>
            <br/>
        </xsl:if>
        <xsl:if test="MessagePrimaryContent/ExtractionInvalidDataRequest/ExtractionPeriod/DocumentsOnPeriod">
            <xsl:variable name="ДатаC">
                <xsl:call-template name="dateMy">
                    <xsl:with-param name="value"
                                    select="MessagePrimaryContent/ExtractionInvalidDataRequest/ExtractionPeriod/DocumentsOnPeriod/DateFrom"/>
                </xsl:call-template>
            </xsl:variable>

            <xsl:variable name="ДатаПО">
                <xsl:call-template name="dateMy">
                    <xsl:with-param name="value"
                                    select="MessagePrimaryContent/ExtractionInvalidDataRequest/ExtractionPeriod/DocumentsOnPeriod/DateTo"/>
                </xsl:call-template>
            </xsl:variable>

            Запрос документа за указанный период:
            <xsl:value-of select="$ДатаC"/> - <xsl:value-of select="$ДатаПО"/>
            <br/>
        </xsl:if>


        <br/>
        <b>СНИЛС:
            <xsl:value-of select="MessagePrimaryContent/ExtractionInvalidDataRequest/SNILS"/>
        </b>
    </xsl:template>


    <!--Волшебное . - это текущий контекст обработки. и так как
     ИНН это узел то чтобы зять значение узла надо взять текущий контекст обработки-->
    <xsl:template match="SNILS">
        <xsl:if test=". != ''">
            <br/>
            СНИЛС:
            <xsl:value-of select="."/>
        </xsl:if>
    </xsl:template>
    <!--Запрос****************************************************************************-->

    <!--<xsl:template match="reportResponse">-->
    <!--<table class="table2">-->
    <!--<tr class="tr2">-->
    <!--<td class="td2" width="400">-->
    <!--<b>Ответ:</b>-->
    <!--<xsl:value-of select="@responseId"/>-->
    <!--</td>-->
    <!--<td class="td2">-->
    <!--Дата получения:-->
    <!--<xsl:call-template name="dateTimeMy">-->
    <!--<xsl:with-param name="value" select="@responseCreateDate"/>-->
    <!--</xsl:call-template>-->
    <!--</td>-->
    <!--</tr>-->
    <!--</table>-->
    <!--ID Запроса:-->
    <!--<xsl:value-of select="DOHFLNAResponse/@ИдЗапрос"/>-->
    <!--<br/>-->

    <!--&lt;!&ndash;<xsl:apply-templates select="reportAttachmentData/ВыпискаФРИ"/>&ndash;&gt;-->
    <!--&lt;!&ndash;<xsl:apply-templates select="reportAttachmentData/ВыпискаФРИ/ПерсональныеДанные"/>&ndash;&gt;-->
    <!--</xsl:template>-->

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
        <b>Данные выписки:</b>

        <table class="table1">
            <xsl:call-template name="ИнформацияОДокументе">
                <xsl:with-param name="val1" select='"Информация о Документе:"'/>
            </xsl:call-template>
        </table>

        <table class="table1">
            <xsl:apply-templates select="reportAttachmentData/ВыпискаФРИ/ПерсональныеДанные"/>
        </table>

        <table class="table1">
            <xsl:apply-templates
                    select="reportAttachmentData/ВыпискаФРИ/ПерсональныеДанные/АктуальныеСведенияОбИнвалидности"/>
        </table>

        <!--<table class="table1">-->
        <!--<xsl:apply-templates select="reportAttachmentData/ВыпискаФРИ/ВсеДокументы"/>-->
        <!--</table>-->

        <!--<xsl:call-template name="tableInsertRow">-->
        <!--<xsl:with-param name="col1" select='"Информация о Документе:"'/>-->
        <!--<xsl:with-param name="col2" select='"title"'/>-->
        <!--</xsl:call-template>-->
        <br/>
        <details>
        <summary>Все документы</summary>
        <xsl:call-template name="ALL_DOCS">
            <xsl:with-param name="val1"
                            select="reportAttachmentData/ВыпискаФРИ/ВсеДокументы"/>
        </xsl:call-template>
        </details>
    </xsl:template>


    <xsl:template match="ПерсональныеДанные">
        <xsl:call-template name="СведенияОбИнвалиде">
            <xsl:with-param name="val1" select='"Сведения об инвалиде (ребенке-инвалиде):"'/>
        </xsl:call-template>
    </xsl:template>

    <xsl:template match="АктуальныеСведенияОбИнвалидности">
        <xsl:call-template name="РеквизитыОсведетельствования">
            <xsl:with-param name="val1" select='"Реквизиты проведенного освидетельствования:"'/>
        </xsl:call-template>
        <xsl:call-template name="СведенияОбУстановленнойИнвалидности">
            <xsl:with-param name="val1" select='"Сведения об установленной инвалидности:"'/>
        </xsl:call-template>
    </xsl:template>


    <!--Все документы-->
    <!--<xsl:template match="ВсеДокументы">-->
    <!--<xsl:apply-templates-->
    <!--select="."/>-->
    <!--<xsl:value-of select="."/>-->
    <!--&lt;!&ndash;<table class="table1">&ndash;&gt;-->
    <!--&lt;!&ndash;<xsl:apply-templates&ndash;&gt;-->
    <!--&lt;!&ndash;select="reportAttachmentData/ВыпискаФРИ/ВсеДокументы/*"/>&ndash;&gt;-->
    <!--&lt;!&ndash;</table>&ndash;&gt;-->
    <!--</xsl:template>-->

    <!--<xsl:template match="Документ">-->
    <!--<table class="table1">-->
    <!--<xsl:apply-templates-->
    <!--select="РеквизитыДокумента"/>-->
    <!--</table>-->
    <!--</xsl:template>-->
    <!--<xsl:template match="РеквизитыДокумента">-->
    <!--<table class="table1">-->
    <!--<xsl:apply-templates-->
    <!--select="РеквизитыДокумента"/>-->
    <!--</table>-->
    <!--</xsl:template>-->


    <!--<xsl:template match="АктуальныеСведенияОбИнвалидности">-->
    <!--<xsl:call-template name="СведенияОбУстановленнойИнвалидности">-->
    <!--<xsl:with-param name="val1" select='"Сведения об установленной инвалидности:"'/>-->
    <!--</xsl:call-template>-->
    <!--</xsl:template>-->

    <xsl:template name="СведенияОбУстановленнойИнвалидности">
        <xsl:param name="val1"/>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select="$val1"/>
            <xsl:with-param name="col2" select='"title"'/>
        </xsl:call-template>

        <xsl:variable name="ДатаС">
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="ДатаС"/>
            </xsl:call-template>
        </xsl:variable>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Дата начала инвалидности"'/>
            <xsl:with-param name="col2" select="$ДатаС"/>
        </xsl:call-template>

        <xsl:variable name="ДатаПо">
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="ДатаПо"/>
            </xsl:call-template>
        </xsl:variable>

        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Дата окончания инвалидности"'/>
            <xsl:with-param name="col2" select="$ДатаПо"/>
        </xsl:call-template>


        <xsl:variable name="ПервичнаяИнвалидность">
            <xsl:call-template name="BooleanMy">
                <xsl:with-param name="value" select="ПервичнаяИнвалидность"/>
            </xsl:call-template>
        </xsl:variable>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Инвалидность установлена впервые"'/>
            <xsl:with-param name="col2" select="$ПервичнаяИнвалидность"/>
        </xsl:call-template>

        <xsl:variable name="ДатаПервичногоОсвидетельствования">
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="ДатаПервичногоОсвидетельствования"/>
            </xsl:call-template>
        </xsl:variable>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Дата установления инвалидности"'/>
            <xsl:with-param name="col2" select="$ДатаПервичногоОсвидетельствования"/>
        </xsl:call-template>

        <xsl:variable name="ДатаОчередноеОсвидетельствование">
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="ОчередноеОсвидетельствование"/>
            </xsl:call-template>
        </xsl:variable>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Дата следующего освидетельствования"'/>
            <xsl:with-param name="col2" select="$ДатаОчередноеОсвидетельствование"/>
        </xsl:call-template>

        <xsl:variable name="ГруппаИнвалидности">
            <xsl:call-template name="groupInvalidString">
                <xsl:with-param name="intGroup" select="ГруппаИнвалидности"/>
            </xsl:call-template>
        </xsl:variable>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Группа инвалидности"'/>
            <xsl:with-param name="col2" select="$ГруппаИнвалидности"/>
        </xsl:call-template>

        <xsl:if test="НаименованиеПричиныИнвалидности!=''">
            <xsl:call-template name="tableInsertRow">
                <xsl:with-param name="col1" select='"Причина инвалидности"'/>
                <xsl:with-param name="col2" select="НаименованиеПричиныИнвалидности"/>
            </xsl:call-template>
        </xsl:if>

    </xsl:template>

    <xsl:template name="РеквизитыОсведетельствования">
        <xsl:param name="val1"/>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select="$val1"/>
            <xsl:with-param name="col2" select='"title"'/>
        </xsl:call-template>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Серия Справки МСЭ"'/>
            <xsl:with-param name="col2" select="СерияСправкиМСЭ"/>
        </xsl:call-template>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Номер Справки МСЭ"'/>
            <xsl:with-param name="col2" select="НомерСправкиМСЭ"/>
        </xsl:call-template>
        <xsl:variable name="ДатаСправкиМСЭ">
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="ДатаСправкиМСЭ"/>
            </xsl:call-template>
        </xsl:variable>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Дата Справки МСЭ"'/>
            <xsl:with-param name="col2" select="$ДатаСправкиМСЭ"/>
        </xsl:call-template>

        <xsl:variable name="ДатаАктаМСЭ">
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="ДатаАктаМСЭ"/>
            </xsl:call-template>
        </xsl:variable>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Дата Акта МСЭ"'/>
            <xsl:with-param name="col2" select="$ДатаАктаМСЭ"/>
        </xsl:call-template>

        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Номер акта освидетельствования"'/>
            <xsl:with-param name="col2" select="НомерАктаМСЭ"/>
        </xsl:call-template>


        <!--<xsl:value-of select="../../ВсеДокументы/Документ/ВсеСведения/Запись[Категория/Код[text()='MSE.BURO']]/."/>-->
        <!--<xsl:value-of select="../../ВсеДокументы/Документ/ВсеСведения/Запись[Категория/Код[text()='MSE.BURO']]/*"/>-->

        <!--Самый первый вариант. когда брал запись в документе которую находил самой первой в докумете-->
        <!--<xsl:variable name="ProcName_MSE.BURO">-->
        <!--<xsl:call-template name="MSE.BURO">-->
        <!--<xsl:with-param name="zapis"-->
        <!--select="../../ВсеДокументы/Документ/ВсеСведения/Запись[Категория/Код[text()='MSE.BURO']]/."/>-->
        <!--</xsl:call-template>-->
        <!--</xsl:variable>-->

        <xsl:variable name="ProcName_MSE.BURO">
            <xsl:call-template name="getZapisNameInActualDoc">
                <xsl:with-param name="allDoc" select="../../ВсеДокументы/*"/>
                <xsl:with-param name="nameZapis" select='"MSE.BURO"'/>
            </xsl:call-template>
        </xsl:variable>

        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Наименование подразделения МСЭ, выдавшего справку"'/>
            <xsl:with-param name="col2" select="$ProcName_MSE.BURO"/>
        </xsl:call-template>


        <br/>
    </xsl:template>

    <xsl:template name="ИнформацияОДокументе">
        <xsl:param name="val1"/>

        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select="$val1"/>
            <xsl:with-param name="col2" select='"title"'/>
        </xsl:call-template>

        <xsl:variable name="ProcFirstDoc_Дата1">
            <xsl:call-template name="ProcFirstDoc">
                <xsl:with-param name="param" select="reportAttachmentData/ВыпискаФРИ/ВсеДокументы/."/>
                <xsl:with-param name="node" select='"Дата"'/>
            </xsl:call-template>
        </xsl:variable>
        <xsl:variable name="ProcFirstDoc_Дата">
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="$ProcFirstDoc_Дата1"/>
            </xsl:call-template>
        </xsl:variable>

        <xsl:variable name="ProcFirstDoc_SourceName">
            <xsl:call-template name="ProcFirstDoc">
                <xsl:with-param name="param" select="reportAttachmentData/ВыпискаФРИ/ВсеДокументы/."/>
                <xsl:with-param name="node" select='"Наименование"'/>
            </xsl:call-template>
        </xsl:variable>

        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Источник документа:"'/>
            <xsl:with-param name="col2" select="$ProcFirstDoc_SourceName"/>
        </xsl:call-template>

        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Дата документа:"'/>
            <xsl:with-param name="col2" select="$ProcFirstDoc_Дата"/>
        </xsl:call-template>
    </xsl:template>

    <xsl:template name="СведенияОбИнвалиде">
        <xsl:param name="val1"/>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select="$val1"/>
            <xsl:with-param name="col2" select='"title"'/>
        </xsl:call-template>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Фамилия"'/>
            <xsl:with-param name="col2" select="Фамилия"/>
        </xsl:call-template>
        <br/>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Имя"'/>
            <xsl:with-param name="col2" select="Имя"/>
        </xsl:call-template>
        <br/>
        <xsl:if test="Отчество">
            <xsl:call-template name="tableInsertRow">
                <xsl:with-param name="col1" select='"Отчество"'/>
                <xsl:with-param name="col2" select="Отчество"/>
            </xsl:call-template>
        </xsl:if>
        <xsl:variable name="ДатаРождения">
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="ДатаРождения"/>
            </xsl:call-template>
        </xsl:variable>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Дата рождения"'/>
            <xsl:with-param name="col2" select="$ДатаРождения"/>
        </xsl:call-template>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"СНИЛС"'/>
            <xsl:with-param name="col2" select="СНИЛС"/>
        </xsl:call-template>
    </xsl:template>


    <!--пока этот шаблон не используется, пока не знаю нужно ли-->
    <xsl:template name="ProcFirstDoc">
        <xsl:param name="param"/>
        <xsl:param name="node"/>
        <xsl:for-each select="$param/Документ">
            <xsl:sort select="Дата" order="descending"/>

            <!--&lt;!&ndash;Шаблон для MSE.BURO&ndash;&gt;-->
            <!--<xsl:call-template name="MSE.BURO">-->
            <!--<xsl:with-param name="zapis" select="ВсеСведения/Запись[Категория/Код[text()='MSE.BURO']]/."/>-->
            <!--</xsl:call-template>-->


            <xsl:if test="position()=1">
                <xsl:call-template name="FirstDoc">
                    <xsl:with-param name="doc" select="."/>
                    <xsl:with-param name="node2" select="$node"/>
                </xsl:call-template>
            </xsl:if>
        </xsl:for-each>
    </xsl:template>


    <!--List ВсеДокументы - выбираем все документы в записях которых есть нужная запись затем сортируем и берем первый документ
    далее в этом документе находим нужную запись и берем от туда данные
    таким образом получаем самый актуальный документ с нужной записью(ми)-->
    <xsl:template name="getZapisNameInActualDoc">
        <xsl:param name="allDoc"/>
        <xsl:param name="nameZapis"/>
        <xsl:for-each select="$allDoc/ВсеСведения/Запись[Категория/Код[text()=$nameZapis]]/../../*">
            <xsl:sort select="Дата" order="descending"/>
            <!--<br/>-->
            <!--<xsl:value-of select="$allDoc/*"/>-->
            <xsl:if test="position()=1">

                <!--через choose так как имена шаблонов не могу быть динамическими-->
                <xsl:choose>
                    <xsl:when test="$nameZapis = 'MSE.BURO'">
                        <xsl:call-template name="MSE.BURO">
                            <xsl:with-param name="zapis"
                                            select="../ВсеСведения/Запись[Категория/Код[text()=$nameZapis]]/."/>
                        </xsl:call-template>
                    </xsl:when>
                </xsl:choose>
            </xsl:if>
        </xsl:for-each>
    </xsl:template>


    <!--Самый первый вариант _ List ВсеДокументы, сортируем по Дата и берем первый-->
    <!--<xsl:template match="ВсеДокументы">-->
    <!--<xsl:for-each select="Документ">-->
    <!--<xsl:sort select="Дата" order="descending"/>-->

    <!--&lt;!&ndash;Шаблон для MSE.BURO&ndash;&gt;-->
    <!--<xsl:call-template name="MSE.BURO">-->
    <!--<xsl:with-param name="zapis" select="ВсеСведения/Запись[Категория/Код[text()='MSE.BURO']]/."/>-->
    <!--</xsl:call-template>-->


    <!--<xsl:if test="position()=1">-->
    <!--<xsl:call-template name="FirstDoc">-->
    <!--<xsl:with-param name="doc" select="."/>-->
    <!--</xsl:call-template>-->
    <!--</xsl:if>-->
    <!--</xsl:for-each>-->
    <!--</xsl:template>-->

    <xsl:template name="FirstDoc">
        <xsl:param name="doc"/>
        <xsl:param name="node2"/>

        <xsl:choose>
            <xsl:when test="$node2 = 'Дата'">
                <xsl:value-of select="$doc/РеквизитыДокумента/Дата"/>
            </xsl:when>
            <xsl:when test="$node2 = 'Наименование'">
                <xsl:value-of select="$doc/РеквизитыДокумента/Источник/Наименование"/>
            </xsl:when>
        </xsl:choose>

        <!--<xsl:value-of select=""$doc/РеквизитыДокумента/Источник/"" + $node2'/>-->
        <!--<xsl:value-of select="$doc"/>-->

        <!--<xsl:call-template name="sourceDocOrdering">-->
        <!--<xsl:with-param name="kod" select="$doc/РеквизитыДокумента/Источник/$node2"/>-->
        <!--</xsl:call-template>-->


        <!--<div>-->
        <!--<xsl:value-of select="$doc/РеквизитыДокумента/Источник/Наименование"/>-->
        <!--</div>-->
    </xsl:template>

    <!--Шаблон для MSE.BURO-->
    <xsl:template name="MSE.BURO">
        <xsl:param name="zapis"/>
        <!--<xsl:value-of select="$zapis/Категория/Наименование"/>-->

        <!--BuroShortName-->
        <xsl:variable name="BuroShortName">
            <xsl:call-template name="BuroShortName">
                <xsl:with-param name="param" select="$zapis/ВсеАтрибуты/Атрибут[Код[text()='BuroShortName']]/."/>
            </xsl:call-template>
        </xsl:variable>

        <!--BuroOrgName-->
        <xsl:variable name="BuroOrgName">
            <xsl:call-template name="BuroOrgName">
                <xsl:with-param name="param" select="$zapis/ВсеАтрибуты/Атрибут[Код[text()='BuroOrgName']]/."/>
            </xsl:call-template>
        </xsl:variable>

        <!--BuroFullName-->
        <xsl:variable name="BuroFullName">
            <xsl:call-template name="BuroFullName">
                <xsl:with-param name="param" select="$zapis/ВсеАтрибуты/Атрибут[Код[text()='BuroFullName']]/."/>
            </xsl:call-template>
        </xsl:variable>

        <!--select any not empty-->
        <xsl:choose>
            <xsl:when test="$BuroShortName != ''">
                <xsl:value-of select="$BuroShortName"/>
            </xsl:when>
            <xsl:when test="$BuroOrgName != ''">
                <xsl:value-of select="$BuroOrgName"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="$BuroFullName"/>
            </xsl:otherwise>
        </xsl:choose>

        <!--<xsl:variable name="BuroNumber">-->
        <!--<xsl:call-template name="BuroNumber">-->
        <!--<xsl:with-param name="param" select="$zapis/ВсеАтрибуты/Атрибут[Код[text()='BuroNumber']]/."/>-->
        <!--</xsl:call-template>-->
        <!--</xsl:variable>-->

    </xsl:template>

    <xsl:template name="BuroShortName">
        <xsl:param name="param"/>
        <div>
            <xsl:value-of select="$param/Значение"/>
        </div>
    </xsl:template>

    <xsl:template name="BuroFullName">
        <xsl:param name="param"/>
        <div>
            <xsl:value-of select="$param/Значение"/>
        </div>
    </xsl:template>

    <xsl:template name="BuroOrgName">
        <xsl:param name="param"/>
        <div>
            <xsl:value-of select="$param/Значение"/>
        </div>
    </xsl:template>


    <xsl:template name="BuroNumber">
        <xsl:param name="param"/>
        <div>
            <xsl:value-of select="$param/Значение"/>
        </div>
    </xsl:template>

    <xsl:template name="OneAttr">
        <xsl:param name="attr"/>

        <xsl:variable name="znachenie">
            <xsl:value-of select="$attr/ТипДанных"/>
        </xsl:variable>


        <xsl:variable name="znach">
            <xsl:choose>
                <xsl:when test="$attr/ТипДанных = 'BOOLEAN'">
                    <xsl:call-template name="BooleanMy">
                        <xsl:with-param name="value" select="$attr/Значение"/>
                    </xsl:call-template>
                </xsl:when>
                <xsl:when test="$attr/ТипДанных = 'DATE'">
                    <xsl:call-template name="dateMy">
                        <xsl:with-param name="value" select="$attr/Значение"/>
                    </xsl:call-template>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:value-of select="$attr/Значение"/>
                </xsl:otherwise>
            </xsl:choose>
        </xsl:variable>

        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select="$attr/Наименование"/>
            <xsl:with-param name="col2" select="$znach"/>
        </xsl:call-template>

    </xsl:template>


    <!--Шаблон для MSE.BURO_ALL - вывод всех записей-->
    <xsl:template name="MSE.BURO_ALL">
        <xsl:param name="zapis"/>
        <!--<xsl:value-of select="$zapis/Категория/Наименование"/>-->

    </xsl:template>

    <!--Общий шаблон для ЗАПИСИ-->
    <xsl:template name="TEMPLATE_ZAPIS">
        <xsl:param name="zapis"/>
        <xsl:param name="titleZapis"/>

        <!--есть записи без атрибутов-->
        <xsl:if test="count($zapis/ВсеАтрибуты/*) != 0">
            <xsl:call-template name="tableInsertRow">
                <xsl:with-param name="col1" select="$titleZapis"/>
                <xsl:with-param name="col2" select='"title"'/>
                <xsl:with-param name="color" select='"BBBBBB"'/>
            </xsl:call-template>
        </xsl:if>

        <!--Цикл по атрибутам-->
        <xsl:for-each select="$zapis/ВсеАтрибуты/Атрибут">
            <xsl:call-template name="OneAttr">
                <xsl:with-param name="attr" select="."/>
            </xsl:call-template>
        </xsl:for-each>
    </xsl:template>


    <!--Шаблон для MSE.IPRA.GENERAL-->
    <xsl:template name="MSE.IPRA.GENERAL">
        <xsl:param name="zapis"/>

        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Общие сведения об ИПРА"'/>
            <xsl:with-param name="col2" select='"title"'/>
        </xsl:call-template>

        <!--Цикл по атрибутам-->
        <xsl:for-each select="$zapis/ВсеАтрибуты/Атрибут">
            <xsl:call-template name="OneAttr">
                <xsl:with-param name="attr" select="."/>
            </xsl:call-template>
        </xsl:for-each>


    </xsl:template>


    <xsl:template name="sourceDocOrdering">
        <xsl:param name="kod"/>
        <xsl:choose>
            <xsl:when test="$kod = 'MSE'">МСЭ</xsl:when>
            <xsl:when test="$kod = 'PFR'">ПФР</xsl:when>
        </xsl:choose>
        <!--<div>-->
        <!--<xsl:value-of select="Источник/Код"/>-->
        <!--</div>-->
    </xsl:template>


    <xsl:template name="OneZ">
        <xsl:param name="zap"/>

        <xsl:variable name="kodZapis">
            <xsl:value-of select="$zap/Категория/Код"/>
        </xsl:variable>
        <xsl:variable name="titleZapis">
            <xsl:value-of select="$zap/Категория/Наименование"/>
        </xsl:variable>
        <!--<xsl:value-of select="$zap/Категория/Код"/>-->


        <xsl:call-template name="TEMPLATE_ZAPIS">
            <xsl:with-param name="zapis" select="$zap"/>
            <xsl:with-param name="titleZapis" select="concat($titleZapis, ' (',$kodZapis, ')')"/>
        </xsl:call-template>
        <!--<xsl:value-of select="count($zap/ВсеАтрибуты)"/>-->

        <!--<xsl:choose>-->
        <!--<xsl:when test="$nameZapis = 'MSE.BURO'">-->
        <!--<xsl:call-template name="MSE.BURO_ALL">-->
        <!--<xsl:with-param name="zapis" select="$zap"/>-->
        <!--</xsl:call-template>-->
        <!--</xsl:when>-->
        <!--<xsl:when test="$nameZapis = 'MSE.FIOHEAD'">-->
        <!--<xsl:call-template name="MSE.FIOHEAD">-->
        <!--<xsl:with-param name="zapis" select="$zap"/>-->
        <!--</xsl:call-template>-->
        <!--</xsl:when>-->
        <!--<xsl:when test="$nameZapis = 'MSE.IPRA.GENERAL'">-->
        <!--<xsl:call-template name="TEMPLATE_ZAPIS">-->
        <!--<xsl:with-param name="zapis" select="$zap"/>-->
        <!--<xsl:with-param name="titleZapis" select='"Общие сведения об ИПРА"'/>-->
        <!--</xsl:call-template>-->
        <!--</xsl:when>-->
        <!--<xsl:when test="$nameZapis = 'GENERAL.PERSON'">-->
        <!--<xsl:call-template name="GENERAL.PERSON">-->
        <!--<xsl:with-param name="zapis" select="$zap"/>-->
        <!--</xsl:call-template>-->
        <!--</xsl:when>-->
        <!--<xsl:when test="$nameZapis = 'GENERAL. IPRA.PERSON'">-->
        <!--<xsl:call-template name="GENERAL. IPRA.PERSON">-->
        <!--<xsl:with-param name="zapis" select="$zap"/>-->
        <!--</xsl:call-template>-->
        <!--</xsl:when>-->
        <!--<xsl:when test="$nameZapis = 'MSE.IPRA.PHONES'">-->
        <!--<xsl:call-template name="MSE.IPRA.PHONES">-->
        <!--<xsl:with-param name="zapis" select="$zap"/>-->
        <!--</xsl:call-template>-->
        <!--</xsl:when>-->
        <!--<xsl:when test="$nameZapis = 'GENERAL.ADDRESS'">-->
        <!--<xsl:call-template name="GENERAL.ADDRESS">-->
        <!--<xsl:with-param name="zapis" select="$zap"/>-->
        <!--</xsl:call-template>-->
        <!--</xsl:when>-->
        <!--<xsl:when test="$nameZapis = 'GENERAL.ID'">-->
        <!--<xsl:call-template name="GENERAL.ID">-->
        <!--<xsl:with-param name="zapis" select="$zap"/>-->
        <!--</xsl:call-template>-->
        <!--</xsl:when>-->
        <!--<xsl:when test="$nameZapis = 'MSE.REPRESENTATIVE.GENERAL'">-->
        <!--<xsl:call-template name="MSE.REPRESENTATIVE.GENERAL">-->
        <!--<xsl:with-param name="zapis" select="$zap"/>-->
        <!--</xsl:call-template>-->
        <!--</xsl:when>-->
        <!--<xsl:when test="$nameZapis = 'MSE.IPRA.REPRESENTATIVE.AUTHODOC'">-->
        <!--<xsl:call-template name="MSE.IPRA.REPRESENTATIVE.AUTHODOC">-->
        <!--<xsl:with-param name="zapis" select="$zap"/>-->
        <!--</xsl:call-template>-->
        <!--</xsl:when>-->
        <!--<xsl:when test="$nameZapis = 'MSE.IPRA.REPRESENTATIVE.DOC'">-->
        <!--<xsl:call-template name="MSE.IPRA.REPRESENTATIVE.DOC">-->
        <!--<xsl:with-param name="zapis" select="$zap"/>-->
        <!--</xsl:call-template>-->
        <!--</xsl:when>-->
        <!--<xsl:when test="$nameZapis = 'GENERAL.INVALIDITY'">-->
        <!--<xsl:call-template name="GENERAL.INVALIDITY">-->
        <!--<xsl:with-param name="zapis" select="$zap"/>-->
        <!--</xsl:call-template>-->
        <!--</xsl:when>-->
        <!--<xsl:when test="$nameZapis = 'MSE.IPRA.LIFE_RESTRICT'">-->
        <!--<xsl:call-template name="MSE.IPRA.LIFE_RESTRICT">-->
        <!--<xsl:with-param name="zapis" select="$zap"/>-->
        <!--</xsl:call-template>-->
        <!--</xsl:when>-->
        <!--<xsl:when test="$nameZapis = 'MSE.IPRA.SOCIAL.EVENT'">-->
        <!--<xsl:call-template name="MSE.IPRA.SOCIAL.EVENT">-->
        <!--<xsl:with-param name="zapis" select="$zap"/>-->
        <!--</xsl:call-template>-->
        <!--</xsl:when>-->
        <!--<xsl:when test="$nameZapis = 'MSE.IPRA.SOCIAL'">-->
        <!--<xsl:call-template name="MSE.IPRA.SOCIAL">-->
        <!--<xsl:with-param name="zapis" select="$zap"/>-->
        <!--</xsl:call-template>-->
        <!--</xsl:when>-->
        <!--<xsl:when test="$nameZapis = 'MSE.IPRA.TSR.FEDERAL'">-->
        <!--<xsl:call-template name="MSE.IPRA.TSR.FEDERAL">-->
        <!--<xsl:with-param name="zapis" select="$zap"/>-->
        <!--</xsl:call-template>-->
        <!--</xsl:when>-->
        <!--<xsl:when test="$nameZapis = 'MSE.IPRA.TSR.FEDERAL.ITEM'">-->
        <!--<xsl:call-template name="MSE.IPRA.TSR.FEDERAL.ITEM">-->
        <!--<xsl:with-param name="zapis" select="$zap"/>-->
        <!--</xsl:call-template>-->
        <!--</xsl:when>-->
        <!--<xsl:when test="$nameZapis = 'MSE.IPRA.TSR.REGIONAL.ITEM'">-->
        <!--<xsl:call-template name="MSE.IPRA.TSR.REGIONAL.ITEM">-->
        <!--<xsl:with-param name="zapis" select="$zap"/>-->
        <!--</xsl:call-template>-->
        <!--</xsl:when>-->
        <!--<xsl:when test="$nameZapis = 'MSE.IPRA.TSR.MSK'">-->
        <!--<xsl:call-template name="MSE.IPRA.TSR.MSK">-->
        <!--<xsl:with-param name="zapis" select="$zap"/>-->
        <!--</xsl:call-template>-->
        <!--</xsl:when>-->
        <!--<xsl:when test="$nameZapis = 'MSE.IPRA.HELPITEM'">-->
        <!--<xsl:call-template name="MSE.IPRA.HELPITEM">-->
        <!--<xsl:with-param name="zapis" select="$zap"/>-->
        <!--</xsl:call-template>-->
        <!--</xsl:when>-->
        <!--<xsl:when test="$nameZapis = 'MSE.IPRA.HELP'">-->
        <!--<xsl:call-template name="MSE.IPRA.HELP">-->
        <!--<xsl:with-param name="zapis" select="$zap"/>-->
        <!--</xsl:call-template>-->
        <!--</xsl:when>-->
        <!--<xsl:when test="$nameZapis = 'MSE.IPRA.FORECAST'">-->
        <!--<xsl:call-template name="MSE.IPRA.FORECAST">-->
        <!--<xsl:with-param name="zapis" select="$zap"/>-->
        <!--</xsl:call-template>-->
        <!--</xsl:when>-->
        <!--</xsl:choose>-->
    </xsl:template>


    <xsl:template name="ВсеСведенияMy">
        <xsl:param name="content"/>
        <xsl:for-each select="$content/Запись">
            <xsl:call-template name="OneZ">
                <xsl:with-param name="zap" select="."/>
            </xsl:call-template>
        </xsl:for-each>
    </xsl:template>

    <xsl:template name="РеквизитыДокументаMy">
        <xsl:param name="content"/>

        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"ID"'/>
            <xsl:with-param name="col2" select="$content/ID"/>
        </xsl:call-template>

        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Наименование источника документа"'/>
            <xsl:with-param name="col2" select="$content/Источник/Наименование"/>
        </xsl:call-template>

        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Номер документа"'/>
            <xsl:with-param name="col2" select="$content/Номер"/>
        </xsl:call-template>

        <xsl:variable name="Дата">
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="$content/Дата"/>
            </xsl:call-template>
        </xsl:variable>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Дата"'/>
            <xsl:with-param name="col2" select="$Дата"/>
        </xsl:call-template>

        <xsl:variable name="СрокДействия">
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="$content/СрокДействия"/>
            </xsl:call-template>
        </xsl:variable>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Срок Действия"'/>
            <xsl:with-param name="col2" select="$СрокДействия"/>
        </xsl:call-template>

        <xsl:variable name="ДатаРегистрации">
            <xsl:call-template name="dateTimeMy">
                <xsl:with-param name="value" select="$content/ДатаРегистрации"/>
            </xsl:call-template>
        </xsl:variable>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Дата регистрации документа в реестре ФГИС ФРИ"'/>
            <xsl:with-param name="col2" select="$ДатаРегистрации"/>
        </xsl:call-template>

        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Тип Документа"'/>
            <xsl:with-param name="col2" select="$content/ТипДокумента/Наименование"/>
        </xsl:call-template>

        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Код Версия"'/>
            <xsl:with-param name="col2" select="$content/ТипДокумента/КодВерсия"/>
        </xsl:call-template>

        <xsl:variable name="ДокументОснование">
            <xsl:call-template name="BooleanMy">
                <xsl:with-param name="value" select="$content/ДокументОснование"/>
            </xsl:call-template>
        </xsl:variable>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Документ Основание"'/>
            <xsl:with-param name="col2" select="$ДокументОснование"/>
        </xsl:call-template>


        <xsl:variable name="ДокументИсполнение">
            <xsl:call-template name="BooleanMy">
                <xsl:with-param name="value" select="$content/ДокументИсполнение"/>
            </xsl:call-template>
        </xsl:variable>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Документ Исполнение"'/>
            <xsl:with-param name="col2" select="$ДокументИсполнение"/>
        </xsl:call-template>

        <!--<xsl:value-of select="$content/ID"/>-->

    </xsl:template>


    <xsl:template name="OneDoc">
        <xsl:param name="doc"/>
        <xsl:param name="pos"/>

        <xsl:variable name="ДокументName">
            <xsl:value-of select="$doc/РеквизитыДокумента/ТипДокумента/Наименование"/>
        </xsl:variable>

        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select="concat('Документ ', $pos, ' - ', $ДокументName)"/>
            <xsl:with-param name="col2" select='"title"'/>
            <xsl:with-param name="color" select='"F3B19C"'/>
        </xsl:call-template>
        <br/>
        <!--<xsl:value-of select="$doc/РеквизитыДокумента"/>-->
        <xsl:call-template name="РеквизитыДокументаMy">
            <xsl:with-param name="content" select="$doc/РеквизитыДокумента"/>
        </xsl:call-template>

        <xsl:call-template name="ВсеСведенияMy">
            <xsl:with-param name="content" select="$doc/ВсеСведения"/>
        </xsl:call-template>

    </xsl:template>

    <xsl:template name="ALL_DOCS">
        <xsl:param name="val1"/>
        <xsl:for-each select="$val1/Документ">
            <!--&lt;!&ndash;Шаблон для MSE.BURO&ndash;&gt;-->
            <!--<xsl:call-template name="MSE.BURO">-->
            <!--<xsl:with-param name="zapis" select="ВсеСведения/Запись[Категория/Код[text()='MSE.BURO']]/."/>-->
            <!--</xsl:call-template>-->


            <table class="table1">
                <xsl:call-template name="OneDoc">
                    <xsl:with-param name="doc" select="."/>
                    <xsl:with-param name="pos" select="position()"/>
                    <!--<xsl:with-param name="node2" select="$node"/>-->
                </xsl:call-template>
            </table>
        </xsl:for-each>
        <!--<xsl:apply-templates select="$val1"/>-->
        <!--<xsl:value-of select="$val1"/>-->
    </xsl:template>


</xsl:stylesheet>
