package com.betsol.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.betsol.model.Project;
import com.betsol.model.Skill;
import com.betsol.service.ProjectService;

@Controller
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@RequestMapping(value="projects/project", method = RequestMethod.GET)
	public ModelAndView registration(){
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("projects/project");
		return modelAndView;
	}
	
	@RequestMapping(value="projects/viewallprojects", method = RequestMethod.GET)
	public ModelAndView viewAllProjects(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("listofProject", projectService.viewAllProjects());
		modelAndView.setViewName("projects/viewAllProject");
		return modelAndView;
	}
	
	@RequestMapping(value="projects/searchSkill",method = RequestMethod.POST)
	public ModelAndView findAllProjectOnSkill(@RequestParam(required=true,name="skillsearch") String skillsearch){
		
		Skill S=new Skill(1,"test","test");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("listofProject", projectService.findProjectBySkill(S));
		modelAndView.setViewName("projects/viewAllProject");
		return modelAndView;
	}
	

}
