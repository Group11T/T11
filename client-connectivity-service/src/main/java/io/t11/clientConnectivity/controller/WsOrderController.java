package io.t11.clientConnectivity.controller;

import com.group11.soap.api.order_creation.CreateOrderRequest;
import com.group11.soap.api.order_creation.CreateOrderResponse;
import com.group11.soap.api.order_creation.Order;
import io.t11.clientConnectivity.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class WsOrderController {

    private static final String NAMESPACE_URI = "http://www.group11.com/soap/api/order-creation";
    @Autowired
    OrderService orderService;

    @PayloadRoot(namespace = "NAMESPACE_URI",localPart = "createOrderRequest")
    @ResponsePayload
    public CreateOrderResponse createOrder(@RequestPayload CreateOrderRequest orderRequest){
//        Order order=orderService.createNewOrder(orderRequest);
//        CreateOrderResponse response = new CreateOrderResponse();
//        response.setOrder(order);
//        response.setStatus("Order Creation Successful");
//        return response;
        return null;
    }
}
