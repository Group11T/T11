package io.t11.clientConnectivity.service;

import io.t11.clientConnectivity.dao.OrderRepository;
import io.t11.clientConnectivity.model.Order;
import io.t11.validatiingorders.wsdl.ValidateOrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService{

    @Autowired
    OrderRepository orderRepository;

    @Override
    public Order createNewOrder(ValidateOrderResponse validateOrderResponse) {
        Order order = new Order();
        order.setProduct(validateOrderResponse.getOrder().getProduct());
        order.setQuantity(validateOrderResponse.getOrder().getQuantity());
        order.setPrice(validateOrderResponse.getOrder().getPrice());
        order.setSide(validateOrderResponse.getOrder().getSide());
        return orderRepository.save(order);
    }

}
