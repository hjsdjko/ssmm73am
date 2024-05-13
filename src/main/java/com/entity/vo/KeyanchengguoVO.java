package com.entity.vo;

import com.entity.KeyanchengguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 科研成果
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-05 11:07:09
 */
public class KeyanchengguoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 项目名称
	 */
	
	private String xiangmumingcheng;
		
	/**
	 * 技术简介
	 */
	
	private String jishujianjie;
		
	/**
	 * 应用范围
	 */
	
	private String yingyongfanwei;
		
	/**
	 * 报告文件
	 */
	
	private String baogaowenjian;
		
	/**
	 * 研究团队
	 */
	
	private String yanjiutuandui;
		
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
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：项目名称
	 */
	 
	public void setXiangmumingcheng(String xiangmumingcheng) {
		this.xiangmumingcheng = xiangmumingcheng;
	}
	
	/**
	 * 获取：项目名称
	 */
	public String getXiangmumingcheng() {
		return xiangmumingcheng;
	}
				
	
	/**
	 * 设置：技术简介
	 */
	 
	public void setJishujianjie(String jishujianjie) {
		this.jishujianjie = jishujianjie;
	}
	
	/**
	 * 获取：技术简介
	 */
	public String getJishujianjie() {
		return jishujianjie;
	}
				
	
	/**
	 * 设置：应用范围
	 */
	 
	public void setYingyongfanwei(String yingyongfanwei) {
		this.yingyongfanwei = yingyongfanwei;
	}
	
	/**
	 * 获取：应用范围
	 */
	public String getYingyongfanwei() {
		return yingyongfanwei;
	}
				
	
	/**
	 * 设置：报告文件
	 */
	 
	public void setBaogaowenjian(String baogaowenjian) {
		this.baogaowenjian = baogaowenjian;
	}
	
	/**
	 * 获取：报告文件
	 */
	public String getBaogaowenjian() {
		return baogaowenjian;
	}
				
	
	/**
	 * 设置：研究团队
	 */
	 
	public void setYanjiutuandui(String yanjiutuandui) {
		this.yanjiutuandui = yanjiutuandui;
	}
	
	/**
	 * 获取：研究团队
	 */
	public String getYanjiutuandui() {
		return yanjiutuandui;
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
			
}
