package com.example.RYArgentina.utils;

import com.example.RYArgentina.model.Persona;
import com.example.RYArgentina.model.Usuario;
import com.example.RYArgentina.repository.UsuarioRepositorio;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class Utils {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    public Persona getPersonContext(){
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return usuarioRepositorio.buscarUsuarioPorEmail(userDetails.getUsername()).getPersona();
    }

    public String getRoleContext (){
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
     return userDetails.getAuthorities().toArray()[0].toString();
    }

    public Usuario getUserContext(){
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return usuarioRepositorio.buscarUsuarioPorEmail(userDetails.getUsername());
    }
}
