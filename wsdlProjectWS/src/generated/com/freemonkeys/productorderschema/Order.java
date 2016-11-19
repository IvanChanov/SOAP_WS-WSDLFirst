
package com.freemonkeys.productorderschema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Order complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Order">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="product" type="{http://FreeMonkeys.com/ProductOrderSchema}Product" maxOccurs="unbounded"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GiftWrapped" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="shippingCompany" type="{http://FreeMonkeys.com/ProductOrderSchema}ShippingCompanys"/>
 *         &lt;element name="paymentMethod" type="{http://FreeMonkeys.com/ProductOrderSchema}PaymentMethod"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Order", propOrder = {
    "customerID",
    "product",
    "id",
    "giftWrapped",
    "shippingCompany",
    "paymentMethod"
})
public class Order {

    protected int customerID;
    @XmlElement(required = true)
    protected List<Product> product;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(name = "GiftWrapped")
    protected boolean giftWrapped;
    @XmlElement(required = true)
    protected ShippingCompanys shippingCompany;
    @XmlElement(required = true)
    protected PaymentMethod paymentMethod;

    /**
     * Gets the value of the customerID property.
     * 
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     */
    public void setCustomerID(int value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Product }
     * 
     * 
     */
    public List<Product> getProduct() {
        if (product == null) {
            product = new ArrayList<Product>();
        }
        return this.product;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the giftWrapped property.
     * 
     */
    public boolean isGiftWrapped() {
        return giftWrapped;
    }

    /**
     * Sets the value of the giftWrapped property.
     * 
     */
    public void setGiftWrapped(boolean value) {
        this.giftWrapped = value;
    }

    /**
     * Gets the value of the shippingCompany property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingCompanys }
     *     
     */
    public ShippingCompanys getShippingCompany() {
        return shippingCompany;
    }

    /**
     * Sets the value of the shippingCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingCompanys }
     *     
     */
    public void setShippingCompany(ShippingCompanys value) {
        this.shippingCompany = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethod }
     *     
     */
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethod }
     *     
     */
    public void setPaymentMethod(PaymentMethod value) {
        this.paymentMethod = value;
    }

}
