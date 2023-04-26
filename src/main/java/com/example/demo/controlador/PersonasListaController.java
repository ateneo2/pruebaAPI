package com.example.demo.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Persona;

@RestController

public class PersonasListaController {
  //@GetMapping("/personastraer")
  public List <Persona> listaPersonas= new ArrayList<>();
  @GetMapping("/personastraer")
  public ArrayList<Persona> traerPersonas(){
    
    listaPersonas.add(new Persona(1,"Mariana","paswgrt4"));
    listaPersonas.add(new Persona(2,"Berni","berwgrt4"));
    listaPersonas.add(new Persona(1,"Segi","pasegit454"));
        
    return (ArrayList<Persona>) listaPersonas;
    

  }
  

}
