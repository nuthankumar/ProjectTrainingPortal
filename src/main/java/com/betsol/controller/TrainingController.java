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
import com.betsol.service.TrainingService;
import com.betsol.service.UserService;

@Controller
public class TrainingController {
	
	
@Autowired
private TrainingService trainingService;
	
	@RequestMapping(value="technical/training", method = RequestMethod.GET)
	public ModelAndView registration(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("training", trainingService.findAll());
		
		modelAndView.setViewName("technical/training");
		return modelAndView;
	}
	
	@RequestMapping(value="technical/oops", method = RequestMethod.GET)
	public ModelAndView gotoOopsTraining(){
		ModelAndView modelAndView = new ModelAndView();
	
		
		modelAndView.setViewName("technical/oops");
		return modelAndView;
	}
	@RequestMapping(value="technical/oopsTrain", method = RequestMethod.GET)
	public ModelAndView gotoOops(){
		ModelAndView modelAndView = new ModelAndView();
	
		
		modelAndView.setViewName("technical/oopsTrain");
		return modelAndView;
	}
	

}
