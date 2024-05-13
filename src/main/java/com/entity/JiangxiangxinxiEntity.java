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
 * 奖项信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-05 11:07:09
 */
@TableName("jiangxiangxinxi")
public class JiangxiangxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiangxiangxinxiEntity() {
		
	}
	
	public JiangxiangxinxiEntity(T t) {
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
	 * 序号
	 */
					
	private String xuhao;
	
	/**
	 * 奖项名称
	 */
					
	private String jiangxiangmingcheng;
	
	/**
	 * 类别
	 */
					
	private String leibie;
	
	/**
	 * 奖项说明
	 */
					
	private String jiangxiangshuoming;
	
	/**
	 * 评比时间
	 */
					
	private String pingbishijian;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	
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
	 * 设置：序号
	 */
	public void setXuhao(String xuhao) {
		this.xuhao = xuhao;
	}
	/**
	 * 获取：序号
	 */
	public String getXuhao() {
		return xuhao;
	}
	/**
	 * 设置：奖项名称
	 */
	public void setJiangxiangmingcheng(String jiangxiangmingcheng) {
		this.jiangxiangmingcheng = jiangxiangmingcheng;
	}
	/**
	 * 获取：奖项名称
	 */
	public String getJiangxiangmingcheng() {
		return jiangxiangmingcheng;
	}
	/**
	 * 设置：类别
	 */
	public void setLeibie(String leibie) {
		this.leibie = leibie;
	}
	/**
	 * 获取：类别
	 */
	public String getLeibie() {
		return leibie;
	}
	/**
	 * 设置：奖项说明
	 */
	public void setJiangxiangshuoming(String jiangxiangshuoming) {
		this.jiangxiangshuoming = jiangxiangshuoming;
	}
	/**
	 * 获取：奖项说明
	 */
	public String getJiangxiangshuoming() {
		return jiangxiangshuoming;
	}
	/**
	 * 设置：评比时间
	 */
	public void setPingbishijian(String pingbishijian) {
		this.pingbishijian = pingbishijian;
	}
	/**
	 * 获取：评比时间
	 */
	public String getPingbishijian() {
		return pingbishijian;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
	/**
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}

}
