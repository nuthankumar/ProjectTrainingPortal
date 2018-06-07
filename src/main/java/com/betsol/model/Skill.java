package com.betsol.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name = "skill")
public class Skill {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="skill_id")
	private int id;

	@Column(name="skill_name")
	private String skillName;
	
	@Column(name="skill_desc")
	private String skill_desc;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "skill_project", joinColumns = @JoinColumn(name = "skill_id"), inverseJoinColumns = @JoinColumn(name = "project_id"))
	private List<Project> projects;
	
	public Skill(int id,String skillname,String skilldesc){
		this.id=id;
		this.skillName=skillname;
		this.skill_desc=skilldesc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getSkill_desc() {
		return skill_desc;
	}

	public void setSkill_desc(String skill_desc) {
		this.skill_desc = skill_desc;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
}
