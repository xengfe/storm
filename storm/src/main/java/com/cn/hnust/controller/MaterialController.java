package com.cn.hnust.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/material")
public class MaterialController {
	

	@RequestMapping(value = "", method = { RequestMethod.GET })
	public String toMaterial() {
		return "material";
	}

}