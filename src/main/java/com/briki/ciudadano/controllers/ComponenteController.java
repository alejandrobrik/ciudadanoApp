package com.briki.ciudadano.controllers;

import com.briki.ciudadano.models.Usuario;
import com.briki.ciudadano.services.ComponenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/componente")
public class ComponenteController {

    @Autowired
    ComponenteService componenteService;


}
