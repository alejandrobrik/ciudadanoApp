package com.briki.ciudadano.services;

import com.briki.ciudadano.models.Componente;


import com.briki.ciudadano.models.Usuario;
import com.briki.ciudadano.repositories.ComponenteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ComponenteService {
   @Autowired
  ComponenteRepository componenteRepository;
//
//    public ArrayList<Componente> obtenerComponentes(){
//        return (ArrayList<Componente>)componenteRepository.findAll();
//    }
//    public Componente guardarUsuario(Componente componente){
//        return componenteRepository.save(componente);
//    }
//
//    public Optional<Componente> obtenerPorId(int id){
//        return componenteRepository.findById(id);
//    }
//
//    public ArrayList<Componente> obtenerPorNombre(int usuario){
//        return componenteRepository.finbyUsuarioID(usuario);
//    }
//
//    public boolean componenteRepository(int id) {
//        try {
//            componenteRepository.deleteById(id);
//            return true;
//
//        } catch (Exception err) {
//            return false;
//        }
//    }
}
