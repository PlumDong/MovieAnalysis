package com.aprilia.modules.MovieAnalysis.controller;

import java.util.Arrays;
import java.util.Map;

import com.aprilia.common.utils.PageUtils;
import com.aprilia.common.utils.R;
import com.aprilia.modules.MovieAnalysis.entity.MoviesEntity;
import com.aprilia.modules.MovieAnalysis.service.MoviesService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * 
 *
 * @author mzd
 * @email 1695165447@qq.com
 * @date 2021-09-12 16:51:17
 */
@RestController
@RequestMapping("movies")
public class MoviesController {
    @Autowired
    private MoviesService moviesService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = moviesService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		MoviesEntity movies = moviesService.getById(id);

        return R.ok().put("movies", movies);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("MovieAnalysis:movies:save")
    public R save(@RequestBody MoviesEntity movies){
		moviesService.save(movies);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("MovieAnalysis:movies:update")
    public R update(@RequestBody MoviesEntity movies){
		moviesService.updateById(movies);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("MovieAnalysis:movies:delete")
    public R delete(@RequestBody Integer[] ids){
		moviesService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
