package com.aprilia.modules.MovieAnalysis.controller;

import java.util.Arrays;
import java.util.Map;

import com.aprilia.modules.MovieAnalysis.entity.ParsingEntity;
import com.aprilia.modules.MovieAnalysis.service.ParsingService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aprilia.common.utils.PageUtils;
import com.aprilia.common.utils.R;



/**
 * 解析接口
 *
 * @author mzd
 * @email 1695165447@qq.com
 * @date 2021-09-05 18:19:40
 */
@RestController
@RequestMapping("parsing")
public class ParsingController {
    @Autowired
    private ParsingService parsingService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = parsingService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("MovieAnalysis:parsing:info")
    public R info(@PathVariable("id") Long id){
		ParsingEntity parsing = parsingService.getById(id);

        return R.ok().put("parsing", parsing);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("MovieAnalysis:parsing:save")
    public R save(@RequestBody ParsingEntity parsing){
		parsingService.save(parsing);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("MovieAnalysis:parsing:update")
    public R update(@RequestBody ParsingEntity parsing){
		parsingService.updateById(parsing);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("MovieAnalysis:parsing:delete")
    public R delete(@RequestBody Long[] ids){
		parsingService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
