package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshutuanduiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshutuanduiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshutuanduiView;


/**
 * 学术团队
 *
 * @author 
 * @email 
 * @date 2021-04-05 11:07:09
 */
public interface XueshutuanduiService extends IService<XueshutuanduiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshutuanduiVO> selectListVO(Wrapper<XueshutuanduiEntity> wrapper);
   	
   	XueshutuanduiVO selectVO(@Param("ew") Wrapper<XueshutuanduiEntity> wrapper);
   	
   	List<XueshutuanduiView> selectListView(Wrapper<XueshutuanduiEntity> wrapper);
   	
   	XueshutuanduiView selectView(@Param("ew") Wrapper<XueshutuanduiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshutuanduiEntity> wrapper);
   	
}

