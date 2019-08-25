CREATE TABLE IF NOT EXISTS `sr_goods` (
  `goods_id` char(32) NOT NULL,
  `goods_name` varchar(32) NOT NULL,
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `sr_goods` (`goods_id`, `goods_name`) VALUES
	('223c9e36055811e7b74a00155d010e04', '宝马轿车'),
	('2261d9fb056011e7b21200155d010e04', 'CPU'),
	('751cff53055311e7b74a00155d010e04', '奔驰轿车'),
	('ba94638e054811e7b74a00155d010e04', '联想笔记本电脑'),
	('ba94638e054811e7b74a00155d010e13', '笔记本电脑'),
	('ba94638e054811e7b74a00155d010e14', '笔记本电脑'),
	('ba94638e054811e7b74a00155d010e15', '笔记本电脑'),
	('ba94638e054811e7b74a00155d010e16', '笔记本电脑'),
	('efaf1af0056211e7b21200155d010e04', '内存');
