package com.ws.service.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor//Genera constructor para todos los campos
@NoArgsConstructor//Genera constructor sin campos
public class PersonaDto {

    private String nombre;
    private String apellido;
}
