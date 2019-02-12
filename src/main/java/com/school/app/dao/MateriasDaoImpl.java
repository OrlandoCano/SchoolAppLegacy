package com.school.app.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.school.app.model.Materia;

@Transactional
@Repository
public class MateriasDaoImpl implements MateriasDao{
	@Autowired
	private SessionFactory sessionFactory;

	
	@Override
	public List<Materia> find() {
		List<Materia> materias = new ArrayList<>();
		Session session = sessionFactory.getCurrentSession();
		 materias = session.createQuery("from Materia").list();
		 return materias;
	}

	@Override
	public Materia load(Long id) {
		Session session = sessionFactory.openSession();
        return (Materia) session.get(Materia.class, id);
	}

	@Override
	public Materia persist(Materia materia) {
		Session session = sessionFactory.getCurrentSession();
        session.persist(materia);
		return materia;
	}

	@Override
	public Materia merge(Materia materia) {
		Session session = sessionFactory.getCurrentSession();  
        session.merge(materia);
		return materia;
	}

	@Override
	public Materia delete(Materia materia) {
		Session session = sessionFactory.getCurrentSession();        
        session.delete(materia);
		return materia;
	}
	

}
