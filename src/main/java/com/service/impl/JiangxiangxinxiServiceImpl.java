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


import com.dao.JiangxiangxinxiDao;
import com.entity.JiangxiangxinxiEntity;
import com.service.JiangxiangxinxiService;
import com.entity.vo.JiangxiangxinxiVO;
import com.entity.view.JiangxiangxinxiView;

@Service("jiangxiangxinxiService")
public class JiangxiangxinxiServiceImpl extends ServiceImpl<JiangxiangxinxiDao, JiangxiangxinxiEntity> implements JiangxiangxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiangxiangxinxiEntity> page = this.selectPage(
                new Query<JiangxiangxinxiEntity>(params).getPage(),
                new EntityWrapper<JiangxiangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiangxiangxinxiEntity> wrapper) {
		  Page<JiangxiangxinxiView> page =new Query<JiangxiangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiangxiangxinxiVO> selectListVO(Wrapper<JiangxiangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiangxiangxinxiVO selectVO(Wrapper<JiangxiangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiangxiangxinxiView> selectListView(Wrapper<JiangxiangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiangxiangxinxiView selectView(Wrapper<JiangxiangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
