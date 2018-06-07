package com.betsol.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  com.betsol.service.ProjectService;
import com.betsol.model.Project;
import com.betsol.model.Skill;
import com.betsol.repository.ProjectRepository;



@Service("projectService")
public class ProjectServiceImpl implements ProjectService{
	@Autowired
	private ProjectRepository projectRepository;
	@Override
	public List<Project> viewAllProjects() {
		return projectRepository.findAll();
	}
	@Override
	public List<Project> findProjectBySkill(Skill skill) {
		return projectRepository.findProjectBySkill(skill);
	}
	
}
