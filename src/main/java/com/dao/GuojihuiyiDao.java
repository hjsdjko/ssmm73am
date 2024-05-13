package com.dao;

import com.entity.GuojihuiyiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuojihuiyiVO;
import com.entity.view.GuojihuiyiView;


/**
 * 国际会议
 * 
 * @author 
 * @email 
 * @date 2021-04-05 11:07:09
 */
public interface GuojihuiyiDao extends BaseMapper<GuojihuiyiEntity> {
	
	List<GuojihuiyiVO> selectListVO(@Param("ew") Wrapper<GuojihuiyiEntity> wrapper);
	
	GuojihuiyiVO selectVO(@Param("ew") Wrapper<GuojihuiyiEntity> wrapper);
	
	List<GuojihuiyiView> selectListView(@Param("ew") Wrapper<GuojihuiyiEntity> wrapper);

	List<GuojihuiyiView> selectListView(Pagination page,@Param("ew") Wrapper<GuojihuiyiEntity> wrapper);
	
	GuojihuiyiView selectView(@Param("ew") Wrapper<GuojihuiyiEntity> wrapper);
	
}
