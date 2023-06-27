package com.app.web.services;

import com.app.web.entities.Estudiante;
import java.util.List;


public interface EstudianteServicio {
    
    public List<Estudiante> mostrarEstudiantes();
    
    public Estudiante guardarEstudiante(Estudiante estudiante);
    
    public Estudiante obtenerEstudiantePorId(Integer id);
    
    public Estudiante actualizarEstudiante(Estudiante estudiante);
    
    public void eliminarEstudiante(Integer id);
}
