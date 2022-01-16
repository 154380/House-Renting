package com.nmt.repository;

import com.nmt.model.house.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHouseTypeRepository extends JpaRepository<Type, Long> {
}
