package com.cms.controller;

import com.blade.ioc.annotation.Inject;
import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.JSON;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.annotation.PathParam;
import com.blade.mvc.http.Response;
import com.cms.model.Goods;
import com.cms.services.GoodsService;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @author andy
 */
@Path
@Slf4j
public class IndexController {


    @Inject
    GoodsService goodsService;

    @GetRoute("/")
    public void index(Response response){

        List<Goods>  goodsList =  goodsService.listAllGoods();
        response.json(goodsList);
    }

    @JSON
    @GetRoute("/:id")
    public Goods test(@PathParam String id){
        log.info("ID is :{}",id);
        return goodsService.getByID(id);
    }
}
