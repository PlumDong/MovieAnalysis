package com.aprilia.modules.MovieAnalysis.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aprilia.modules.MovieAnalysis.entity.MovieEntity;
import com.aprilia.modules.MovieAnalysis.service.MovieService;
import com.aprilia.common.utils.PageUtils;
import com.aprilia.common.utils.R;



/**
 * 电影信息
 *
 * @author mzd
 * @email 1695165447@qq.com
 * @date 2021-09-05 18:19:40
 */
@RestController
@RequestMapping("movie")
public class MovieController {
    @Autowired
    private MovieService movieService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = movieService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("MovieAnalysis:movie:info")
    public R info(@PathVariable("id") Long id){
		MovieEntity movie = movieService.getById(id);

        return R.ok().put("movie", movie);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("MovieAnalysis:movie:save")
    public R save(@RequestBody MovieEntity movie){
		movieService.save(movie);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("MovieAnalysis:movie:update")
    public R update(@RequestBody MovieEntity movie){
		movieService.updateById(movie);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("MovieAnalysis:movie:delete")
    public R delete(@RequestBody Long[] ids){
		movieService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
