package io.t11.clientConnectivity.service;

import com.group11.soap.api.order_creation.CreateOrderRequest;
import io.t11.clientConnectivity.dao.OrderRepository;
import io.t11.clientConnectivity.dto.OrderDto;
import io.t11.clientConnectivity.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService{

    @Autowired
    OrderRepository orderRepository;

    @Override
    public Order createNewOrder(OrderDto orderDto) {
        Order order = new Order();
        order.setProduct(orderDto.getProduct());
        order.setQuantity(orderDto.getQuantity());
        order.setPrice(orderDto.getPrice());
        order.setSide(orderDto.getSide());
        return orderRepository.save(order);
    }

    @Override
    public Order sendOrderForValidation(Order order) {
        return null;
    }

//    public Order createNewOrder(CreateOrderRequest orderRequest){
//        Order order = new Order();
//        order.setProduct(orderRequest.getProduct());
//        order.setQuantity(orderRequest.getQuantity());
//        order.setPrice(orderRequest.getQuantity());
//        order.setSide(orderRequest.getSide());
//        return order;
//    }


}
