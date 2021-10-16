<!-- Created with Liquid Studio 2020 (https://www.liquid-technologies.com) -->
<!--ALT0160 - неразрывный пробел-->
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:import href="reportTemplate.xsl"/>

    <xsl:template match="/">
        <xsl:call-template name="root">
            <xsl:with-param
                    name="title"
                    select='"Сведения о нахождении на регистрационном учете в органах власти содействия занятости населения в субъектах Российской Федерации"'/>
        </xsl:call-template>
    </xsl:template>


    <!--Запрос-->
    <xsl:template match="reportRequest">
        <b>Код региона по ОКТМО:
            <xsl:value-of select="MessagePrimaryContent/SZNRequest/RegionCode"/>
        </b>
        <br/>
        Фамилия: <xsl:value-of select="MessagePrimaryContent/SZNRequest/LastName"/>
        <br/>
        Имя: <xsl:value-of select="MessagePrimaryContent/SZNRequest/FirstName"/>
        <br/>
        <xsl:if test="MessagePrimaryContent/SZNRequest/MiddleName!=''">
            Отчество: <xsl:value-of select="MessagePrimaryContent/SZNRequest/MiddleName"/>
            <br/>
        </xsl:if>
        СНИЛС: <xsl:value-of select="MessagePrimaryContent/SZNRequest/Snils"/>
        <br/>
        Дата рождения:
        <xsl:call-template name="dateMy">
            <xsl:with-param name="value" select="MessagePrimaryContent/SZNRequest/BirthDate"/>
        </xsl:call-template>
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

        <table class="table1">
            <xsl:call-template name="СведенияОперсоне">
                <xsl:with-param name="val1" select='"Основные сведения:"'/>
            </xsl:call-template>
        </table>

        <xsl:if test="SZNResponse/PresenceData = 'false'">
            <br/>
            Сведения о нахождении на регистрационном учете отсутствуют.
        </xsl:if>


        <table class="table1">
            <xsl:if test="count(SZNResponse/RegistrationAccountPeriods/*) &gt; 0 ">
                <xsl:call-template name="tableInsertRow">
                    <xsl:with-param name="col1" select='"Период нахождения на регистрационном учете"'/>
                    <xsl:with-param name="col2" select='"title"'/>
                    <xsl:with-param name="color" select='"F3B19C"'/>
                </xsl:call-template>
                <xsl:if test="SZNResponse/RegistrationAccountPeriods/RegistrationAccountPeriod/AsTheUnemployed">
                    <tr class="tr1">
                        <td class="td1" width="400">
                            <xsl:value-of select='"В качестве безработного"'/>
                        </td>
                        <td class="td1" width="400">
                            <xsl:apply-templates select="SZNResponse/RegistrationAccountPeriods/RegistrationAccountPeriod/AsTheUnemployed"/>
                        </td>
                    </tr>
                </xsl:if>

                <xsl:if test="SZNResponse/RegistrationAccountPeriods/RegistrationAccountPeriod/AsSearchWork">
                    <tr class="tr1">
                        <td class="td1" width="400">
                            <xsl:value-of select='"В целях поиска подходящей работы"'/>
                        </td>
                        <td class="td1" width="400">
                            <xsl:apply-templates select="SZNResponse/RegistrationAccountPeriods/RegistrationAccountPeriod/AsSearchWork"/>
                        </td>
                    </tr>
                </xsl:if>
            </xsl:if>

            <!--<xsl:apply-templates select="SZNResponse/RegistrationAccountPeriods"/>-->

            <xsl:if test="count(SZNResponse/InfoPeriodsSeniority/*) &gt; 0">
                <xsl:call-template name="tableInsertRow">
                    <xsl:with-param name="col1" select='"Сведения о периодах, засчитываемых в трудовой стаж"'/>
                    <xsl:with-param name="col2" select='"title"'/>
                    <xsl:with-param name="color" select='"ccff99"'/>
                </xsl:call-template>

                <xsl:if test="SZNResponse/InfoPeriodsSeniority/PeriodReceptionUnemploymentBenefit">
                    <tr class="tr1">
                        <td class="td1" width="400">
                            <xsl:value-of select='"Период получения пособия по безработице"'/>
                        </td>
                        <td class="td1" width="400">
                            <xsl:apply-templates select="SZNResponse/InfoPeriodsSeniority/PeriodReceptionUnemploymentBenefit"/>
                        </td>
                    </tr>
                </xsl:if>

                <xsl:if test="SZNResponse/InfoPeriodsSeniority/PeriodParticipationPaidPublicWorks">
                    <tr class="tr1">
                        <td class="td1" width="400">
                            <xsl:value-of select='"Период участия в оплачиваемых общественных работах"'/>
                        </td>
                        <td class="td1" width="400">
                            <xsl:apply-templates select="SZNResponse/InfoPeriodsSeniority/PeriodParticipationPaidPublicWorks"/>
                        </td>
                    </tr>
                </xsl:if>

                <xsl:if test="SZNResponse/InfoPeriodsSeniority/PeriodMovingEmployment">
                    <tr class="tr1">
                        <td class="td1" width="400">
                            <xsl:value-of select='"Период переезда по направлению в другую местность для трудоустройства"'/>
                        </td>
                        <td class="td1" width="400">
                            <xsl:apply-templates select="SZNResponse/InfoPeriodsSeniority/PeriodMovingEmployment"/>
                        </td>
                    </tr>
                </xsl:if>

                <!--<xsl:apply-templates select="SZNResponse/InfoPeriodsSeniority"/>-->
            </xsl:if>

            <xsl:if test="count(SZNResponse/InclusionDataBases/*) &gt; 0">
                <xsl:call-template name="tableInsertRow">
                    <xsl:with-param name="col1" select='"Основания включения сведений"'/>
                    <xsl:with-param name="col2" select='"title"'/>
                    <xsl:with-param name="color" select='"BBBBBB"'/>
                </xsl:call-template>
                <xsl:apply-templates select="SZNResponse/InclusionDataBases"/>
            </xsl:if>
        </table>
    </xsl:template>

    <xsl:template match="InclusionDataBasis">
        <xsl:variable name="DatePrivateAffair">
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="DatePrivateAffair"/>
            </xsl:call-template>
        </xsl:variable>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Дата/Номер личного дела"'/>
            <xsl:with-param name="col2" select="concat($DatePrivateAffair, ' / ', NumberPrivateAffair)"/>
        </xsl:call-template>
    </xsl:template>

      <xsl:template match="PeriodReceptionUnemploymentBenefit">
        <xsl:call-template name="StartEnd">
            <xsl:with-param name="param" select="."/>
        </xsl:call-template>
    </xsl:template>

    <xsl:template match="AsTheUnemployed">
        <xsl:call-template name="StartEnd">
            <xsl:with-param name="param" select="."/>
        </xsl:call-template>
    </xsl:template>

    <xsl:template match="AsSearchWork">
        <xsl:call-template name="StartEnd">
            <xsl:with-param name="param" select="."/>
        </xsl:call-template>
    </xsl:template>

    <xsl:template match="PeriodParticipationPaidPublicWorks">
        <xsl:call-template name="StartEnd">
            <xsl:with-param name="param" select="."/>
        </xsl:call-template>
    </xsl:template>

    <xsl:template match="PeriodMovingEmployment">
        <xsl:call-template name="StartEnd">
            <xsl:with-param name="param" select="."/>
        </xsl:call-template>
    </xsl:template>


    <!--<xsl:template name="MyRegistrationAccountPeriod">-->
        <!--<xsl:param name="val1"/>-->
        <!--<xsl:call-template name="tableInsertRow">-->
            <!--<xsl:with-param name="col1" select="$val1"/>-->
            <!--<xsl:with-param name="col2" select='"title"'/>-->
            <!--<xsl:with-param name="color" select='"F3B19C"'/>-->
        <!--</xsl:call-template>-->

        <!--<tr class="tr1">-->
            <!--<td class="td1" width="400">-->
                <!--<xsl:value-of select='"В качестве безработного"'/>-->
            <!--</td>-->
            <!--<td class="td1" width="400">-->
                <!--<xsl:call-template name="StartEnd">-->
                    <!--<xsl:with-param name="param" select="AsTheUnemployed"/>-->
                <!--</xsl:call-template>-->
            <!--</td>-->
        <!--</tr>-->
        <!--<tr class="tr1">-->
            <!--<td class="td1" width="400">-->
                <!--<xsl:value-of select='"В целях поиска подходящей работы"'/>-->
            <!--</td>-->
            <!--<td class="td1" width="400">-->
                <!--<xsl:call-template name="StartEnd">-->
                    <!--<xsl:with-param name="param" select="AsSearchWork"/>-->
                <!--</xsl:call-template>-->
            <!--</td>-->
        <!--</tr>-->
    <!--</xsl:template>-->

    <!--<xsl:template name="MyPeriodReceptionUnemploymentBenefit">-->
        <!--<xsl:param name="val1"/>-->


        <!--<tr class="tr1">-->
            <!--<td class="td1" width="400">-->
                <!--<xsl:value-of select='"Период получения пособия по безработице"'/>-->
            <!--</td>-->
            <!--<td class="td1" width="400">-->
                <!--<xsl:call-template name="StartEnd">-->
                    <!--<xsl:with-param name="param" select="."/>-->
                <!--</xsl:call-template>-->
            <!--</td>-->
        <!--</tr>-->
        <!--<tr class="tr1">-->
            <!--<td class="td1" width="400">-->
                <!--<xsl:value-of select='"Период участия в оплачиваемых общественных работах"'/>-->
            <!--</td>-->
            <!--<td class="td1" width="400">-->
                <!--<xsl:call-template name="StartEnd">-->
                    <!--<xsl:with-param name="param" select="."/>-->
                <!--</xsl:call-template>-->
            <!--</td>-->
        <!--</tr>-->

        <!--<tr class="tr1">-->
            <!--<td class="td1" width="400">-->
                <!--<xsl:value-of select='"Период переезда по направлению в другую местность для трудоустройства"'/>-->
            <!--</td>-->
            <!--<td class="td1" width="400">-->
                <!--<xsl:call-template name="StartEnd">-->
                    <!--<xsl:with-param name="param" select="."/>-->
                <!--</xsl:call-template>-->
            <!--</td>-->
        <!--</tr>-->
    <!--</xsl:template>-->


    <xsl:template name="StartEnd">
        <xsl:param name="param"/>
        <!--Дата начала периода:-->
        <xsl:call-template name="dateMy">
            <xsl:with-param name="value" select="$param/DateStart"/>
        </xsl:call-template>
        -
        <xsl:call-template name="dateMy">
            <xsl:with-param name="value" select="$param/DateEnd"/>
        </xsl:call-template>
        <!--<xsl:value-of select="$param/DateStart"/>  -  <xsl:value-of select="$param/DateEnd"/>-->
        <br/>
        <!--Дата конца периода:-->

    </xsl:template>


    <xsl:template name="СведенияОперсоне">
        <xsl:param name="val1"/>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select="$val1"/>
            <xsl:with-param name="col2" select='"title"'/>
            <xsl:with-param name="color" select='"BBBBBB"'/>
        </xsl:call-template>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Фамилия"'/>
            <xsl:with-param name="col2" select="SZNResponse/LastName"/>
        </xsl:call-template>
        <br/>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Имя"'/>
            <xsl:with-param name="col2" select="SZNResponse/FirstName"/>
        </xsl:call-template>
        <br/>
        <xsl:if test="SZNResponse/MiddleName">
            <xsl:call-template name="tableInsertRow">
                <xsl:with-param name="col1" select='"Отчество"'/>
                <xsl:with-param name="col2" select="SZNResponse/MiddleName"/>
            </xsl:call-template>
        </xsl:if>
        <xsl:variable name="ДатаРождения">
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="SZNResponse/BirthDate"/>
            </xsl:call-template>
        </xsl:variable>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Дата рождения"'/>
            <xsl:with-param name="col2" select="$ДатаРождения"/>
        </xsl:call-template>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"СНИЛС"'/>
            <xsl:with-param name="col2" select="SZNResponse/Snils"/>
        </xsl:call-template>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Адрес места жительства"'/>
            <xsl:with-param name="col2" select="SZNResponse/ResidenceAddress"/>
        </xsl:call-template>
        <xsl:variable name="DateQuery">
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="SZNResponse/DateQuery"/>
            </xsl:call-template>
        </xsl:variable>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Дата направления запроса"'/>
            <xsl:with-param name="col2" select="$DateQuery"/>
        </xsl:call-template>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Наименование органа содействия занятости населения"'/>
            <xsl:with-param name="col2" select="SZNResponse/NameOrgSZN"/>
        </xsl:call-template>
        <xsl:variable name="DateFormationData">
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="SZNResponse/DateFormationData"/>
            </xsl:call-template>
        </xsl:variable>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select='"Дата формирования сведений"'/>
            <xsl:with-param name="col2" select="$DateFormationData"/>
        </xsl:call-template>

    </xsl:template>

</xsl:stylesheet>
