package com.cms.dao;

import com.blade.ioc.annotation.Bean;
import com.cms.model.Goods;

import java.util.List;

import static io.github.biezhi.anima.Anima.select;

/**
 * @author andy
 */
@Bean
public class GoodsDao {


	/**
	 * 得到所有货品
	 * 
	 * @return
	 */
	public List<Goods> listAllGoods() {
		return select().from(Goods.class).all();
	}

	public Goods getByID(String id){
		return select().from(Goods.class).where(Goods::getId).eq(id).one();
	}
}
