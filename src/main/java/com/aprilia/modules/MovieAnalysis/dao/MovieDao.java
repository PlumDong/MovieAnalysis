package com.aprilia.modules.MovieAnalysis.dao;

import com.aprilia.modules.MovieAnalysis.entity.MovieEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 电影信息
 * 
 * @author mzd
 * @email 1695165447@qq.com
 * @date 2021-09-05 18:19:40
 */
@Mapper
public interface MovieDao extends BaseMapper<MovieEntity> {
	
}
