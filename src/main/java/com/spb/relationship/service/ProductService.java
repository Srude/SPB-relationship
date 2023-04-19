package com.spb.relationship.service;

import com.spb.relationship.data.dto.ProductDTO;
import com.spb.relationship.data.dto.ProductResponseDTO;

public interface ProductService {
    ProductResponseDTO getProduct(Long number);
    ProductResponseDTO saveProduct(ProductDTO productDTO);
    ProductResponseDTO changeProductName(Long number, String name) throws Exception;
    void deleteProduct(Long number) throws Exception;
}