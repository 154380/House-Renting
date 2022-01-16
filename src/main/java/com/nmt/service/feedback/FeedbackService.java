package com.nmt.service.feedback;

import com.nmt.model.Feedback;
import com.nmt.model.house.House;
import com.nmt.repository.IFeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FeedbackService implements IFeedbackService{

    @Autowired
    private IFeedbackRepository feedbackRepository;
    @Override
    public Iterable<Feedback> findAll() {
        return feedbackRepository.findAll();
    }

    @Override
    public Optional<Feedback> findById(Long id) {
        return feedbackRepository.findById(id);
    }

    @Override
    public void save(Feedback feedback) {
        feedbackRepository.save(feedback);
    }

    @Override
    public void remove(Long id) {
        feedbackRepository.deleteById(id);
    }


    @Override
    public Iterable<Feedback> findAllByHouse(House house) {
        return feedbackRepository.findAllByHouse(house);
    }
}
