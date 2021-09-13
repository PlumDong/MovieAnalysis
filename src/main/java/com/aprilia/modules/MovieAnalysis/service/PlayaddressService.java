package com.aprilia.modules.MovieAnalysis.service;

import com.aprilia.common.utils.PageUtils;
import com.aprilia.modules.MovieAnalysis.entity.PlayaddressEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 电影播放地址
 *
 * @author mzd
 * @email 1695165447@qq.com
 * @date 2021-09-13 18:36:25
 */
public interface PlayaddressService extends IService<PlayaddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

