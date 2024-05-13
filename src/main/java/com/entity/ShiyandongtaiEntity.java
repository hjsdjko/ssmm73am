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
 * 实验动态
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-05 11:07:09
 */
@TableName("shiyandongtai")
public class ShiyandongtaiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShiyandongtaiEntity() {
		
	}
	
	public ShiyandongtaiEntity(T t) {
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
	 * 实验名称
	 */
					
	private String shiyanmingcheng;
	
	/**
	 * 类型
	 */
					
	private String leixing;
	
	/**
	 * 实验内容
	 */
					
	private String shiyanneirong;
	
	/**
	 * 进展情况
	 */
					
	private String jinzhanqingkuang;
	
	/**
	 * 实验团队
	 */
					
	private String shiyantuandui;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fabushijian;
	
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
	 * 设置：实验名称
	 */
	public void setShiyanmingcheng(String shiyanmingcheng) {
		this.shiyanmingcheng = shiyanmingcheng;
	}
	/**
	 * 获取：实验名称
	 */
	public String getShiyanmingcheng() {
		return shiyanmingcheng;
	}
	/**
	 * 设置：类型
	 */
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
	/**
	 * 设置：实验内容
	 */
	public void setShiyanneirong(String shiyanneirong) {
		this.shiyanneirong = shiyanneirong;
	}
	/**
	 * 获取：实验内容
	 */
	public String getShiyanneirong() {
		return shiyanneirong;
	}
	/**
	 * 设置：进展情况
	 */
	public void setJinzhanqingkuang(String jinzhanqingkuang) {
		this.jinzhanqingkuang = jinzhanqingkuang;
	}
	/**
	 * 获取：进展情况
	 */
	public String getJinzhanqingkuang() {
		return jinzhanqingkuang;
	}
	/**
	 * 设置：实验团队
	 */
	public void setShiyantuandui(String shiyantuandui) {
		this.shiyantuandui = shiyantuandui;
	}
	/**
	 * 获取：实验团队
	 */
	public String getShiyantuandui() {
		return shiyantuandui;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
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
