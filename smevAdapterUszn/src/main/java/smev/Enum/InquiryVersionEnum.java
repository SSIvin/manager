package smev.Enum;

/*
 * виды ВС
 *
 * */

import smev.utils.util;

import java.util.UUID;

public enum InquiryVersionEnum {

    INITIATIVE_distribution( util.StringToUUID("1BD95D05-B1A7-4E47-8C24-1E914AFFAA0F"),""),
    DEATH_EGISSO(util.StringToUUID("02505be8-9d6f-48c3-84ff-30e207c818ee"),""),
    GIS_JKH_HOUSES(util.StringToUUID("dc58c534-5646-4d64-97b8-c7b7c5db9f66"),""),
    /*создаем запросы*/
    GIS_JKH_IMPORT_REQUEST(util.StringToUUID("a4ce1c62-9825-49b2-967b-ed1fae01dac3"),""),
    /**Забирать ответы*/
    GIS_JKH_EXPORT_REQUEST(util.StringToUUID("5aeb8634-72cd-41ad-b399-1a49da5b4f78"),""),
    GIBDD(util.StringToUUID("751daed9-5693-43b8-85d2-33075765d1b3"),"TemplateGIBDD"),

    INN(util.StringToUUID("F33F8477-AFDC-4B76-A410-DAAE6B55A2DC"),"Template_INN"),

    VIP_FL(util.StringToUUID("B07FF7CD-8450-462A-B2F6-21A05A2C6CBD"),""),
    NDIPSR(util.StringToUUID("EC474D91-C8CF-494E-856F-5DB7677D7776"),""),
    DOHFLNA_SP(util.StringToUUID("8756F03E-F7D4-4E3F-9377-F0FB0571DC09"),""),
    NDFL2(util.StringToUUID("D7883D14-3A61-4B73-BA65-83EC0B8D0636"),"Template_FNS_2NDFL"),
    DOHFLNA(util.StringToUUID("FA6BA6A8-7866-4608-A7A8-6AE84F5F4EAA"),""),
    NDFL3(util.StringToUUID("F0F6C33A-41E7-49A4-9759-D04950F8F78B"),"Template3NDFL"),
    SVVIPL_FL(util.StringToUUID("B07FF7CD-8450-462A-B2F6-21A05A2C6CBD"),""),


    SNILS(util.StringToUUID("7D146D3F-504E-4E75-B789-C2F95FB40D48"),""),

    SZN(util.StringToUUID("CE88C33B-7C89-46D6-AB43-7729A217554C"),"TemplateSZN"),

    ZAGS_FATHER(util.StringToUUID("9FDFD422-66DE-49A3-BBA0-5C4FD7B67BF9"),"TemplateZ_PARENT"),
    ZAGS_FATAL(util.StringToUUID("4A23CE9E-0B24-4354-813D-A17D054179CF"),"TemplateZ_DEATH"),
    ZAGS_ROJD(util.StringToUUID("4CF1B3C2-118B-4491-9B55-26518AD157C0"),"TemplateZagsRogdenie2"),
    ZAGS_RAST_BRAK(util.StringToUUID("D46CBF18-849E-42BC-A5F0-C844B31E07A2"),"TemplateZ_RASTOR_BRAK"),
    ZAGS_ZAK_BRAK(util.StringToUUID("AF84FD8D-3C13-457D-B74D-574CDD2F57A8"),"TemplateZ_ZAK_BRAK"),
    ZAGS_RENAME(util.StringToUUID("EF41F8C3-8F64-4BB6-BAF0-4F78B6FF8EEF"),"TemplateZ_RENAME"),

    REESTR_LIC(util.StringToUUID("510EEA73-7937-4F08-8676-879E77F0421B"),"TemplateRL"),

    MVD_PL_REG(util.StringToUUID("DCF7C243-4622-4C8F-AA40-69F6483EA81F"),"Template_MVD_PL_REG"),

    MVD_LIV_REG(util.StringToUUID("A55A7AF0-FCC0-4FC1-B9B0-5FCCE97DC62F"),"Template_MVD_LIV_REG"),

    UNKNOWN(null,"");

    private final UUID idInquiry;
    private final String templateName;


    InquiryVersionEnum(UUID idInquiry, String templateName) {
        this.idInquiry = idInquiry;
        this.templateName = templateName;
    }

    public UUID idInquiry() {
        return idInquiry;
    }

    public String templateName() {
        return templateName;
    }

    public static InquiryVersionEnum InquiryById(UUID idInquiry) {
        for (InquiryVersionEnum e : values()) {
            if (e.idInquiry == null) {
                return UNKNOWN;
            } else
            if (e.idInquiry.equals(idInquiry))
                return e;
        }
        return UNKNOWN;
    }

    public static InquiryVersionEnum InquiryById(String idInquiry) {
        for (InquiryVersionEnum e : values()) {
            if (e.idInquiry == null) {
                return UNKNOWN;
            } else
            if (e.idInquiry.toString().toLowerCase().equals(idInquiry.toLowerCase()))
                return e;
        }
        return null;
    }

    public static UUID getInquiryId(InquiryVersionEnum inquiryVersionEnum) {
        return inquiryVersionEnum.idInquiry;
    }



}
