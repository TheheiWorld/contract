
package com.maitao.weservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>submitContractRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="submitContractRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="travelname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="travelmobile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="travelemail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="platsource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noemail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractTeam" type="{http://server.ws.api.contract.goldpalm.com/}contractTeam"/>
 *         &lt;element name="contractJSON" type="{http://server.ws.api.contract.goldpalm.com/}contractJSON"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "submitContractRequest", propOrder = {
    "version",
    "no",
    "travelname",
    "travelmobile",
    "travelemail",
    "transactor",
    "price",
    "platsource",
    "nomsg",
    "noemail",
    "contractTeam",
    "contractJSON"
})
public class SubmitContractRequest {

    @XmlElement(required = true)
    protected String version;
    protected String no;
    @XmlElement(required = true)
    protected String travelname;
    @XmlElement(required = true)
    protected String travelmobile;
    protected String travelemail;
    @XmlElement(required = true)
    protected String transactor;
    protected double price;
    protected String platsource;
    protected String nomsg;
    protected String noemail;
    @XmlElement(required = true)
    protected ContractTeam contractTeam;
    @XmlElement(required = true)
    protected ContractJSON contractJSON;

    /**
     * 获取version属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * 获取no属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNo() {
        return no;
    }

    /**
     * 设置no属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNo(String value) {
        this.no = value;
    }

    /**
     * 获取travelname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelname() {
        return travelname;
    }

    /**
     * 设置travelname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelname(String value) {
        this.travelname = value;
    }

    /**
     * 获取travelmobile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelmobile() {
        return travelmobile;
    }

    /**
     * 设置travelmobile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelmobile(String value) {
        this.travelmobile = value;
    }

    /**
     * 获取travelemail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelemail() {
        return travelemail;
    }

    /**
     * 设置travelemail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelemail(String value) {
        this.travelemail = value;
    }

    /**
     * 获取transactor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactor() {
        return transactor;
    }

    /**
     * 设置transactor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactor(String value) {
        this.transactor = value;
    }

    /**
     * 获取price属性的值。
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置price属性的值。
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * 获取platsource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatsource() {
        return platsource;
    }

    /**
     * 设置platsource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatsource(String value) {
        this.platsource = value;
    }

    /**
     * 获取nomsg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomsg() {
        return nomsg;
    }

    /**
     * 设置nomsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomsg(String value) {
        this.nomsg = value;
    }

    /**
     * 获取noemail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoemail() {
        return noemail;
    }

    /**
     * 设置noemail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoemail(String value) {
        this.noemail = value;
    }

    /**
     * 获取contractTeam属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContractTeam }
     *     
     */
    public ContractTeam getContractTeam() {
        return contractTeam;
    }

    /**
     * 设置contractTeam属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContractTeam }
     *     
     */
    public void setContractTeam(ContractTeam value) {
        this.contractTeam = value;
    }

    /**
     * 获取contractJSON属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContractJSON }
     *     
     */
    public ContractJSON getContractJSON() {
        return contractJSON;
    }

    /**
     * 设置contractJSON属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContractJSON }
     *     
     */
    public void setContractJSON(ContractJSON value) {
        this.contractJSON = value;
    }

}
