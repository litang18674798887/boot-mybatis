package com.pagoda.dao;

import com.pagoda.bean.Goods;
import com.pagoda.utils.TkMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author : litang
 * @date : Create in 2018/3/26
 */
@Mapper
@Component(value = "goodsMapper")
public interface GoodsMapper extends TkMapper<Goods> {
}
