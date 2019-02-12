package com.school.app.dao;

import java.util.List;

import com.school.app.model.Alumno;

public interface AlumnosDao {
	List <Alumno> find();
	Alumno load(Long id);
	Alumno persist(Alumno alumno);
	Alumno merge(Alumno alumno);
	Alumno delete(Alumno alumno);
}
