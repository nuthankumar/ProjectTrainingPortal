package com.betsol.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.betsol.model.User;
import com.betsol.service.UserService;

@Controller
public class ThemeController {
	
	
	
	
	@RequestMapping(value="admin/theme", method = RequestMethod.GET)
	public ModelAndView registration(){
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("admin/theme");
		return modelAndView;
	}
	
	
	

}
