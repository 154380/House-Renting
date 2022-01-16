package com.nmt.service.house;

import com.nmt.model.house.House;
import com.nmt.model.house.Type;
import com.nmt.model.user.User;
import com.nmt.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IHouseService extends IGeneralService<House> {

    Iterable<House> findAllByType(Type houseType);
    Page<House> findAll(Pageable pageable);
    Page<House> findAllByOwner(Pageable pageable, User user);
    Page<House> findHouseByAddressContainingAndPriceGreaterThanEqualAndPriceLessThanEqual(Pageable pageable, String address, float price_from, float price_to);
    Page<House> findHouseByAddressContainingAndPriceGreaterThanEqualAndPriceLessThanEqualAndType(Pageable pageable, String address, float price_from, float price_to, Type houseType);
}
