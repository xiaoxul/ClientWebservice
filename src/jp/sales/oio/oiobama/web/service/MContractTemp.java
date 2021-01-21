
package jp.sales.oio.oiobama.web.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for mContractTemp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mContractTemp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.web.oiobama.oio.sales.jp/}oiobamaEntity">
 *       &lt;sequence>
 *         &lt;element name="checkDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cpno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detailUnmatchCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="inContractNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inDetailCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="inPsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="inPsFilename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outContractNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="psUnmatchCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mContractTemp", propOrder = {
    "checkDate",
    "cpno",
    "detailUnmatchCount",
    "inContractNo",
    "inDetailCount",
    "inPsCount",
    "inPsFilename",
    "outContractNo",
    "psUnmatchCount",
    "status",
    "unificationDate"
})
public class MContractTemp
    extends OiobamaEntity
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkDate;
    protected String cpno;
    protected Integer detailUnmatchCount;
    protected String inContractNo;
    protected Integer inDetailCount;
    protected Integer inPsCount;
    protected String inPsFilename;
    protected String outContractNo;
    protected Integer psUnmatchCount;
    protected String status;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar unificationDate;

    /**
     * Gets the value of the checkDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckDate() {
        return checkDate;
    }

    /**
     * Sets the value of the checkDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckDate(XMLGregorianCalendar value) {
        this.checkDate = value;
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
     * Gets the value of the detailUnmatchCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDetailUnmatchCount() {
        return detailUnmatchCount;
    }

    /**
     * Sets the value of the detailUnmatchCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDetailUnmatchCount(Integer value) {
        this.detailUnmatchCount = value;
    }

    /**
     * Gets the value of the inContractNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInContractNo() {
        return inContractNo;
    }

    /**
     * Sets the value of the inContractNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInContractNo(String value) {
        this.inContractNo = value;
    }

    /**
     * Gets the value of the inDetailCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInDetailCount() {
        return inDetailCount;
    }

    /**
     * Sets the value of the inDetailCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInDetailCount(Integer value) {
        this.inDetailCount = value;
    }

    /**
     * Gets the value of the inPsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInPsCount() {
        return inPsCount;
    }

    /**
     * Sets the value of the inPsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInPsCount(Integer value) {
        this.inPsCount = value;
    }

    /**
     * Gets the value of the inPsFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPsFilename() {
        return inPsFilename;
    }

    /**
     * Sets the value of the inPsFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPsFilename(String value) {
        this.inPsFilename = value;
    }

    /**
     * Gets the value of the outContractNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutContractNo() {
        return outContractNo;
    }

    /**
     * Sets the value of the outContractNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutContractNo(String value) {
        this.outContractNo = value;
    }

    /**
     * Gets the value of the psUnmatchCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPsUnmatchCount() {
        return psUnmatchCount;
    }

    /**
     * Sets the value of the psUnmatchCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPsUnmatchCount(Integer value) {
        this.psUnmatchCount = value;
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
     * Gets the value of the unificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUnificationDate() {
        return unificationDate;
    }

    /**
     * Sets the value of the unificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUnificationDate(XMLGregorianCalendar value) {
        this.unificationDate = value;
    }

}
