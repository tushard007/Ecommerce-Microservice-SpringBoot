package org.ecommerce.orderservice.repository;

import org.ecommerce.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}