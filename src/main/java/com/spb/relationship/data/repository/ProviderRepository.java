package com.spb.relationship.data.repository;

import com.spb.relationship.data.Entity.ProviderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<ProviderEntity, Long> {
}
