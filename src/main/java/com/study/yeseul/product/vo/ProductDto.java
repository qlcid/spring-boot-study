package com.study.yeseul.product.vo;


import lombok.Getter;
import lombok.Setter;

public class ProductDto {

    @Getter
    @Setter
    public static class ProductCreateDto {
        private String name;
        private int price;
        private String vender;
    }

    @Getter
    @Setter
    public static class ProductDetailDto {
        private long id;
        private String name;
        private int price;
        private String vender;
    }

    @Getter
    @Setter
    public static class ProductUpdateDto {
        private int price;
    }

}
