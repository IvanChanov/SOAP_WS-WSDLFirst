package com.freemonkeys.main.implementation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.freemonkeys.productorderschema.CreatedOrderReques;
import com.freemonkeys.productorderschema.CreatedOrderResponse;
import com.freemonkeys.productorderschema.CreditCard;
import com.freemonkeys.productorderschema.Order;
import com.freemonkeys.productorderschema.OrdersRequest;
import com.freemonkeys.productorderschema.OrdersResponse;
import com.freemonkeys.productorderschema.PaymentMethod;
import com.freemonkeys.productorderschema.Product;
import com.freemonkeys.productorderschema.ShippingCompanys;
import com.freemonkeysws.CustomerOrdersPortType;


public class CustomersOrderImplementation implements CustomerOrdersPortType {
	
	private int currentCustomerId ;
	private HashMap<Integer, ArrayList<Order>> customerOrders;
	private Order order;
	private Product product ; 
	private ArrayList<Order> allOrders;
	private PaymentMethod paymentMethod ;
	private CreditCard creditcard ; 
	private ShippingCompanys shippingCompanys ; 
	
	
	
	CustomersOrderImplementation()
	{
		init();
	}
	
	public void init()
	{
	
		
		// Provider - Client Test
		
		customerOrders = new HashMap<>();
		allOrders = new ArrayList<Order>();
		
		creditcard = new CreditCard();
		creditcard.setBankName("CCB");
		creditcard.setCardtype("Visa");
		
		shippingCompanys = new ShippingCompanys();
		shippingCompanys.setDeliverySpeed("1 day delivery");
		shippingCompanys.setName("DHL");
			
		paymentMethod = new PaymentMethod();
		paymentMethod.setCreditCard(creditcard); 
		
		order = new Order();
		order.setId("1");
		order.setGiftWrapped(true);
		order.setPaymentMethod(paymentMethod);
		order.setShippingCompany(shippingCompanys);
		order.setPaymentMethod(paymentMethod);
		
		product = new Product();
		product.setName("HeadPhones");
		product.setId("14124eqadsa123");
		product.setDescription("Gaming headphones with microphone");
		product.setQuantity(1);
		
		
		order.getProduct().add(product);
		allOrders.add(order);
		customerOrders.put(++currentCustomerId, allOrders);	
	}

	@Override
	public OrdersResponse getOrders(OrdersRequest request) {
		int customerId = request.getCustomerID();
		ArrayList<Order> ordersList = customerOrders.get(customerId);
		
		OrdersResponse ordersResponse = new OrdersResponse();
		List<Order> responseOrders = ordersResponse.getOrder();
		
		for(Order ord : ordersList)
		{
			responseOrders.add(ord);
		}
		
		return ordersResponse;
		
		
	}

	@Override
	public CreatedOrderResponse createdOrders(CreatedOrderReques request) {
		
		int customerID = request.getCustomerID();
		Order order = request.getOrder();
		List<Order> currentOrders = customerOrders.get(customerID);
		currentOrders.add(order);
	
		CreatedOrderResponse createdOrderResponse = new CreatedOrderResponse();
		createdOrderResponse.setResult(true);
		
		return createdOrderResponse;
	}
	
}
