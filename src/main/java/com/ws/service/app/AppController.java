package com.ws.service.app;

import com.ws.service.model.PersonaEntity;
import com.ws.service.model.dto.PersonaDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController//Mapear la clase que sea un controlador
@RequestMapping("/api")//Mapear ruta
public class AppController {



    List<PersonaDto> personas = new ArrayList<>();

    //GET
    //POST
    //PUT
    //DELETE
    //PATH


    //@PathVariable -> pasar variables por el PATH /get/{nombre}
    //@RequestParam -> pasar variables por el PATH /get/{nombre}?apellido=Mallqui

    @GetMapping("/get/{nombre}")
    public String get(@PathVariable("nombre") String nombre,
                      @RequestParam("apellido") String apellido,
                      @RequestParam("edad") int edad){
        return "Hola "+nombre +" "+apellido +" "+edad;
    }


    //@RequestBody -> mandar cuerpo al request
    @PostMapping("/post")
    public PersonaDto post(@RequestBody PersonaEntity persona){
        return new PersonaDto(persona.getNombre(),persona.getApellido());
    }


    @PostMapping("/postList")
    public List<PersonaDto> postList(@RequestBody PersonaEntity persona){

        personas.add(new PersonaDto(persona.getNombre(),persona.getApellido()));

        return personas;
    }



}
