package io.t11.orderValidation.service;

import com.group11.soap.api.order_validation.Order;
import com.group11.soap.api.order_validation.ValidateOrderRequest;

public interface IOrderValidationService {

     Order validateOrder(ValidateOrderRequest orderRequest);
}
