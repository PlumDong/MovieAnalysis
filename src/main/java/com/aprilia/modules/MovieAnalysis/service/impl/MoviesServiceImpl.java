package com.aprilia.modules.MovieAnalysis.service.impl;

import com.aprilia.common.utils.PageUtils;
import com.aprilia.common.utils.Query;
import com.aprilia.modules.MovieAnalysis.dao.MoviesDao;
import com.aprilia.modules.MovieAnalysis.entity.MoviesEntity;
import com.aprilia.modules.MovieAnalysis.service.MoviesService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Service("moviesService")
public class MoviesServiceImpl extends ServiceImpl<MoviesDao, MoviesEntity> implements MoviesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MoviesEntity> page = this.page(
                new Query<MoviesEntity>().getPage(params),
                new QueryWrapper<MoviesEntity>()
        );

        return new PageUtils(page);
    }

}