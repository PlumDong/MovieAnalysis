package com.aprilia.modules.MovieAnalysis.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author mzd
 * @email 1695165447@qq.com
 * @date 2021-09-12 16:51:17
 */
@Data
@TableName("movies")
public class MoviesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 类型
	 */
	private String type;
	/**
	 * 短url
	 */
	private String slug;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 别名
	 */
	private String alias;
	/**
	 * 封面url
	 */
	private String cover;
	/**
	 * 上映年份
	 */
	private Integer year;
	/**
	 * 国家
	 */
	private String regions;
	/**
	 * 类型
	 */
	private String genres;
	/**
	 * 语言
	 */
	private String languages;
	/**
	 * 上映日期
	 */
	private Date releaseDate;
	/**
	 * 豆瓣url
	 */
	private String officialSite;
	/**
	 * 导演
	 */
	private String directors;
	/**
	 * 演员
	 */
	private String actors;
	/**
	 * 简介
	 */
	private String storyline;
	/**
	 * 时长
	 */
	private Integer mins;
	/**
	 * 
	 */
	private String recommendTip;
	/**
	 * 标签
	 */
	private String tags;
	/**
	 * 
	 */
	private BigDecimal avgScore;
	/**
	 * 
	 */
	private String imdbId;
	/**
	 * 
	 */
	private BigDecimal imdbScore;
	/**
	 * 
	 */
	private Integer imdbVotes;
	/**
	 * 豆瓣id
	 */
	private Integer doubanId;
	/**
	 * 豆瓣评分
	 */
	private BigDecimal doubanScore;
	/**
	 * 评价人数
	 */
	private Integer doubanVotes;
	/**
	 * 
	 */
	private Date createdAt;
	/**
	 * 
	 */
	private Date updatedAt;

}
