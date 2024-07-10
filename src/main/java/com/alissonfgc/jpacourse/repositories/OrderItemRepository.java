package com.alissonfgc.jpacourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alissonfgc.jpacourse.entities.OrderItem;
import com.alissonfgc.jpacourse.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
