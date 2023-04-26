package com.example.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    int idPersona;
    String nombre;
    String password;


    public Persona(int id,String name, String clave){
        idPersona=id;
        nombre=name;
        password=clave;

    }
}

