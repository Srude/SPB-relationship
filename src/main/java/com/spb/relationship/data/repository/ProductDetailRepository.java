package com.spb.relationship.data.repository;

import com.spb.relationship.data.Entity.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDetailRepository extends JpaRepository<ProductDetail, Long> {
}
