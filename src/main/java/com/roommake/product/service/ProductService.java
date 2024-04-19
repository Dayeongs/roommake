package com.roommake.product.service;

import com.roommake.product.mapper.ProductMapper;
import com.roommake.product.vo.Product;
import com.roommake.product.vo.ProductTag;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductMapper productMapper;

    /**
     * 모든상품 리스트를 반환한다.
     *
     * @return 모든상품리스트
     */
    public List<Product> getAllProduct() {
        return productMapper.getAllProduct();
    }

    public List<ProductTag> getAllProductTag() {
        return productMapper.getAllProductTag();
    }

    public Product getProductByNo(int id) {
        return productMapper.getProductById(id);
    }
}
