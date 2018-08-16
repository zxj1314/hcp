package com.hdvon.rcp.web.controller.sample;

import com.hdvon.rcp.common.response.HttpResponse;
import com.hdvon.rcp.dao.sample.CityDao;
import com.hdvon.rcp.domain.sample.City;
import com.hdvon.rcp.mapper.sample.CityMapper;
import com.hdvon.rcp.biz.sample.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Toby on 2017/6/26.
 */
@RestController
@RequestMapping(value = "/t")
public class DataFromDBController {
    @Autowired
    private CityDao cityDao;

    @Autowired
    private CityMapper cityMapper;

    @Autowired
    private ICityService cityService;

    @RequestMapping(value = "/c/{cityId}", method = RequestMethod.GET)
    public HttpResponse getCity(@PathVariable Long cityId) {
        HttpResponse apiResponse = new HttpResponse();
        Map<String,Object> outMap = new HashMap<String,Object>();
        outMap.put("city",cityMapper.selectCityById(cityId));
        apiResponse.setData(outMap);
        return apiResponse;
    }

    @RequestMapping(value = "/c/annotation/{cityId}", method = RequestMethod.GET)
    public HttpResponse findCity(@PathVariable Long cityId) {
        HttpResponse apiResponse = new HttpResponse();
        Map<String,Object> outMap = new HashMap<String,Object>();
        outMap.put("city",cityMapper.findCity(cityId));
        apiResponse.setData(outMap);
        return apiResponse;
    }

    @RequestMapping(value = "/c", method = RequestMethod.POST)
    public HttpResponse addCity() {
        HttpResponse apiResponse = new HttpResponse();
        City city = City.builder().name("gz").state("gd").country("china").build();
        cityMapper.insertCity(city);
        Map<String,Object> outMap = new HashMap<String,Object>();
        outMap.put("city",city);
        apiResponse.setData(outMap);
        return apiResponse;
    }

    @RequestMapping(value = "/c/{cityId}", method = RequestMethod.DELETE)
    public HttpResponse deleteCity(@PathVariable long cityId) {
        cityMapper.deleteCity(cityId);
        return new HttpResponse();
    }

    @RequestMapping(value = "/c/{cityId}", method = RequestMethod.PUT)
    public HttpResponse updateCity(@PathVariable Long cityId) {
        cityService.updateCity(cityId);
        return new HttpResponse();
    }
}
