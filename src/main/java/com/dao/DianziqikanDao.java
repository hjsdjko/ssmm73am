package com.dao;

import com.entity.DianziqikanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DianziqikanVO;
import com.entity.view.DianziqikanView;


/**
 * 电子期刊
 * 
 * @author 
 * @email 
 * @date 2021-04-05 11:07:09
 */
public interface DianziqikanDao extends BaseMapper<DianziqikanEntity> {
	
	List<DianziqikanVO> selectListVO(@Param("ew") Wrapper<DianziqikanEntity> wrapper);
	
	DianziqikanVO selectVO(@Param("ew") Wrapper<DianziqikanEntity> wrapper);
	
	List<DianziqikanView> selectListView(@Param("ew") Wrapper<DianziqikanEntity> wrapper);

	List<DianziqikanView> selectListView(Pagination page,@Param("ew") Wrapper<DianziqikanEntity> wrapper);
	
	DianziqikanView selectView(@Param("ew") Wrapper<DianziqikanEntity> wrapper);
	
}
