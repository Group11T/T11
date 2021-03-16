package io.t11.clientConnectivity.controller;

import io.t11.clientConnectivity.dto.OrderDto;
import io.t11.clientConnectivity.model.Order;
import io.t11.clientConnectivity.service.IOrderService;
import io.t11.clientConnectivity.service.OrderClient;
import io.t11.validatiingorders.wsdl.ValidateOrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class RestOrderController {

    @Autowired
    IOrderService orderService;

    @Autowired
    OrderClient orderClient;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity< Order> createNewOrder(@RequestBody OrderDto orderDto){
        ValidateOrderResponse validateOrderResponse=orderClient.validateNewOrder(orderDto);
        Order order = orderService.createNewOrder(validateOrderResponse);
       return ResponseEntity.ok().body(order);
    }


}


