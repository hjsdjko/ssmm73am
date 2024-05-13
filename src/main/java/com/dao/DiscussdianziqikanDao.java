package com.dao;

import com.entity.DiscussdianziqikanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdianziqikanVO;
import com.entity.view.DiscussdianziqikanView;


/**
 * 电子期刊评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-05 11:07:09
 */
public interface DiscussdianziqikanDao extends BaseMapper<DiscussdianziqikanEntity> {
	
	List<DiscussdianziqikanVO> selectListVO(@Param("ew") Wrapper<DiscussdianziqikanEntity> wrapper);
	
	DiscussdianziqikanVO selectVO(@Param("ew") Wrapper<DiscussdianziqikanEntity> wrapper);
	
	List<DiscussdianziqikanView> selectListView(@Param("ew") Wrapper<DiscussdianziqikanEntity> wrapper);

	List<DiscussdianziqikanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdianziqikanEntity> wrapper);
	
	DiscussdianziqikanView selectView(@Param("ew") Wrapper<DiscussdianziqikanEntity> wrapper);
	
}
