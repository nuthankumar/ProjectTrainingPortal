package com.betsol.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name = "course")
public class Course {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="course_id")
	private int id;
	
	public Training getTraining() {
		return training;
	}
	public void setTraining(Training training) {
		this.training = training;
	}
	@Column(name="cname")
	private String cname;
	
	@Column(name="summary")
	private String summary;
	
	@ManyToOne
	@JoinColumn(name = "training_id")
	@ForeignKey(name="training_fk")
	private Training training;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	
	
	
}
