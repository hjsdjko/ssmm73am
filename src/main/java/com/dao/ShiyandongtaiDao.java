package com.dao;

import com.entity.ShiyandongtaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiyandongtaiVO;
import com.entity.view.ShiyandongtaiView;


/**
 * 实验动态
 * 
 * @author 
 * @email 
 * @date 2021-04-05 11:07:09
 */
public interface ShiyandongtaiDao extends BaseMapper<ShiyandongtaiEntity> {
	
	List<ShiyandongtaiVO> selectListVO(@Param("ew") Wrapper<ShiyandongtaiEntity> wrapper);
	
	ShiyandongtaiVO selectVO(@Param("ew") Wrapper<ShiyandongtaiEntity> wrapper);
	
	List<ShiyandongtaiView> selectListView(@Param("ew") Wrapper<ShiyandongtaiEntity> wrapper);

	List<ShiyandongtaiView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyandongtaiEntity> wrapper);
	
	ShiyandongtaiView selectView(@Param("ew") Wrapper<ShiyandongtaiEntity> wrapper);
	
}
