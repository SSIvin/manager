<!-- Created with Liquid Studio 2020 (https://www.liquid-technologies.com) -->
<!--ALT0160 - неразрывный пробел-->
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:exsl="http://exslt.org/common"
                extension-element-prefixes="exsl">
    <xsl:import href="reportTemplate.xsl"/>

    <xsl:template match="/">
        <xsl:call-template name="root">
            <xsl:with-param
                    name="title"
                    select='"Сведения из ЕГР ЗАГС об актах гражданского состояния"'/>
        </xsl:call-template>
    </xsl:template>

    <!--Запрос-->
    <xsl:template match="reportRequest">
        Фамилия:
        <xsl:value-of select="MessagePrimaryContent/informRequest/СведФЛ/ФИО/Фамилия"/>
        <br/>
        Имя:
        <xsl:value-of select="MessagePrimaryContent/informRequest/СведФЛ/ФИО/Имя"/>
        <br/>
        <xsl:if test="MessagePrimaryContent/informRequest/СведФЛ/ФИО/Отчество!=''">
            Отчество:
            <xsl:value-of select="MessagePrimaryContent/informRequest/СведФЛ/ФИО/Отчество"/>
        </xsl:if>
        <br/>
        Дата рождения:
        <xsl:call-template name="dateMy">
            <xsl:with-param name="value" select="MessagePrimaryContent/informRequest/СведФЛ/ДатаРожд"/>
        </xsl:call-template>
        <br/>

        <xsl:if test="MessagePrimaryContent/informRequest/СведФЛ/@ИННФЛ != ''">
            ИНН:
            <xsl:value-of select="MessagePrimaryContent/informRequest/СведФЛ/@ИННФЛ"/>
            <br/>
        </xsl:if>
        <xsl:if test="MessagePrimaryContent/informRequest/СведФЛ/@СНИЛС != ''">
            СНИЛС:
            <xsl:value-of select="MessagePrimaryContent/informRequest/СведФЛ/@СНИЛС"/>
            <br/>
        </xsl:if>
        <br/>
        <b>
            Тип акта:
            <xsl:call-template name="ZagsТипАГСЗапрос_OLD">
                <xsl:with-param name="kod" select="MessagePrimaryContent/informRequest/@ТипАГС"/>
            </xsl:call-template>
        </b>
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
        <b>Общие сведения:</b>


        <table class="table1">
            <xsl:call-template name="tableInsertRow">
                <xsl:with-param name="col1" select='"Идентификатор запроса"'/>
                <xsl:with-param name="col2" select="informResponse/@ИдЗапрос"/>
            </xsl:call-template>

            <xsl:variable name="ТипАГСЗапрос">
                <xsl:call-template name="ZagsТипАГСЗапрос_OLD">
                    <xsl:with-param name="kod" select="informResponse/@ТипАГСЗапрос"/>
                </xsl:call-template>
            </xsl:variable>
            <xsl:call-template name="tableInsertRow">
                <xsl:with-param name="col1"
                                select='"Тип акта гражданского состояния, в отношении которого сформирован запрос"'/>
                <xsl:with-param name="col2" select="$ТипАГСЗапрос"/>
            </xsl:call-template>

            <xsl:variable name="РезОбраб">
                <xsl:call-template name="ZagsРезОбраб">
                    <xsl:with-param name="kod" select="informResponse/@РезОбраб"/>
                </xsl:call-template>
            </xsl:variable>
            <xsl:call-template name="tableInsertRow">
                <xsl:with-param name="col1" select='"Результат обработки поступившего запроса"'/>
                <xsl:with-param name="col2" select="$РезОбраб"/>
            </xsl:call-template>
            <xsl:apply-templates select="informResponse"/>
        </table>
    </xsl:template>


    <!--СведРегСмерт-->
    <xsl:template match="СведРегСмерт">
        <xsl:call-template name="Сведения">
            <xsl:with-param name="val1" select='"Сведения о государственной регистрации смерти"'/>
            <xsl:with-param name="val2" select='"Номер записи акта о смерти"'/>
            <xsl:with-param name="val3" select='"Дата составления записи акта о смерти"'/>
        </xsl:call-template>

        <xsl:apply-templates select="СведСвидет" mode="смерть"/>

        <tr class="tr1">
            <td class="td1" width="400">
                <xsl:value-of select='"Сведения о причинах смерти"'/>
            </td>
            <td class="td1" width="400">
                <xsl:apply-templates select="ПрдСведРег/СведУмер/СведПричСмерт"/>
            </td>
        </tr>

        <tr class="tr1">
            <td class="td1" width="400">
                <xsl:value-of select='"Cведения об умершим"'/>
            </td>
            <td class="td1" width="400">
                <xsl:apply-templates select="ПрдСведРег/СведУмер/ФИОУмер"/>
            </td>
        </tr>

        <xsl:if test="ПрдСведРег/СведДокСмерт">
            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"Сведения о документе, подтверждающем факт смерти"'/>
                </td>
                <td class="td1" width="400">
                    <xsl:apply-templates select="ПрдСведРег/СведДокСмерт"/>
                </td>
            </tr>
        </xsl:if>
    </xsl:template>

    <xsl:template match="СведПричСмерт">
        <xsl:value-of select="@ПричСмерт"/>;
    </xsl:template>

    <xsl:template match="СведСвидет" mode="смерть">
        <xsl:call-template name="СведенияОСвидельстве">
            <xsl:with-param name="val" select='"Сведения о выданном Свидетельстве о смерти"'/>
        </xsl:call-template>
    </xsl:template>

    <xsl:template match="СведСвидет" mode="отцовство">
        <xsl:call-template name="СведенияОСвидельстве">
            <xsl:with-param name="val" select='"Сведения о выданном Свидетельстве об установлении отцовства"'/>
        </xsl:call-template>
    </xsl:template>

    <xsl:template match="СведСвидет" mode="переменаИмени">
        <xsl:call-template name="СведенияОСвидельстве">
            <xsl:with-param name="val" select='"Сведения о выданном Свидетельстве о перемене имени"'/>
        </xsl:call-template>
    </xsl:template>

    <xsl:template match="СведДокСмерт">
        <xsl:value-of select="@НаимДок"/>
        <br/>
        Код вида документа, подтверждающего факт смерти:
        <xsl:value-of select="@КодДок"/>
        <br/>
        <xsl:if test="НаимОрг">
            Наименование органа, выдавшего документ:
            <xsl:value-of select="НаимОрг"/>
            <br/>
        </xsl:if>

        <xsl:if test="@СерНомДок != ''">
            Серия номер:
            <xsl:value-of select="@СерНомДок"/>
            <br/>
        </xsl:if>
        Дата документа:
        <xsl:call-template name="dateMy">
            <xsl:with-param name="value" select="@ДатаДок"/>
        </xsl:call-template>
    </xsl:template>



    <!--СведРегРстржБрак-->
    <xsl:template match="СведРегРстржБрак">
        <xsl:call-template name="Сведения">
            <xsl:with-param name="val1" select='"Сведения о государственной регистрации расторжения брака"'/>
            <xsl:with-param name="val2" select='"Номер записи акта о расторжении брака"'/>
            <xsl:with-param name="val3" select='"Дата записи"'/>
        </xsl:call-template>

        <xsl:apply-templates select="СведСвидет" mode="расторжениеБрака"/>
        <!--<xsl:apply-templates select="//СведСвидет" mode="расторжениеБрака"/>-->

        <xsl:variable name="ДатаПрекрБрак">
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="ПрдСведРег/@ДатаПрекрБрак"/>
            </xsl:call-template>
        </xsl:variable>

        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1"
                            select='"Дата прекращения брака"'/>
            <xsl:with-param name="col2" select="$ДатаПрекрБрак"/>
        </xsl:call-template>

        <tr class="tr1">
            <td class="td1" width="400">
                <xsl:value-of select='"Данные супруга"'/>
            </td>
            <td class="td1" width="400">
                <xsl:apply-templates select="ПрдСведРег/СведЛицБрак/Супруг"/>
            </td>
        </tr>

        <tr class="tr1">
            <td class="td1" width="400">
                <xsl:value-of select='"Данные супруги"'/>
            </td>
            <td class="td1" width="400">
                <xsl:apply-templates select="ПрдСведРег/СведЛицБрак/Супруга"/>
            </td>
        </tr>
    </xsl:template>
    <xsl:template match="СведСвидет" mode="расторжениеБрака">
        <!--<xsl:template match="СведСвидет" mode="расторжениеБрака">-->
        <xsl:call-template name="СведенияОСвидельстве">
            <xsl:with-param name="val" select='"Сведения о выданном Свидетельстве о расторжении брака"'/>
        </xsl:call-template>
    </xsl:template>


    <!--СведРегЗаклБрак-->
    <xsl:template match="СведРегЗаклБрак">
        <xsl:call-template name="Сведения">
            <xsl:with-param name="val1" select='"Сведения о государственной регистрации брака"'/>
            <xsl:with-param name="val2" select='"Номер записи акта о браке"'/>
            <xsl:with-param name="val3" select='"Дата составления записи акта о браке"'/>
        </xsl:call-template>

        <xsl:apply-templates select="//СведСвидет" mode="заключениеБрака"/>


        <xsl:variable name="ДатаЗаклБрак">
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="ПрдСведРег/@ДатаЗаклБрак"/>
            </xsl:call-template>
        </xsl:variable>

        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1"
                            select='"Дата заключения брака"'/>
            <xsl:with-param name="col2" select="$ДатаЗаклБрак"/>
        </xsl:call-template>

        <tr class="tr1">
            <td class="td1" width="400">
                <xsl:value-of select='"Данные супруга"'/>
            </td>
            <td class="td1" width="400">
                <xsl:apply-templates select="ПрдСведРег/СведЛицБрак/Супруг"/>
            </td>
        </tr>

        <tr class="tr1">
            <td class="td1" width="400">
                <xsl:value-of select='"Данные супруги"'/>
            </td>
            <td class="td1" width="400">
                <xsl:apply-templates select="ПрдСведРег/СведЛицБрак/Супруга"/>
            </td>
        </tr>
    </xsl:template>

    <xsl:template match="СведСвидет" mode="заключениеБрака">
        <xsl:call-template name="СведенияОСвидельстве">
            <xsl:with-param name="val" select='"Сведения о выданном Свидетельстве о браке"'/>
        </xsl:call-template>
    </xsl:template>


    <!-- СведРегРожд-->
    <xsl:template match="СведРегРожд">
        <xsl:call-template name="Сведения">
            <xsl:with-param name="val1" select='"Сведения о государственной регистрации рождения"'/>
            <xsl:with-param name="val2" select='"Номер записи акта о рождении"'/>
            <xsl:with-param name="val3" select='"Дата составления записи акта о рождении"'/>
        </xsl:call-template>
        <!--<xsl:call-template name="СведенияОГосРегистрцииРождения"/>-->
        <!--<xsl:call-template name="СведениеОВыданномСвидетРожд"/>-->
        <xsl:apply-templates select="//СвидетРожд"/>

        <tr class="tr1">
            <td class="td1" width="400">
                <xsl:value-of select='"Сведения о родившемся"'/>
            </td>
            <td class="td1" width="400">
                <xsl:apply-templates select="ПрдСведРег/СведРодившемся/ФИОРожд"/>
            </td>
        </tr>

        <tr class="tr1">
            <td class="td1" width="400">
                <xsl:value-of select='"Сведения о матери"'/>
            </td>
            <td class="td1" width="400">
                <xsl:apply-templates select="ПрдСведРег/СведМать"/>
            </td>
        </tr>

        <tr class="tr1">
            <td class="td1" width="400">
                <xsl:value-of select='"Сведения об отце"'/>
            </td>
            <td class="td1" width="400">
                <xsl:apply-templates select="ПрдСведРег/СведОтец"/>
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
    </xsl:template>


    <!--Start СвеРегОтцов установление отцовства-->
    <xsl:template match="СвеРегОтцов">
        <xsl:call-template name="Сведения">
            <xsl:with-param name="val1" select='"Сведения о государственной регистрации установления отцовства"'/>
            <xsl:with-param name="val2" select='"Номер записи акта об установлении отцовства"'/>
            <xsl:with-param name="val3" select='"Дата составления записи акта об установлении отцовства"'/>
        </xsl:call-template>
        <!--<xsl:call-template name="СведенияОГосРегистрцииРождения"/>-->
        <!--<xsl:call-template name="СведениеОВыданномСвидетРожд"/>-->

        <!--<xsl:apply-templates select="//СведСвидет"/>-->
        <xsl:apply-templates select="//СведСвидет" mode="отцовство"/>

        <tr class="tr1">
            <td class="td1" width="400">
                <xsl:value-of select='"Сведения о ребенке"'/>
            </td>
            <td class="td1" width="400">
                <xsl:apply-templates select="ПрдСведРег/СведРебенок/ФИОДо"/>
                <br/>
                <xsl:apply-templates select="ПрдСведРег/СведРебенок/ФИОПосле"/>
            </td>
        </tr>



        <xsl:call-template name="Сведения_для_отцовства">
            <xsl:with-param name="val1" select='"Сведения о государственной регистрации рождения ребенка, в отношении которого установлено отцовство"'/>
            <xsl:with-param name="val2" select='"Номер записи акта о рождении"'/>
            <xsl:with-param name="val3" select='"Дата составления записи акта о рождении"'/>
        </xsl:call-template>

        <tr class="tr1">
            <td class="td1" width="400">
                <xsl:value-of select='"Сведения о матери"'/>
            </td>
            <td class="td1" width="400">
                <xsl:apply-templates select="ПрдСведРег/СведМать"/>
            </td>
        </tr>

        <tr class="tr1">
            <td class="td1" width="400">
                <xsl:value-of select='"Сведения об отце"'/>
            </td>
            <td class="td1" width="400">
                <xsl:apply-templates select="ПрдСведРег/СведОтец"/>
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
    </xsl:template>
<!--End установление отцовства-->


    <!--Start перемена имени-->
    <xsl:template match="СведРегПерИмя">
        <xsl:call-template name="Сведения">
            <xsl:with-param name="val1" select='"Сведения о государственной регистрации перемены имени"'/>
            <xsl:with-param name="val2" select='"Номер записи акта о перемене имени"'/>
            <xsl:with-param name="val3" select='"Дата составления записи акта о перемене имени"'/>
        </xsl:call-template>
        <!--<xsl:call-template name="СведенияОГосРегистрцииРождения"/>-->
        <!--<xsl:call-template name="СведениеОВыданномСвидетРожд"/>-->
        <xsl:apply-templates select="//СведСвидет"/>

        <tr class="tr1">
            <td class="td1" width="400">
                <xsl:value-of select='"Передаваемые сведения о государственной регистрации перемены имени"'/>
            </td>
            <td class="td1" width="400">
                <xsl:apply-templates select="ПрдСведРег/ФИОДо"/>
                <br/>
                <xsl:apply-templates select="ПрдСведРег/ФИОПосле"/>
            </td>
        </tr>

        <xsl:apply-templates select="СведСвидет" mode="переменаИмени"/>
    </xsl:template>
    <!--End перемена имени-->


    <xsl:template match="СвидетРожд">
        <!--<xsl:template name="СведениеОВыданномСвидетРожд">-->
        <xsl:call-template name="СведенияОСвидельстве">
            <xsl:with-param name="val" select='"Сведения о выданном Свидетельстве о рождении"'/>
        </xsl:call-template>
    </xsl:template>
    <xsl:template match="ПрдСведРег"/>
    <xsl:template match="СведДокРод">
        <xsl:value-of select="@НаимДок"/>
        <br/>
        Код вида документа, подтверждающего факт рождения:
        <xsl:value-of select="@КодДок"/>
        <br/>
        <xsl:if test="НаимОрг">
            Наименование органа, выдавшего документ:
            <xsl:value-of select="НаимОрг"/>
            <br/>
        </xsl:if>

        <xsl:if test="@СерНомДок != ''">
            Серия номер:
            <xsl:value-of select="@СерНомДок"/>
            <br/>
        </xsl:if>
        Дата документа:
        <xsl:call-template name="dateMy">
            <xsl:with-param name="value" select="@ДатаДок"/>
        </xsl:call-template>
    </xsl:template>


    <xsl:template match="ФИОДо">
        <xsl:call-template name="только_ФИО_template">
            <xsl:with-param name="pref" select="' ДО'"/>
        </xsl:call-template>
    </xsl:template>
    <xsl:template match="ФИОПосле">
        <xsl:call-template name="только_ФИО_template">
            <xsl:with-param name="pref" select="' ПОСЛЕ'"/>
        </xsl:call-template>
        <br/>
        <!--Даты рождения-->
        <xsl:call-template name="даты_рождения"/>
        <br/>
        <xsl:call-template name="МестоРожден">
            <xsl:with-param name="МестоТекст" select="parent::node()/МестоРожден/@МестоТекст"/>
            <xsl:with-param name="КодСтраны" select="parent::node()/МестоРожден/@КодСтраны"/>
            <xsl:with-param name="НаимСтраны" select="parent::node()/МестоРожден/@НаимСтраны"/>
            <xsl:with-param name="Регион" select="parent::node()/МестоРожден/@Регион"/>
            <xsl:with-param name="НаимСубъект" select="parent::node()/МестоРожден/@НаимСубъект"/>
            <xsl:with-param name="Район" select="parent::node()/МестоРожден/@Район"/>
            <xsl:with-param name="Город" select="parent::node()/МестоРожден/@Город"/>
            <xsl:with-param name="НаселПункт" select="parent::node()/МестоРожден/@НаселПункт"/>
        </xsl:call-template>
        <br/>
        <xsl:call-template name="АдрМЖРФ">
            <xsl:with-param name="АдрРФТекст" select="parent::node()/АдрМЖРФ/@АдрРФТекст"/>
        </xsl:call-template>

    </xsl:template>
    <xsl:template match="ФИОРожд">
        <xsl:call-template name="ФИО_template"/>
    </xsl:template>
    <xsl:template match="ФИОУмер">
        <xsl:call-template name="ФИО_template"/>
    </xsl:template>
    <xsl:template match="ФИО">
        <xsl:call-template name="ФИО_template"/>
    </xsl:template>

    <xsl:template name="только_ФИО_template">
        <xsl:param name="pref"/>
        ФИО<xsl:if test="$pref != ''">
        <b>
            <xsl:value-of select="$pref"></xsl:value-of>
        </b>
    </xsl:if>:

        <xsl:if test="not(ПрФамилия) or ПрФамилия='0'">
            <xsl:value-of select="Фамилия"/>
        </xsl:if>
         
        <xsl:if test="not(ПрИмя) or ПрИмя = '0'">
            <xsl:value-of select="Имя"/>
        </xsl:if>
         
        <xsl:if test="not(ПрОтчество) or ПрОтчество='0'">
            <xsl:value-of select="Отчество"/>
        </xsl:if>
        <br/>
    </xsl:template>

    <xsl:template name="даты_рождения">
        <xsl:if test="parent::node()/ДатаРожд">
            Дата рождения:
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="parent::node()/ДатаРожд"/>
            </xsl:call-template>
            <!--<br/>-->
            <!--<xsl:value-of select="format-date(ДатаРожд, '[D01].[M01].[Y0001]', 'en',(),())"/>-->
        </xsl:if>
        <xsl:if test="parent::node()/МесГодРожд">
            Месяц год рождения:
            <xsl:value-of
                    select="concat(substring(parent::node()/МесГодРожд,6,2),'.',substring(parent::node()/МесГодРожд,1,4))"/>
            <br/>
        </xsl:if>
        <xsl:if test="parent::node()/ГодРожд">
            Год рождения:
            <xsl:value-of select="substring(parent::node()/ГодРожд,1,4)"/>
            <br/>
        </xsl:if>
    </xsl:template>

    <xsl:template name="ФИО_template">
        <!--ФИО-->
        <xsl:call-template name="только_ФИО_template">
            <xsl:with-param name="pref" select="''"/>
        </xsl:call-template>

        <!--Даты рождения-->
        <xsl:call-template name="даты_рождения"/>

        <!--Даты СМЕРТИ-->
        <br/>
        <xsl:if test="parent::node()/ДатаСмерт">
            Дата смерти:
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="parent::node()/ДатаСмерт"/>
            </xsl:call-template>
            <br/>
            <!--<xsl:value-of select="format-date(ДатаРожд, '[D01].[M01].[Y0001]', 'en',(),())"/>-->
        </xsl:if>
        <xsl:if test="parent::node()/МесГодСмерт">
            Месяц год смерти:
            <xsl:value-of
                    select="concat(substring(parent::node()/МесГодСмерт,6,2),'.',substring(parent::node()/МесГодСмерт,1,4))"/>
            <br/>
        </xsl:if>
        <xsl:if test="parent::node()/ГодСмерт">
            Год смерти:
            <xsl:value-of select="substring(parent::node()/ГодСмерт,1,4)"/>
            <br/>
        </xsl:if>


        <!--смещаемся на родительский узел-->
        <br/>
        <xsl:if test="parent::node()/@ЖивМертв = 1">
            <b>мертворожденный</b>
            <br/>
        </xsl:if>


        <xsl:call-template name="МестоРожден">
            <xsl:with-param name="МестоТекст" select="parent::node()/МестоРожден/@МестоТекст"/>
            <xsl:with-param name="КодСтраны" select="parent::node()/МестоРожден/@КодСтраны"/>
            <xsl:with-param name="НаимСтраны" select="parent::node()/МестоРожден/@НаимСтраны"/>
            <xsl:with-param name="Регион" select="parent::node()/МестоРожден/@Регион"/>
            <xsl:with-param name="НаимСубъект" select="parent::node()/МестоРожден/@НаимСубъект"/>
            <xsl:with-param name="Район" select="parent::node()/МестоРожден/@Район"/>
            <xsl:with-param name="Город" select="parent::node()/МестоРожден/@Город"/>
            <xsl:with-param name="НаселПункт" select="parent::node()/МестоРожден/@НаселПункт"/>
        </xsl:call-template>
                <br/>
                <br/>
        <xsl:call-template name="АдрМЖРФ">
            <xsl:with-param name="АдрРФТекст" select="parent::node()/АдрМЖРФ/@АдрРФТекст"/>
        </xsl:call-template>

        <xsl:if test="parent::node()/МестоСмерт">
            <xsl:call-template name="МестоСмерт">
                <xsl:with-param name="МестоТекст" select="parent::node()/МестоСмерт/@МестоТекст"/>
                <xsl:with-param name="КодСтраны" select="parent::node()/МестоСмерт/@КодСтраны"/>
                <xsl:with-param name="НаимСтраны" select="parent::node()/МестоСмерт/@НаимСтраны"/>
                <xsl:with-param name="Регион" select="parent::node()/МестоСмерт/@Регион"/>
                <xsl:with-param name="НаимСубъект" select="parent::node()/МестоСмерт/@НаимСубъект"/>
                <xsl:with-param name="Район" select="parent::node()/МестоСмерт/@Район"/>
                <xsl:with-param name="Город" select="parent::node()/МестоСмерт/@Город"/>
                <xsl:with-param name="НаселПункт" select="parent::node()/МестоСмерт/@НаселПункт"/>
            </xsl:call-template>
        </xsl:if>
    </xsl:template>

    <!--создал пустые шаблоны чтобы не выводились даты(значения нодов) так как мы делаем <xsl:apply-templates select="ПрдСведРег/СведОтец"/> то он выводит значения. УРОД!-->
    <xsl:template match="ДатаРожд"/>
    <xsl:template match="МесГодРожд"/>
    <xsl:template match="ГодРожд"/>
    <xsl:template match="ДатаСмерт"/>
    <xsl:template match="МесГодСмерт"/>
    <xsl:template match="ГодСмерт"/>

    <!--ОБЩИЕ шаблоны-->
    <xsl:template match="Супруг">
        <xsl:call-template name="Супруги_template">
            <xsl:with-param name="val" select='"супруга"'/>
        </xsl:call-template>
    </xsl:template>
    <xsl:template match="Супруга">
        <xsl:call-template name="Супруги_template">
            <xsl:with-param name="val" select='"супруги"'/>
        </xsl:call-template>
    </xsl:template>
    <xsl:template match="ПрдСведРег"/>
    <xsl:template name="Супруги_template">
        <xsl:param name="val"/>
        <xsl:if test="not(ПрФамилияДо) or ПрФамилияДо='0'">
            Фамилия до заключения брака <xsl:value-of select="$val"/>:
            <xsl:value-of select="ФамилияДо"/>
            <br/>
        </xsl:if>
        <xsl:if test="not(ПрФамилияПосле) or ПрФамилияПосле='0'">
            Фамилия после заключения брака <xsl:value-of select="$val"/>:
            <xsl:value-of select="ФамилияПосле"/>
            <br/>
        </xsl:if>
        <xsl:if test="not(ПрИмя) or ПрИмя = '0'">
            Имя <xsl:value-of select="$val"/>:<xsl:value-of select="Имя"/>
            <br/>
        </xsl:if>
        <xsl:if test="not(ПрОтчество) or ПрОтчество='0'">
            Отчество <xsl:value-of select="$val"/>:
            <xsl:value-of select="Отчество"/>
            <br/>
        </xsl:if>
        <!--Даты рождения-->
        <xsl:if test="ДатаРожд">
            Дата рождения <xsl:value-of select="$val"/>:
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="ДатаРожд"/>
            </xsl:call-template>
            <br/>
        </xsl:if>
        <xsl:if test="МесГодРожд">
            Месяц год рождения <xsl:value-of select="$val"/>:
            <xsl:value-of
                    select="concat(substring(МесГодРожд,6,2),'.',substring(МесГодРожд,1,4))"/>
            <br/>
        </xsl:if>
        <xsl:if test="ГодРожд">
            Год рождения <xsl:value-of select="$val"/>:
            <xsl:value-of select="substring(ГодРожд,1,4)"/>
            <br/>
        </xsl:if>
        <xsl:call-template name="МестоРожден">
            <xsl:with-param name="МестоТекст" select="МестоРожден/@МестоТекст"/>
            <xsl:with-param name="КодСтраны" select="МестоРожден/@КодСтраны"/>
            <xsl:with-param name="НаимСтраны" select="МестоРожден/@НаимСтраны"/>
            <xsl:with-param name="Регион" select="МестоРожден/@Регион"/>
            <xsl:with-param name="НаимСубъект" select="МестоРожден/@НаимСубъект"/>
            <xsl:with-param name="Район" select="МестоРожден/@Район"/>
            <xsl:with-param name="Город" select="МестоРожден/@Город"/>
            <xsl:with-param name="НаселПункт" select="МестоРожден/@НаселПункт"/>
        </xsl:call-template>
    </xsl:template>
    <xsl:template name="Сведения">
        <xsl:param name="val1"/>
        <xsl:param name="val2"/>
        <xsl:param name="val3"/>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select="$val1"/>
            <xsl:with-param name="col2" select='"title"'/>
        </xsl:call-template>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select="$val2"/>
            <xsl:with-param name="col2" select="@НомерЗапис"/>
        </xsl:call-template>
        <br/>
        <xsl:variable name="ДатаЗапис">
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="@ДатаЗапис"/>
            </xsl:call-template>
        </xsl:variable>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select="$val3"/>
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
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Наименование статуса"'/>
            <xsl:with-param name="col2" select="СтатусЗаписи/@НаимСтатус"/>
        </xsl:call-template>
        <xsl:variable name="ДатаНачСтатус">
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="СтатусЗаписи/@ДатаНачСтатус"/>
            </xsl:call-template>
        </xsl:variable>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Дата начала действия статуса"'/>
            <xsl:with-param name="col2" select="СтатусЗаписи/$ДатаНачСтатус"/>
        </xsl:call-template>
    </xsl:template>

    <xsl:template name="Сведения_для_отцовства">
        <xsl:param name="val1"/>
        <xsl:param name="val2"/>
        <xsl:param name="val3"/>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select="$val1"/>
            <xsl:with-param name="col2" select='"title"'/>
        </xsl:call-template>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select="$val2"/>
            <xsl:with-param name="col2" select="ПрдСведРег/СведРебенок/СведРегРожд/@НомерЗапис"/>
        </xsl:call-template>
        <br/>
        <xsl:variable name="ДатаЗапис">
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="ПрдСведРег/СведРебенок/СведРегРожд/@ДатаЗапис"/>
            </xsl:call-template>
        </xsl:variable>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select="$val3"/>
            <xsl:with-param name="col2" select="$ДатаЗапис"/>
        </xsl:call-template>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1"
                            select='"Код ЗАГС"'/>
            <xsl:with-param name="col2" select="ПрдСведРег/СведРебенок/СведРегРожд/ОрганЗАГСРожд/@КодЗАГС"/>
        </xsl:call-template>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1"
                            select='"Полное наименование органа ЗАГС,которым произведена государственная регистрация акта гражданского состояния"'/>
            <xsl:with-param name="col2" select="ПрдСведРег/СведРебенок/СведРегРожд/ОрганЗАГСРожд/@НаимЗАГС"/>
        </xsl:call-template>
    </xsl:template>

    <xsl:template name="АдрМЖРФ">
        <xsl:param name="АдрРФТекст"/>
        <xsl:if test="$АдрРФТекст != ''">
            Адрес места жительства:
            <xsl:value-of select="$АдрРФТекст"/>
        </xsl:if>
    </xsl:template>


    <xsl:template name="МестоРожден">
        <xsl:param name="МестоТекст"/>
        <xsl:param name="КодСтраны"/>
        <xsl:param name="НаимСтраны"/>
        <xsl:param name="Регион"/>
        <xsl:param name="НаимСубъект"/>
        <xsl:param name="Район"/>
        <xsl:param name="Город"/>
        <xsl:param name="НаселПункт"/>

        <xsl:if test="$МестоТекст != ''">
            Место рожения:
            <xsl:value-of select="$МестоТекст"/>
            <xsl:if test="$НаимСтраны">
                <br/>
                Страна: <xsl:value-of select="$НаимСтраны"/>,
            </xsl:if>
            <xsl:if test="$Регион">
                <xsl:value-of select="$Регион"/>,
            </xsl:if>
            <xsl:if test="$НаимСубъект">
                 <xsl:value-of select="$НаимСубъект"/>,
            </xsl:if>
            <xsl:if test="$Район">
                 <xsl:value-of select="$Район"/>,
            </xsl:if>
            <xsl:if test="$Город">
                 <xsl:value-of select="$Город"/>,
            </xsl:if>
            <xsl:if test="$НаселПункт">
                 <xsl:value-of select="$НаселПункт"/>
            </xsl:if>
        </xsl:if>
    </xsl:template>

    <xsl:template name="МестоСмерт">
        <xsl:param name="МестоТекст"/>
        <xsl:param name="КодСтраны"/>
        <xsl:param name="НаимСтраны"/>
        <xsl:param name="Регион"/>
        <xsl:param name="НаимСубъект"/>
        <xsl:param name="Район"/>
        <xsl:param name="Город"/>
        <xsl:param name="НаселПункт"/>

        <xsl:if test="$МестоТекст != ''">
            <br/>
            Место смерти:
            <xsl:value-of select="$МестоТекст"/>
            <xsl:if test="$НаимСтраны">
                <br/>
                Страна: <xsl:value-of select="$НаимСтраны"/>,
            </xsl:if>
            <xsl:if test="$Регион">
                <xsl:value-of select="$Регион"/>,
            </xsl:if>
            <xsl:if test="$НаимСубъект">
                 <xsl:value-of select="$НаимСубъект"/>,
            </xsl:if>
            <xsl:if test="$Район">
                 <xsl:value-of select="$Район"/>,
            </xsl:if>
            <xsl:if test="$Город">
                 <xsl:value-of select="$Город"/>,
            </xsl:if>
            <xsl:if test="$НаселПункт">
                 <xsl:value-of select="$НаселПункт"/>
            </xsl:if>
        </xsl:if>

    </xsl:template>
    <xsl:template name="СведенияОСвидельстве">
        <xsl:param name="val"/>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select="$val"/>
            <xsl:with-param name="col2" select='"title"'/>
        </xsl:call-template>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1"
                            select='"Серия свидетельства"'/>
            <xsl:with-param name="col2" select="@СерияСвидет"/>
        </xsl:call-template>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1"
                            select='"Номер свидетельства"'/>
            <xsl:with-param name="col2" select="@НомерСвидет"/>
        </xsl:call-template>
        <xsl:variable name="ДатаВыдСвидет">
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="@ДатаВыдСвидет"/>
            </xsl:call-template>
        </xsl:variable>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1"
                            select='"Дата выдачи свидетельства"'/>
            <xsl:with-param name="col2" select="$ДатаВыдСвидет"/>
        </xsl:call-template>
    </xsl:template>

</xsl:stylesheet>
