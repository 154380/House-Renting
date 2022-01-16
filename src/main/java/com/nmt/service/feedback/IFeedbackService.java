package com.nmt.service.feedback;

import com.nmt.model.Feedback;
import com.nmt.model.house.House;
import com.nmt.service.IGeneralService;

public interface IFeedbackService extends IGeneralService<Feedback> {
    Iterable<Feedback> findAllByHouse(House house);
}
