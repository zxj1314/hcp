package com.hdvon.rcp.biz.sample;

import com.hdvon.rcp.domain.sample.City;
import com.hdvon.rcp.mapper.sample.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Toby on 2017/6/26.
 */
@Service
@Transactional
public class CityServiceImpl implements ICityService {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public void updateCity(long cityId) {
        cityMapper.updateCity(City.builder().id(cityId).name("fs").state("gd").country("china").build());
        //throw new NullPointerException(); //test transactional
    }
}
