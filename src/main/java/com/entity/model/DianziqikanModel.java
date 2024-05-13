package com.entity.model;

import com.entity.DianziqikanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 电子期刊
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-05 11:07:09
 */
public class DianziqikanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 杂志名称
	 */
	
	private String zazhimingcheng;
		
	/**
	 * 所属分类
	 */
	
	private String suoshufenlei;
		
	/**
	 * 简介
	 */
	
	private String jianjie;
		
	/**
	 * 附件下载
	 */
	
	private String fujianxiazai;
		
	/**
	 * 发行单位
	 */
	
	private String faxingdanwei;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：杂志名称
	 */
	 
	public void setZazhimingcheng(String zazhimingcheng) {
		this.zazhimingcheng = zazhimingcheng;
	}
	
	/**
	 * 获取：杂志名称
	 */
	public String getZazhimingcheng() {
		return zazhimingcheng;
	}
				
	
	/**
	 * 设置：所属分类
	 */
	 
	public void setSuoshufenlei(String suoshufenlei) {
		this.suoshufenlei = suoshufenlei;
	}
	
	/**
	 * 获取：所属分类
	 */
	public String getSuoshufenlei() {
		return suoshufenlei;
	}
				
	
	/**
	 * 设置：简介
	 */
	 
	public void setJianjie(String jianjie) {
		this.jianjie = jianjie;
	}
	
	/**
	 * 获取：简介
	 */
	public String getJianjie() {
		return jianjie;
	}
				
	
	/**
	 * 设置：附件下载
	 */
	 
	public void setFujianxiazai(String fujianxiazai) {
		this.fujianxiazai = fujianxiazai;
	}
	
	/**
	 * 获取：附件下载
	 */
	public String getFujianxiazai() {
		return fujianxiazai;
	}
				
	
	/**
	 * 设置：发行单位
	 */
	 
	public void setFaxingdanwei(String faxingdanwei) {
		this.faxingdanwei = faxingdanwei;
	}
	
	/**
	 * 获取：发行单位
	 */
	public String getFaxingdanwei() {
		return faxingdanwei;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
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
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
			
}
