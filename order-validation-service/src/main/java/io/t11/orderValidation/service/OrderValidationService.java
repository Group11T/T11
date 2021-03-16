package io.t11.orderValidation.service;

import com.group11.soap.api.order_validation.Order;
import com.group11.soap.api.order_validation.ValidateOrderRequest;
import org.springframework.stereotype.Service;

@Service
public class OrderValidationService implements IOrderValidationService{

    @Override
    public Order validateOrder(final ValidateOrderRequest orderRequest) {
//        we start validation here

        //This is just for testing,we need to take it out
        Order order=new Order();
        order.setQuantity(orderRequest.getQuantity());
        order.setPrice(orderRequest.getPrice());
        order.setProduct(orderRequest.getProduct());
        return order;
    }
}
