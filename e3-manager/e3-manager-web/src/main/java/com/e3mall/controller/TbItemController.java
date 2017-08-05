package com.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.e3mall.pojo.TbItem;
import com.e3mall.service.TbItemService;

@Controller
public class TbItemController {

	@Autowired
	private TbItemService itemService;
	
	@RequestMapping("item/{itemid}")
	@ResponseBody
	public TbItem getItemById(@PathVariable long itemid){
		TbItem tbItem = itemService.getItemById(itemid);
		return tbItem;
	}
	
}
