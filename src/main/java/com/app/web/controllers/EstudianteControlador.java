
package com.app.web.controllers;

import com.app.web.entities.Estudiante;
import com.app.web.services.EstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EstudianteControlador {
    
    @Autowired
    private EstudianteServicio servicio;
    
    @GetMapping({"/estudiantes","/"})
    public String mostrarEstudiantes(Model modelo){
        modelo.addAttribute("estudiantes", servicio.mostrarEstudiantes());
        return "estudiantes";
    }

    @GetMapping("/estudiantes/nuevo")
    public String formularioCrearEstudiante(Model modelo){
        Estudiante estudiante = new Estudiante();
        modelo.addAttribute("estudiante", estudiante);
        return "crearEstudiante";
    }
    
    @PostMapping("/estudiantes")
    public String guardarEstudiante(@ModelAttribute("estudiante") Estudiante estudiante){
        servicio.guardarEstudiante(estudiante);
        return "redirect:/estudiantes";
    }
    
    @GetMapping("/estudiantes/editar/{id}")
    public String mostrarFormularioEdicion(@PathVariable Integer id, Model modelo){
        modelo.addAttribute("estudiante", servicio.obtenerEstudiantePorId(id));
        return "editarEstudiante";
    }
    
    @PostMapping("/estudiantes/{id}")
    public String actualizarEstudiante(@PathVariable Integer id, @ModelAttribute("estudiante") Estudiante estudiante){
        Estudiante estudianteExistente = servicio.obtenerEstudiantePorId(id);
        estudianteExistente.setId(id);
        estudianteExistente.setNombre(estudiante.getNombre());
        estudianteExistente.setApellido(estudiante.getApellido());
        estudianteExistente.setEmail(estudiante.getEmail());
        
        servicio.actualizarEstudiante(estudianteExistente);
        return "redirect:/estudiantes";
    }
    
    @GetMapping("/estudiantes/{id}")
    public String eliminarEstudiante(@PathVariable Integer id){
        servicio.eliminarEstudiante(id);
        return "redirect:/estudiantes";
    }
    
}
