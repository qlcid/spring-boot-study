package com.study.yeseul.order.service;

import com.study.yeseul.order.dao.OrderRepository;
import com.study.yeseul.order.domain.Order;
import com.study.yeseul.order.vo.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order createOrder(final long productId, final OrderDto.OrderCreateDto createDto) {
        return orderRepository.save(Order.valueOf(productId, createDto));
    }

    public OrderDto.OrderDetailDto getOrder(long id) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 상품이 없습니다. id=" + id));

        return OrderDto.OrderDetailDto.valueOf(order);
    }
}
