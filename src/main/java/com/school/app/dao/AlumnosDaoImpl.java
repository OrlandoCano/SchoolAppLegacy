package com.school.app.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.school.app.model.Alumno;


@Repository
@Transactional
public class AlumnosDaoImpl implements AlumnosDao{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Alumno> find() {
		List<Alumno> alumnos = new ArrayList<>();
		Session session = sessionFactory.getCurrentSession();
        alumnos = session.createQuery("from Alumno").list();
        return alumnos;
	}

	@Override
	public Alumno load(Long id) {
		Session session = sessionFactory.getCurrentSession();
        return (Alumno) session.get(Alumno.class, id);
	}

	@Override
	public Alumno persist(Alumno alumno) {
		Session session = sessionFactory.getCurrentSession();
        session.persist(alumno);
		return alumno;
	}

	@Override
	public Alumno merge(Alumno alumno) {
		Session session = sessionFactory.getCurrentSession();
        session.merge(alumno);
		return alumno;
	}

	@Override
	public Alumno delete(Alumno alumno) {
		Session session = sessionFactory.getCurrentSession();
        session.delete(alumno);
        alumno = null;
		return alumno;
	}
	
}
