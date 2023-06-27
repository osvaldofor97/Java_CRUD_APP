package com.app.web;

import com.app.web.entities.Estudiante;
import com.app.web.repository.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner{

    public static void main(String[] args) {
	SpringApplication.run(Application.class, args);
    }

    @Autowired
    private EstudianteRepositorio repositorio;
        
    @Override
    public void run(String... args) throws Exception {
       /*
        Estudiante estudiante1 = new Estudiante("Oscar", "Fernandez", "oscarfer@gmail.com");
        repositorio.save(estudiante1);
        
        Estudiante estudiante2 = new Estudiante("Luisa", "Martinez", "lumar@gmail.com");
        repositorio.save(estudiante2);
        
        Estudiante estudiante3 = new Estudiante("Carlos", "Fetecua", "carfet@gmail.com");
        repositorio.save(estudiante3);
        */
    }

}
