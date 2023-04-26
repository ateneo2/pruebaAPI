package com.example.demo.controlador;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Persona;
//Probar enviando un Json con datos de Persona pers
@RestController
public class PersonaController {
    @PostMapping("/persona")
    /**
     * 
     * @param pers
     * RequestBody permite recibir un .JSON con un objeto de dominio completo al endpoint.
     *  Lo hace en el cuerpo o body del del mensaje
     * de la solicitud, Para luego convertirlo en un objeto java en la 
     * aplicacion.
     * en este caso, recibe un json con una Persona.
     * @return
     */
    public String nuevaPersona(@RequestBody Persona pers){
        Persona p1= new Persona(pers.getIdPersona(),pers.getNombre(), pers.getPassword());


        return pers.getIdPersona()+"te envie una persona y se recibio   "+
        p1.getNombre()+
        " Tiene password: "+
        p1.getPassword();
            
        
    }
    
}
