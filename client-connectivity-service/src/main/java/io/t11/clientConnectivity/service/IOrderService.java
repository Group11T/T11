package io.t11.clientConnectivity.service;

import io.t11.clientConnectivity.model.Order;
import io.t11.validatiingorders.wsdl.ValidateOrderResponse;

public interface IOrderService {

    Order createNewOrder(ValidateOrderResponse validateOrderResponse );

}
