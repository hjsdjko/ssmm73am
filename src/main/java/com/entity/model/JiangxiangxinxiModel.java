package com.entity.model;

import com.entity.JiangxiangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 奖项信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-05 11:07:09
 */
public class JiangxiangxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
