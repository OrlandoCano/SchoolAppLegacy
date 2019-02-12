package com.school.app.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.school.app.model.Alumno;
import com.school.app.service.AlumnosService;

@RestController
@RequestMapping("/api/")
public class AlumnosController {
	
	@Autowired
	private AlumnosService service;
	
	@RequestMapping(value = "/alumnos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE) 
	public @ResponseBody List<Alumno> getAlumnos(HttpServletResponse httpResponse) throws IOException{
		List<Alumno> alumnos = null;
		try{
			alumnos = service.find();
			return alumnos;
		}catch(Exception e){
			httpResponse.sendError(HttpServletResponse.SC_BAD_REQUEST);
			return null;
		}
	}
	
	@RequestMapping(value = "/alumnos", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE) 
	public @ResponseBody Alumno saveAlumnos(@RequestBody Alumno alumno, HttpServletResponse httpResponse) throws IOException{
		try{
			if(alumno.getId() != null){
				alumno = service.merge(alumno);
			}else{
				alumno = service.persist(alumno);
			}
			return alumno;
		}catch(Exception e){
			httpResponse.sendError(HttpServletResponse.SC_BAD_REQUEST);
			return null;
		}
	}
	
	@RequestMapping(value = "/alumnos/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE) 
	public @ResponseBody Alumno removeAlumno(@PathVariable Long id, HttpServletResponse httpResponse) throws IOException{
		Alumno alumno = null;
		try{
			alumno = service.load(id);
			alumno = service.delete(alumno);
			return alumno;
		}catch(Exception e){
			httpResponse.sendError(HttpServletResponse.SC_BAD_REQUEST);
			return null;
		}
	}
	
	@RequestMapping(value = "/alumnos/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE) 
	public @ResponseBody Alumno loadAlumno(@PathVariable Long id, HttpServletResponse httpResponse) throws IOException{
		Alumno alumno = null;
		try{
			alumno = service.load(id);
			return alumno;
		}catch(Exception e){
			httpResponse.sendError(HttpServletResponse.SC_BAD_REQUEST);
			return null;
		}
	}

}
