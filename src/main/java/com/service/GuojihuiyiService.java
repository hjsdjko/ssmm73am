package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuojihuiyiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuojihuiyiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuojihuiyiView;


/**
 * 国际会议
 *
 * @author 
 * @email 
 * @date 2021-04-05 11:07:09
 */
public interface GuojihuiyiService extends IService<GuojihuiyiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuojihuiyiVO> selectListVO(Wrapper<GuojihuiyiEntity> wrapper);
   	
   	GuojihuiyiVO selectVO(@Param("ew") Wrapper<GuojihuiyiEntity> wrapper);
   	
   	List<GuojihuiyiView> selectListView(Wrapper<GuojihuiyiEntity> wrapper);
   	
   	GuojihuiyiView selectView(@Param("ew") Wrapper<GuojihuiyiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuojihuiyiEntity> wrapper);
   	
}

