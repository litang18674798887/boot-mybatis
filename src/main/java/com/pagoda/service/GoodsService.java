package com.pagoda.service;

import com.alibaba.druid.wall.violation.ErrorCode;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.pagoda.bean.*;
import com.pagoda.bean.condition.GoodsCityCodition;
import com.pagoda.bean.condition.StoreGoodsCondition;
import com.pagoda.dao.*;
import com.pagoda.out.GoodsAndStoreAndCity;
import com.pagoda.out.GoodsUpdate;
import com.pagoda.out.StoreUnGoodRel;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import java.sql.SQLException;
import java.util.*;

/**
 * @author : litang
 * @date : Create in 2018/3/26
 */
@Service
public class GoodsService {


    @Autowired
    GoodsCityRelMapper goodsCityRelMapper;

    @Autowired
    StoreMapper storeMapper;

    @Autowired
    StoreGoodsRelMapper storeGoodsRelMapper;

    @Autowired
    CityMapper cityMapper;

    @Autowired
    GoodsMapper goodsMapper;

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;


    /**
     * 定时任务上下架
     */
    public String goodsUpdataByStore() {

        return null;
    }

    /**
     * 测试2
     */
    public List<StoreUnGoodRel> updateTest() {

//        //批量插入
//        SqlSession sqlSession = sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH, false);
//        try {
//            sqlSession.getConnection().setAutoCommit(false);
//            GcardThemeCategoryRelMapper mapper = sqlSession.getMapper(GcardThemeCategoryRelMapper.class);
//            Integer count = 0;
//            for (GcardThemeCategoryRel gcardThemeCategoryRel2 : gcardThemeCategoryRels) {
//                mapper.insert(gcardThemeCategoryRel2);
//                count++;
//                if (count % 1000 == 0 || count == gcardThemeCategoryRels.size()) {
//                    sqlSession.commit();
//                    sqlSession.clearCache();
//                }
//            }
//        } catch (SQLException e) {
//            throw new DBException(ErrorCode.ERROR_INSERT_TABLE_RECORD_FAILED.getCode(), ErrorCode.ERROR_INSERT_TABLE_RECORD_FAILED.getMsg() + "【" + "categoryId:" + categoryId + "==>" + JSONObject.toJSONString(gcardThemeCategoryRels) + "】", e);
//        } finally {
//            sqlSession.close();
//        }

        //查询所有的及时达非拼团商品
//        Example example4 = new Example(Goods.class);
//        Example.Criteria criteria2 = example4.createCriteria();
//        criteria2.andEqualTo("status","Y");
//        criteria2.andEqualTo("isPre","N");
//        criteria2.andEqualTo("goodSubType","A");
//        criteria2.andEqualTo("groupSupport","N");
//        List<Goods> goods = goodsMapper.selectByExample(example4);
//        System.out.println(goods);

        List<StoreUnGoodRel> downGoodsByStore = new ArrayList<>();

        //1.查询出所有的城市
        Example example3 = new Example(City.class);
        example3.createCriteria().andEqualTo("status","A");
        List<City> cities = cityMapper.selectByExample(example3);
        for (City city : cities) {
//            //根据城市id 查询城市中上架的商品
//            Example example2 = new Example(GoodsCityRel.class);
//            Example.Criteria criteria1 = example2.createCriteria();
//            criteria1.andEqualTo("cityID", city.getId());
//            criteria1.andEqualTo("status", "A");
//            //当前城市下面的所有上架的商品
//            List<GoodsCityRel> goodsCityRels = goodsCityRelMapper.selectByExample(example2);


            //todo
            GoodsCityCodition codition = new GoodsCityCodition();
            codition.setCityId(city.getId());
            codition.setGoodsCityRelStatus("A");
            codition.setGoodsStatus("Y");
            codition.setGoodSubType("A");
            codition.setGroupSupport("N");
            codition.setIsPre("N");
            List<GoodsCityRel> goodsCityRelByConditonGoods = goodsCityRelMapper.getGoodsCityRelByConditonGoods(codition);
            System.out.println(goodsCityRelByConditonGoods);
            


            if (goodsCityRelByConditonGoods.isEmpty()) {
                continue;
            }

            //根据城市id 查询出所有的门店
            Example example = new Example(Store.class);
            Example.Criteria criteria3 = example.createCriteria();
            criteria3.andEqualTo("cityID", city.getId());
            criteria3.andEqualTo("status","A");
            criteria3.andEqualTo("type","1");
            //当前城市下面的所有门店
            List<Store> stores = storeMapper.selectByExample(example);
            if (stores.isEmpty()) {
                continue;
            }

            //遍历门店查询门店所有已经上架的商品
            for (Store store : stores) {
                //复制城市商品关系集合
                List<GoodsCityRel> tmpCityList = new ArrayList<>();
                tmpCityList.addAll(goodsCityRelByConditonGoods);


//                Example example1 = new Example(StoreGoodsRel.class);
//                Example.Criteria criteria = example1.createCriteria();
//                criteria.andEqualTo("storeID", store.getId());
//                criteria.andEqualTo("status", "A");
//                //一个门店下面所有上架的商品
//                List<StoreGoodsRel> storeGoodsRels = storeGoodsRelMapper.selectByExample(example1);

                StoreGoodsCondition storeGoodsCondition = new StoreGoodsCondition();
                storeGoodsCondition.setStoreStatus("A");
                storeGoodsCondition.setStoreID(store.getId());
                storeGoodsCondition.setGoodsStatus("Y");
                storeGoodsCondition.setGoodSubType("A");
                storeGoodsCondition.setGroupSupport("N");
                storeGoodsCondition.setIsPre("N");
                List<StoreGoodsRel> storeGoodsRelByConditionList=storeGoodsRelMapper.getStoreGoodsRelByCondition(storeGoodsCondition);


                if (storeGoodsRelByConditionList.isEmpty()) {
                    continue;
                }
                if (tmpCityList.isEmpty()) {
                    continue;
                }
                //遍历当前门店上架的商品与当前城市上架的商品，只要商品一样（证明当前门店是已经上架的状态），就在城市上架的商品中移除这个商品，获取的就是这个门店下面的没有上架的商品（同城市）
                for (StoreGoodsRel storeGoodsRel : storeGoodsRelByConditionList) {
                    for (GoodsCityRel goodsCityRel : goodsCityRelByConditonGoods) {
                        //相同城市的相同商品.如果门店该商品是上架的状态，在城市与商品中进行移除
                        if (goodsCityRel.getGoodsID().equals(storeGoodsRel.getGoodsID())) {
                            tmpCityList.remove(goodsCityRel);
                        }

                    }
                }
                if (!tmpCityList.isEmpty()) {
                    StoreUnGoodRel storeUnGoodRel = new StoreUnGoodRel();
                    storeUnGoodRel.setName(store.getName());
                    storeUnGoodRel.setStoreId(store.getId());
                    storeUnGoodRel.setGoodsCityRelList(tmpCityList);
                    downGoodsByStore.add(storeUnGoodRel);
                }
            }
        }
        return downGoodsByStore;
    }
}
