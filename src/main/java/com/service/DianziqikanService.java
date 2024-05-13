package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DianziqikanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DianziqikanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DianziqikanView;


/**
 * 电子期刊
 *
 * @author 
 * @email 
 * @date 2021-04-05 11:07:09
 */
public interface DianziqikanService extends IService<DianziqikanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DianziqikanVO> selectListVO(Wrapper<DianziqikanEntity> wrapper);
   	
   	DianziqikanVO selectVO(@Param("ew") Wrapper<DianziqikanEntity> wrapper);
   	
   	List<DianziqikanView> selectListView(Wrapper<DianziqikanEntity> wrapper);
   	
   	DianziqikanView selectView(@Param("ew") Wrapper<DianziqikanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DianziqikanEntity> wrapper);
   	
}

