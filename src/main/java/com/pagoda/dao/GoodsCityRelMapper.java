package com.pagoda.dao;

import com.pagoda.bean.GoodsCityRel;
import com.pagoda.bean.condition.GoodsCityCodition;
import com.pagoda.utils.TkMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * @author : litang
 * @date : Create in 2018/3/26
 */
@Mapper
@Component(value = "goodsCityRelMapper")
public interface GoodsCityRelMapper extends TkMapper<GoodsCityRel> {


    List<GoodsCityRel> getGoodsCityRelByConditonGoods(GoodsCityCodition goodsCityCodition);


}
