package com.cms.model;

import io.github.biezhi.anima.Model;
import io.github.biezhi.anima.annotation.Column;
import io.github.biezhi.anima.annotation.Table;
import lombok.Data;

/**
 * @author andy
 */
@Data
@Table(name = "sr_goods")
public class Goods extends Model {

	@Column(name = "goods_id")
	private String id;
	@Column(name = "goods_name")
	private String name;
}
