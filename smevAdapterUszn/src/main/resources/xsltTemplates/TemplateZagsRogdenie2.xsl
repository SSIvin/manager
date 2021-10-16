<!-- Created with Liquid Studio 2020 (https://www.liquid-technologies.com) -->
<!--ALT0160 - неразрывный пробел-->
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:exsl="http://exslt.org/common"
                extension-element-prefixes="exsl">
    <xsl:import href="reportTemplate.xsl"/>
    <xsl:import href="ZagsTemplate.xsl"/>

    <xsl:template match="/">
        <xsl:call-template name="root">
            <xsl:with-param
                    name="title"
                    select='"Сведения об актах гражданского состояния о рождении, содержащихся в Едином государственном реестре записей актов гражданского состояния"'/>
        </xsl:call-template>
    </xsl:template>

    <!--Запрос-->
    <xsl:template match="reportRequest">
        <table class="table2">
            <tr class="tr2">
                <td class="td2" width="400">
                    Фамилия:
                    <xsl:value-of select="MessagePrimaryContent/ROGDINFRequest/СведЗапрос/СведФЛ/ФИО/Фамилия"/>
                    <br/>
                    Имя:
                    <xsl:value-of select="MessagePrimaryContent/ROGDINFRequest/СведЗапрос/СведФЛ/ФИО/Имя"/>
                    <br/>
                    <xsl:if test="MessagePrimaryContent/ROGDINFRequest/СведЗапрос/СведФЛ/ФИО/Отчество!=''">
                        Отчество:
                        <xsl:value-of select="MessagePrimaryContent/ROGDINFRequest/СведЗапрос/СведФЛ/ФИО/Отчество"/>
                    </xsl:if>
                    <br/>
                    Дата рождения:
                    <xsl:call-template name="dateMy">
                        <xsl:with-param name="value"
                                        select="MessagePrimaryContent/ROGDINFRequest/СведЗапрос/СведФЛ/ДатаРождКаленд"/>
                    </xsl:call-template>
                    <br/>

                    <xsl:if test="MessagePrimaryContent/ROGDINFRequest/СведЗапрос/СведФЛ/@СНИЛС != ''">
                        СНИЛС:
                        <xsl:value-of select="MessagePrimaryContent/ROGDINFRequest/СведЗапрос/СведФЛ/@СНИЛС"/>
                    </xsl:if>
                    <br/>
                    Номер записи:
                    <xsl:value-of select="MessagePrimaryContent/ROGDINFRequest/СведЗапрос/СведАГС/@НомерЗапис"/>
                    <br/>
                    Дата записи:
                    <xsl:call-template name="dateMy">
                        <xsl:with-param name="value"
                                        select="MessagePrimaryContent/ROGDINFRequest/СведЗапрос/СведАГС/ДатаЗапис"/>
                    </xsl:call-template>
                </td>
                <td class="td2">
                    <xsl:variable name="кодОсн">
                        <xsl:call-template name="кодОСН">
                            <xsl:with-param name="kod" select="MessagePrimaryContent/ROGDINFRequest/СведОсн/@КодНормОсн"/>
                        </xsl:call-template>
                    </xsl:variable>

                    Основание запроса:
                    <xsl:value-of select="$кодОсн"/>
                    <br/>
                </td>
            </tr>
        </table>
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
        <b>Общие сведения:</b>
        <table class="table1">
            <xsl:call-template name="tableInsertRow">
                <xsl:with-param name="col1" select='"Идентификатор запроса"'/>
                <xsl:with-param name="col2" select="ROGDINFResponse/@ИдЗапрос"/>
            </xsl:call-template>

            <xsl:variable name="ТипАГСЗапрос">
                <xsl:call-template name="ZagsТипАГСЗапрос">
                    <xsl:with-param name="kod" select="ROGDINFResponse/@ТипАГСЗапрос"/>
                </xsl:call-template>
            </xsl:variable>
            <xsl:call-template name="tableInsertRow">
                <xsl:with-param name="col1"
                                select='"Тип акта гражданского состояния, в отношении которого сформирован запрос"'/>
                <xsl:with-param name="col2" select="$ТипАГСЗапрос"/>
            </xsl:call-template>
            <xsl:variable name="РезОбраб">
                <xsl:call-template name="ZagsРезОбраб">
                    <xsl:with-param name="kod" select="ROGDINFResponse/СведОтветАГС/@РезОбраб"/>
                </xsl:call-template>
            </xsl:variable>
            <xsl:call-template name="tableInsertRow">
                <xsl:with-param name="col1" select='"Результат обработки поступившего запроса"'/>
                <xsl:with-param name="col2" select="$РезОбраб"/>
            </xsl:call-template>
            <xsl:apply-templates select="ROGDINFResponse/СведОтветАГС"/>
        </table>
    </xsl:template>


    <!-- СведРегРожд-->
    <xsl:template match="СведРегРожд">
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Сведения о государственной регистрации рождения"'/>
            <xsl:with-param name="col2" select='"title"'/>
        </xsl:call-template>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Номер записи акта о рождении"'/>
            <xsl:with-param name="col2" select="@НомерЗапис"/>
        </xsl:call-template>
        <br/>
        <xsl:variable name="ДатаЗапис">
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="ДатаЗапис"/>
            </xsl:call-template>
        </xsl:variable>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Дата составления записи акта о рождении"'/>
            <xsl:with-param name="col2" select="$ДатаЗапис"/>
        </xsl:call-template>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1"
                            select='"Код ЗАГС"'/>
            <xsl:with-param name="col2" select="ОрганЗАГС/@КодЗАГС"/>
        </xsl:call-template>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1"
                            select='"Полное наименование органа ЗАГС,которым произведена государственная регистрация акта гражданского состояния"'/>
            <xsl:with-param name="col2" select="ОрганЗАГС/@НаимЗАГС"/>
        </xsl:call-template>

        <!--<xsl:call-template name="tableInsertRow">-->
            <!--<xsl:with-param name="col1" select='"Сведения о состоянии и статусе записи акта о рождении"'/>-->
            <!--<xsl:with-param name="col2" select='"title"'/>-->
        <!--</xsl:call-template>-->
        <!--<xsl:variable name="ДатаНачСостСтат">-->
            <!--<xsl:call-template name="dateMy">-->
                <!--<xsl:with-param name="value" select="СостСтатЗаписи/@ДатаНачСостСтат"/>-->
            <!--</xsl:call-template>-->
        <!--</xsl:variable>-->
        <!--<xsl:call-template name="tableInsertRow">-->
            <!--<xsl:with-param name="col1" select='"Дата начала действия"'/>-->
            <!--<xsl:with-param name="col2" select="$ДатаНачСостСтат"/>-->
        <!--</xsl:call-template>-->

        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Наименование состояния и статуса "'/>
            <xsl:with-param name="col2" select="СостСтатЗаписи/@НаимСостСтат"/>
        </xsl:call-template>

        <xsl:apply-templates select="СвидетРожд" mode="свидельствоОРождении"/>

        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1"
                            select="'Передаваемые сведения о государственной регистрации рождения'"/>
            <xsl:with-param name="col2" select='"title"'/>
            <xsl:with-param name="color" select='"c7c7c7"'/>
        </xsl:call-template>

        <tr class="tr1">
            <td class="td1" width="400">
                <xsl:value-of select='"Сведения о том, которым по счету ребенок был рожден у матери"'/>
            </td>
            <td class="td1" width="400">
                <xsl:apply-templates select="ПрдСведРег/СчетМатер"/>
            </td>
        </tr>



        <xsl:if test="ПрдСведРег/СведРоды">
            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"Сведения о родах"'/>
                </td>
                <td class="td1" width="400">
                    <xsl:apply-templates select="ПрдСведРег/СведРоды"/>
                </td>
            </tr>
        </xsl:if>

        <xsl:if test="ПрдСведРег/СведРоды/СведМногоплРоды">
            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"Сведения о многоплодных родах"'/>
                </td>
                <td class="td1" width="400">
                    <xsl:apply-templates select="ПрдСведРег/СведРоды/СведМногоплРоды"/>
                </td>
            </tr>
        </xsl:if>

        <tr class="tr1">
            <td class="td1" width="400">
                <xsl:value-of select='"Сведения о родившемся"'/>
            </td>
            <td class="td1" width="400">
                <xsl:if test="not(ПрдСведРег/СведРодившемся/ПрЖивМертв) or ПрдСведРег/СведРодившемся/ПрЖивМертв='0'">
                    <xsl:if test="ПрдСведРег/СведРодившемся/ЖивМертв = '1'">
                        <b>мертворожденный</b>
                        <br/>
                    </xsl:if>
                    <!--<br/>-->
                </xsl:if>
                <xsl:apply-templates select="ПрдСведРег/СведРодившемся/ФИОРожд"/>
            </td>
        </tr>

        <tr class="tr1">
            <td class="td1" width="400">
                <xsl:value-of select='"Сведения о матери"'/>
            </td>
            <td class="td1" width="400">
                <xsl:if test="not(ПрдСведРег/ПрМать) or ПрдСведРег/ПрМать='0'">
                    <xsl:apply-templates select="ПрдСведРег/СведМать" mode="СведМать"/>
                </xsl:if>
            </td>
        </tr>

        <tr class="tr1">
            <td class="td1" width="400">
                <xsl:value-of select='"Сведения об отце"'/>
            </td>
            <td class="td1" width="400">
                <xsl:if test="not(ПрдСведРег/ПрОтец) or ПрдСведРег/ПрОтец='0'">
                    <xsl:apply-templates select="ПрдСведРег/СведОтец" mode="СведОтец"/>
                </xsl:if>
            </td>
        </tr>

        <xsl:if test="ПрдСведРег/СведДокРод">
            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"Сведения о документе,подтверждающем факт рождения ребенка"'/>
                </td>
                <td class="td1" width="400">
                    <xsl:apply-templates select="ПрдСведРег/СведДокРод"/>
                </td>
            </tr>
        </xsl:if>

        <xsl:if test="ПрдСведРег/СведДокОснОтец">
            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"Сведения о документе, на основании которого указаны сведения об отце"'/>
                </td>
                <td class="td1" width="400">
                    <xsl:apply-templates select="ПрдСведРег/СведДокОснОтец"/>
                </td>
            </tr>
        </xsl:if>
    </xsl:template>


    <xsl:template match="ЗапАктОсн">
        Тип записи:
        <xsl:value-of select="@НаимТипЗапис"/>
        <br/>
        Номер записи:
        <xsl:value-of select="@НомерЗапис"/>
        <br/>
        Дата записи:
        <xsl:call-template name="dateMy">
            <xsl:with-param name="value" select="@ДатаЗапис"/>
        </xsl:call-template>
        <br/>
        Орган ЗАГС:
        <xsl:value-of select="ОрганЗАГС/@НаимЗАГС"/>
        <br/>
        Код ЗАГС:
        <xsl:value-of select="ОрганЗАГС/@КодЗАГС"/>
        <br/>
    </xsl:template>

    <xsl:template match="ДокОсн">
        <xsl:if test="КодДок">
            Код:
            <xsl:value-of select="КодДок"/>
            <br/>
        </xsl:if>
        <xsl:if test="НаимДок">
            Наименование:
            <xsl:value-of select="НаимДок"/>
            <br/>
        </xsl:if>

        <xsl:if test="СерНомДок">
            Серия:
            <xsl:value-of select="СерНомДок"/>
            <br/>
        </xsl:if>

        <xsl:if test="ДатаДокКаленд">
            Дата:
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="ДатаДокКаленд"/>
            </xsl:call-template>
            <br/>
        </xsl:if>
        <xsl:if test="НаимОрг">
            Организация:
            <xsl:value-of select="НаимОрг"/>
            <br/>
        </xsl:if>
    </xsl:template>

    <xsl:template match="СведМать" mode="СведМать">
        <xsl:if test="@СНИЛС != ''">
            СНИЛС:
            <xsl:value-of select="@СНИЛС"/>
            <br/>
        </xsl:if>
        <xsl:apply-templates select="ФИО"/>
    </xsl:template>

    <xsl:template match="СведОтец" mode="СведОтец">
        <xsl:if test="@СНИЛС != ''">
            СНИЛС:
            <xsl:value-of select="@СНИЛС"/>
            <br/>
        </xsl:if>
        <xsl:apply-templates select="ФИО"/>
    </xsl:template>

    <xsl:template match="СвидетРожд" mode="свидельствоОРождении">
        <xsl:call-template name="СведенияОСвидельстве">
            <xsl:with-param name="val" select='"Сведения о выданном Свидетельстве о рождении"'/>
        </xsl:call-template>
    </xsl:template>
    <xsl:template match="ПрдСведРег"/>
    <xsl:template match="СведДокРод">
        <xsl:value-of select="НаимДок"/>
        <br/>
        Код вида документа, подтверждающего факт рождения:
        <xsl:value-of select="КодДок"/>
        <br/>
        <xsl:if test="НаимОрг">
            Наименование органа, выдавшего документ:
            <xsl:value-of select="НаимОрг"/>
            <br/>
        </xsl:if>

        <xsl:if test="СерНомДок != ''">
            Серия номер:
            <xsl:value-of select="СерНомДок"/>
            <br/>
        </xsl:if>
        Дата документа:
        <xsl:call-template name="dateMy">
            <xsl:with-param name="value" select="ДатаДокКаленд"/>
        </xsl:call-template>
    </xsl:template>

    <xsl:template match="СведСчетРебен">
        <xsl:if test="not(ПрСчетРебен) or ПрСчетРебен='0'">
            <xsl:value-of select="СчетРебен"/>
            <br/>
        </xsl:if>
    </xsl:template>

    <!--<xsl:template match="СведРоды">-->
        <!--<xsl:if test="not(ПрПризнакРодов) or ПрПризнакРодов='0'">-->
            <!--<xsl:value-of select="ПризнакРодов"/>-->
            <!--<br/>-->
        <!--</xsl:if>-->
    <!--</xsl:template>-->

    <xsl:template match="СведРоды">
        Число родившихся детей при родах:
        <xsl:value-of select="ЧислоРодДетей"/>
        <br/>
        <xsl:if test="not(ПрСчет) or ПрСчет='0'">
            Которым по счету был рожден ребенок:
            <xsl:value-of select="Счет"/>
            <br/>
        </xsl:if>
    </xsl:template>


    <!--создал пустые шаблоны чтобы не выводились даты(значения нодов) так как мы делаем <xsl:apply-templates select="ПрдСведРег/СведОтец"/> то он выводит значения. УРОД!-->
    <xsl:template match="ДатаРожд"/>
    <xsl:template match="МесГодРожд"/>
    <xsl:template match="ГодРожд"/>
    <xsl:template match="ДатаСмерт"/>
    <xsl:template match="МесГодСмерт"/>
    <xsl:template match="ГодСмерт"/>
    <xsl:template match="ПрДатаРожд"/>
    <xsl:template match="ПрГражданство"/>
    <xsl:template match="ДатаРождДок"/>


</xsl:stylesheet>
