package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShiyandongtaiDao;
import com.entity.ShiyandongtaiEntity;
import com.service.ShiyandongtaiService;
import com.entity.vo.ShiyandongtaiVO;
import com.entity.view.ShiyandongtaiView;

@Service("shiyandongtaiService")
public class ShiyandongtaiServiceImpl extends ServiceImpl<ShiyandongtaiDao, ShiyandongtaiEntity> implements ShiyandongtaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyandongtaiEntity> page = this.selectPage(
                new Query<ShiyandongtaiEntity>(params).getPage(),
                new EntityWrapper<ShiyandongtaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiyandongtaiEntity> wrapper) {
		  Page<ShiyandongtaiView> page =new Query<ShiyandongtaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiyandongtaiVO> selectListVO(Wrapper<ShiyandongtaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyandongtaiVO selectVO(Wrapper<ShiyandongtaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyandongtaiView> selectListView(Wrapper<ShiyandongtaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyandongtaiView selectView(Wrapper<ShiyandongtaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
