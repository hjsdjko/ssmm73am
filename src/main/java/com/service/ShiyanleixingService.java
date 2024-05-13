package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiyanleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiyanleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyanleixingView;


/**
 * 实验类型
 *
 * @author 
 * @email 
 * @date 2021-04-05 11:07:09
 */
public interface ShiyanleixingService extends IService<ShiyanleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyanleixingVO> selectListVO(Wrapper<ShiyanleixingEntity> wrapper);
   	
   	ShiyanleixingVO selectVO(@Param("ew") Wrapper<ShiyanleixingEntity> wrapper);
   	
   	List<ShiyanleixingView> selectListView(Wrapper<ShiyanleixingEntity> wrapper);
   	
   	ShiyanleixingView selectView(@Param("ew") Wrapper<ShiyanleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiyanleixingEntity> wrapper);
   	
}

