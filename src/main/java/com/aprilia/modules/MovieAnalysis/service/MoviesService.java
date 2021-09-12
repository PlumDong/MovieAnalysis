package com.aprilia.modules.MovieAnalysis.service;

import com.aprilia.common.utils.PageUtils;
import com.aprilia.modules.MovieAnalysis.entity.MoviesEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 
 *
 * @author mzd
 * @email 1695165447@qq.com
 * @date 2021-09-12 16:51:17
 */
public interface MoviesService extends IService<MoviesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

