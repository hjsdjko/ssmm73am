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


import com.dao.KeyanbaogaoDao;
import com.entity.KeyanbaogaoEntity;
import com.service.KeyanbaogaoService;
import com.entity.vo.KeyanbaogaoVO;
import com.entity.view.KeyanbaogaoView;

@Service("keyanbaogaoService")
public class KeyanbaogaoServiceImpl extends ServiceImpl<KeyanbaogaoDao, KeyanbaogaoEntity> implements KeyanbaogaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KeyanbaogaoEntity> page = this.selectPage(
                new Query<KeyanbaogaoEntity>(params).getPage(),
                new EntityWrapper<KeyanbaogaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KeyanbaogaoEntity> wrapper) {
		  Page<KeyanbaogaoView> page =new Query<KeyanbaogaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KeyanbaogaoVO> selectListVO(Wrapper<KeyanbaogaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KeyanbaogaoVO selectVO(Wrapper<KeyanbaogaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KeyanbaogaoView> selectListView(Wrapper<KeyanbaogaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KeyanbaogaoView selectView(Wrapper<KeyanbaogaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
