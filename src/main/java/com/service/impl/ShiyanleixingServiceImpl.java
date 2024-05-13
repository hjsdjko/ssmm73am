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


import com.dao.ShiyanleixingDao;
import com.entity.ShiyanleixingEntity;
import com.service.ShiyanleixingService;
import com.entity.vo.ShiyanleixingVO;
import com.entity.view.ShiyanleixingView;

@Service("shiyanleixingService")
public class ShiyanleixingServiceImpl extends ServiceImpl<ShiyanleixingDao, ShiyanleixingEntity> implements ShiyanleixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyanleixingEntity> page = this.selectPage(
                new Query<ShiyanleixingEntity>(params).getPage(),
                new EntityWrapper<ShiyanleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiyanleixingEntity> wrapper) {
		  Page<ShiyanleixingView> page =new Query<ShiyanleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiyanleixingVO> selectListVO(Wrapper<ShiyanleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyanleixingVO selectVO(Wrapper<ShiyanleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyanleixingView> selectListView(Wrapper<ShiyanleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyanleixingView selectView(Wrapper<ShiyanleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
