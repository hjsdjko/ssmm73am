package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KeyanbaogaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KeyanbaogaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KeyanbaogaoView;


/**
 * 科研报告
 *
 * @author 
 * @email 
 * @date 2021-04-05 11:07:09
 */
public interface KeyanbaogaoService extends IService<KeyanbaogaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KeyanbaogaoVO> selectListVO(Wrapper<KeyanbaogaoEntity> wrapper);
   	
   	KeyanbaogaoVO selectVO(@Param("ew") Wrapper<KeyanbaogaoEntity> wrapper);
   	
   	List<KeyanbaogaoView> selectListView(Wrapper<KeyanbaogaoEntity> wrapper);
   	
   	KeyanbaogaoView selectView(@Param("ew") Wrapper<KeyanbaogaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KeyanbaogaoEntity> wrapper);
   	
}

