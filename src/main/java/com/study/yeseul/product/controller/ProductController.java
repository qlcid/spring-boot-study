package com.study.yeseul.product.controller;

import com.study.yeseul.product.model.ProductModel;
import com.study.yeseul.product.vo.ProductDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    // 등록(생성)
    @PostMapping("")
    public ProductModel createProduct(@RequestBody ProductDto.ProductCreateDto createDto) {

        ProductModel productModel = new ProductModel();
        productModel.setId((long) (Math.random() * 100));
        productModel.setName(createDto.getName());
        productModel.setPrice(createDto.getPrice());
        productModel.setVender(createDto.getVender());

        System.out.println("상품을 등록 하였습니다.");

        return productModel;
    }

    // 조회
    @GetMapping("/{id}")
    public ProductDto.ProductDetailDto getProduct(@PathVariable("id") final long id) {
        System.out.println(">>>>> id : " + id);

        ProductDto.ProductDetailDto productDetailDto = new ProductDto.ProductDetailDto();
        productDetailDto.setId(id);
        productDetailDto.setName("HP ProDesk 280 G2 6세대i5 탑재 램8G SSD 256G 정품 윈도우10");
        productDetailDto.setPrice(349000);
        productDetailDto.setVender("(주)스마트닷컴");

        return productDetailDto;
    }

    // 삭제
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable("id") final String id) {
        return id + " 상품을 삭제 하였습니다.";
    }

    // 업데이트
    @PutMapping("/{id}")
    public String updateProduct(@PathVariable("id") final String id) {
        return id + " 상품을 수정 하였습니다.";
    }

}
