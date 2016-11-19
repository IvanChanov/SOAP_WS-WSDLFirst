
package com.freemonkeys.productorderschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.freemonkeys.productorderschema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreatedOrderRequest_QNAME = new QName("http://FreeMonkeys.com/ProductOrderSchema", "createdOrderRequest");
    private final static QName _Order_QNAME = new QName("http://FreeMonkeys.com/ProductOrderSchema", "order");
    private final static QName _GetOrdersResponse_QNAME = new QName("http://FreeMonkeys.com/ProductOrderSchema", "getOrdersResponse");
    private final static QName _Product_QNAME = new QName("http://FreeMonkeys.com/ProductOrderSchema", "product");
    private final static QName _GetOrdersRequest_QNAME = new QName("http://FreeMonkeys.com/ProductOrderSchema", "getOrdersRequest");
    private final static QName _CreatedOrderResponse_QNAME = new QName("http://FreeMonkeys.com/ProductOrderSchema", "createdOrderResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.freemonkeys.productorderschema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrdersResponse }
     * 
     */
    public OrdersResponse createOrdersResponse() {
        return new OrdersResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link OrdersRequest }
     * 
     */
    public OrdersRequest createOrdersRequest() {
        return new OrdersRequest();
    }

    /**
     * Create an instance of {@link CreatedOrderResponse }
     * 
     */
    public CreatedOrderResponse createCreatedOrderResponse() {
        return new CreatedOrderResponse();
    }

    /**
     * Create an instance of {@link CreatedOrderReques }
     * 
     */
    public CreatedOrderReques createCreatedOrderReques() {
        return new CreatedOrderReques();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link ShippingCompanys }
     * 
     */
    public ShippingCompanys createShippingCompanys() {
        return new ShippingCompanys();
    }

    /**
     * Create an instance of {@link PaymentMethod }
     * 
     */
    public PaymentMethod createPaymentMethod() {
        return new PaymentMethod();
    }

    /**
     * Create an instance of {@link CashOnDelivery }
     * 
     */
    public CashOnDelivery createCashOnDelivery() {
        return new CashOnDelivery();
    }

    /**
     * Create an instance of {@link CreditCard }
     * 
     */
    public CreditCard createCreditCard() {
        return new CreditCard();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatedOrderReques }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://FreeMonkeys.com/ProductOrderSchema", name = "createdOrderRequest")
    public JAXBElement<CreatedOrderReques> createCreatedOrderRequest(CreatedOrderReques value) {
        return new JAXBElement<CreatedOrderReques>(_CreatedOrderRequest_QNAME, CreatedOrderReques.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://FreeMonkeys.com/ProductOrderSchema", name = "order")
    public JAXBElement<Order> createOrder(Order value) {
        return new JAXBElement<Order>(_Order_QNAME, Order.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://FreeMonkeys.com/ProductOrderSchema", name = "getOrdersResponse")
    public JAXBElement<OrdersResponse> createGetOrdersResponse(OrdersResponse value) {
        return new JAXBElement<OrdersResponse>(_GetOrdersResponse_QNAME, OrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://FreeMonkeys.com/ProductOrderSchema", name = "product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://FreeMonkeys.com/ProductOrderSchema", name = "getOrdersRequest")
    public JAXBElement<OrdersRequest> createGetOrdersRequest(OrdersRequest value) {
        return new JAXBElement<OrdersRequest>(_GetOrdersRequest_QNAME, OrdersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatedOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://FreeMonkeys.com/ProductOrderSchema", name = "createdOrderResponse")
    public JAXBElement<CreatedOrderResponse> createCreatedOrderResponse(CreatedOrderResponse value) {
        return new JAXBElement<CreatedOrderResponse>(_CreatedOrderResponse_QNAME, CreatedOrderResponse.class, null, value);
    }

}
