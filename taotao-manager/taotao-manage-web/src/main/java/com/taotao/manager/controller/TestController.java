package com.taotao.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.taotao.manager.pojo.ItemCat;

@RequestMapping("page")
@Controller
public class TestController {
    
	@RequestMapping(value = "{pathName}",method=RequestMethod.GET)
	public String getPathName(@PathVariable("pathName") String pathName) {
		return pathName;
	}
	
	public void insertById(ItemCat cat){
		
	}
}
