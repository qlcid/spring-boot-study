package com.study.yeseul.order.controller;

import com.study.yeseul.order.domain.Order;
import com.study.yeseul.order.service.OrderService;
import com.study.yeseul.order.vo.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    // 주문 목록 조회
    @GetMapping("")
    public String getOrderList() {
        return "";
    }

    // 주문 생성
    @PostMapping("/{productId}")
    public Order createOrder(@PathVariable("productId") final long productId,
                             @RequestBody final OrderDto.OrderCreateDto createDto) {
        return orderService.createOrder(productId, createDto);
    }

    // 주문 상세 조회
    @GetMapping("/{id}")
    public OrderDto.OrderDetailDto getOrder(@PathVariable("id") final long id) {
        return orderService.getOrder(id);
    }

    // 주문 삭제
    @DeleteMapping("/{id}")
    public void deleteOrder() {

    }
}
