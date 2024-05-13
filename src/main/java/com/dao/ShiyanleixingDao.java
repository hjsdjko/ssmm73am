package com.dao;

import com.entity.ShiyanleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiyanleixingVO;
import com.entity.view.ShiyanleixingView;


/**
 * 实验类型
 * 
 * @author 
 * @email 
 * @date 2021-04-05 11:07:09
 */
public interface ShiyanleixingDao extends BaseMapper<ShiyanleixingEntity> {
	
	List<ShiyanleixingVO> selectListVO(@Param("ew") Wrapper<ShiyanleixingEntity> wrapper);
	
	ShiyanleixingVO selectVO(@Param("ew") Wrapper<ShiyanleixingEntity> wrapper);
	
	List<ShiyanleixingView> selectListView(@Param("ew") Wrapper<ShiyanleixingEntity> wrapper);

	List<ShiyanleixingView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyanleixingEntity> wrapper);
	
	ShiyanleixingView selectView(@Param("ew") Wrapper<ShiyanleixingEntity> wrapper);
	
}
