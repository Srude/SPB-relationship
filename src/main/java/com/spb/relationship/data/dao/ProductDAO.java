package com.spb.relationship.data.dao;

import com.spb.relationship.data.Entity.ProductEntity;

public interface ProductDAO {
    ProductEntity insertProduct(ProductEntity entity);
    ProductEntity selectProduct(Long number);
    ProductEntity updateProductName(Long number, String name) throws Exception;
    void deleteProduct(Long number) throws Exception;

}

