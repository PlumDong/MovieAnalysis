package com.aprilia.modules.MovieAnalysis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.aprilia.modules.MovieAnalysis.entity.MovieEntity;
import com.aprilia.modules.MovieAnalysis.service.MovieService;
import com.aprilia.common.utils.PageUtils;
import com.aprilia.common.utils.R;

import java.util.Map;

/**
 * 电影信息
 *
 * @author mzd
 * @email 1695165447@qq.com
 * @date 2021-09-05 18:19:40
 */
public interface MovieService extends IService<MovieEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

