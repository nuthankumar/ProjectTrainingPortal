package com.betsol.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.betsol.model.Training;
import com.betsol.repository.TrainingRepository;

@Service
public class TrainingServiceImpl implements TrainingService {

	@Autowired
	private TrainingRepository trainingRepository;

	@Override
	public List<Training> findAll() {

		return trainingRepository.findAll();
	}

}
