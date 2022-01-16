package com.nmt.repository;

import com.nmt.model.Contract;
import com.nmt.model.house.House;
import com.nmt.model.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;


@Repository
public interface IContractRepository extends JpaRepository<Contract,Long> {
    Iterable<Contract> findAllByHouse(House house);
    Optional<Contract> findByIdAndUser(Long id, User user);
    Page<Contract> findAllByUser(User user, Pageable pageable);


    @Query(value = "SELECT c FROM Contract c INNER JOIN c.house h WHERE h.owner = :user ")
    List<Contract> findContractByHouseRenting(@Param("user") User user);

    @Query(value = "SELECT c FROM Contract c INNER JOIN c.house h WHERE h.owner = :user ")
    Page<Contract> findContractByHouseRenting(@Param("user") User user, Pageable pageable);

}
