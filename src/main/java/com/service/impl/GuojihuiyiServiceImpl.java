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


import com.dao.GuojihuiyiDao;
import com.entity.GuojihuiyiEntity;
import com.service.GuojihuiyiService;
import com.entity.vo.GuojihuiyiVO;
import com.entity.view.GuojihuiyiView;

@Service("guojihuiyiService")
public class GuojihuiyiServiceImpl extends ServiceImpl<GuojihuiyiDao, GuojihuiyiEntity> implements GuojihuiyiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuojihuiyiEntity> page = this.selectPage(
                new Query<GuojihuiyiEntity>(params).getPage(),
                new EntityWrapper<GuojihuiyiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuojihuiyiEntity> wrapper) {
		  Page<GuojihuiyiView> page =new Query<GuojihuiyiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuojihuiyiVO> selectListVO(Wrapper<GuojihuiyiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuojihuiyiVO selectVO(Wrapper<GuojihuiyiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuojihuiyiView> selectListView(Wrapper<GuojihuiyiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuojihuiyiView selectView(Wrapper<GuojihuiyiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
