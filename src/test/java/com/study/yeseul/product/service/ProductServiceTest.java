package com.study.yeseul.product.service;

import com.study.yeseul.product.dao.ProductRepository;
import com.study.yeseul.product.domain.Product;
import com.study.yeseul.product.vo.ProductDto;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
//@ActiveProfiles(TestProfile.TEST)
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