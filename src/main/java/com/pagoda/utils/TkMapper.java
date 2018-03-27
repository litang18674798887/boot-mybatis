package com.pagoda.utils;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author : litang
 * @date : Create in 2018/3/26
 */
public interface TkMapper<T>  extends Mapper<T>,MySqlMapper<T> {


}
