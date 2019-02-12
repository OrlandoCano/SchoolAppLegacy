package com.school.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.app.dao.MateriasDao;
import com.school.app.model.Materia;

@Service
public class MateriasServiceImpl implements MateriasService{

	@Autowired
	private MateriasDao materiasDao;
	
	@Override
	public List<Materia> find() {
		return materiasDao.find();
	}

	@Override
	public Materia load(Long id) {
		return materiasDao.load(id);
	}

	@Override
	public Materia persist(Materia materia) {
		
		return materiasDao.persist(materia);
	}

	@Override
	public Materia merge(Materia materia) {
		return materiasDao.merge(materia);
	}

	@Override
	public Materia delete(Materia materia) {
		return materiasDao.delete(materia);
	}

}
