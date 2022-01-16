package com.nmt.service.contract;

import com.nmt.model.Contract;
import com.nmt.model.house.House;
import com.nmt.model.user.User;
import com.nmt.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface IContractService extends IGeneralService<Contract> {
    double getTotalPrice(float unitPrice, LocalDate startDay, LocalDate endDay);
    Page<Contract> findAllByUser(User user, Pageable pageable);
    long getDuration(LocalDate startDay, LocalDate endDay);
    Iterable<Contract> findAllByHouse(House house);
    Optional<Contract> findByIdAndUser(Long id, User user);
    boolean checkContractConflict(House house, LocalDate startDay, LocalDate endDay);
    List<Contract> findContractByHouseRenting(@Param("user") User user);
    Page<Contract> findContractByHouseRenting(@Param("user") User user, Pageable pageable);

}
