package com.pagoda.contorller;

import com.alibaba.fastjson.JSON;
import com.pagoda.out.StoreUnGoodRel;
import com.pagoda.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : litang
 * @date : Create in 2018/3/26
 */

@RestController
public class GoodContorller {

    @Autowired
    GoodsService goodsService;

    @GetMapping("/update")
    public String goodsUpdataByStore(){

        String data = goodsService.goodsUpdataByStore();

        return data;

    }

    @GetMapping("/abc")
    public String updateTest(){
        List<StoreUnGoodRel> storeUnGoodRels = goodsService.updateTest();
        System.out.println(storeUnGoodRels.size());
        String data = JSON.toJSONString(storeUnGoodRels);
        return data;
    }
}
