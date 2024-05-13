package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiangxiangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiangxiangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiangxiangxinxiView;


/**
 * 奖项信息
 *
 * @author 
 * @email 
 * @date 2021-04-05 11:07:09
 */
public interface JiangxiangxinxiService extends IService<JiangxiangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiangxiangxinxiVO> selectListVO(Wrapper<JiangxiangxinxiEntity> wrapper);
   	
   	JiangxiangxinxiVO selectVO(@Param("ew") Wrapper<JiangxiangxinxiEntity> wrapper);
   	
   	List<JiangxiangxinxiView> selectListView(Wrapper<JiangxiangxinxiEntity> wrapper);
   	
   	JiangxiangxinxiView selectView(@Param("ew") Wrapper<JiangxiangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiangxiangxinxiEntity> wrapper);
   	
}

