<!-- Created with Liquid Studio 2020 (https://www.liquid-technologies.com) -->
<!--ALT0160 - неразрывный пробел-->
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:import href="reportTemplate.xsl"/>

    <xsl:template match="/">
        <xsl:call-template name="root">
            <xsl:with-param
                    name="title"
                    select='"Сведения о доходах физических лиц по налогу на доходы физических лиц (по форме 3-НДФЛ)"'/>
        </xsl:call-template>
    </xsl:template>


    <!--Запрос-->
    <xsl:template match="reportRequest">
        <xsl:apply-templates select="MessagePrimaryContent/NDFL3DOHRequest"/>
        <br/>
        <b>Отчетный год:
            <xsl:value-of select="MessagePrimaryContent/NDFL3DOHRequest/@ОтчетГод"/>
        </b>
    </xsl:template>


<!--Волшебное . - это текущий контекст обработки. и так как
 ИНН это узел то чтобы взять значение узла надо взять текущий контекст обработки-->
    <xsl:template match="ИННФЛ">
        <xsl:if test=". != ''">
            <br/>
            ИНН:
            <xsl:value-of select="."/>
        </xsl:if>
    </xsl:template>

    <xsl:template match="ФИОФЛ">
        Фамилия:
        <xsl:value-of select="@FamilyName"/>
        <br/>
        Имя:
        <xsl:value-of select="@FirstName"/>
        <br/>
        <xsl:if test="@Patronymic!=''">
            Отчество:
            <xsl:value-of select="@Patronymic"/>
        </xsl:if>
    </xsl:template>



    <xsl:template match="СведФЛ">
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
        <xsl:value-of select="NDFL3DOHResponse/@ИдЗапрос"/>
        <br/>
        Отчетный год:
        <xsl:value-of select="NDFL3DOHResponse/СвНДФЛ3/@ОтчетГод"/>
        <br/>
        <b>Код категории налогоплательщика:</b>
        <xsl:value-of select="NDFL3DOHResponse/СвНДФЛ3/@ДокПредст"/>-
        <xsl:call-template name="FnsKodCategNalog">
            <xsl:with-param name="kodCateg" select="NDFL3DOHResponse/СвНДФЛ3/@ДокПредст"/>
        </xsl:call-template>
        <br/>
        <xsl:apply-templates select="NDFL3DOHResponse"/>
    </xsl:template>

    <xsl:template match="СвНДФЛ3">
        <xsl:apply-templates select="СвФЛ"/>
        <hr/>

        <b>Данные налоговой декларации по налогу на доходы физических лиц (по форме 3-НДФЛ):</b>
        <br/>
        <br/>
        <b>Налоговая база</b>
        <xsl:if test="ИтогУплВозв/НалБаза">
            <table class="table1">
                <TR>
                    <th class="th1">
                        <B>Ставка</B>
                    </th>
                    <th class="th1">
                        <B>Вид дохода</B>
                    </th>
                    <th class="th1">
                        <B>Сумма дохода</B>
                    </th>
                </TR>
                <xsl:apply-templates select="ИтогУплВозв/НалБаза"/>
            </table>
        </xsl:if>
        <xsl:if test="not(ИтогУплВозв/НалБаза)">
            <br/>
            По поступившему запросу сведения отсутствуют
        </xsl:if>
        <br/>
        <br/>
        <b>Доходы от источников в Российской Федерации</b>
        <xsl:if test="ИтогУплВозв/ДоходИстРФ">
            <table class="table1">
                <TR>
                    <th class="th1">
                        <B>Ставка</B>
                    </th>
                    <th class="th1">
                        <B>Вид Дохода</B>
                    </th>
                    <th class="th1">
                        <B>Доход</B>
                    </th>
                    <th class="th1">
                        <B>Сведения об источнике выплаты дохода</B>
                    </th>
                </TR>
                <xsl:apply-templates select="ИтогУплВозв/ДоходИстРФ"/>
            </table>
        </xsl:if>
        <xsl:if test="not(ИтогУплВозв/ДоходИстРФ)">
            <br/>
            По поступившему запросу сведения отсутствуют
        </xsl:if>
        <br/>
        <br/>
        <b>Доходы от источников за пределами Российской Федерации, облагаемые налогом по ставке (Приложение 2)</b>
        <xsl:if test="ИтогУплВозв/ДоходИстИно"> 
            <table class="table1">
                <TR>
                    <th class="th1">
                        <B>Ставка</B>
                    </th>
                    <th class="th1">
                        <B>ОКСМ</B>
                    </th>
                    <th class="th1">
                        <B>Вид Дохода</B>
                    </th>
                    <th class="th1">
                        <B>Источник дохода</B>
                    </th>
                    <th class="th1">
                        <B>Доход</B>
                    </th>
                    <th class="th1">
                        <B>Сумма дохода,60.217</B>
                    </th>
                    <th class="th1">
                        <B>Сумма дохода,60.1.217</B>
                    </th>
                    <th class="th1">
                        <B>ДСумма дохода,66.217</B>
                    </th>
                </TR>
                <xsl:apply-templates select="ИтогУплВозв/ДоходИстИно/РасчДохНалИно"/>
            </table>
        </xsl:if>
        <xsl:if test="not(ИтогУплВозв/ДоходИстИно)">
            <br/>
            По поступившему запросу сведения отсутствуют
        </xsl:if>

        <br/>
        <br/>
        <b>Доходы, полученные от предпринимательской, адвокатской деятельности и частной практики, а также расчет
            профессиональных налоговых вычетов, установленных пунктами 2, 3 статьи 221 Налогового кодекса Российской
            Федерации
        </b>
        <xsl:if test="ИтогУплВозв/ДоходПредпр"> 
            <table class="table1">
                <TR>
                    <th class="th1">
                        <B>Общая сумма дохода</B>
                    </th>
                    <th class="th1">
                        <B>КодВидДеят</B>
                    </th>
                    <th class="th1">
                        <B>ОКВЭД</B>
                    </th>
                    <th class="th1">
                        <B>Доход</B>
                    </th>
                    <th class="th1">
                        <B>РасхФакт</B>
                    </th>
                </TR>
                <xsl:apply-templates select="ИтогУплВозв/ДоходПредпр"/>
            </table>
        </xsl:if>
        <xsl:if test="not(ИтогУплВозв/ДоходПредпр)">
            <br/>
            По поступившему запросу сведения отсутствуют
        </xsl:if>
    </xsl:template>

    <xsl:template match="НалБаза">
        <tr class="tr1">
            <td class="td1">
                <xsl:value-of select="@Ставка"/>
            </td>
            <td class="td1">
                <xsl:call-template name="FnsDohodVid">
                    <xsl:with-param name="kodDoh" select='format-number(@ВидДоход,"0")'/>
                </xsl:call-template>
            </td>
            <td class="td1">
                <xsl:call-template name="curr">
                    <xsl:with-param name="value" select="@НалБазаИсчисл"/>
                </xsl:call-template>
            </td>
        </tr>
    </xsl:template>

    <xsl:template match="РасчДохНалИно">
        <tr class="tr1">
            <td class="td1">
                <xsl:value-of select="../@Ставка"/>
            </td>
            <td class="td1">
                <xsl:value-of select="@ОКСМ"/>
            </td>
            <td class="td1">
                <xsl:call-template name="FnsNameVidDohodZaPredRF">
                    <xsl:with-param name="kodDoh" select='format-number(@КодВидДох,"0")'/>
                </xsl:call-template>
            </td>
            <td class="td1">
                <xsl:value-of select="@НаимИстДох"/>
            </td>
            <td class="td1">
                <xsl:call-template name="curr">
                    <xsl:with-param name="value" select="@ДоходИноРуб"/>
                </xsl:call-template>
            </td>
            <td class="td1">
                <xsl:call-template name="curr">
                    <xsl:with-param name="value" select="@ДоходОсв60.217"/>
                </xsl:call-template>
            </td>
            <td class="td1">
                <xsl:call-template name="curr">
                    <xsl:with-param name="value" select="@ДоходОсв60.1.217"/>
                </xsl:call-template>
            </td>
            <td class="td1">
                <xsl:call-template name="curr">
                    <xsl:with-param name="value" select="@ДоходОсв66.217"/>
                </xsl:call-template>
            </td>
        </tr>
    </xsl:template>

    <xsl:template match="ДоходПредпр">
        <tr class="tr1">
            <td class="td1">
                <xsl:value-of select="@ДоходИт"/>
            </td>

            <td class="td1">
                <xsl:call-template name="FnsVidDeatelnost">
                    <xsl:with-param name="kodDoh" select='format-number(РасчВидДеят/@ВидДеят,"0")'/>
                </xsl:call-template>
            </td>


            <td class="td1">
                <xsl:value-of select="РасчВидДеят/@ОКВЭД"/>
            </td>
            <td class="td1">
                <xsl:call-template name="curr">
                    <xsl:with-param name="value" select="РасчВидДеят/@Доход"/>
                </xsl:call-template>
            </td>
            <td class="td1">
                <xsl:call-template name="curr">
                    <xsl:with-param name="value" select="РасчВидДеят/@РасхФакт"/>
                </xsl:call-template>
            </td>
        </tr>
    </xsl:template>

    <xsl:template match="ДоходИстРФ">
        <tr class="tr1">
            <td class="td1">
                <xsl:value-of select="@Ставка"/>
            </td>
            <td class="td1">
                <xsl:call-template name="FnsNameVidDohodInRF">
                    <xsl:with-param name="kodDoh" select='format-number(@ВидДоход,"0")'/>
                </xsl:call-template>
            </td>
            <td class="td1">
                <xsl:call-template name="curr">
                    <xsl:with-param name="value" select="@Доход"/>
                </xsl:call-template>
            </td>
            <td class="td1">
                <xsl:call-template name="Источник"/>
            </td>
        </tr>
    </xsl:template>

    <xsl:template name="Источник">
        <xsl:if test="ИстЮЛ"> 
            <xsl:value-of select="ИстЮЛ/@Наим"/>
            <br/>
            ИНН организации:
            <xsl:value-of select="ИстЮЛ/@ИННЮЛ"/>
            <br/>
            КПП организации:
            <xsl:value-of select="ИстЮЛ/@КПП"/>
        </xsl:if>
        <xsl:if test="ИстФЛИн"> <xsl:value-of select="ИстФЛИн/@ФИОИн"/>,
            <xsl:value-of select="ИстФЛИн/@ИННФЛ"/>
        </xsl:if>
    </xsl:template>

    <xsl:template name="ФИО">
        <div>
            ФИО:<xsl:value-of select="./ФИО/@FamilyName"/> <xsl:value-of select="./ФИО/@FirstName"/> 
            <xsl:if test="./ФИО/@Patronymic!=''"> 
                <xsl:value-of select="./ФИО/@Patronymic"/>
            </xsl:if>
        </div>
    </xsl:template>


</xsl:stylesheet>
