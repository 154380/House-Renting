package com.nmt.repository;

import com.nmt.model.house.House;
import com.nmt.model.house.Type;
import com.nmt.model.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHouseRepository extends JpaRepository<House, Long> {

    Iterable<House> findAllByType(Type houseType);
    Page<House> findAllByOwner(Pageable pageable,User user);
    Page<House> findHouseByAddressContainingAndPriceGreaterThanEqualAndPriceLessThanEqual(Pageable pageable, String address, float price_from, float price_to);
    Page<House> findHouseByAddressContainingAndPriceGreaterThanEqualAndPriceLessThanEqualAndType(Pageable pageable, String address, float price_from, float price_to, Type houseType);
}
