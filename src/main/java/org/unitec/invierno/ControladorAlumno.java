/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.invierno;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControladorAlumno {
    @Autowired RepositorioAlumno repoAlumno;
 
   
   @GetMapping("/alumno")
   public Estatus guardar(){
       Alumno a=new Alumno();
       a.setEdad(40);
       a.setEmail("rapidclimate@gmail.com");
   repoAlumno.save(a);
       Estatus e=new Estatus();
       return e;
}
    
}
