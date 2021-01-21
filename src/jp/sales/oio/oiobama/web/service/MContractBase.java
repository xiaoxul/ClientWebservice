
package jp.sales.oio.oiobama.web.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mContractBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mContractBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.web.oiobama.oio.sales.jp/}tCustomer">
 *       &lt;sequence>
 *         &lt;element name="contractPattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispAsrFlg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="excelStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="topacsCpno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unificationPattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mContractBase", propOrder = {
    "contractPattern",
    "dispAsrFlg",
    "excelStart",
    "postCd",
    "topacsCpno",
    "unificationPattern"
})
public class MContractBase
    extends TCustomer
{

    protected String contractPattern;
    protected Integer dispAsrFlg;
    protected String excelStart;
    protected String postCd;
    protected String topacsCpno;
    protected String unificationPattern;

    /**
     * Gets the value of the contractPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractPattern() {
        return contractPattern;
    }

    /**
     * Sets the value of the contractPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractPattern(String value) {
        this.contractPattern = value;
    }

    /**
     * Gets the value of the dispAsrFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDispAsrFlg() {
        return dispAsrFlg;
    }

    /**
     * Sets the value of the dispAsrFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDispAsrFlg(Integer value) {
        this.dispAsrFlg = value;
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
     * Gets the value of the topacsCpno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopacsCpno() {
        return topacsCpno;
    }

    /**
     * Sets the value of the topacsCpno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopacsCpno(String value) {
        this.topacsCpno = value;
    }

    /**
     * Gets the value of the unificationPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnificationPattern() {
        return unificationPattern;
    }

    /**
     * Sets the value of the unificationPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnificationPattern(String value) {
        this.unificationPattern = value;
    }

}
