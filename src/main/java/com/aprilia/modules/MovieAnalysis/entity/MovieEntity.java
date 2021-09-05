package com.aprilia.modules.MovieAnalysis.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 电影信息
 * 
 * @author mzd
 * @email 1695165447@qq.com
 * @date 2021-09-05 18:19:40
 */
@Data
@TableName("movie")
public class MovieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 名称
	 */
	private Long name;
	/**
	 * 豆瓣URL
	 */
	private String url;
	/**
	 * 简介
	 */
	private String perms;
	/**
	 * 封面URL
	 */
	private String imageurl;
	/**
	 * 评分
	 */
	private Double fenshu;
	/**
	 * 上映日期
	 */
	private Date releaseDate;
	/**
	 * 腾讯视频播放地址
	 */
	private String txurl;
	/**
	 * 优酷播放地址
	 */
	private String youkuurl;
	/**
	 * 爱奇艺播放地址
	 */
	private String aqiyiurl;
	/**
	 * 芒果播放地址
	 */
	private String mangguourl;
	/**
	 * 乐视播放地址
	 */
	private String leshiurl;
	/**
	 * 状态  0：禁用   1：正常
	 */
	private Integer status;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date modifyTime;

}
