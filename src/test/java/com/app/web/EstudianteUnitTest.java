package com.app.web;

import com.app.web.entities.Estudiante;
import com.app.web.repository.EstudianteRepositorio;
import com.app.web.services.EstudianteServicio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EstudianteUnitTest {

    //@Autowired
    //private EstudianteServicio servicio;
    
    @Autowired
    private EstudianteRepositorio repositorio;
    
    @Test
    public void guardarEstudianteBD(){
        Estudiante estudiante1 = new Estudiante("Oscar", "Fernandez", "oscarfernandez@gmail.com");
        repositorio.save(estudiante1);
        
    }

}
