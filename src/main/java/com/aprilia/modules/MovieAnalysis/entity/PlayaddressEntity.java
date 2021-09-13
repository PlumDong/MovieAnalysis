package com.aprilia.modules.MovieAnalysis.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 电影播放地址
 * 
 * @author mzd
 * @email 1695165447@qq.com
 * @date 2021-09-13 18:36:25
 */
@Data
@TableName("playaddress")
public class PlayaddressEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 电影豆瓣ID
	 */
	private String movieId;
	/**
	 * 网站名称
	 */
	private String name;
	/**
	 * 播放地址
	 */
	private String url;
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
