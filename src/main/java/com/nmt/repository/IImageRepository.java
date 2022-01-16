package com.nmt.repository;

import com.nmt.model.house.House;
import com.nmt.model.house.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IImageRepository extends JpaRepository<Image, Long> {

    Iterable<Image> findAllByHouse(House house);
}
