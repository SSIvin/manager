<!-- Created with Liquid Studio 2020 (https://www.liquid-technologies.com) -->
<!--ALT0160 - неразрывный пробел-->
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <!--<xsl:import href="Dic.xsl"/>-->
    <!--<xsl:import href="util.xsl"/>-->
    <xsl:output method="html" encoding="UTF-8" doctype-public="-//W3C//DTD HTML 4.01//EN"
                doctype-system="http://www/w3c.org/TR/html4/strict.dtd"
                indent="yes"/>

    <xsl:template name="СведенияОСвидельстве">
        <xsl:param name="val"/>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select="$val"/>
            <xsl:with-param name="col2" select='"title"'/>
        </xsl:call-template>

        <xsl:variable name="ТипСвидет">
            <xsl:call-template name="ZagsТипСвидет">
                <xsl:with-param name="kod" select="@ТипСвидет"/>
            </xsl:call-template>
        </xsl:variable>

        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1"
                            select='"Тип свидетельства"'/>
            <xsl:with-param name="col2" select="$ТипСвидет"/>
        </xsl:call-template>

        <xsl:if test="not(ПрСерияСвидет) or ПрСерияСвидет='0'">
            <xsl:call-template name="tableInsertRow">
                <xsl:with-param name="col1"
                                select='"Серия свидетельства"'/>
                <xsl:with-param name="col2" select="СерияСвидет"/>
            </xsl:call-template>
            <!--<br/>-->
        </xsl:if>
        <xsl:if test="not(ПрНомерСвидет) or ПрНомерСвидет='0'">
            <xsl:call-template name="tableInsertRow">
                <xsl:with-param name="col1"
                                select='"Номер свидетельства"'/>
                <xsl:with-param name="col2" select="НомерСвидет"/>
            </xsl:call-template>
            <!--<br/>-->
        </xsl:if>
        <xsl:if test="not(ПрДатаВыдСвидет) or ПрДатаВыдСвидет='0'">
            <xsl:variable name="ДатаВыдСвидет">
                <xsl:call-template name="dateMy">
                    <xsl:with-param name="value" select="ДатаВыдСвидет"/>
                </xsl:call-template>
            </xsl:variable>
            <xsl:call-template name="tableInsertRow">
                <xsl:with-param name="col1"
                                select='"Дата выдачи свидетельства"'/>
                <xsl:with-param name="col2" select="$ДатаВыдСвидет"/>
            </xsl:call-template>
            <!--<br/>-->
        </xsl:if>
    </xsl:template>

    <!--<xsl:template name="СведенияОСвидельстве">-->
    <!--<xsl:param name="val"/>-->
    <!--<xsl:call-template name="tableInsertRow">-->
    <!--<xsl:with-param name="col1" select="$val"/>-->
    <!--<xsl:with-param name="col2" select='"title"'/>-->
    <!--<xsl:with-param name="color" select='"c7c7c7"'/>-->
    <!--</xsl:call-template>-->
    <!--<xsl:call-template name="tableInsertRow">-->
    <!--<xsl:with-param name="col1"-->
    <!--select='"Серия свидетельства"'/>-->
    <!--<xsl:with-param name="col2" select="@СерияСвидет"/>-->
    <!--</xsl:call-template>-->

    <!--<xsl:variable name="ТИП_СВИДЕТ">-->
    <!--<xsl:call-template name="ZagsТипСвидет">-->
    <!--<xsl:with-param name="kod" select="@ТипСвидет"/>-->
    <!--</xsl:call-template>-->
    <!--</xsl:variable>-->
    <!--<xsl:call-template name="tableInsertRow">-->
    <!--<xsl:with-param name="col1"-->
    <!--select='"Тип выданного свидетельства"'/>-->
    <!--<xsl:with-param name="col2" select="$ТИП_СВИДЕТ"/>-->
    <!--</xsl:call-template>-->
    <!--<xsl:call-template name="tableInsertRow">-->
    <!--<xsl:with-param name="col1"-->
    <!--select='"Номер свидетельства"'/>-->
    <!--<xsl:with-param name="col2" select="НомерСвидет"/>-->
    <!--</xsl:call-template>-->
    <!--<xsl:call-template name="tableInsertRow">-->
    <!--<xsl:with-param name="col1"-->
    <!--select='"Серия свидетельства"'/>-->
    <!--<xsl:with-param name="col2" select="СерияСвидет"/>-->
    <!--</xsl:call-template>-->
    <!--<xsl:variable name="ДатаВыдСвидет">-->
    <!--<xsl:call-template name="dateMy">-->
    <!--<xsl:with-param name="value" select="ДатаВыдСвидет"/>-->
    <!--</xsl:call-template>-->
    <!--</xsl:variable>-->
    <!--<xsl:call-template name="tableInsertRow">-->
    <!--<xsl:with-param name="col1"-->
    <!--select='"Дата выдачи свидетельства"'/>-->
    <!--<xsl:with-param name="col2" select="$ДатаВыдСвидет"/>-->
    <!--</xsl:call-template>-->
    <!--</xsl:template>-->


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

    <xsl:template name="Сведения_для_отцовства">
        <xsl:param name="val1"/>
        <xsl:param name="val2"/>
        <xsl:param name="val3"/>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select="$val1"/>
            <xsl:with-param name="col2" select='"title"'/>
            <xsl:with-param name="color" select='"c7c7c7"'/>
        </xsl:call-template>

        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select="$val2"/>
            <xsl:with-param name="col2" select="ПрдСведРег/СведРебенок/СведРегРожд/ЗапАктОсн/@НомерЗапис"/>
        </xsl:call-template>
        <br/>
        <xsl:variable name="ДатаЗапис">
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="ПрдСведРег/СведРебенок/СведРегРожд/ЗапАктОсн/ДатаЗапис"/>
            </xsl:call-template>
        </xsl:variable>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select="$val3"/>
            <xsl:with-param name="col2" select="$ДатаЗапис"/>
        </xsl:call-template>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1"
                            select='"Код ЗАГС"'/>
            <xsl:with-param name="col2" select="ПрдСведРег/СведРебенок/СведРегРожд/ОрганЗАГС/@КодЗАГС"/>
        </xsl:call-template>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1"
                            select='"Полное наименование органа ЗАГС,которым произведена государственная регистрация акта гражданского состояния"'/>
            <xsl:with-param name="col2" select="ПрдСведРег/СведРебенок/СведРегРожд/ОрганЗАГС/@НаимЗАГС"/>
        </xsl:call-template>
    </xsl:template>

    <xsl:template match="МЖПосл">
        <xsl:if test="АдрМЖРФ">
            <xsl:value-of select="АдрМЖРФ/АдрРФФИАС/@АдрТекст"/>
            <xsl:value-of select="АдрМЖРФ/АдрРФНеФИАС/@АдрТекст"/>
            <xsl:value-of select="АдрМЖРФ/АдрТекст"/>
        </xsl:if>
        <xsl:if test="АдрМЖИн">
            <xsl:value-of select="АдрМЖИн/АдрТекст"/>
        </xsl:if>
        <xsl:if test="АдрМЖКонв">
            <xsl:value-of select="."/>
        </xsl:if>
    </xsl:template>

    <xsl:template name="АдрМЖРФ">
        <xsl:param name="АдрРФТекст"/>
        <xsl:if test="$АдрРФТекст != ''">
            <b>Адрес места жительства: </b>
            <xsl:value-of select="$АдрРФТекст"/>
        </xsl:if>
    </xsl:template>

    <xsl:template name="АдрРФФИАС">
        <xsl:param name="АдрТекст"/>
        <xsl:if test="$АдрТекст != ''">
            <b>Адрес места жительства: </b>
            <xsl:value-of select="$АдрТекст"/>
            <br/>
        </xsl:if>
    </xsl:template>

    <xsl:template name="АдрМЖКонв">
        <xsl:param name="АдрТекст"/>
        <xsl:if test="$АдрТекст != ''">
            <b>Адрес места жительства: </b>
            <xsl:value-of select="$АдрТекст"/>
            <br/>
        </xsl:if>
    </xsl:template>

    <xsl:template name="АдрМЖ_ALL">
        <xsl:param name="АдрМЖ"/>
        <xsl:call-template name="АдрРФФИАС">
            <xsl:with-param name="АдрТекст" select="$АдрМЖ/АдрМЖРФ/АдрРФФИАС/@АдрТекст"/>
        </xsl:call-template>
        <xsl:call-template name="АдрРФНеФИАС">
            <xsl:with-param name="АдрТекст" select="$АдрМЖ/АдрМЖРФ/АдрРФНеФИАС/@АдрТекст"/>
        </xsl:call-template>
        <xsl:call-template name="АдрТекст">
            <xsl:with-param name="АдрТекст" select="$АдрМЖ/АдрМЖРФ/АдрТекст"/>
        </xsl:call-template>
        <xsl:call-template name="АдрМЖИн">
            <xsl:with-param name="АдрТекст" select="$АдрМЖ/АдрМЖИн/АдрТекст"/>
        </xsl:call-template>
        <xsl:call-template name="АдрМЖКонв">
            <xsl:with-param name="АдрТекст" select="$АдрМЖ/АдрМЖКонв"/>
        </xsl:call-template>
    </xsl:template>


    <xsl:template name="АдрМЖИн">
        <xsl:param name="АдрТекст"/>
        <xsl:if test="$АдрТекст != ''">
            <b>Адрес места жительства: </b>
            <xsl:value-of select="$АдрТекст"/>
            <br/>
        </xsl:if>
    </xsl:template>

    <xsl:template name="АдрРФНеФИАС">
        <xsl:param name="АдрТекст"/>
        <xsl:if test="$АдрТекст != ''">
            <b>Адрес места жительства: </b>
            <xsl:value-of select="$АдрТекст"/>
            <br/>
        </xsl:if>
    </xsl:template>

    <xsl:template name="АдрТекст">
        <xsl:param name="АдрТекст"/>
        <xsl:if test="$АдрТекст != ''">
            <b>Адрес места жительства: </b>
            <xsl:value-of select="$АдрТекст"/>
            <br/>
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
            <b>Место рожения:</b>
            <xsl:value-of select="$МестоТекст"/>
            <!--<xsl:if test="$НаимСтраны">-->
                <!--<br/>-->
                <!--&lt;!&ndash;Страна: <xsl:value-of select="$НаимСтраны"/>,&ndash;&gt;-->
            <!--</xsl:if>-->
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
            <br/>
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
            <b>Место смерти: </b>
            <xsl:value-of select="$МестоТекст"/>
            <xsl:if test="$НаимСтраны">
                <br/>
                <!--Страна: <xsl:value-of select="$НаимСтраны"/>,-->
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
        <xsl:if test="ДатаРождКаленд">
            Дата рождения <xsl:value-of select="$val"/>:
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="ДатаРождКаленд"/>
            </xsl:call-template>
        </xsl:if>
        <br/>
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

        <xsl:call-template name="АдрМЖ_ALL">
            <xsl:with-param name="АдрМЖ" select="АдрМЖ"/>
        </xsl:call-template>
    </xsl:template>

    <xsl:template name="ФИО_template">
        <!--ФИО-->
        <xsl:call-template name="только_ФИО_template">
            <xsl:with-param name="pref" select="''"/>
        </xsl:call-template>

        <!--Даты рождения-->
        <xsl:call-template name="даты_рождения"/>

        <!--Даты СМЕРТИ-->
        <!--<br/>-->
        <xsl:if test="parent::node()/ДатаСмерт">
            Дата смерти:
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="parent::node()/ДатаСмерт"/>
            </xsl:call-template>
            <!--<br/>-->
            <!--<xsl:value-of select="format-date(ДатаРожд, '[D01].[M01].[Y0001]', 'en',(),())"/>-->
        </xsl:if>
        <xsl:if test="parent::node()/МесГодСмерт">
            Месяц год смерти:
            <xsl:value-of
                    select="concat(substring(parent::node()/МесГодСмерт,6,2),'.',substring(parent::node()/МесГодСмерт,1,4))"/>
            <!--<br/>-->
        </xsl:if>
        <xsl:if test="parent::node()/ГодСмерт">
            Год смерти:
            <xsl:value-of select="substring(parent::node()/ГодСмерт,1,4)"/>
            <!--<br/>-->
        </xsl:if>


        <!--смещаемся на родительский узел-->
        <!--<br/>-->
        <xsl:if test="parent::node()/@ЖивМертв = 1">
            <b>мертворожденный</b>
            <!--<br/>-->
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
        <!--<br/>-->
        <br/>
        <xsl:call-template name="АдрМЖ_ALL">
            <xsl:with-param name="АдрМЖ" select="parent::node()/АдрМЖ"/>
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

    <xsl:template match="ФИОПосле">
        <xsl:call-template name="только_ФИО_template">
            <xsl:with-param name="pref" select="' ПОСЛЕ'"/>
        </xsl:call-template>
        <br/>
        <!--Даты рождения-->
        <xsl:call-template name="даты_рождения"/>

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

    <xsl:template match="ФИОДо">
        <xsl:call-template name="только_ФИО_template">
            <xsl:with-param name="pref" select="' ДО'"/>
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
        ФИО
        <xsl:if test="$pref != ''">
            <b>
                <xsl:value-of select="$pref"></xsl:value-of>
            </b>
        </xsl:if>
        :

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
        <xsl:if test="parent::node()/ДатаРождКаленд">
            Дата рождения:
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="parent::node()/ДатаРождКаленд"/>
            </xsl:call-template>
            <!--<xsl:text>&#xA;&#xD;</xsl:text>-->
            <!--<xsl:value-of select="format-date(ДатаРожд, '[D01].[M01].[Y0001]', 'en',(),())"/>-->
        </xsl:if>
        <xsl:if test="parent::node()/МесГодРожд">
            Месяц год рождения:
            <xsl:value-of
                    select="concat(substring(parent::node()/МесГодРожд,6,2),'.',substring(parent::node()/МесГодРожд,1,4))"/>
        </xsl:if>
        <xsl:if test="parent::node()/ГодРожд">
            Год рождения:
            <xsl:value-of select="substring(parent::node()/ГодРожд,1,4)"/>
        </xsl:if>
        <br/>
    </xsl:template>

    <xsl:template match="СведДокСмерт">
        <xsl:value-of select="@НаимДок"/>
        Код вида документа, подтверждающего факт смерти:
        <xsl:value-of select="@КодДок"/>
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

</xsl:stylesheet>
