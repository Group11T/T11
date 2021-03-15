package io.t11.clientConnectivity.dao;

import io.t11.clientConnectivity.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
