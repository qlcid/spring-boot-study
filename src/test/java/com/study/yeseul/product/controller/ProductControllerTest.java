package com.study.yeseul.product.controller;

import com.study.yeseul.product.dao.ProductRepository;
import com.study.yeseul.product.service.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
class ProductControllerTest {

//    @Autowired
//    MockMvc mockMvc;
//
//    @Autowired
//    ObjectMapper objectMapper;

    @MockBean
    ProductService productService;

    @Autowired
    TestRestTemplate testRestTemplate;

    @Autowired
    ProductRepository productRepository;

    @Test
    public void hello() {
        String result = testRestTemplate.getForObject("/products/1", String.class);
        System.out.println(result);
//        assertThat(result).isEqualTo("hello namjune");
    }

//    @Test
//    void 상품등록_성공() throws Exception {
//
//        ProductDto.ProductCreateDto productCreateDto = ProductDto.ProductCreateDto.builder()
//                .name("iPhone")
//                .price(10000000)
//                .vender("APPLE")
//                .build();
//        given(productService.createProduct(productCreateDto)).willReturn(Product.valueOf(productCreateDto));
//
//        String content = objectMapper.writeValueAsString(productCreateDto);
//        ResultActions actions = this.mockMvc.perform(
//                post("/products")
//                        .content(content)
//                        .contentType(MediaType.APPLICATION_JSON)
//        );
//        actions.andExpect(status().isOk())
//                .andDo(print())
//        ;
//    }
//
//    @Test
//    void 상품등록_입력값_에러() throws Exception {
//
//        ProductDto.ProductCreateDto productCreateDto = ProductDto.ProductCreateDto.builder()
//                .name("iPhone abcdeee")
//                .price(10000000)
//                .vender("APPLEeeeeeeeee")
//                .build();
//        final String content = objectMapper.writeValueAsString(productCreateDto);
//
//        ResultActions actions = this.mockMvc.perform(
//                post("/products")
//                        .content(content)
//                        .contentType(MediaType.APPLICATION_JSON)
//        );
//        actions.andExpect(status().is4xxClientError())
//                .andDo(print())
//        ;
//    }
//
//    @Test
//    void 상품목록조회() throws Exception {
//        ResultActions actions = this.mockMvc.perform(
//                get("/products")
//                .contentType(MediaType.APPLICATION_JSON)
//        );
//
//        actions.andExpect(status().isOk())
//                .andDo(print())
//                ;
//    }
//
//    @Test
//    void 상품상세조회() throws Exception {
//        MockHttpServletResponse response = this.mockMvc
//                .perform(get("/products/{id}", 19L).contentType(MediaType.APPLICATION_JSON))
//                .andReturn()
//                .getResponse();
//
//        System.out.println(">>>>> sss");
//        System.out.println(response.getContentAsString());
//        System.out.println(">>>>> fff");
//    }

}