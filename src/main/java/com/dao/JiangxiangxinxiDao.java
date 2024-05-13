package com.dao;

import com.entity.JiangxiangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiangxiangxinxiVO;
import com.entity.view.JiangxiangxinxiView;


/**
 * 奖项信息
 * 
 * @author 
 * @email 
 * @date 2021-04-05 11:07:09
 */
public interface JiangxiangxinxiDao extends BaseMapper<JiangxiangxinxiEntity> {
	
	List<JiangxiangxinxiVO> selectListVO(@Param("ew") Wrapper<JiangxiangxinxiEntity> wrapper);
	
	JiangxiangxinxiVO selectVO(@Param("ew") Wrapper<JiangxiangxinxiEntity> wrapper);
	
	List<JiangxiangxinxiView> selectListView(@Param("ew") Wrapper<JiangxiangxinxiEntity> wrapper);

	List<JiangxiangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JiangxiangxinxiEntity> wrapper);
	
	JiangxiangxinxiView selectView(@Param("ew") Wrapper<JiangxiangxinxiEntity> wrapper);
	
}
