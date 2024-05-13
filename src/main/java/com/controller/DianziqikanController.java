package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DianziqikanEntity;
import com.entity.view.DianziqikanView;

import com.service.DianziqikanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 电子期刊
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-05 11:07:09
 */
@RestController
@RequestMapping("/dianziqikan")
public class DianziqikanController {
    @Autowired
    private DianziqikanService dianziqikanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DianziqikanEntity dianziqikan, 
		HttpServletRequest request){

        EntityWrapper<DianziqikanEntity> ew = new EntityWrapper<DianziqikanEntity>();
		PageUtils page = dianziqikanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dianziqikan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DianziqikanEntity dianziqikan, HttpServletRequest request){
        EntityWrapper<DianziqikanEntity> ew = new EntityWrapper<DianziqikanEntity>();
		PageUtils page = dianziqikanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dianziqikan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DianziqikanEntity dianziqikan){
       	EntityWrapper<DianziqikanEntity> ew = new EntityWrapper<DianziqikanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( dianziqikan, "dianziqikan")); 
        return R.ok().put("data", dianziqikanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DianziqikanEntity dianziqikan){
        EntityWrapper< DianziqikanEntity> ew = new EntityWrapper< DianziqikanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( dianziqikan, "dianziqikan")); 
		DianziqikanView dianziqikanView =  dianziqikanService.selectView(ew);
		return R.ok("查询电子期刊成功").put("data", dianziqikanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DianziqikanEntity dianziqikan = dianziqikanService.selectById(id);
        return R.ok().put("data", dianziqikan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DianziqikanEntity dianziqikan = dianziqikanService.selectById(id);
        return R.ok().put("data", dianziqikan);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        DianziqikanEntity dianziqikan = dianziqikanService.selectById(id);
        if(type.equals("1")) {
        	dianziqikan.setThumbsupnum(dianziqikan.getThumbsupnum()+1);
        } else {
        	dianziqikan.setCrazilynum(dianziqikan.getCrazilynum()+1);
        }
        dianziqikanService.updateById(dianziqikan);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DianziqikanEntity dianziqikan, HttpServletRequest request){
    	dianziqikan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dianziqikan);

        dianziqikanService.insert(dianziqikan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DianziqikanEntity dianziqikan, HttpServletRequest request){
    	dianziqikan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dianziqikan);

        dianziqikanService.insert(dianziqikan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DianziqikanEntity dianziqikan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(dianziqikan);
        dianziqikanService.updateById(dianziqikan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        dianziqikanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DianziqikanEntity> wrapper = new EntityWrapper<DianziqikanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = dianziqikanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
