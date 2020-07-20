package com.study.yeseul.product.service;

import com.study.yeseul.product.dao.ProductRepository;
import com.study.yeseul.product.domain.Product;
import com.study.yeseul.product.vo.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public List<ProductDto.ProductDetailDto> getProductList() {
        List<Product> productList = productRepository.findAll();
//        List<ProductDto.ProductDetailDto> resultList = new ArrayList<>();
//        for (Product product : productList) {
//            resultList.add(ProductDto.ProductDetailDto.valueOf(product));
//        }
//        return resultList;

        return productList.stream()
                .map(ProductDto.ProductDetailDto::valueOf)
                .collect(Collectors.toList());
    }

    public Product createProduct(final ProductDto.ProductCreateDto createDto) {
        return productRepository.save(Product.valueOf(createDto));
    }

    public ProductDto.ProductDetailDto getProduct(long id) {
        // todo
//        Product product = productRepository.getOne(id);
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 상품이 없습니다. id=" + id));

        return ProductDto.ProductDetailDto.valueOf(product);
    }

    public void deleteProduct(final long id) {
        // todo
        productRepository.deleteById(id);
        // 해당 id가 없을 경우?
    }

    public ProductDto.ProductDetailDto updateProduct(final long id, final ProductDto.ProductUpdateDto updateDto) {
        // todo
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 상품이 없습니다. id=" + id));
        product.setPrice(updateDto.getPrice());
        productRepository.save(product);

        return ProductDto.ProductDetailDto.valueOf(product);
    }
}
