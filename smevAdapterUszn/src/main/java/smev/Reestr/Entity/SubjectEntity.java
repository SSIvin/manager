package smev.Reestr.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "T_SUBJECT", schema = "dbo")
@IdClass(SubjectEntityPK.class)
public class SubjectEntity implements Serializable {

    @Embedded
    private SubjectEntityPK subjectEntityPK;

    private int idSubject;
    private int idRegion;
    private String surname;
    private String name;
    private String secname;
    private LocalDate birthday;
    private String sex;
    private String otdsvz;
    private Integer kladr;
    private Integer street;
    private Integer dom;
    private String fractionHouse;
    private String korpus;
    private Integer kvart;
    private String kvartL;
    private Short documentType;
    private String documentSerie;
    private String documentNumber;
    private LocalDate documentDate;
    private String documentSource;
    private String numberFone;
    private String lcPens;
    private String inn;
    private String snils;
    private String otdsvzRegistration;
    private Integer kladrRegistration;
    private Integer streetRegistration;
    private Integer domRegistration;
    private String fractionHouseRegistration;
    private String korpusRegistration;
    private Integer kvartRegistration;
    private String kvartLRegistration;
    private Integer idRegionRegistration;
    private Integer idOpekun;
    private Timestamp dateClosed;
    private Timestamp dateQuit;
    private Short reasonOfQuit;
    private Timestamp dateFirstInv;
    private Short documentSourceNew;
    private Timestamp dateFirstVisit;
    private Short addParent;
    private Byte permissionToProcessing;
    private String email;
    private String domLRegistration;
    private String domL;




    public SubjectEntityPK getSubjectEntityPK() {
        return subjectEntityPK;
    }

    public void setSubjectEntityPK(SubjectEntityPK subjectEntityPK) {
        this.subjectEntityPK = subjectEntityPK;
    }

    @Id
    @Column(name = "ID_SUBJECT", nullable = false)
    public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    @Id
    @Column(name = "ID_REGION", nullable = false)
    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    @Basic
    @Column(name = "SURNAME", nullable = false, length = 25)
    public String getSurname() {
        return surname != null ? surname : "";
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "NAME", nullable = false, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "SECNAME", nullable = true, length = 20)
    public String getSecname() {
        return secname != null ? secname : "";
    }

    public void setSecname(String secname) {
        this.secname = secname;
    }

    @Basic
    @Column(name = "BIRTHDAY", nullable = true)
    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "SEX", nullable = true, length = 1)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "OTDSVZ", nullable = true, length = 6)
    public String getOtdsvz() {
        return otdsvz;
    }

    public void setOtdsvz(String otdsvz) {
        this.otdsvz = otdsvz;
    }

    @Basic
    @Column(name = "KLADR", nullable = true)
    public Integer getKladr() {
        return kladr;
    }

    public void setKladr(Integer kladr) {
        this.kladr = kladr;
    }

    @Basic
    @Column(name = "STREET", nullable = true)
    public Integer getStreet() {
        return street;
    }

    public void setStreet(Integer street) {
        this.street = street;
    }

    @Basic
    @Column(name = "DOM", nullable = true)
    public Integer getDom() {
        return dom;
    }

    public void setDom(Integer dom) {
        this.dom = dom;
    }

    @Basic
    @Column(name = "FRACTION_HOUSE", nullable = true, length = 3)
    public String getFractionHouse() {
        return fractionHouse;
    }

    public void setFractionHouse(String fractionHouse) {
        this.fractionHouse = fractionHouse;
    }

    @Basic
    @Column(name = "KORPUS", nullable = true, length = 3)
    public String getKorpus() {
        return korpus;
    }

    public void setKorpus(String korpus) {
        this.korpus = korpus;
    }

    @Basic
    @Column(name = "KVART", nullable = true)
    public Integer getKvart() {
        return kvart;
    }

    public void setKvart(Integer kvart) {
        this.kvart = kvart;
    }

    @Basic
    @Column(name = "KVART_L", nullable = true, length = 3)
    public String getKvartL() {
        return kvartL;
    }

    public void setKvartL(String kvartL) {
        this.kvartL = kvartL;
    }

    @Basic
    @Column(name = "DOCUMENT_TYPE", nullable = true)
    public Short getDocumentType() {
        return documentType;
    }

    public void setDocumentType(Short documentType) {
        this.documentType = documentType;
    }

    @Basic
    @Column(name = "DOCUMENT_SERIE", nullable = true, length = 10)
    public String getDocumentSerie() {
        return documentSerie;
    }

    public void setDocumentSerie(String documentSerie) {
        this.documentSerie = documentSerie;
    }

    @Basic
    @Column(name = "DOCUMENT_NUMBER", nullable = true, length = 15)
    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    @Basic
    @Column(name = "DOCUMENT_DATE", nullable = true)
    public LocalDate getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(LocalDate documentDate) {
        this.documentDate = documentDate;
    }

    @Basic
    @Column(name = "DOCUMENT_SOURCE", nullable = true, length = 150)
    public String getDocumentSource() {
        return documentSource;
    }

    public void setDocumentSource(String documentSource) {
        this.documentSource = documentSource;
    }

    @Basic
    @Column(name = "NUMBER_FONE", nullable = true, length = 30)
    public String getNumberFone() {
        return numberFone;
    }

    public void setNumberFone(String numberFone) {
        this.numberFone = numberFone;
    }

    @Basic
    @Column(name = "LC_PENS", nullable = true, length = 6)
    public String getLcPens() {
        return lcPens;
    }

    public void setLcPens(String lcPens) {
        this.lcPens = lcPens;
    }

    @Basic
    @Column(name = "INN", nullable = true, length = 20)
    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    @Basic
    @Column(name = "SNILS", nullable = true, length = 20)
    public String getSnils() {
        return snils;
    }

    public void setSnils(String snils) {
        this.snils = snils;
    }

    @Basic
    @Column(name = "OTDSVZ_REGISTRATION", nullable = true, length = 6)
    public String getOtdsvzRegistration() {
        return otdsvzRegistration;
    }

    public void setOtdsvzRegistration(String otdsvzRegistration) {
        this.otdsvzRegistration = otdsvzRegistration;
    }

    @Basic
    @Column(name = "KLADR_REGISTRATION", nullable = true)
    public Integer getKladrRegistration() {
        return kladrRegistration;
    }

    public void setKladrRegistration(Integer kladrRegistration) {
        this.kladrRegistration = kladrRegistration;
    }

    @Basic
    @Column(name = "STREET_REGISTRATION", nullable = true)
    public Integer getStreetRegistration() {
        return streetRegistration;
    }

    public void setStreetRegistration(Integer streetRegistration) {
        this.streetRegistration = streetRegistration;
    }

    @Basic
    @Column(name = "DOM_REGISTRATION", nullable = true)
    public Integer getDomRegistration() {
        return domRegistration;
    }

    public void setDomRegistration(Integer domRegistration) {
        this.domRegistration = domRegistration;
    }

    @Basic
    @Column(name = "FRACTION_HOUSE_REGISTRATION", nullable = true, length = 3)
    public String getFractionHouseRegistration() {
        return fractionHouseRegistration;
    }

    public void setFractionHouseRegistration(String fractionHouseRegistration) {
        this.fractionHouseRegistration = fractionHouseRegistration;
    }

    @Basic
    @Column(name = "KORPUS_REGISTRATION", nullable = true, length = 3)
    public String getKorpusRegistration() {
        return korpusRegistration;
    }

    public void setKorpusRegistration(String korpusRegistration) {
        this.korpusRegistration = korpusRegistration;
    }

    @Basic
    @Column(name = "KVART_REGISTRATION", nullable = true)
    public Integer getKvartRegistration() {
        return kvartRegistration;
    }

    public void setKvartRegistration(Integer kvartRegistration) {
        this.kvartRegistration = kvartRegistration;
    }

    @Basic
    @Column(name = "KVART_L_REGISTRATION", nullable = true, length = 3)
    public String getKvartLRegistration() {
        return kvartLRegistration;
    }

    public void setKvartLRegistration(String kvartLRegistration) {
        this.kvartLRegistration = kvartLRegistration;
    }

    @Basic
    @Column(name = "ID_REGION_REGISTRATION", nullable = true)
    public Integer getIdRegionRegistration() {
        return idRegionRegistration;
    }

    public void setIdRegionRegistration(Integer idRegionRegistration) {
        this.idRegionRegistration = idRegionRegistration;
    }

    @Basic
    @Column(name = "ID_OPEKUN", nullable = true)
    public Integer getIdOpekun() {
        return idOpekun;
    }

    public void setIdOpekun(Integer idOpekun) {
        this.idOpekun = idOpekun;
    }

    @Basic
    @Column(name = "DATE_CLOSED", nullable = true)
    public Timestamp getDateClosed() {
        return dateClosed;
    }

    public void setDateClosed(Timestamp dateClosed) {
        this.dateClosed = dateClosed;
    }

    @Basic
    @Column(name = "DATE_QUIT", nullable = true)
    public Timestamp getDateQuit() {
        return dateQuit;
    }

    public void setDateQuit(Timestamp dateQuit) {
        this.dateQuit = dateQuit;
    }

    @Basic
    @Column(name = "REASON_OF_QUIT", nullable = true)
    public Short getReasonOfQuit() {
        return reasonOfQuit;
    }

    public void setReasonOfQuit(Short reasonOfQuit) {
        this.reasonOfQuit = reasonOfQuit;
    }

    @Basic
    @Column(name = "DATE_FIRST_INV", nullable = true)
    public Timestamp getDateFirstInv() {
        return dateFirstInv;
    }

    public void setDateFirstInv(Timestamp dateFirstInv) {
        this.dateFirstInv = dateFirstInv;
    }

    @Basic
    @Column(name = "DOCUMENT_SOURCE_NEW", nullable = true)
    public Short getDocumentSourceNew() {
        return documentSourceNew;
    }

    public void setDocumentSourceNew(Short documentSourceNew) {
        this.documentSourceNew = documentSourceNew;
    }

    @Basic
    @Column(name = "DATE_FIRST_VISIT", nullable = true)
    public Timestamp getDateFirstVisit() {
        return dateFirstVisit;
    }

    public void setDateFirstVisit(Timestamp dateFirstVisit) {
        this.dateFirstVisit = dateFirstVisit;
    }

    @Basic
    @Column(name = "ADD_PARENT", nullable = true)
    public Short getAddParent() {
        return addParent;
    }

    public void setAddParent(Short addParent) {
        this.addParent = addParent;
    }

    @Basic
    @Column(name = "PERMISSION_TO_PROCESSING", nullable = true)
    public Byte getPermissionToProcessing() {
        return permissionToProcessing;
    }

    public void setPermissionToProcessing(Byte permissionToProcessing) {
        this.permissionToProcessing = permissionToProcessing;
    }

    @Basic
    @Column(name = "EMAIL", nullable = true, length = 70)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "DOM_L_REGISTRATION", nullable = true, length = 3)
    public String getDomLRegistration() {
        return domLRegistration;
    }

    public void setDomLRegistration(String domLRegistration) {
        this.domLRegistration = domLRegistration;
    }

    @Basic
    @Column(name = "DOM_L", nullable = true, length = 3)
    public String getDomL() {
        return domL;
    }

    public void setDomL(String domL) {
        this.domL = domL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubjectEntity that = (SubjectEntity) o;
        return idSubject == that.idSubject &&
                idRegion == that.idRegion &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(name, that.name) &&
                Objects.equals(secname, that.secname) &&
                Objects.equals(birthday, that.birthday) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(otdsvz, that.otdsvz) &&
                Objects.equals(kladr, that.kladr) &&
                Objects.equals(street, that.street) &&
                Objects.equals(dom, that.dom) &&
                Objects.equals(fractionHouse, that.fractionHouse) &&
                Objects.equals(korpus, that.korpus) &&
                Objects.equals(kvart, that.kvart) &&
                Objects.equals(kvartL, that.kvartL) &&
                Objects.equals(documentType, that.documentType) &&
                Objects.equals(documentSerie, that.documentSerie) &&
                Objects.equals(documentNumber, that.documentNumber) &&
                Objects.equals(documentDate, that.documentDate) &&
                Objects.equals(documentSource, that.documentSource) &&
                Objects.equals(numberFone, that.numberFone) &&
                Objects.equals(lcPens, that.lcPens) &&
                Objects.equals(inn, that.inn) &&
                Objects.equals(snils, that.snils) &&
                Objects.equals(otdsvzRegistration, that.otdsvzRegistration) &&
                Objects.equals(kladrRegistration, that.kladrRegistration) &&
                Objects.equals(streetRegistration, that.streetRegistration) &&
                Objects.equals(domRegistration, that.domRegistration) &&
                Objects.equals(fractionHouseRegistration, that.fractionHouseRegistration) &&
                Objects.equals(korpusRegistration, that.korpusRegistration) &&
                Objects.equals(kvartRegistration, that.kvartRegistration) &&
                Objects.equals(kvartLRegistration, that.kvartLRegistration) &&
                Objects.equals(idRegionRegistration, that.idRegionRegistration) &&
                Objects.equals(idOpekun, that.idOpekun) &&
                Objects.equals(dateClosed, that.dateClosed) &&
                Objects.equals(dateQuit, that.dateQuit) &&
                Objects.equals(reasonOfQuit, that.reasonOfQuit) &&
                Objects.equals(dateFirstInv, that.dateFirstInv) &&
                Objects.equals(documentSourceNew, that.documentSourceNew) &&
                Objects.equals(dateFirstVisit, that.dateFirstVisit) &&
                Objects.equals(addParent, that.addParent) &&
                Objects.equals(permissionToProcessing, that.permissionToProcessing) &&
                Objects.equals(email, that.email) &&
                Objects.equals(domLRegistration, that.domLRegistration) &&
                Objects.equals(domL, that.domL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSubject, idRegion, surname, name, secname, birthday, sex, otdsvz, kladr, street, dom, fractionHouse, korpus, kvart, kvartL, documentType, documentSerie, documentNumber, documentDate, documentSource, numberFone, lcPens, inn, snils, otdsvzRegistration, kladrRegistration, streetRegistration, domRegistration, fractionHouseRegistration, korpusRegistration, kvartRegistration, kvartLRegistration, idRegionRegistration, idOpekun, dateClosed, dateQuit, reasonOfQuit, dateFirstInv, documentSourceNew, dateFirstVisit, addParent, permissionToProcessing, email, domLRegistration, domL);
    }
}
