package com.study.yeseul.order.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.ZonedDateTime;

@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @Column
    private long id;

    @Column(updatable = false)
    private long productId;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private ZonedDateTime cratedAt;

    @Column(nullable = false, updatable = false)
    private String userName;

    @Column(updatable = false)
    private int count;

}
