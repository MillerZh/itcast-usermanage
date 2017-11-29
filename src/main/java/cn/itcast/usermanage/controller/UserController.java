package cn.itcast.usermanage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itcast.usermanage.bean.EasyUIResult;
import cn.itcast.usermanage.service.UserService;

public class UserController {
	@Autowired
	private UserService userService;
	
//	@RequestMapping(value = "list", method = RequestMethod.GET)
//	@ResponseBody
//	public EasyUIResult queryUserList(//@RequestParam)
//		
//	};
	
}
