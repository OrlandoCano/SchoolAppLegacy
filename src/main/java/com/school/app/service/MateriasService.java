package com.school.app.service;

import java.util.List;

import com.school.app.model.Materia;

public interface MateriasService {
	List <Materia> find();
	Materia load(Long id);
	Materia persist(Materia materia);
	Materia merge(Materia materia);
	Materia delete(Materia materia);
}
