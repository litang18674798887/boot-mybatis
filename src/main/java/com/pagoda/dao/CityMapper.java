package com.pagoda.dao;

import com.pagoda.bean.City;
import com.pagoda.utils.TkMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author : litang
 * @date : Create in 2018/3/27
 */
@Component(value = "cityMapper")
@Mapper
public interface CityMapper extends TkMapper<City> {
}
