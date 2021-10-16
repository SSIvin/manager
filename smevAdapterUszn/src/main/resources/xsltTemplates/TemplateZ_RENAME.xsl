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
                    select='"Сведения об актах гражданского состояния о перемене имени, содержащихся в Едином государственном реестре записей актов гражданского состояния"'/>
        </xsl:call-template>
    </xsl:template>

    <!--Запрос-->
    <xsl:template match="reportRequest">
        <table class="table2">
            <tr class="tr2">
                <td class="td2" width="400">
                    Фамилия:
                    <xsl:value-of select="MessagePrimaryContent/PERNAMEINFRequest/СведЗапрос/СведФЛ/ФИО/Фамилия"/>
                    <br/>
                    Имя:
                    <xsl:value-of select="MessagePrimaryContent/PERNAMEINFRequest/СведЗапрос/СведФЛ/ФИО/Имя"/>
                    <br/>
                    <xsl:if test="MessagePrimaryContent/PERNAMEINFRequest/СведЗапрос/СведФЛ/ФИО/Отчество!=''">
                        Отчество:
                        <xsl:value-of select="MessagePrimaryContent/PERNAMEINFRequest/СведЗапрос/СведФЛ/ФИО/Отчество"/>
                    </xsl:if>
                    <br/>
                    Дата рождения:
                    <xsl:call-template name="dateMy">
                        <xsl:with-param name="value"
                                        select="MessagePrimaryContent/PERNAMEINFRequest/СведЗапрос/СведФЛ/ДатаРождКаленд"/>
                    </xsl:call-template>
                    <br/>

                    <!--<xsl:if test="MessagePrimaryContent/informRequest/СведФЛ/@ИННФЛ != ''">-->
                    <!--ИНН:-->
                    <!--<xsl:value-of select="MessagePrimaryContent/informRequest/СведФЛ/@ИННФЛ"/>-->
                    <!--<br/>-->
                    <!--</xsl:if>-->
                    <xsl:if test="MessagePrimaryContent/PERNAMEINFRequest/СведЗапрос/СведФЛ/@СНИЛС != ''">
                        СНИЛС:
                        <xsl:value-of select="MessagePrimaryContent/PERNAMEINFRequest/СведЗапрос/СведФЛ/@СНИЛС"/>
                        <br/>
                        Номер записи:
                        <xsl:value-of select="MessagePrimaryContent/PERNAMEINFRequest/СведЗапрос/СведАГС/@НомерЗапис"/>
                        <br/>
                        Дата записи:
                        <xsl:call-template name="dateMy">
                            <xsl:with-param name="value"
                                            select="MessagePrimaryContent/PERNAMEINFRequest/СведЗапрос/СведАГС/ДатаЗапис"/>
                        </xsl:call-template>
                    </xsl:if>
                    <br/>
                </td>
                <td class="td2">
                    <xsl:variable name="кодОсн">
                        <xsl:call-template name="кодОСН">
                            <xsl:with-param name="kod"
                                            select="MessagePrimaryContent/PERNAMEINFRequest/СведОсн/@КодНормОсн"/>
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
        <br/>
        <b>Общие сведения:</b>


        <table class="table1">
            <xsl:call-template name="tableInsertRow">
                <xsl:with-param name="col1" select='"Идентификатор запроса"'/>
                <xsl:with-param name="col2" select="PERNAMEINFResponse/@ИдЗапрос"/>
            </xsl:call-template>

            <xsl:variable name="ТипАГСЗапрос">
                <xsl:call-template name="ZagsТипАГСЗапрос">
                    <xsl:with-param name="kod" select="PERNAMEINFResponse/@ТипАГСЗапрос"/>
                </xsl:call-template>
            </xsl:variable>
            <xsl:call-template name="tableInsertRow">
                <xsl:with-param name="col1"
                                select='"Тип акта гражданского состояния, в отношении которого сформирован запрос"'/>
                <xsl:with-param name="col2" select="$ТипАГСЗапрос"/>
            </xsl:call-template>
            <xsl:variable name="РезОбраб">
                <xsl:call-template name="ZagsРезОбраб">
                    <xsl:with-param name="kod" select="PERNAMEINFResponse/СведОтветАГС/@РезОбраб"/>
                </xsl:call-template>
            </xsl:variable>
            <xsl:call-template name="tableInsertRow">
                <xsl:with-param name="col1" select='"Результат обработки поступившего запроса"'/>
                <xsl:with-param name="col2" select="$РезОбраб"/>
            </xsl:call-template>
            <xsl:apply-templates select="PERNAMEINFResponse"/>
        </table>
    </xsl:template>


    <!--Start перемена имени-->
    <xsl:template match="СведРегПерИмя">
        <xsl:call-template name="Сведения">
            <xsl:with-param name="val1" select='"Сведения о государственной регистрации перемены имени"'/>
            <xsl:with-param name="val2" select='"Номер записи акта о перемене имени"'/>
            <xsl:with-param name="val3" select='"Дата составления записи акта о перемене имени"'/>
        </xsl:call-template>

        <!--<xsl:apply-templates select="//СвидетПерИмя"/>-->

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

        <xsl:apply-templates select="СвидетПерИмя" mode="переменаИмени"/>
    </xsl:template>
    <!--End перемена имени-->

    <xsl:template match="СвидетПерИмя" mode="переменаИмени">
        <xsl:call-template name="СведенияОСвидельстве">
            <xsl:with-param name="val" select='"Сведения о выданном Свидетельстве о перемене имени"'/>
        </xsl:call-template>
    </xsl:template>

    <!--<xsl:template match="СведРегРожд" mode="рожд">-->
    <!--<xsl:template name="СведениеОВыданномСвидетРожд">-->
    <!--<xsl:call-template name="СведенияОСвидельстве">-->
    <!--<xsl:with-param name="val" select='"Сведения о государственной регистрации рождения"'/>-->
    <!--</xsl:call-template>-->
    <!--</xsl:template>-->

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


    <!--создал пустые шаблоны чтобы не выводились даты(значения нодов) так как мы делаем <xsl:apply-templates select="ПрдСведРег/СведОтец"/> то он выводит значения. УРОД!-->
    <xsl:template match="ДатаРожд"/>
    <xsl:template match="МесГодРожд"/>
    <xsl:template match="ГодРожд"/>
    <xsl:template match="ДатаСмерт"/>
    <xsl:template match="МесГодСмерт"/>
    <xsl:template match="ГодСмерт"/>

    <xsl:template name="Сведения">
        <xsl:param name="val1"/>
        <xsl:param name="val2"/>
        <xsl:param name="val3"/>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select="$val1"/>
            <xsl:with-param name="col2" select='"title"'/>
            <xsl:with-param name="color" select='"F3B19C"'/>
        </xsl:call-template>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1" select="$val2"/>
            <xsl:with-param name="col2" select="@НомерЗаписЕГР"/>
        </xsl:call-template>
        <br/>
        <xsl:variable name="ДатаЗапис">
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="ДатаЗапис"/>
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
                            select='"Номер актовой записи, содержащийся в ЕГР ЗАГС"'/>
            <xsl:with-param name="col2" select="@НомАГССвид"/>
        </xsl:call-template>
        <xsl:call-template name="tableInsertRow">
            <xsl:with-param name="col1"
                            select='"Полное наименование органа ЗАГС,которым произведена государственная регистрация акта гражданского состояния"'/>
            <xsl:with-param name="col2" select="ОрганЗАГС/@НаимЗАГС"/>
        </xsl:call-template>
        <!--<xsl:call-template name="tableInsertRow">-->
        <!--<xsl:with-param name="col1" select='"Наименование статуса"'/>-->
        <!--<xsl:with-param name="col2" select="СтатусЗаписи/@НаимСтатус"/>-->
        <!--</xsl:call-template>-->
        <!--<xsl:variable name="ДатаНачСтатус">-->
        <!--<xsl:call-template name="dateMy">-->
        <!--<xsl:with-param name="value" select="СтатусЗаписи/@ДатаНачСтатус"/>-->
        <!--</xsl:call-template>-->
        <!--</xsl:variable>-->
        <!--<xsl:call-template name="tableInsertRow">-->
        <!--<xsl:with-param name="col1" select='"Дата начала действия статуса"'/>-->
        <!--<xsl:with-param name="col2" select="СтатусЗаписи/$ДатаНачСтатус"/>-->
        <!--</xsl:call-template>-->
    </xsl:template>


</xsl:stylesheet>
