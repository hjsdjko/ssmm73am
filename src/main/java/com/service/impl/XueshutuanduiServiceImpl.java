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


import com.dao.XueshutuanduiDao;
import com.entity.XueshutuanduiEntity;
import com.service.XueshutuanduiService;
import com.entity.vo.XueshutuanduiVO;
import com.entity.view.XueshutuanduiView;

@Service("xueshutuanduiService")
public class XueshutuanduiServiceImpl extends ServiceImpl<XueshutuanduiDao, XueshutuanduiEntity> implements XueshutuanduiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshutuanduiEntity> page = this.selectPage(
                new Query<XueshutuanduiEntity>(params).getPage(),
                new EntityWrapper<XueshutuanduiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshutuanduiEntity> wrapper) {
		  Page<XueshutuanduiView> page =new Query<XueshutuanduiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshutuanduiVO> selectListVO(Wrapper<XueshutuanduiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshutuanduiVO selectVO(Wrapper<XueshutuanduiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshutuanduiView> selectListView(Wrapper<XueshutuanduiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshutuanduiView selectView(Wrapper<XueshutuanduiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
