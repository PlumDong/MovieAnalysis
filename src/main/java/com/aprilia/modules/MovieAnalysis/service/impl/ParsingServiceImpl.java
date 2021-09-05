package com.aprilia.modules.MovieAnalysis.service.impl;

import com.aprilia.common.utils.Query;
import com.aprilia.modules.MovieAnalysis.dao.ParsingDao;
import com.aprilia.modules.MovieAnalysis.entity.ParsingEntity;
import com.aprilia.modules.MovieAnalysis.service.ParsingService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.aprilia.modules.MovieAnalysis.entity.MovieEntity;
import com.aprilia.modules.MovieAnalysis.service.MovieService;
import com.aprilia.common.utils.PageUtils;
import com.aprilia.common.utils.R;


@Service("parsingService")
public class ParsingServiceImpl extends ServiceImpl<ParsingDao, ParsingEntity> implements ParsingService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ParsingEntity> page = this.page(
                new Query<ParsingEntity>().getPage(params),
                new QueryWrapper<ParsingEntity>()
        );

        return new PageUtils(page);
    }
}