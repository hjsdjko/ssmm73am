package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 国际会议
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-05 11:07:09
 */
@TableName("guojihuiyi")
public class GuojihuiyiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GuojihuiyiEntity() {
		
	}
	
	public GuojihuiyiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 会议编号
	 */
					
	private String huiyibianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：会议编号
	 */
	public void setHuiyibianhao(String huiyibianhao) {
		this.huiyibianhao = huiyibianhao;
	}
	/**
	 * 获取：会议编号
	 */
	public String getHuiyibianhao() {
		return huiyibianhao;
	}
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
