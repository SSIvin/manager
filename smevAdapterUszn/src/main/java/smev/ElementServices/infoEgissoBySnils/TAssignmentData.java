package smev.ElementServices.infoEgissoBySnils;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 *
 *          Тип данных: Сведения о фактах назначения
 *
 *
 * <p>Java class for tAssignmentData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType userName="tAssignmentData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element userName="assignment" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;group ref="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}PhysicalPersonQualifiedName-ModelGroup"/>
 *                   &lt;element userName="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element userName="reasonPersons" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element userName="reasonPerson" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element userName="reasonSNILS" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}SNILSType"/>
 *                                       &lt;group ref="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}PhysicalPersonQualifiedName-ModelGroup"/>
 *                                       &lt;element userName="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element userName="kmszCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="\d{4}\.\d{8}\.\d{2}\.\d{4}\.\d{2}\.\d{6}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element userName="onmszTitle" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-500"/>
 *                   &lt;element userName="onmszCode" type="{urn://egisso-ru/types/basic/1.0.6}tParticipantCode"/>
 *                   &lt;element userName="lmszTitle">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="2000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element userName="categoryTitle">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="2000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element userName="decisionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element userName="dateStart" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element userName="dateFinish" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element userName="form" type="{urn://egisso-ru/types/basic/1.0.6}tFormOfGranting"/>
 *                   &lt;element userName="periodicity" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}digits-2"/>
 *                   &lt;element userName="amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element userName="measureUnit" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}digits-2"/>
 *                   &lt;element userName="comment" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-200" minOccurs="0"/>
 *                   &lt;element userName="description" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-200" minOccurs="0"/>
 *                   &lt;element userName="needCriterion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element userName="criteria" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-500" minOccurs="0"/>
 *                   &lt;element userName="rightsDocuments" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element userName="document" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element userName="issueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;element userName="startDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;element userName="finishDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                       &lt;element userName="series" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-20" minOccurs="0"/>
 *                                       &lt;element userName="number" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-20" minOccurs="0"/>
 *                                       &lt;element userName="title" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-500"/>
 *                                       &lt;element userName="authority" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-500"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element userName="npaList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element userName="npa" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element userName="npaDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;element userName="npaNumber" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-20"/>
 *                                       &lt;element userName="npaName" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-500"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tAssignmentData"
        , namespace = "urn://egisso-ru/types/prsn-statement/1.0.3"
        , propOrder = {
    "assignment"
})
public class TAssignmentData {

    protected List<Assignment> assignment;

    /**
     * Gets the value of the assignment property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignment property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignment().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TAssignmentData.Assignment }
     *
     *
     */
    public List<Assignment> getAssignment() {
        if (assignment == null) {
            assignment = new ArrayList<Assignment>();
        }
        return this.assignment;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;group ref="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}PhysicalPersonQualifiedName-ModelGroup"/>
     *         &lt;element userName="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element userName="reasonPersons" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element userName="reasonPerson" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element userName="reasonSNILS" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}SNILSType"/>
     *                             &lt;group ref="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}PhysicalPersonQualifiedName-ModelGroup"/>
     *                             &lt;element userName="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element userName="kmszCode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="\d{4}\.\d{8}\.\d{2}\.\d{4}\.\d{2}\.\d{6}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element userName="onmszTitle" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-500"/>
     *         &lt;element userName="onmszCode" type="{urn://egisso-ru/types/basic/1.0.6}tParticipantCode"/>
     *         &lt;element userName="lmszTitle">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="2000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element userName="categoryTitle">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="2000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element userName="decisionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element userName="dateStart" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element userName="dateFinish" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element userName="form" type="{urn://egisso-ru/types/basic/1.0.6}tFormOfGranting"/>
     *         &lt;element userName="periodicity" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}digits-2"/>
     *         &lt;element userName="amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element userName="measureUnit" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}digits-2"/>
     *         &lt;element userName="comment" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-200" minOccurs="0"/>
     *         &lt;element userName="description" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-200" minOccurs="0"/>
     *         &lt;element userName="needCriterion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element userName="criteria" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-500" minOccurs="0"/>
     *         &lt;element userName="rightsDocuments" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element userName="document" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element userName="issueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;element userName="startDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;element userName="finishDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;element userName="series" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-20" minOccurs="0"/>
     *                             &lt;element userName="number" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-20" minOccurs="0"/>
     *                             &lt;element userName="title" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-500"/>
     *                             &lt;element userName="authority" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-500"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element userName="npaList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element userName="npa" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element userName="npaDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;element userName="npaNumber" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-20"/>
     *                             &lt;element userName="npaName" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-500"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "familyName",
        "firstName",
        "patronymic",
        "birthDate",
        "reasonPersons",
        "kmszCode",
        "onmszTitle",
        "onmszCode",
        "lmszTitle",
        "categoryTitle",
        "decisionDate",
        "dateStart",
        "dateFinish",
        "form",
        "periodicity",
        "amount",
        "measureUnit",
        "comment",
        "description",
        "needCriterion",
        "criteria",
        "rightsDocuments",
        "npaList"
    })
    public static class Assignment {

        @XmlElement(name = "FamilyName", required = true)
        protected String familyName;
        @XmlElement(name = "FirstName", required = true)
        protected String firstName;
        @XmlElement(name = "Patronymic")
        protected String patronymic;
        @XmlElement(name = "BirthDate", namespace = "urn://egisso-ru/types/prsn-statement/1.0.3", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar birthDate;
        @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3")
        protected TAssignmentData.Assignment.ReasonPersons reasonPersons;
        @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3", required = true)
        protected String kmszCode;
        @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3", required = true)
        protected String onmszTitle;
        @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3", required = true)
        protected String onmszCode;
        @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3", required = true)
        protected String lmszTitle;
        @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3", required = true)
        protected String categoryTitle;
        @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar decisionDate;
        @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateStart;
        @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateFinish;
        @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3", required = true)
        protected String form;
        @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3", required = true)
        protected String periodicity;
        @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3", required = true)
        protected BigDecimal amount;
        @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3", required = true)
        protected String measureUnit;
        @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3")
        protected String comment;
        @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3")
        protected String description;
        @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3")
        protected boolean needCriterion;
        @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3")
        protected String criteria;
        @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3")
        protected TAssignmentData.Assignment.RightsDocuments rightsDocuments;
        @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3")
        protected TAssignmentData.Assignment.NpaList npaList;

        /**
         * Gets the value of the familyName property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getFamilyName() {
            return familyName;
        }

        /**
         * Sets the value of the familyName property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setFamilyName(String value) {
            this.familyName = value;
        }

        /**
         * Gets the value of the firstName property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getFirstName() {
            return firstName;
        }

        /**
         * Sets the value of the firstName property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setFirstName(String value) {
            this.firstName = value;
        }

        /**
         * Gets the value of the patronymic property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPatronymic() {
            return patronymic;
        }

        /**
         * Sets the value of the patronymic property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPatronymic(String value) {
            this.patronymic = value;
        }

        /**
         * Gets the value of the birthday property.
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getBirthDate() {
            return birthDate;
        }

        /**
         * Sets the value of the birthday property.
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setBirthDate(XMLGregorianCalendar value) {
            this.birthDate = value;
        }

        /**
         * Gets the value of the reasonPersons property.
         *
         * @return
         *     possible object is
         *     {@link TAssignmentData.Assignment.ReasonPersons }
         *
         */
        public TAssignmentData.Assignment.ReasonPersons getReasonPersons() {
            return reasonPersons;
        }

        /**
         * Sets the value of the reasonPersons property.
         *
         * @param value
         *     allowed object is
         *     {@link TAssignmentData.Assignment.ReasonPersons }
         *
         */
        public void setReasonPersons(TAssignmentData.Assignment.ReasonPersons value) {
            this.reasonPersons = value;
        }

        /**
         * Gets the value of the kmszCode property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getKmszCode() {
            return kmszCode;
        }

        /**
         * Sets the value of the kmszCode property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setKmszCode(String value) {
            this.kmszCode = value;
        }

        /**
         * Gets the value of the onmszTitle property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getOnmszTitle() {
            return onmszTitle;
        }

        /**
         * Sets the value of the onmszTitle property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setOnmszTitle(String value) {
            this.onmszTitle = value;
        }

        /**
         * Gets the value of the onmszCode property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getOnmszCode() {
            return onmszCode;
        }

        /**
         * Sets the value of the onmszCode property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setOnmszCode(String value) {
            this.onmszCode = value;
        }

        /**
         * Gets the value of the lmszTitle property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getLmszTitle() {
            return lmszTitle;
        }

        /**
         * Sets the value of the lmszTitle property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setLmszTitle(String value) {
            this.lmszTitle = value;
        }

        /**
         * Gets the value of the categoryTitle property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCategoryTitle() {
            return categoryTitle;
        }

        /**
         * Sets the value of the categoryTitle property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCategoryTitle(String value) {
            this.categoryTitle = value;
        }

        /**
         * Gets the value of the decisionDate property.
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getDecisionDate() {
            return decisionDate;
        }

        /**
         * Sets the value of the decisionDate property.
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setDecisionDate(XMLGregorianCalendar value) {
            this.decisionDate = value;
        }

        /**
         * Gets the value of the dateStart property.
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getDateStart() {
            return dateStart;
        }

        /**
         * Sets the value of the dateStart property.
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setDateStart(XMLGregorianCalendar value) {
            this.dateStart = value;
        }

        /**
         * Gets the value of the dateFinish property.
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getDateFinish() {
            return dateFinish;
        }

        /**
         * Sets the value of the dateFinish property.
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setDateFinish(XMLGregorianCalendar value) {
            this.dateFinish = value;
        }

        /**
         * Gets the value of the form property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getForm() {
            return form;
        }

        /**
         * Sets the value of the form property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setForm(String value) {
            this.form = value;
        }

        /**
         * Gets the value of the periodicity property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPeriodicity() {
            return periodicity;
        }

        /**
         * Sets the value of the periodicity property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPeriodicity(String value) {
            this.periodicity = value;
        }

        /**
         * Gets the value of the amount property.
         *
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         *
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Gets the value of the measureUnit property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getMeasureUnit() {
            return measureUnit;
        }

        /**
         * Sets the value of the measureUnit property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setMeasureUnit(String value) {
            this.measureUnit = value;
        }

        /**
         * Gets the value of the comment property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getComment() {
            return comment;
        }

        /**
         * Sets the value of the comment property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setComment(String value) {
            this.comment = value;
        }

        /**
         * Gets the value of the description property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the needCriterion property.
         *
         */
        public boolean isNeedCriterion() {
            return needCriterion;
        }

        /**
         * Sets the value of the needCriterion property.
         *
         */
        public void setNeedCriterion(boolean value) {
            this.needCriterion = value;
        }

        /**
         * Gets the value of the criteria property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCriteria() {
            return criteria;
        }

        /**
         * Sets the value of the criteria property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCriteria(String value) {
            this.criteria = value;
        }

        /**
         * Gets the value of the rightsDocuments property.
         *
         * @return
         *     possible object is
         *     {@link TAssignmentData.Assignment.RightsDocuments }
         *
         */
        public TAssignmentData.Assignment.RightsDocuments getRightsDocuments() {
            return rightsDocuments;
        }

        /**
         * Sets the value of the rightsDocuments property.
         *
         * @param value
         *     allowed object is
         *     {@link TAssignmentData.Assignment.RightsDocuments }
         *
         */
        public void setRightsDocuments(TAssignmentData.Assignment.RightsDocuments value) {
            this.rightsDocuments = value;
        }

        /**
         * Gets the value of the npaList property.
         *
         * @return
         *     possible object is
         *     {@link TAssignmentData.Assignment.NpaList }
         *
         */
        public TAssignmentData.Assignment.NpaList getNpaList() {
            return npaList;
        }

        /**
         * Sets the value of the npaList property.
         *
         * @param value
         *     allowed object is
         *     {@link TAssignmentData.Assignment.NpaList }
         *
         */
        public void setNpaList(TAssignmentData.Assignment.NpaList value) {
            this.npaList = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element userName="npa" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element userName="npaDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element userName="npaNumber" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-20"/>
         *                   &lt;element userName="npaName" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-500"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "npa"
        })
        public static class NpaList {

            @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3", required = true)
            protected List<Npa> npa;

            /**
             * Gets the value of the npa property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the npa property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNpa().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TAssignmentData.Assignment.NpaList.Npa }
             *
             *
             */
            public List<Npa> getNpa() {
                if (npa == null) {
                    npa = new ArrayList<Npa>();
                }
                return this.npa;
            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element userName="npaDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element userName="npaNumber" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-20"/>
             *         &lt;element userName="npaName" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-500"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "npaDate",
                "npaNumber",
                "npaName"
            })
            public static class Npa {

                @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar npaDate;
                @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3", required = true)
                protected String npaNumber;
                @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3", required = true)
                protected String npaName;

                /**
                 * Gets the value of the npaDate property.
                 *
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public XMLGregorianCalendar getNpaDate() {
                    return npaDate;
                }

                /**
                 * Sets the value of the npaDate property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public void setNpaDate(XMLGregorianCalendar value) {
                    this.npaDate = value;
                }

                /**
                 * Gets the value of the npaNumber property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getNpaNumber() {
                    return npaNumber;
                }

                /**
                 * Sets the value of the npaNumber property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setNpaNumber(String value) {
                    this.npaNumber = value;
                }

                /**
                 * Gets the value of the npaName property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getNpaName() {
                    return npaName;
                }

                /**
                 * Sets the value of the npaName property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setNpaName(String value) {
                    this.npaName = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element userName="reasonPerson" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element userName="reasonSNILS" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}SNILSType"/>
         *                   &lt;group ref="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}PhysicalPersonQualifiedName-ModelGroup"/>
         *                   &lt;element userName="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "reasonPerson"
        })
        public static class ReasonPersons {

            @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3", required = true)
            protected List<ReasonPerson> reasonPerson;

            /**
             * Gets the value of the reasonPerson property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the reasonPerson property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getReasonPerson().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TAssignmentData.Assignment.ReasonPersons.ReasonPerson }
             *
             *
             */
            public List<ReasonPerson> getReasonPerson() {
                if (reasonPerson == null) {
                    reasonPerson = new ArrayList<ReasonPerson>();
                }
                return this.reasonPerson;
            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element userName="reasonSNILS" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}SNILSType"/>
             *         &lt;group ref="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}PhysicalPersonQualifiedName-ModelGroup"/>
             *         &lt;element userName="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "reasonSNILS",
                "familyName",
                "firstName",
                "patronymic",
                "birthDate"
            })
            public static class ReasonPerson {

                @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3", required = true)
                protected String reasonSNILS;
                @XmlElement(name = "FamilyName", required = true)
                protected String familyName;
                @XmlElement(name = "FirstName", required = true)
                protected String firstName;
                @XmlElement(name = "Patronymic")
                protected String patronymic;
                @XmlElement(name = "BirthDate", namespace = "urn://egisso-ru/types/prsn-statement/1.0.3", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar birthDate;

                /**
                 * Gets the value of the reasonSNILS property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getReasonSNILS() {
                    return reasonSNILS;
                }

                /**
                 * Sets the value of the reasonSNILS property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setReasonSNILS(String value) {
                    this.reasonSNILS = value;
                }

                /**
                 * Gets the value of the familyName property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getFamilyName() {
                    return familyName;
                }

                /**
                 * Sets the value of the familyName property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setFamilyName(String value) {
                    this.familyName = value;
                }

                /**
                 * Gets the value of the firstName property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getFirstName() {
                    return firstName;
                }

                /**
                 * Sets the value of the firstName property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setFirstName(String value) {
                    this.firstName = value;
                }

                /**
                 * Gets the value of the patronymic property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getPatronymic() {
                    return patronymic;
                }

                /**
                 * Sets the value of the patronymic property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setPatronymic(String value) {
                    this.patronymic = value;
                }

                /**
                 * Gets the value of the birthday property.
                 *
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public XMLGregorianCalendar getBirthDate() {
                    return birthDate;
                }

                /**
                 * Sets the value of the birthday property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public void setBirthDate(XMLGregorianCalendar value) {
                    this.birthDate = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element userName="document" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element userName="issueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element userName="startDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element userName="finishDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;element userName="series" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-20" minOccurs="0"/>
         *                   &lt;element userName="number" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-20" minOccurs="0"/>
         *                   &lt;element userName="title" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-500"/>
         *                   &lt;element userName="authority" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-500"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "document"
        })
        public static class RightsDocuments {

            @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3", required = true)
            protected List<Document> document;

            /**
             * Gets the value of the document property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the document property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDocument().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TAssignmentData.Assignment.RightsDocuments.Document }
             *
             *
             */
            public List<Document> getDocument() {
                if (document == null) {
                    document = new ArrayList<Document>();
                }
                return this.document;
            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element userName="issueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element userName="startDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element userName="finishDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;element userName="series" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-20" minOccurs="0"/>
             *         &lt;element userName="number" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-20" minOccurs="0"/>
             *         &lt;element userName="title" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-500"/>
             *         &lt;element userName="authority" type="{urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1}string-500"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "issueDate",
                "startDate",
                "finishDate",
                "series",
                "number",
                "title",
                "authority"
            })
            public static class Document {

                @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar issueDate;
                @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar startDate;
                @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar finishDate;
                @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3")
                protected String series;
                @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3")
                protected String number;
                @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3", required = true)
                protected String title;
                @XmlElement(namespace = "urn://egisso-ru/types/prsn-statement/1.0.3", required = true)
                protected String authority;

                /**
                 * Gets the value of the issueDate property.
                 *
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public XMLGregorianCalendar getIssueDate() {
                    return issueDate;
                }

                /**
                 * Sets the value of the issueDate property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public void setIssueDate(XMLGregorianCalendar value) {
                    this.issueDate = value;
                }

                /**
                 * Gets the value of the startDate property.
                 *
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public XMLGregorianCalendar getStartDate() {
                    return startDate;
                }

                /**
                 * Sets the value of the startDate property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public void setStartDate(XMLGregorianCalendar value) {
                    this.startDate = value;
                }

                /**
                 * Gets the value of the finishDate property.
                 *
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public XMLGregorianCalendar getFinishDate() {
                    return finishDate;
                }

                /**
                 * Sets the value of the finishDate property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public void setFinishDate(XMLGregorianCalendar value) {
                    this.finishDate = value;
                }

                /**
                 * Gets the value of the series property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getSeries() {
                    return series;
                }

                /**
                 * Sets the value of the series property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setSeries(String value) {
                    this.series = value;
                }

                /**
                 * Gets the value of the number property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getNumber() {
                    return number;
                }

                /**
                 * Sets the value of the number property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setNumber(String value) {
                    this.number = value;
                }

                /**
                 * Gets the value of the title property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getTitle() {
                    return title;
                }

                /**
                 * Sets the value of the title property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setTitle(String value) {
                    this.title = value;
                }

                /**
                 * Gets the value of the authority property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getAuthority() {
                    return authority;
                }

                /**
                 * Sets the value of the authority property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setAuthority(String value) {
                    this.authority = value;
                }

            }

        }

    }

}
