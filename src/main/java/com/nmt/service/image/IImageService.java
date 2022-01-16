package com.nmt.service.image;

import com.nmt.model.house.House;
import com.nmt.model.house.Image;
import com.nmt.service.IGeneralService;

public interface IImageService extends IGeneralService<Image> {

    Iterable<Image> findAllByHouse(House house);
}
