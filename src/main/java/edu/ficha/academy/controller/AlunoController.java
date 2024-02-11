package edu.ficha.academy.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ficha.academy.model.AlunoModel;
import edu.ficha.academy.repository.AlunoRepository;



@RestController
@RequestMapping("/aluno")
public class AlunoController {
	
	@Autowired
	AlunoRepository repository;
	
	@GetMapping("/retornar")
	public List<AlunoModel> retornarAlunos(){
		return repository.findAll();
	}
	
}
