
package jp.sales.oio.oiobama.web.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tPprice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tPprice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.web.oiobama.oio.sales.jp/}oiobamaEntity">
 *       &lt;sequence>
 *         &lt;element name="cpno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ioc01" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ioc02" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ioc03" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ioc04" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ioc05" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ioc06" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ioc07" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ioc08" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ioc09" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ioc10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ioc11" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ioc12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="iocYt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="lineNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tPprice", propOrder = {
    "cpno",
    "delFlag",
    "ioc01",
    "ioc02",
    "ioc03",
    "ioc04",
    "ioc05",
    "ioc06",
    "ioc07",
    "ioc08",
    "ioc09",
    "ioc10",
    "ioc11",
    "ioc12",
    "iocYt",
    "lineNo",
    "year"
})
public class TPprice
    extends OiobamaEntity
{

    protected String cpno;
    protected String delFlag;
    protected BigDecimal ioc01;
    protected BigDecimal ioc02;
    protected BigDecimal ioc03;
    protected BigDecimal ioc04;
    protected BigDecimal ioc05;
    protected BigDecimal ioc06;
    protected BigDecimal ioc07;
    protected BigDecimal ioc08;
    protected BigDecimal ioc09;
    protected BigDecimal ioc10;
    protected BigDecimal ioc11;
    protected BigDecimal ioc12;
    protected BigDecimal iocYt;
    protected Integer lineNo;
    protected String year;

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
     * Gets the value of the delFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * Sets the value of the delFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelFlag(String value) {
        this.delFlag = value;
    }

    /**
     * Gets the value of the ioc01 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIoc01() {
        return ioc01;
    }

    /**
     * Sets the value of the ioc01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIoc01(BigDecimal value) {
        this.ioc01 = value;
    }

    /**
     * Gets the value of the ioc02 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIoc02() {
        return ioc02;
    }

    /**
     * Sets the value of the ioc02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIoc02(BigDecimal value) {
        this.ioc02 = value;
    }

    /**
     * Gets the value of the ioc03 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIoc03() {
        return ioc03;
    }

    /**
     * Sets the value of the ioc03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIoc03(BigDecimal value) {
        this.ioc03 = value;
    }

    /**
     * Gets the value of the ioc04 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIoc04() {
        return ioc04;
    }

    /**
     * Sets the value of the ioc04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIoc04(BigDecimal value) {
        this.ioc04 = value;
    }

    /**
     * Gets the value of the ioc05 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIoc05() {
        return ioc05;
    }

    /**
     * Sets the value of the ioc05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIoc05(BigDecimal value) {
        this.ioc05 = value;
    }

    /**
     * Gets the value of the ioc06 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIoc06() {
        return ioc06;
    }

    /**
     * Sets the value of the ioc06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIoc06(BigDecimal value) {
        this.ioc06 = value;
    }

    /**
     * Gets the value of the ioc07 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIoc07() {
        return ioc07;
    }

    /**
     * Sets the value of the ioc07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIoc07(BigDecimal value) {
        this.ioc07 = value;
    }

    /**
     * Gets the value of the ioc08 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIoc08() {
        return ioc08;
    }

    /**
     * Sets the value of the ioc08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIoc08(BigDecimal value) {
        this.ioc08 = value;
    }

    /**
     * Gets the value of the ioc09 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIoc09() {
        return ioc09;
    }

    /**
     * Sets the value of the ioc09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIoc09(BigDecimal value) {
        this.ioc09 = value;
    }

    /**
     * Gets the value of the ioc10 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIoc10() {
        return ioc10;
    }

    /**
     * Sets the value of the ioc10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIoc10(BigDecimal value) {
        this.ioc10 = value;
    }

    /**
     * Gets the value of the ioc11 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIoc11() {
        return ioc11;
    }

    /**
     * Sets the value of the ioc11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIoc11(BigDecimal value) {
        this.ioc11 = value;
    }

    /**
     * Gets the value of the ioc12 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIoc12() {
        return ioc12;
    }

    /**
     * Sets the value of the ioc12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIoc12(BigDecimal value) {
        this.ioc12 = value;
    }

    /**
     * Gets the value of the iocYt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIocYt() {
        return iocYt;
    }

    /**
     * Sets the value of the iocYt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIocYt(BigDecimal value) {
        this.iocYt = value;
    }

    /**
     * Gets the value of the lineNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLineNo() {
        return lineNo;
    }

    /**
     * Sets the value of the lineNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLineNo(Integer value) {
        this.lineNo = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
    }

}
