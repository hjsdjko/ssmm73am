package com.dao;

import com.entity.XueshutuanduiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshutuanduiVO;
import com.entity.view.XueshutuanduiView;


/**
 * 学术团队
 * 
 * @author 
 * @email 
 * @date 2021-04-05 11:07:09
 */
public interface XueshutuanduiDao extends BaseMapper<XueshutuanduiEntity> {
	
	List<XueshutuanduiVO> selectListVO(@Param("ew") Wrapper<XueshutuanduiEntity> wrapper);
	
	XueshutuanduiVO selectVO(@Param("ew") Wrapper<XueshutuanduiEntity> wrapper);
	
	List<XueshutuanduiView> selectListView(@Param("ew") Wrapper<XueshutuanduiEntity> wrapper);

	List<XueshutuanduiView> selectListView(Pagination page,@Param("ew") Wrapper<XueshutuanduiEntity> wrapper);
	
	XueshutuanduiView selectView(@Param("ew") Wrapper<XueshutuanduiEntity> wrapper);
	
}
