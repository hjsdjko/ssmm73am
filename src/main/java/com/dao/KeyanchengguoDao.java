package com.dao;

import com.entity.KeyanchengguoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KeyanchengguoVO;
import com.entity.view.KeyanchengguoView;


/**
 * 科研成果
 * 
 * @author 
 * @email 
 * @date 2021-04-05 11:07:09
 */
public interface KeyanchengguoDao extends BaseMapper<KeyanchengguoEntity> {
	
	List<KeyanchengguoVO> selectListVO(@Param("ew") Wrapper<KeyanchengguoEntity> wrapper);
	
	KeyanchengguoVO selectVO(@Param("ew") Wrapper<KeyanchengguoEntity> wrapper);
	
	List<KeyanchengguoView> selectListView(@Param("ew") Wrapper<KeyanchengguoEntity> wrapper);

	List<KeyanchengguoView> selectListView(Pagination page,@Param("ew") Wrapper<KeyanchengguoEntity> wrapper);
	
	KeyanchengguoView selectView(@Param("ew") Wrapper<KeyanchengguoEntity> wrapper);
	
}
