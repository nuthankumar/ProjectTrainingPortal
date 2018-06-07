package com.betsol.service;

import java.util.List;


import com.betsol.model.Project;
import com.betsol.model.Skill;

public interface ProjectService {
	List<Project> viewAllProjects();
	List<Project> findProjectBySkill(Skill skill);
}
