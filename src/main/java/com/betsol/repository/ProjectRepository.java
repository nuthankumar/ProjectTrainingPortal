package com.betsol.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.betsol.model.Project;
import com.betsol.model.Skill;

@Repository("projectRepository")
public interface ProjectRepository extends JpaRepository<Project, Long> {
	List<Project> findProjectBySkill(Skill skill);
}
