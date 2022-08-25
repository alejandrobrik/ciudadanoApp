package com.briki.ciudadano.controllers;

import com.briki.ciudadano.models.Usuario;
import com.briki.ciudadano.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<Usuario> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping
    public Usuario guardarUsuario(@RequestBody Usuario usuario){
        return this.usuarioService.guardarUsuario(usuario);
    }

    @GetMapping(path = "/{id}")
    public Optional<Usuario> obtenerUsuarioPorId(@PathVariable("id") int id){
        return this.usuarioService.obtenerPorId(id);
    }

    @GetMapping(path = "/query")
    public ArrayList<Usuario> obtenerPorNombre(@RequestParam("nombre") String nombre){
        return this.usuarioService.obtenerPorNombre(nombre);
    }
    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") int id){
        boolean ok = this.usuarioService.elimanrUsuario(id);
        if (ok){
            return "Se elimino el usuario con el id: " + id;
        }else {
            return "No se pudo eliminar el usuario con el id: "+ id;
        }

    }



}
