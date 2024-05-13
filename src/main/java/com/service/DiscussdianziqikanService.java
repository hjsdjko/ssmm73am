package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdianziqikanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdianziqikanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdianziqikanView;


/**
 * 电子期刊评论表
 *
 * @author 
 * @email 
 * @date 2021-04-05 11:07:09
 */
public interface DiscussdianziqikanService extends IService<DiscussdianziqikanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdianziqikanVO> selectListVO(Wrapper<DiscussdianziqikanEntity> wrapper);
   	
   	DiscussdianziqikanVO selectVO(@Param("ew") Wrapper<DiscussdianziqikanEntity> wrapper);
   	
   	List<DiscussdianziqikanView> selectListView(Wrapper<DiscussdianziqikanEntity> wrapper);
   	
   	DiscussdianziqikanView selectView(@Param("ew") Wrapper<DiscussdianziqikanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdianziqikanEntity> wrapper);
   	
}

