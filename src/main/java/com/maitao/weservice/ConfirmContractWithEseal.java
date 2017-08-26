
package com.maitao.weservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>confirmContractWithEseal complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="confirmContractWithEseal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confirmRequest" type="{http://server.ws.api.contract.goldpalm.com/}confirmRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confirmContractWithEseal", propOrder = {
    "token",
    "confirmRequest"
})
public class ConfirmContractWithEseal {

    protected String token;
    protected ConfirmRequest confirmRequest;

    /**
     * 获取token属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * 设置token属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * 获取confirmRequest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ConfirmRequest }
     *     
     */
    public ConfirmRequest getConfirmRequest() {
        return confirmRequest;
    }

    /**
     * 设置confirmRequest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmRequest }
     *     
     */
    public void setConfirmRequest(ConfirmRequest value) {
        this.confirmRequest = value;
    }

}
