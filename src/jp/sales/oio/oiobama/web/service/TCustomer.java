
package jp.sales.oio.oiobama.web.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for tCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tCustomer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.web.oiobama.oio.sales.jp/}oiobamaEntity">
 *       &lt;sequence>
 *         &lt;element name="approvalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="commitUpdateFlg" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="contractDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cpno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="importDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="importMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paAnvDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rowColomnName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rowCustomData" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="startMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCustomer", propOrder = {
    "approvalDate",
    "commitUpdateFlg",
    "contractDate",
    "cpno",
    "custName",
    "dStatus",
    "endMonth",
    "endYear",
    "importDetail",
    "importMethod",
    "operFlag",
    "pStatus",
    "paAnvDate",
    "paLevel",
    "rowColomnName",
    "rowCustomData",
    "startMonth",
    "startYear"
})
@XmlSeeAlso({
    MContractBase.class
})
public class TCustomer
    extends OiobamaEntity
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approvalDate;
    protected boolean commitUpdateFlg;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar contractDate;
    protected String cpno;
    protected String custName;
    @XmlElement(name = "DStatus")
    protected String dStatus;
    protected String endMonth;
    protected String endYear;
    protected String importDetail;
    protected String importMethod;
    protected String operFlag;
    @XmlElement(name = "PStatus")
    protected String pStatus;
    protected String paAnvDate;
    protected String paLevel;
    @XmlElement(nillable = true)
    protected List<String> rowColomnName;
    @XmlElement(nillable = true)
    protected List<String> rowCustomData;
    protected String startMonth;
    protected String startYear;

    /**
     * Gets the value of the approvalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApprovalDate() {
        return approvalDate;
    }

    /**
     * Sets the value of the approvalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApprovalDate(XMLGregorianCalendar value) {
        this.approvalDate = value;
    }

    /**
     * Gets the value of the commitUpdateFlg property.
     * 
     */
    public boolean isCommitUpdateFlg() {
        return commitUpdateFlg;
    }

    /**
     * Sets the value of the commitUpdateFlg property.
     * 
     */
    public void setCommitUpdateFlg(boolean value) {
        this.commitUpdateFlg = value;
    }

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
     * Gets the value of the custName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustName() {
        return custName;
    }

    /**
     * Sets the value of the custName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustName(String value) {
        this.custName = value;
    }

    /**
     * Gets the value of the dStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDStatus() {
        return dStatus;
    }

    /**
     * Sets the value of the dStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDStatus(String value) {
        this.dStatus = value;
    }

    /**
     * Gets the value of the endMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndMonth() {
        return endMonth;
    }

    /**
     * Sets the value of the endMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndMonth(String value) {
        this.endMonth = value;
    }

    /**
     * Gets the value of the endYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndYear() {
        return endYear;
    }

    /**
     * Sets the value of the endYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndYear(String value) {
        this.endYear = value;
    }

    /**
     * Gets the value of the importDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportDetail() {
        return importDetail;
    }

    /**
     * Sets the value of the importDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportDetail(String value) {
        this.importDetail = value;
    }

    /**
     * Gets the value of the importMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportMethod() {
        return importMethod;
    }

    /**
     * Sets the value of the importMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportMethod(String value) {
        this.importMethod = value;
    }

    /**
     * Gets the value of the operFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperFlag() {
        return operFlag;
    }

    /**
     * Sets the value of the operFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperFlag(String value) {
        this.operFlag = value;
    }

    /**
     * Gets the value of the pStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPStatus() {
        return pStatus;
    }

    /**
     * Sets the value of the pStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPStatus(String value) {
        this.pStatus = value;
    }

    /**
     * Gets the value of the paAnvDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaAnvDate() {
        return paAnvDate;
    }

    /**
     * Sets the value of the paAnvDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaAnvDate(String value) {
        this.paAnvDate = value;
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
     * Gets the value of the rowColomnName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rowColomnName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRowColomnName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRowColomnName() {
        if (rowColomnName == null) {
            rowColomnName = new ArrayList<String>();
        }
        return this.rowColomnName;
    }

    /**
     * Gets the value of the rowCustomData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rowCustomData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRowCustomData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRowCustomData() {
        if (rowCustomData == null) {
            rowCustomData = new ArrayList<String>();
        }
        return this.rowCustomData;
    }

    /**
     * Gets the value of the startMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartMonth() {
        return startMonth;
    }

    /**
     * Sets the value of the startMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartMonth(String value) {
        this.startMonth = value;
    }

    /**
     * Gets the value of the startYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartYear() {
        return startYear;
    }

    /**
     * Sets the value of the startYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartYear(String value) {
        this.startYear = value;
    }

}
