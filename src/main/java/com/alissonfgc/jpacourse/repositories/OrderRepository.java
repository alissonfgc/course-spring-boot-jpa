package com.alissonfgc.jpacourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alissonfgc.jpacourse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
