package com.study.yeseul.product.service;

import com.study.yeseul.product.dao.ProductRepository;
import com.study.yeseul.product.domain.Product;
import com.study.yeseul.product.vo.ProductDto;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @InjectMocks
    private ProductService productService;

    @Mock
    private ProductRepository productRepository;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    void createProduct() {
        ProductDto.ProductCreateDto createDto = ProductDto.ProductCreateDto.builder()
                .name("aaa")
                .price(10000)
                .vender("apple")
                .build();
        given(productRepository.findById(1L)).willReturn(Optional.of(Product.valueOf(createDto)));

        Product product = productService.createProduct(createDto);
        assertThat(product).isNotNull();

        ProductDto.ProductCreateDto createDto2 = ProductDto.ProductCreateDto.builder()
                .name("bbb")
                .price(10000)
                .vender("apple")
                .build();
        Product product2 = productService.createProduct(createDto2);
        assertThat(product2).isNotNull();

    }

}