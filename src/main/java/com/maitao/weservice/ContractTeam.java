
package com.maitao.weservice;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


/**
 * <p>contractTeam complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="contractTeam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="teamcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="days" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nights" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bgndate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="enddate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="qty" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="optype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startcity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="longtraffic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localtraffic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tripmemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="routes" type="{http://server.ws.api.contract.goldpalm.com/}contractTeamRoute" maxOccurs="unbounded"/>
 *         &lt;element name="guests" type="{http://server.ws.api.contract.goldpalm.com/}contractTeamGuest" maxOccurs="unbounded"/>
 *         &lt;element name="activities" type="{http://server.ws.api.contract.goldpalm.com/}contractTeamActivity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shoppings" type="{http://server.ws.api.contract.goldpalm.com/}contractTeamShopping" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractTeam", propOrder = {
    "teamcode",
    "linename",
    "days",
    "nights",
    "bgndate",
    "enddate",
    "qty",
    "optype",
    "startcity",
    "longtraffic",
    "localtraffic",
    "tripmemo",
    "routes",
    "guests",
    "activities",
    "shoppings"
})
public class ContractTeam {

    protected String teamcode;
    @XmlElement(required = true)
    protected String linename;
    protected int days;
    protected Integer nights;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected Date bgndate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected Date enddate;
    protected int qty;
    protected String optype;
    protected String startcity;
    protected String longtraffic;
    protected String localtraffic;
    protected String tripmemo;
    @XmlElement(required = true)
    protected List<ContractTeamRoute> routes;
    @XmlElement(required = true)
    protected List<ContractTeamGuest> guests;
    protected List<ContractTeamActivity> activities;
    protected List<ContractTeamShopping> shoppings;

    /**
     * 获取teamcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamcode() {
        return teamcode;
    }

    /**
     * 设置teamcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamcode(String value) {
        this.teamcode = value;
    }

    /**
     * 获取linename属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinename() {
        return linename;
    }

    /**
     * 设置linename属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinename(String value) {
        this.linename = value;
    }

    /**
     * 获取days属性的值。
     * 
     */
    public int getDays() {
        return days;
    }

    /**
     * 设置days属性的值。
     * 
     */
    public void setDays(int value) {
        this.days = value;
    }

    /**
     * 获取nights属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNights() {
        return nights;
    }

    /**
     * 设置nights属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNights(Integer value) {
        this.nights = value;
    }

    /**
     * 获取bgndate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getBgndate() {
        return bgndate;
    }

    /**
     * 设置bgndate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBgndate(Date value) {
        this.bgndate = value;
    }

    /**
     * 获取enddate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getEnddate() {
        return enddate;
    }

    /**
     * 设置enddate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnddate(Date value) {
        this.enddate = value;
    }

    /**
     * 获取qty属性的值。
     * 
     */
    public int getQty() {
        return qty;
    }

    /**
     * 设置qty属性的值。
     * 
     */
    public void setQty(int value) {
        this.qty = value;
    }

    /**
     * 获取optype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptype() {
        return optype;
    }

    /**
     * 设置optype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptype(String value) {
        this.optype = value;
    }

    /**
     * 获取startcity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartcity() {
        return startcity;
    }

    /**
     * 设置startcity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartcity(String value) {
        this.startcity = value;
    }

    /**
     * 获取longtraffic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongtraffic() {
        return longtraffic;
    }

    /**
     * 设置longtraffic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongtraffic(String value) {
        this.longtraffic = value;
    }

    /**
     * 获取localtraffic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocaltraffic() {
        return localtraffic;
    }

    /**
     * 设置localtraffic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocaltraffic(String value) {
        this.localtraffic = value;
    }

    /**
     * 获取tripmemo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripmemo() {
        return tripmemo;
    }

    /**
     * 设置tripmemo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripmemo(String value) {
        this.tripmemo = value;
    }

    /**
     * Gets the value of the routes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractTeamRoute }
     * 
     * 
     */
    public List<ContractTeamRoute> getRoutes() {
        if (routes == null) {
            routes = new ArrayList<ContractTeamRoute>();
        }
        return this.routes;
    }

    /**
     * Gets the value of the guests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractTeamGuest }
     * 
     * 
     */
    public List<ContractTeamGuest> getGuests() {
        if (guests == null) {
            guests = new ArrayList<ContractTeamGuest>();
        }
        return this.guests;
    }

    /**
     * Gets the value of the activities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractTeamActivity }
     * 
     * 
     */
    public List<ContractTeamActivity> getActivities() {
        if (activities == null) {
            activities = new ArrayList<ContractTeamActivity>();
        }
        return this.activities;
    }

    /**
     * Gets the value of the shoppings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shoppings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShoppings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractTeamShopping }
     * 
     * 
     */
    public List<ContractTeamShopping> getShoppings() {
        if (shoppings == null) {
            shoppings = new ArrayList<ContractTeamShopping>();
        }
        return this.shoppings;
    }

}
