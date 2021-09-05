package com.aprilia.modules.MovieAnalysis.service.impl;

import com.aprilia.common.utils.Query;
import com.aprilia.modules.MovieAnalysis.dao.MovieDao;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.aprilia.modules.MovieAnalysis.entity.MovieEntity;
import com.aprilia.modules.MovieAnalysis.service.MovieService;
import com.aprilia.common.utils.PageUtils;
import com.aprilia.common.utils.R;

@Service("movieService")
public class MovieServiceImpl extends ServiceImpl<MovieDao, MovieEntity> implements MovieService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MovieEntity> page = this.page(
                new Query<MovieEntity>().getPage(params),
                new QueryWrapper<MovieEntity>()
        );

        return new PageUtils(page);
    }

}