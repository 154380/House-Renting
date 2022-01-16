package com.nmt.repository;

import com.nmt.model.Feedback;
import com.nmt.model.house.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFeedbackRepository extends JpaRepository<Feedback,Long> {
    Iterable<Feedback> findAllByHouse(House house);
}
