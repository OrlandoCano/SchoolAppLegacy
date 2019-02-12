package com.school.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.app.dao.AlumnosDao;
import com.school.app.model.Alumno;

@Service
public class AlumnosServiceImpl implements AlumnosService{

	@Autowired
	private AlumnosDao alumnosDao;
	
	@Override
	public List<Alumno> find() {
		return alumnosDao.find();
	}

	@Override
	public Alumno load(Long id) {
		return alumnosDao.load(id);
	}

	@Override
	public Alumno persist(Alumno alumno) {
		
		return alumnosDao.persist(alumno);
	}

	@Override
	public Alumno merge(Alumno alumno) {
		return alumnosDao.merge(alumno);
	}

	@Override
	public Alumno delete(Alumno alumno) {
		return alumnosDao.delete(alumno);
	}
}
