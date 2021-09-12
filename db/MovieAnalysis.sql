
-- 电影信息
CREATE TABLE `movie` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` bigint COMMENT '名称',
  `url` varchar(200) COMMENT '豆瓣URL',
  `perms` varchar(500) COMMENT '简介',
  `imageurl` varchar(200) COMMENT '封面URL',
  `fenshu` DOUBLE(6,2) COMMENT '评分',
  `release_date` date COMMENT '上映日期',

  `txurl` varchar(200) COMMENT '腾讯视频播放地址',
  `youkuurl` varchar(200) COMMENT '优酷播放地址',
  `aqiyiurl` varchar(200) COMMENT '爱奇艺播放地址',
  `mangguourl` varchar(200) COMMENT '芒果播放地址',
  `leshiurl` varchar(200) COMMENT '乐视播放地址',

  `status` tinyint COMMENT '状态  0：禁用   1：正常',

  `create_time` datetime COMMENT '创建时间',
  `modify_time` datetime COMMENT '修改时间',

  PRIMARY KEY (`id`)
) ENGINE=`InnoDB` DEFAULT CHARACTER SET utf8mb4 COMMENT='电影信息';


-- 解析接口
CREATE TABLE `parsing` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL COMMENT '名称',
  `url` varchar(200) COMMENT '接口网址',
  
  `status` tinyint COMMENT '状态  0：禁用   1：正常',

  `create_time` datetime COMMENT '创建时间',
  `modify_time` datetime COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=`InnoDB` DEFAULT CHARACTER SET utf8mb4 COMMENT='解析接口';



-- 电影播放地址
CREATE TABLE `playaddress` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `movie_id` varchar(255) NOT NULL COMMENT '电影豆瓣ID',

  `name` varchar(50) NOT NULL COMMENT '网站名称',
  `url` varchar(200) COMMENT '播放地址',

  `status` tinyint COMMENT '状态  0：禁用   1：正常',

  `create_time` datetime COMMENT '创建时间',
  `modify_time` datetime COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=`InnoDB` DEFAULT CHARACTER SET utf8mb4 COMMENT='解析接口';
