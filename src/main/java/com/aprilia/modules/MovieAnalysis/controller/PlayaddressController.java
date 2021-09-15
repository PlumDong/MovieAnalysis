package com.aprilia.modules.MovieAnalysis.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.aprilia.common.utils.PageUtils;
import com.aprilia.common.utils.R;
import com.aprilia.modules.MovieAnalysis.entity.PlayaddressEntity;
import com.aprilia.modules.MovieAnalysis.service.PlayaddressService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




/**
 * 电影播放地址
 *
 * @author mzd
 * @email 1695165447@qq.com
 * @date 2021-09-13 18:36:25
 */
@RestController
@RequestMapping("playaddress")
public class PlayaddressController {
    @Autowired
    private PlayaddressService playaddressService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = playaddressService.queryPage(params);

        return R.ok().put("page", page);
    }
    /**
     * 获取播放地址
     */
    @RequestMapping("/getMovieAddress/{movieId}")
    public R getMovieAddress(@PathVariable("movieId") Long movieId){
        Map<String, Object> params = new HashMap<>();
        params.put("movieId",movieId);
        PageUtils playaddress = playaddressService.queryPage(params);

        return R.ok().put("playaddress", playaddress);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("MovieAnalysis:playaddress:info")
    public R info(@PathVariable("id") Long id){
		PlayaddressEntity playaddress = playaddressService.getById(id);

        return R.ok().put("playaddress", playaddress);
    }


    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("MovieAnalysis:playaddress:save")
    public R save(@RequestBody PlayaddressEntity playaddress){
		playaddressService.save(playaddress);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("MovieAnalysis:playaddress:update")
    public R update(@RequestBody PlayaddressEntity playaddress){
		playaddressService.updateById(playaddress);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("MovieAnalysis:playaddress:delete")
    public R delete(@RequestBody Long[] ids){
		playaddressService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
