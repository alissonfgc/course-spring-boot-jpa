package com.alissonfgc.jpacourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alissonfgc.jpacourse.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
