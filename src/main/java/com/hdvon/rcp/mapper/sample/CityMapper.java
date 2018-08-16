package com.hdvon.rcp.mapper.sample;

import com.hdvon.rcp.domain.sample.City;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Toby on 2017/6/26.
 */
public interface CityMapper {
    void insertCity(City city);

    void deleteCity(long CityId);

    void updateCity(City city);

    City selectCityById(long id);

    @Select("select id,name,state,country from test.city where id = #{id}")
    City findCity(@Param("id") Long id);
}
