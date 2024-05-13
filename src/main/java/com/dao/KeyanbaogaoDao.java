package com.dao;

import com.entity.KeyanbaogaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KeyanbaogaoVO;
import com.entity.view.KeyanbaogaoView;


/**
 * 科研报告
 * 
 * @author 
 * @email 
 * @date 2021-04-05 11:07:09
 */
public interface KeyanbaogaoDao extends BaseMapper<KeyanbaogaoEntity> {
	
	List<KeyanbaogaoVO> selectListVO(@Param("ew") Wrapper<KeyanbaogaoEntity> wrapper);
	
	KeyanbaogaoVO selectVO(@Param("ew") Wrapper<KeyanbaogaoEntity> wrapper);
	
	List<KeyanbaogaoView> selectListView(@Param("ew") Wrapper<KeyanbaogaoEntity> wrapper);

	List<KeyanbaogaoView> selectListView(Pagination page,@Param("ew") Wrapper<KeyanbaogaoEntity> wrapper);
	
	KeyanbaogaoView selectView(@Param("ew") Wrapper<KeyanbaogaoEntity> wrapper);
	
}
