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


import com.dao.DiscussdianziqikanDao;
import com.entity.DiscussdianziqikanEntity;
import com.service.DiscussdianziqikanService;
import com.entity.vo.DiscussdianziqikanVO;
import com.entity.view.DiscussdianziqikanView;

@Service("discussdianziqikanService")
public class DiscussdianziqikanServiceImpl extends ServiceImpl<DiscussdianziqikanDao, DiscussdianziqikanEntity> implements DiscussdianziqikanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdianziqikanEntity> page = this.selectPage(
                new Query<DiscussdianziqikanEntity>(params).getPage(),
                new EntityWrapper<DiscussdianziqikanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdianziqikanEntity> wrapper) {
		  Page<DiscussdianziqikanView> page =new Query<DiscussdianziqikanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdianziqikanVO> selectListVO(Wrapper<DiscussdianziqikanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdianziqikanVO selectVO(Wrapper<DiscussdianziqikanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdianziqikanView> selectListView(Wrapper<DiscussdianziqikanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdianziqikanView selectView(Wrapper<DiscussdianziqikanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
