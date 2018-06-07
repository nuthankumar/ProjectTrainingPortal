package com.betsol.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.betsol.model.Training;


public interface TrainingService {
	public List<Training> findAll();
	
}
