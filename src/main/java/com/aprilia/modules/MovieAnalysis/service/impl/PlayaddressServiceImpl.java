package com.aprilia.modules.MovieAnalysis.service.impl;

import com.aprilia.common.utils.PageUtils;
import com.aprilia.common.utils.Query;
import com.aprilia.modules.MovieAnalysis.dao.PlayaddressDao;
import com.aprilia.modules.MovieAnalysis.entity.PlayaddressEntity;
import com.aprilia.modules.MovieAnalysis.service.PlayaddressService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Service("playaddressService")
public class PlayaddressServiceImpl extends ServiceImpl<PlayaddressDao, PlayaddressEntity> implements PlayaddressService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PlayaddressEntity> page = this.page(
                new Query<PlayaddressEntity>().getPage(params),
                new QueryWrapper<PlayaddressEntity>()
        );

        return new PageUtils(page);
    }

}