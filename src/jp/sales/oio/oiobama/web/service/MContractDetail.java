
package jp.sales.oio.oiobama.web.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for mContractDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mContractDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.web.oiobama.oio.sales.jp/}oiobamaEntity">
 *       &lt;sequence>
 *         &lt;element name="contractDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="contractNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="contractNoName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createDate1" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="createUser1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="excelStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceRequestDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="proposalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updateDate1" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="updateUser1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mContractDetail", propOrder = {
    "contractDate",
    "contractNo",
    "contractNoName",
    "cpno",
    "createDate1",
    "createUser1",
    "excelStart",
    "paLevel",
    "postCd",
    "priceRequestDate",
    "proposalDate",
    "status",
    "updateDate1",
    "updateUser1"
})
public class MContractDetail
    extends OiobamaEntity
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar contractDate;
    protected Integer contractNo;
    protected String contractNoName;
    protected String cpno;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate1;
    protected String createUser1;
    protected String excelStart;
    protected String paLevel;
    protected String postCd;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar priceRequestDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar proposalDate;
    protected String status;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDate1;
    protected String updateUser1;

    /**
     * Gets the value of the contractDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractDate() {
        return contractDate;
    }

    /**
     * Sets the value of the contractDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractDate(XMLGregorianCalendar value) {
        this.contractDate = value;
    }

    /**
     * Gets the value of the contractNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContractNo() {
        return contractNo;
    }

    /**
     * Sets the value of the contractNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContractNo(Integer value) {
        this.contractNo = value;
    }

    /**
     * Gets the value of the contractNoName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNoName() {
        return contractNoName;
    }

    /**
     * Sets the value of the contractNoName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNoName(String value) {
        this.contractNoName = value;
    }

    /**
     * Gets the value of the cpno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpno() {
        return cpno;
    }

    /**
     * Sets the value of the cpno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpno(String value) {
        this.cpno = value;
    }

    /**
     * Gets the value of the createDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate1() {
        return createDate1;
    }

    /**
     * Sets the value of the createDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate1(XMLGregorianCalendar value) {
        this.createDate1 = value;
    }

    /**
     * Gets the value of the createUser1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateUser1() {
        return createUser1;
    }

    /**
     * Sets the value of the createUser1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateUser1(String value) {
        this.createUser1 = value;
    }

    /**
     * Gets the value of the excelStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcelStart() {
        return excelStart;
    }

    /**
     * Sets the value of the excelStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcelStart(String value) {
        this.excelStart = value;
    }

    /**
     * Gets the value of the paLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaLevel() {
        return paLevel;
    }

    /**
     * Sets the value of the paLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaLevel(String value) {
        this.paLevel = value;
    }

    /**
     * Gets the value of the postCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCd() {
        return postCd;
    }

    /**
     * Sets the value of the postCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCd(String value) {
        this.postCd = value;
    }

    /**
     * Gets the value of the priceRequestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPriceRequestDate() {
        return priceRequestDate;
    }

    /**
     * Sets the value of the priceRequestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPriceRequestDate(XMLGregorianCalendar value) {
        this.priceRequestDate = value;
    }

    /**
     * Gets the value of the proposalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProposalDate() {
        return proposalDate;
    }

    /**
     * Sets the value of the proposalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProposalDate(XMLGregorianCalendar value) {
        this.proposalDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the updateDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDate1() {
        return updateDate1;
    }

    /**
     * Sets the value of the updateDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDate1(XMLGregorianCalendar value) {
        this.updateDate1 = value;
    }

    /**
     * Gets the value of the updateUser1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateUser1() {
        return updateUser1;
    }

    /**
     * Sets the value of the updateUser1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateUser1(String value) {
        this.updateUser1 = value;
    }

}
