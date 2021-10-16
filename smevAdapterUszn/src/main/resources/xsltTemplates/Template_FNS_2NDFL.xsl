<!-- Created with Liquid Studio 2020 (https://www.liquid-technologies.com) -->
<!--ALT0160 - неразрывный пробел-->
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:import href="reportTemplate.xsl"/>

    <xsl:template match="/">
        <xsl:call-template name="root">
            <xsl:with-param
                    name="title"
                    select='"Сведения по справкам о доходах физических лиц (по форме 2-НДФЛ)"'/>
        </xsl:call-template>
    </xsl:template>


    <!--Запрос-->
    <xsl:template match="reportRequest">
        <xsl:apply-templates select="MessagePrimaryContent/NDFL2Request/СвФЛ"/>
        <br/>
        <b>Отчетный год:
            <xsl:value-of select="MessagePrimaryContent/NDFL2Request/@ОтчетГод"/>
        </b>
    </xsl:template>

    <xsl:template match="СвФЛ">
        Фамилия:
        <xsl:value-of select="ФИОФЛ/@FamilyName"/>
        <br/>
        Имя:
        <xsl:value-of select="ФИОФЛ/@FirstName"/>
        <br/>
        <xsl:if test="ФИОФЛ/@Patronymic!=''">
            Отчество:
            <xsl:value-of select="ФИОФЛ/@Patronymic"/>
        </xsl:if>
        <br/>
        Дата рождения:
        <xsl:call-template name="dateMy">
            <xsl:with-param name="value" select="@ДатаРожд"/>
        </xsl:call-template>
        <br/>
        Тип документа:
        <xsl:call-template name="FnsSourceDoc">
            <xsl:with-param name="kodDoc" select="УдЛичн/@DocumentCode"/>
        </xsl:call-template>
        <!--<xsl:value-of select="УдЛичн/@DocumentCode"/>-->
        <br/>
        Серия номер:
        <xsl:value-of select="УдЛичн/@SeriesNumber"/>
        <!--<xsl:if test_xslt="./ФИО/@Patronymic!=''"> <xsl:value-of select="./ФИО/@Patronymic"/>-->
    </xsl:template>
    <!--Запрос****************************************************************************-->


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
        ID Запроса:
        <xsl:value-of select="NDFL2Response/@ИдЗапрос"/>
        <br/>
        <xsl:if test="NDFL2Response/ДохФЛ/@ОтчетГод">
            <br/>
            <b>Отчетный год:</b>
            <xsl:value-of select="NDFL2Response/ДохФЛ/@ОтчетГод"/>
        </xsl:if>
        <xsl:if test="NDFL2Response/КодОбраб">
            <br/>
            <b>Статус обработки запроса:</b>
            <xsl:choose>
                <xsl:when test="NDFL2Response/КодОбраб = '01'">
                    <xsl:text>
                        запрашиваемые сведения не найдены
                    </xsl:text>
                </xsl:when>
                <xsl:when test="NDFL2Response/КодОбраб = '52'">
                    <xsl:text>
                        ответ не готов
                    </xsl:text>
                </xsl:when>
                <xsl:when test="NDFL2Response/КодОбраб = '99'">
                    <xsl:text>
                        системная ошибка
                    </xsl:text>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:value-of select="NDFL2Response/КодОбраб"/>
                </xsl:otherwise>
            </xsl:choose>
            <!--<xsl:value-of select="NDFL2Response/КодОбраб"/>-->
        </xsl:if>

        <xsl:if test="NDFL2Response/ДохФЛ">
            <xsl:apply-templates select="NDFL2Response"/>
        </xsl:if>

    </xsl:template>

    <xsl:template match="ДохФЛ">
        <xsl:apply-templates select="ДохФЛ_НА"/>
    </xsl:template>

    <xsl:template match="ДохФЛ_НА">
        <hr/>
        <b>Сведения о доходах физического лица:</b>
        <xsl:apply-templates select="ПолучДох"/>
        <xsl:apply-templates select="СвНА"/>
        <xsl:apply-templates select="СведДох"/>
        <xsl:apply-templates select="СведДох_НДПриб"/>
    </xsl:template>

    <xsl:template match="ПолучДох">
        <br/>
        <div>
            ИНН:
            <xsl:value-of select="@ИННФЛ"/>
            Дата рождения:
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="@ДатаРожд"/>
            </xsl:call-template>
            Удост.личности:
            <xsl:call-template name="FnsSourceDoc">
                <xsl:with-param name="kodDoc" select="УдЛичнФЛ/@DocumentCode"/>
            </xsl:call-template>
        </div>
        <xsl:call-template name="ФИО"/>
    </xsl:template>

    <xsl:template name="ФИО">
        <div>
            ФИО: <xsl:value-of select="./ФИО/@FamilyName"/> <xsl:value-of select="./ФИО/@FirstName"/> 
            <xsl:if test="./ФИО/@Patronymic!=''"> <xsl:value-of select="./ФИО/@Patronymic"/>
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
        <xsl:if test="СвНАЮЛ">
            <xsl:apply-templates select="СвНАЮЛ"/>
        </xsl:if>

        <xsl:if test="СвНАФЛ">
            <xsl:apply-templates select="СвНАФЛ"/>
        </xsl:if>
    </xsl:template>


    <xsl:template match="СвНАЮЛ">
        <div>
            <b>Сведения о налоговом агенте - организации</b>
            <br/>
            Наименование Организации:
            <xsl:value-of select="@НаимОрг"/>
            ИНН:
            <xsl:value-of select="@ИННЮЛ"/>
            КПП:
            <xsl:value-of select="@КПП"/>
        </div>
    </xsl:template>

    <xsl:template match="СвНАФЛ">
        <div>
            <b>Сведения о налоговом агенте - физическом лице</b>
            <br/>
            ИНН:
            <xsl:value-of select="@ИННФЛ"/>
        </div>
        <xsl:call-template name="ФИО"/>
    </xsl:template>


    <xsl:template match="СведДох">
        <br/>
        <div>
            Ставка налога:
            <xsl:value-of select="@Ставка"/>
        </div>

        <table class="table1">
            <TR>
                <th class="th1">
                    <B>Месяц</B>
                </th>
                <th class="th1">
                    <B>Код дохода</B>
                </th>
                <th class="th1">
                    <B>Сумма дохода</B>
                </th>
            </TR>
            <xsl:apply-templates select="ДохВыч/СвСумДох">
                <xsl:sort select="@Месяц" data-type="number"/>
            </xsl:apply-templates>
            <tr class="tr1">
                <td class="td1" colspan="2" style="text-align:right">
                    <b>сумма:</b>
                </td>
                <td class="td1">
                    <sum>
                        <xsl:call-template name="curr">
                            <xsl:with-param name="value" select="sum(ДохВыч/СвСумДох/@СумДоход)"/>
                        </xsl:call-template>
                    </sum>
                </td>
            </tr>
        </table>

        <!--НалВычССИ-->
        <xsl:if test="НалВычССИ">
            <xsl:apply-templates select="НалВычССИ"/>
        </xsl:if>

        <!--СГДНалПер-->
        <xsl:choose>
            <xsl:when test="СГДНалПер">
                <xsl:apply-templates select="СГДНалПер"/>
            </xsl:when>
        </xsl:choose>
    </xsl:template>


    <xsl:template match="НалВычССИ">
        <br/>
        Стандартные, социальные и имущественные налоговые вычеты:

        <table class="table1">
            <TR>
                <th class="thMy1">
                    <B>Код вычета</B>
                </th>
                <th class="thMy1">
                    <B>Сумма вычета</B>
                </th>
            </TR>
            <xsl:apply-templates select="ПредВычССИ"/>
        </table>
        <xsl:if test="УведИмущВыч">
            Сведения об Уведомлении, подтверждающем право на имущественный налоговый вычет:
            <br/>
            Номер уведомления:<xsl:value-of select="УведИмущВыч/@НомерУвед"/> Дата уведомления:
            <xsl:call-template name="dateMy">
                <xsl:with-param name="value" select="УведИмущВыч/@ДатаУвед"/>
            </xsl:call-template>
             Код налогового органа:<xsl:value-of select="УведИмущВыч/@ИФНСУвед"/>
        </xsl:if>
    </xsl:template>

    <xsl:template match="ПредВычССИ">
        <!---->
        <tr class="tr1">
            <td class="td1">
                <xsl:value-of select="@КодВычет"/>
            </td>
            <td class="td1">
                <xsl:value-of select="@СумВычет"/>
            </td>
        </tr>
    </xsl:template>

    <xsl:template match="СГДНалПер">
        <br/>
        <div>
            Сумма дох.общая:
            <xsl:call-template name="curr">
                <xsl:with-param name="value" select="@СумДохОбщ"/>
            </xsl:call-template>
            Налоговая база:
            <xsl:call-template name="curr">
                <xsl:with-param name="value" select="@НалБаза"/>
            </xsl:call-template>
            Сумма налога исчисленная:
            <xsl:call-template name="curr">
                <xsl:with-param name="value" select="@НалИсчисл"/>
            </xsl:call-template>
            <br/>
            Сумма налога удержанная:
            <xsl:call-template name="curr">
                <xsl:with-param name="value" select="@НалУдерж"/>
            </xsl:call-template>
            Сумма налога перечисленная:
            <xsl:call-template name="curr">
                <xsl:with-param name="value" select="@НалПеречисл"/>
            </xsl:call-template>
            <br/>
            Сумма налога, излишне удержанная налоговым агентом:
            <xsl:call-template name="curr">
                <xsl:with-param name="value" select="@НалУдержЛиш"/>
            </xsl:call-template>
            Сумма налога, не удержанная налоговым агентом:
            <xsl:call-template name="curr">
                <xsl:with-param name="value" select="@НалНеУдерж"/>
            </xsl:call-template>
        </div>
    </xsl:template>

    <xsl:template match="СвСумВыч">
        <tr class="table2td">
            <td class="table2td">
                <xsl:value-of select="@КодВычет"/>
            </td>
            <td class="table2td">
                <xsl:value-of select="@СумВычет"/>
            </td>
        </tr>
    </xsl:template>

    <xsl:template match="СвСумДох">
        <tr class="tr1">
            <td class="td1">
                <xsl:value-of select="@Месяц"/>
            </td>
            <td class="td1">
                <xsl:value-of select="@КодДоход"/>
                <xsl:if test="count(./*) != 0">
                    <table border="1" style="width: 100%;">
                        <!--Внутреняя таблица-->
                        <TR>
                            <th class="table2th">
                                <B>Код вычета</B>
                            </th>
                            <th class="table2th">
                                <B>Сумма вычета</B>
                            </th>
                        </TR>
                        <xsl:apply-templates select="СвСумВыч"/>
                    </table>
                </xsl:if>
            </td>
            <td class="td1">
                <xsl:call-template name="curr">
                    <xsl:with-param name="value" select="@СумДоход"/>
                </xsl:call-template>
            </td>
        </tr>
    </xsl:template>

    <xsl:template match="СведДох_НДПриб">
        <xsl:choose>
            <xsl:when test="ДохНалПер">
                <div>
                    <b>Сведения о доходах по налогу на прибыль организаций:</b>
                </div>
                <xsl:call-template name="ДохНалПер"/>
            </xsl:when>
        </xsl:choose>


    </xsl:template>

    <xsl:template name="ДохНалПер">
        <div>
            Ставка:
            <xsl:call-template name="curr">
                <xsl:with-param name="value" select="ДохНалПер/@Ставка"/>
            </xsl:call-template>
            Сумма дох.общая:
            <xsl:call-template name="curr">
                <xsl:with-param name="value" select="ДохНалПер/@СумДохОбщ"/>
            </xsl:call-template>
            Налоговая база:
            <xsl:call-template name="curr">
                <xsl:with-param name="value" select="ДохНалПер/@НалБаза"/>
            </xsl:call-template>
        </div>
    </xsl:template>

</xsl:stylesheet>
