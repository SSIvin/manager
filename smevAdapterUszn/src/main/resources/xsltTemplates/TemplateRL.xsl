<!-- Created with Liquid Studio 2020 (https://www.liquid-technologies.com) -->
<!--ALT0160 - неразрывный пробел-->
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:import href="reportTemplate.xsl"/>

    <xsl:template match="/">
        <xsl:call-template name="root">
            <xsl:with-param
                    name="title"
                    select='"Сведения из ЕГИССО о включении или исключении лица или связанных лиц из реестра лиц, связанных с изменением родительских прав, реестра лиц с измененной дееспособностью и реестра законных представителей"'/>
        </xsl:call-template>
    </xsl:template>


    <!--Запрос-->
    <xsl:template match="reportRequest">

        <xsl:if test="MessagePrimaryContent/request/request/rlirp">
            <u>Реестр изменений родительских прав:</u>
            <br/>
            <xsl:choose>
                <xsl:when test="MessagePrimaryContent/request/request/rlirp/parentRequest">
                    СНИЛС родителя: <xsl:value-of select="MessagePrimaryContent/request/request/rlirp/parentRequest/snils"/>
                </xsl:when>
                <xsl:when test="MessagePrimaryContent/request/request/rlirp/childRequest">
                    СНИЛС ребенка: <xsl:value-of select="MessagePrimaryContent/request/request/rlirp/childRequest/snils"/>
                </xsl:when>
                <xsl:when test="MessagePrimaryContent/request/request/rlirp/parentChildRequest">
                    СНИЛС родителя: <xsl:value-of select="MessagePrimaryContent/request/request/rlirp/parentChildRequest/parentSnils"/>
                    <br/>
                    СНИЛС ребенка: <xsl:value-of select="MessagePrimaryContent/request/request/rlirp/parentChildRequest/childSnils"/>
                </xsl:when>
            </xsl:choose>
            <br/>
        </xsl:if>

        <xsl:if test="MessagePrimaryContent/request/request/rlid">
            <u>Реестр измененной дееспособности:</u>
            <br/>
            СНИЛС лица с измененной дееспособностью:<xsl:value-of select="MessagePrimaryContent/request/request/rlid/snils"/>
            <br/>
        </xsl:if>

        <xsl:if test="MessagePrimaryContent/request/request/rzp">
            <u>Реестр законных представителей:</u>
            <br/>
            <xsl:choose>
                <xsl:when test="MessagePrimaryContent/request/request/rzp/representativeRequest">
                    СНИЛС законного представителя: <xsl:value-of select="MessagePrimaryContent/request/request/rzp/representativeRequest"/>
                </xsl:when>
                <xsl:when test="MessagePrimaryContent/request/request/rzp/representedPersonRequestSnils">
                    СНИЛС представляемого лица: <xsl:value-of select="MessagePrimaryContent/request/request/rzp/representedPersonRequestSnils"/>
                </xsl:when>
                <xsl:when test="MessagePrimaryContent/request/request/rzp/relationRequest">
                    СНИЛС представляемого лица: <xsl:value-of select="MessagePrimaryContent/request/request/rzp/relationRequest/representedPersonSnils"/>
                    <br/>
                    СНИЛС представителя: <xsl:value-of select="MessagePrimaryContent/request/request/rzp/relationRequest/representative/physicalPerson/snils"/>
                </xsl:when>
            </xsl:choose>
            <br/>
        </xsl:if>

        <br/>
        <xsl:if test="MessagePrimaryContent/request/request/withDossier = 'true'">
            Включение в ответ досье юридических событий: ДА
            <br/>
        </xsl:if>
        <xsl:if test="MessagePrimaryContent/request/request/withDossier = 'false'">
            Включение в ответ досье юридических событий: НЕТ
            <br/>
        </xsl:if>

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
        <b>Общие сведения: </b>Дата, на которую передоставляются данные об актуальном статусе: <xsl:value-of select="response/statementData/statusDate"></xsl:value-of>
        <!--<xsl:value-of select="count(response/response/statementData/*)"></xsl:value-of> fff-->

        <xsl:apply-templates select="response"/>

        <br/>
        <xsl:if test="count(response/response/statementData/*) = 1">
            Нет данных
        </xsl:if>
    </xsl:template>

    <!--rlirpRecord-->
    <xsl:template match="rlirpRecord">
        <table class="table1">
            <xsl:call-template name="tableInsertRow">
                <xsl:with-param name="col1"
                                select="'Запись о статусе нахождения лица или связанных лиц в реестре лиц, связанных с изменением родительских прав'"/>
                <xsl:with-param name="col2" select='"title"'/>
                <xsl:with-param name="color" select='"F3B19C"'/>
            </xsl:call-template>


            <xsl:variable name="dic_codePresenceStatus">
                <xsl:call-template name="RL_codePresenceStatus">
                    <xsl:with-param name="kod" select="codePresenceStatus"/>
                </xsl:call-template>
            </xsl:variable>
            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"Код статуса нахождения гражданина в реестре"'/>
                </td>
                <td class="td1" width="400">
                    <xsl:value-of select="codePresenceStatus"/>-<xsl:value-of select="$dic_codePresenceStatus"/>
                </td>
            </tr>

            <xsl:call-template name="tableInsertRow">
                <xsl:with-param name="col1" select="'Правовой статус лица'"/>
                <xsl:with-param name="col2" select='legalStatus'/>
            </xsl:call-template>

            <xsl:if test="dossierData/externalEvent">
                <xsl:call-template name="tableInsertRow">
                    <xsl:with-param name="col1"
                                    select="'Запись юридического события (действия) предосставленная поставщиками информации'"/>
                    <xsl:with-param name="col2" select='"title"'/>
                    <xsl:with-param name="color" select='"c7c7c7"'/>
                </xsl:call-template>
                <xsl:call-template name="externalEvent_template">
                    <xsl:with-param name="val" select='dossierData/externalEvent'/>
                </xsl:call-template>
            </xsl:if>
            <xsl:if test="dossierData/internalEvent">
                <xsl:call-template name="tableInsertRow">
                    <xsl:with-param name="col1"
                                    select="'Запись юридического события (действия) зафиксированная ЕГИССО'"/>
                    <xsl:with-param name="col2" select='"title"'/>
                    <xsl:with-param name="color" select='"c7c7c7"'/>
                </xsl:call-template>
                <!--используем тот же шаблон-->
                <!--<xsl:call-template name="internalEvent_template">-->
                <xsl:call-template name="externalEvent_template">
                    <xsl:with-param name="val" select='dossierData/internalEvent'/>
                </xsl:call-template>
            </xsl:if>
        </table>
        <br/>
        <br/>
    </xsl:template>


    <!--rzpRecord-->
    <xsl:template match="rzpRecord">
        <table class="table1">
            <xsl:call-template name="tableInsertRow">
                <xsl:with-param name="col1"
                                select="'Записи о статусе нахождения лица или связанных лиц в реестре законных представителей'"/>
                <xsl:with-param name="col2" select='"title"'/>
                <xsl:with-param name="color" select='"b2f39c"'/>
            </xsl:call-template>


            <xsl:variable name="dic_codePresenceStatus">
                <xsl:call-template name="RL_codePresenceStatus">
                    <xsl:with-param name="kod" select="codePresenceStatus"/>
                </xsl:call-template>
            </xsl:variable>
            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"Код статуса нахождения гражданина в реестре"'/>
                </td>
                <td class="td1" width="400">
                    <xsl:value-of select="codePresenceStatus"/>-<xsl:value-of select="$dic_codePresenceStatus"/>
                </td>
            </tr>

            <xsl:call-template name="tableInsertRow">
                <xsl:with-param name="col1" select="'Правовой статус лица'"/>
                <xsl:with-param name="col2" select='legalStatus'/>
            </xsl:call-template>

            <xsl:if test="dossierData/externalEvent">
                <xsl:call-template name="tableInsertRow">
                    <xsl:with-param name="col1"
                                    select="'Запись юридического события (действия) предосставленная поставщиками информации'"/>
                    <xsl:with-param name="col2" select='"title"'/>
                    <xsl:with-param name="color" select='"c7c7c7"'/>
                </xsl:call-template>
                <xsl:call-template name="externalEvent_template">
                    <xsl:with-param name="val" select='dossierData/externalEvent'/>
                </xsl:call-template>
            </xsl:if>
            <xsl:if test="dossierData/internalEvent">
                <xsl:call-template name="tableInsertRow">
                    <xsl:with-param name="col1"
                                    select="'Запись юридического события (действия) зафиксированная ЕГИССО'"/>
                    <xsl:with-param name="col2" select='"title"'/>
                    <xsl:with-param name="color" select='"c7c7c7"'/>
                </xsl:call-template>
                <!--используем тот же шаблон-->
                <!--<xsl:call-template name="internalEvent_template">-->
                <xsl:call-template name="externalEvent_template">
                    <xsl:with-param name="val" select='dossierData/internalEvent'/>
                </xsl:call-template>
            </xsl:if>
        </table>
        <br/>
        <br/>
    </xsl:template>

    <!--rlidRecord-->
    <xsl:template match="rlidRecord">
        <table class="table1">
            <xsl:call-template name="tableInsertRow">
                <xsl:with-param name="col1"
                                select="'Записи о статусе нахождения лица в реестре лиц с измененной дееспособностью'"/>
                <xsl:with-param name="col2" select='"title"'/>
                <xsl:with-param name="color" select='"9cf3dd"'/>
            </xsl:call-template>


            <xsl:call-template name="tableInsertRow">
                <xsl:with-param name="col1" select="'Правовой статус лица'"/>
                <xsl:with-param name="col2" select='legalStatus'/>
            </xsl:call-template>

            <xsl:if test="dossierData/externalEvent">
                <xsl:call-template name="tableInsertRow">
                    <xsl:with-param name="col1"
                                    select="'Запись юридического события (действия) предосставленная поставщиками информации'"/>
                    <xsl:with-param name="col2" select='"title"'/>
                    <xsl:with-param name="color" select='"c7c7c7"'/>
                </xsl:call-template>
                <xsl:call-template name="externalEvent_template">
                    <xsl:with-param name="val" select='dossierData/externalEvent'/>
                </xsl:call-template>
            </xsl:if>
            <xsl:if test="dossierData/internalEvent">
                <xsl:call-template name="tableInsertRow">
                    <xsl:with-param name="col1"
                                    select="'Запись юридического события (действия) зафиксированная ЕГИССО'"/>
                    <xsl:with-param name="col2" select='"title"'/>
                    <xsl:with-param name="color" select='"c7c7c7"'/>
                </xsl:call-template>
                <!--используем тот же шаблон-->
                <!--<xsl:call-template name="internalEvent_template">-->
                <xsl:call-template name="externalEvent_template">
                    <xsl:with-param name="val" select='dossierData/internalEvent'/>
                </xsl:call-template>
            </xsl:if>
        </table>
        <br/>
        <br/>
    </xsl:template>

    <!--externalEvent-->
    <xsl:template name="externalEvent_template">
        <xsl:param name="val"/>


        <xsl:variable name="dic_codeEventType">
            <xsl:call-template name="RL_codeEventType">
                <xsl:with-param name="kod" select="$val/codeEventType"/>
            </xsl:call-template>
        </xsl:variable>
        <tr class="tr1">
            <td class="td1" width="400">
                <xsl:value-of select='"Код вида юридического события (действия)"'/>
            </td>
            <td class="td1" width="400">
                <xsl:value-of select="$val/codeEventType"/>-<xsl:value-of select="$dic_codeEventType"/>
            </td>
        </tr>

        <xsl:if test="$val/infoProvider">
            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"Поставщик информации о юридическом событии (действии)"'/>
                </td>
                <td class="td1" width="400">
                    <xsl:apply-templates select="$val/infoProvider"/>
                </td>
            </tr>
        </xsl:if>


        <xsl:if test="$val/comment">
            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"Комментарий"'/>
                </td>
                <td class="td1" width="400">
                    <xsl:apply-templates select="$val/comment"/>
                </td>
            </tr>
        </xsl:if>


        <xsl:if test="$val/inclusionDate">
            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"Дата получения данных от поставщика информации"'/>
                </td>
                <td class="td1" width="400">
                    <xsl:call-template name="dateTimeMy">
                        <xsl:with-param name="value" select="$val/inclusionDate"/>
                    </xsl:call-template>
                </td>
            </tr>
        </xsl:if>

        <xsl:if test="$val/effectiveDate">
            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"Дата вступления в силу юридического события (действия)"'/>
                </td>
                <td class="td1" width="400">
                    <xsl:call-template name="dateMy">
                        <xsl:with-param name="value" select="$val/effectiveDate"/>
                    </xsl:call-template>
                </td>
            </tr>
        </xsl:if>


        <tr class="tr1">
            <td class="td1" width="400">
                <xsl:value-of select='"Документ основание юридического события (действия)"'/>
            </td>
            <td class="td1" width="400">
                <!--<xsl:apply-templates select="$val/reasonDocument"/>-->
                <xsl:call-template name="reasonDocument_template">
                    <xsl:with-param name="val" select="$val/reasonDocument"/>
                </xsl:call-template>
            </td>
        </tr>

        <xsl:apply-templates select="$val/person"/>


        <xsl:if test="$val/codeEventState">
            <tr class="tr1">
                <td class="td1" width="400">
                    <xsl:value-of select='"Код состояния юридического события (действия)"'/>
                </td>

                <xsl:variable name="codeEventState">
                    <xsl:call-template name="RL_codeEventState">
                        <xsl:with-param name="kod" select="$val/codeEventState"/>
                    </xsl:call-template>
                </xsl:variable>

                <td class="td1" width="400">
                    <xsl:value-of select="$val/codeEventState"/>-<xsl:value-of select="$codeEventState"/>
                </td>
            </tr>
        </xsl:if>


        <xsl:apply-templates select="$val/lifecycleRecords"/>

    </xsl:template>

    <!--internalEvent-->
    <xsl:template name="internalEvent_template">
        <xsl:param name="val"/>
    </xsl:template>


    <xsl:template match="infoProvider">
        Наименование организации:
        <xsl:value-of select="name"></xsl:value-of>
        <br/>
        ИНН:<xsl:value-of select="inn"></xsl:value-of>
        <br/>
        ОГРН:<xsl:value-of select="ogrn"></xsl:value-of>
        <br/>
        Код участника ЕГИССО:<xsl:value-of select="codeParticipant"></xsl:value-of>
    </xsl:template>

    <xsl:template match="person">
        <!--<xsl:value-of select="physicalPerson"></xsl:value-of>-->
        <tr class="tr1">
            <td class="td1" width="400">
                <xsl:value-of select='"Лицо участвующее в  юридическом событии (действии)"'/>
            </td>

            <xsl:if test="physicalPerson">

                <xsl:call-template name="person_template">
                    <xsl:with-param name="val" select="physicalPerson"/>
                    <xsl:with-param name="typePer" select="'Физическое лицо:'"/>
                </xsl:call-template>
            </xsl:if>

            <xsl:if test="legalPerson">
                <xsl:call-template name="person_template">
                    <xsl:with-param name="val" select="legalPerson"/>
                    <xsl:with-param name="typePer" select="'Юридичесое лицо:'"/>
                </xsl:call-template>
            </xsl:if>
        </tr>
    </xsl:template>

    <xsl:template match="lifecycleRecords">
        <xsl:if test="annulRecord">
            <xsl:call-template name="tableInsertRow">
                <xsl:with-param name="col1" select="'Данные аннулирования  юридического события (действия)'"/>
                <xsl:with-param name="col2" select='"title"'/>
            </xsl:call-template>

            <xsl:call-template name="annulRecove_template">
                <xsl:with-param name="val" select="annulRecord"/>
            </xsl:call-template>
        </xsl:if>

        <xsl:if test="recoveryRecord">
            <xsl:call-template name="tableInsertRow">
                <xsl:with-param name="col1" select="'Данные восстановления юридического события (действия)'"/>
                <xsl:with-param name="col2" select='"title"'/>
            </xsl:call-template>
            <xsl:call-template name="annulRecove_template">
                <xsl:with-param name="val" select="recoveryRecord"/>
            </xsl:call-template>
        </xsl:if>
    </xsl:template>


    <xsl:template name="person_template">
        <xsl:param name="val"/>
        <xsl:param name="typePer"/>
        <td class="td1" width="400">
            <xsl:value-of select="$typePer"></xsl:value-of>
            <br/>

            <xsl:variable name="dic_codeRoleType">
                <xsl:call-template name="RL_CodeRoleType">
                    <xsl:with-param name="kod" select="$val/@codeRoleType"/>
                </xsl:call-template>
            </xsl:variable>

            Код типа роли лица:<xsl:value-of select="$val/@codeRoleType"></xsl:value-of>-<xsl:value-of
                select="$dic_codeRoleType"></xsl:value-of>
            <br/>
            <xsl:if test="$val/@snils">
                СНИЛС:
                <xsl:value-of select="$val/@snils"></xsl:value-of>
                <br/>
            </xsl:if>
            <xsl:if test="$val/@lastName">
                ФИО: <xsl:value-of select="$val/@lastName"></xsl:value-of> 
                <xsl:value-of select="$val/@firstName"></xsl:value-of> 
                <xsl:value-of select="$val/@middleName"></xsl:value-of>
                <br/>
            </xsl:if>
            <xsl:if test="$val/@gender">
                <xsl:variable name="gender">
                    <xsl:call-template name="GenderMy">
                        <xsl:with-param name="value" select="$val/@gender"/>
                    </xsl:call-template>
                </xsl:variable>
                Пол:
                <xsl:value-of select="$gender"></xsl:value-of>
                <br/>
            </xsl:if>

            <xsl:if test="$val/@name">
                Наименование:
                <xsl:value-of select="$val/@name"></xsl:value-of>
                <br/>
            </xsl:if>

            <xsl:if test="$val/@inn">
                ИНН:
                <xsl:value-of select="$val/@inn"></xsl:value-of>
                <br/>
            </xsl:if>
            <xsl:if test="$val/@ogrn">
                ОГРН:
                <xsl:value-of select="$val/@ogrn"></xsl:value-of>
                <br/>
            </xsl:if>
            <xsl:if test="$val/@birthDate">
                Дата рождения:
                <xsl:call-template name="dateMy">
                    <xsl:with-param name="value" select="$val/@birthDate"/>
                </xsl:call-template>
                <br/>
            </xsl:if>
        </td>
    </xsl:template>

    <xsl:template name="reasonDocument_template">
        <xsl:param name="val"/>
        <xsl:if test="$val/@date">
            Дата документа:
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="$val/@date"/>
            </xsl:call-template>
            <br/>
        </xsl:if>
        <xsl:if test="$val/@effectiveDate">
            Дата вступления в силу:
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="$val/@effectiveDate"/>
            </xsl:call-template>
            <br/>
        </xsl:if>
        <xsl:if test="$val/@validityEndDate">
            Дата окончания периода действия документа:
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="$val/@validityEndDate"/>
            </xsl:call-template>
            <br/>
        </xsl:if>
        <xsl:if test="$val/@number">
            Номер документа:<xsl:value-of select="$val/@number"></xsl:value-of>
            <br/>
        </xsl:if>
        <xsl:if test="$val/@series">
            Серия:<xsl:value-of select="$val/@series"></xsl:value-of>
            <br/>
        </xsl:if>
        <xsl:if test="$val/@codeType">
            <xsl:variable name="dic_codeType">
                <xsl:call-template name="RL_codeType">
                    <xsl:with-param name="kod" select="$val/@codeType"/>
                </xsl:call-template>
            </xsl:variable>

            Код вида документа:<xsl:value-of select="$val/@codeType"></xsl:value-of>-<xsl:value-of
                select="$dic_codeType"></xsl:value-of>
            <br/>
        </xsl:if>
        <xsl:if test="$val/@orgName">
            Наименование организации:<xsl:value-of select="$val/@orgName"></xsl:value-of>
            <br/>
        </xsl:if>
    </xsl:template>

    <xsl:template name="annulRecove_template">
        <xsl:param name="val"/>
        <xsl:if test="$val/effectiveDate">
            <xsl:variable name="effectiveDate">
                <xsl:call-template name="dateMy">
                    <xsl:with-param name="value" select="$val/effectiveDate"/>
                </xsl:call-template>
            </xsl:variable>
            <xsl:call-template name="tableInsertRow">
                <xsl:with-param name="col1" select="'Дата вступления в силу юридического события (действия)'"/>
                <xsl:with-param name="col2" select='$effectiveDate'/>
            </xsl:call-template>
        </xsl:if>

        <tr class="tr1">
            <td class="td1" width="400">
                <xsl:value-of select='"Документ основание юридического события (действия)"'/>
            </td>
            <td class="td1" width="400">
                <xsl:call-template name="reasonDocument_template">
                    <xsl:with-param name="val" select="$val/reasonDocument"/>
                </xsl:call-template>
            </td>
        </tr>
        <tr class="tr1">
            <td class="td1" width="400">
                <xsl:value-of
                        select='"Поставщик информации об аннулировании или восстановлении юридического события (действия)"'/>
            </td>
            <td class="td1" width="400">
                <xsl:apply-templates select="$val/infoProvider"/>
            </td>
        </tr>
    </xsl:template>


</xsl:stylesheet>
