package com.cms.services;

import com.cms.dao.GoodsDao;
import com.blade.ioc.annotation.Bean;
import com.blade.ioc.annotation.Inject;
import com.cms.model.Goods;

import java.util.List;


/**
 * @author andy
 */
@Bean
public class GoodsService {
	
	@Inject
	private GoodsDao goodsDao;

	/**
	 * 得到所有货品
	 * @return
	 */
	public List<Goods> listAllGoods() {
		return goodsDao.listAllGoods();
	}

	public Goods getByID(String id){
		return goodsDao.getByID(id);
	}
}
