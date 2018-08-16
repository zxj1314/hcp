package com.hdvon.rcp.dao.sample;

import com.hdvon.rcp.domain.sample.City;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Toby on 2017/6/26.
 */
@Component
public class CityDao {
    @Autowired
    private SqlSession sqlSession;

    public City selectCityById(long id) {
        return this.sqlSession.selectOne("selectCityById", id);
    }
}
