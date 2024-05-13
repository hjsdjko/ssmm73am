package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiyandongtaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiyandongtaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyandongtaiView;


/**
 * 实验动态
 *
 * @author 
 * @email 
 * @date 2021-04-05 11:07:09
 */
public interface ShiyandongtaiService extends IService<ShiyandongtaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyandongtaiVO> selectListVO(Wrapper<ShiyandongtaiEntity> wrapper);
   	
   	ShiyandongtaiVO selectVO(@Param("ew") Wrapper<ShiyandongtaiEntity> wrapper);
   	
   	List<ShiyandongtaiView> selectListView(Wrapper<ShiyandongtaiEntity> wrapper);
   	
   	ShiyandongtaiView selectView(@Param("ew") Wrapper<ShiyandongtaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiyandongtaiEntity> wrapper);
   	
}

