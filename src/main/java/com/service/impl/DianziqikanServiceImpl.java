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


import com.dao.DianziqikanDao;
import com.entity.DianziqikanEntity;
import com.service.DianziqikanService;
import com.entity.vo.DianziqikanVO;
import com.entity.view.DianziqikanView;

@Service("dianziqikanService")
public class DianziqikanServiceImpl extends ServiceImpl<DianziqikanDao, DianziqikanEntity> implements DianziqikanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DianziqikanEntity> page = this.selectPage(
                new Query<DianziqikanEntity>(params).getPage(),
                new EntityWrapper<DianziqikanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DianziqikanEntity> wrapper) {
		  Page<DianziqikanView> page =new Query<DianziqikanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DianziqikanVO> selectListVO(Wrapper<DianziqikanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DianziqikanVO selectVO(Wrapper<DianziqikanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DianziqikanView> selectListView(Wrapper<DianziqikanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DianziqikanView selectView(Wrapper<DianziqikanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
