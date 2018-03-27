package com.pagoda.dao;

import com.pagoda.bean.StoreGoodsRel;
import com.pagoda.bean.condition.StoreGoodsCondition;
import com.pagoda.utils.TkMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Component(value = "storeGoodsRelMapper")
 * 该注解是解决IDEA自动注入显示could not autowire,no bean type of "storeGoodsRelMapper" found
 *
 * @author : litang
 * @date : Create in 2018/3/26
 */
@Mapper
@Component(value = "storeGoodsRelMapper")
public interface StoreGoodsRelMapper extends TkMapper<StoreGoodsRel> {


    List<StoreGoodsRel> getStoreGoodsRelByCondition(StoreGoodsCondition storeGoodsCondition);
}
