package com.qbo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qbo.model.Tutorial;
import com.qbo.repository.TutorialRepository;

@Service
public class TutorialService {

	@Autowired
	private TutorialRepository repository;

	public List<Tutorial> listarTutoriales(){
		return repository.findAll();
	}
	
	public void registrarTutorial(Tutorial tutorial) {
		repository.save(tutorial);
	}
	
}
