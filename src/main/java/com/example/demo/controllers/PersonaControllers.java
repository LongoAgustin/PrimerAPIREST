package com.example.demo.controllers;


import com.example.demo.entities.Persona;
import com.example.demo.service.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaControllers extends BaseControllerImpl<Persona,PersonaServiceImpl>{

}
