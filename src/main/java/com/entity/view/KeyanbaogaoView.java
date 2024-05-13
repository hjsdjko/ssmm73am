package com.entity.view;

import com.entity.KeyanbaogaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 科研报告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-05 11:07:09
 */
@TableName("keyanbaogao")
public class KeyanbaogaoView  extends KeyanbaogaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KeyanbaogaoView(){
	}
 
 	public KeyanbaogaoView(KeyanbaogaoEntity keyanbaogaoEntity){
 	try {
			BeanUtils.copyProperties(this, keyanbaogaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
