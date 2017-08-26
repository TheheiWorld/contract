
package com.maitao.weservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>contractRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="contractRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="platsource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomsg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "contractRequest", propOrder = {
    "version",
    "no",
    "platsource",
    "nomsg",
    "contractJSON"
})
public class ContractRequest {

    @XmlElement(required = true)
    protected String version;
    protected String no;
    protected String platsource;
    protected Boolean nomsg;
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
     *     {@link Boolean }
     *     
     */
    public Boolean isNomsg() {
        return nomsg;
    }

    /**
     * 设置nomsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNomsg(Boolean value) {
        this.nomsg = value;
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
