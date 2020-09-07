package com.study.yeseul.product.vo;


import com.study.yeseul.product.domain.Product;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;

public class ProductDto {

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ProductCreateDto {
        @Length(max = 10)
        private String name;

        private int price;

        @Length(max = 10)
        private String vender;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    public static class ProductDetailDto {
        private long id;
        private String name;
        private int price;
        private String vender;

        public static ProductDetailDto valueOf(Product product) {
            return new ProductDetailDto(
                    product.getId(),
                    product.getName(),
                    product.getPrice(),
                    product.getVender()
            );
        }

        public ProductDetailDto(long id, String name, int price, String vender) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.vender = vender;
        }
    }

    @Getter
    @Setter
    public static class ProductUpdateDto {
        private int price;
    }

}
