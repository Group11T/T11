package io.t11.clientConnectivity.service;

import io.t11.clientConnectivity.dto.OrderDto;
import io.t11.validatiingorders.wsdl.ValidateOrderRequest;
import io.t11.validatiingorders.wsdl.ValidateOrderResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class OrderClient extends WebServiceGatewaySupport {

    public ValidateOrderResponse validateNewOrder(OrderDto order){
        ValidateOrderRequest validateOrderRequest = new ValidateOrderRequest();
        validateOrderRequest.setProduct(order.getProduct());
        validateOrderRequest.setQuantity(order.getQuantity());
        validateOrderRequest.setPrice(order.getPrice());
        validateOrderRequest.setSide(order.getSide());
        ValidateOrderResponse validateOrderResponse=(ValidateOrderResponse)getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8040/ws/orders",validateOrderRequest,
                        new SoapActionCallback("http://www.group11.com/soap/api/order-validation/ValidateOrderRequest"));
        return validateOrderResponse;
    }
}
