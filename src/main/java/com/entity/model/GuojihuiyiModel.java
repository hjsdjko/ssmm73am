package com.entity.model;

import com.entity.GuojihuiyiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 国际会议
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-05 11:07:09
 */
public class GuojihuiyiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 会议主题
	 */
	
	private String huiyizhuti;
		
	/**
	 * 会议概述
	 */
	
	private String huiyigaishu;
		
	/**
	 * 会议成员
	 */
	
	private String huiyichengyuan;
		
	/**
	 * 资源下载
	 */
	
	private String ziyuanxiazai;
		
	/**
	 * 主办方
	 */
	
	private String zhubanfang;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：会议主题
	 */
	 
	public void setHuiyizhuti(String huiyizhuti) {
		this.huiyizhuti = huiyizhuti;
	}
	
	/**
	 * 获取：会议主题
	 */
	public String getHuiyizhuti() {
		return huiyizhuti;
	}
				
	
	/**
	 * 设置：会议概述
	 */
	 
	public void setHuiyigaishu(String huiyigaishu) {
		this.huiyigaishu = huiyigaishu;
	}
	
	/**
	 * 获取：会议概述
	 */
	public String getHuiyigaishu() {
		return huiyigaishu;
	}
				
	
	/**
	 * 设置：会议成员
	 */
	 
	public void setHuiyichengyuan(String huiyichengyuan) {
		this.huiyichengyuan = huiyichengyuan;
	}
	
	/**
	 * 获取：会议成员
	 */
	public String getHuiyichengyuan() {
		return huiyichengyuan;
	}
				
	
	/**
	 * 设置：资源下载
	 */
	 
	public void setZiyuanxiazai(String ziyuanxiazai) {
		this.ziyuanxiazai = ziyuanxiazai;
	}
	
	/**
	 * 获取：资源下载
	 */
	public String getZiyuanxiazai() {
		return ziyuanxiazai;
	}
				
	
	/**
	 * 设置：主办方
	 */
	 
	public void setZhubanfang(String zhubanfang) {
		this.zhubanfang = zhubanfang;
	}
	
	/**
	 * 获取：主办方
	 */
	public String getZhubanfang() {
		return zhubanfang;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
			
}
