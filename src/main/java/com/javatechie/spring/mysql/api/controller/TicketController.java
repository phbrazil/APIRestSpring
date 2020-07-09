package com.javatechie.spring.mysql.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.spring.mysql.api.model.tbUsuarios;
import com.javatechie.spring.mysql.api.dao.UsuariosDAO;

@RestController
@RequestMapping("/user")
public class TicketController {

    @Autowired
    private UsuariosDAO dao;

    @PostMapping("/createUser")
    public String bookTicket(@RequestBody List<tbUsuarios> usuarios) {

        dao.save(usuarios);
        return "user created : " + usuarios.size();
    }

    @GetMapping("/getUsers")
    public List<tbUsuarios> getUsers() {
        return (List<tbUsuarios>) dao.findAll();
    }

    @GetMapping("/getUser")
    public tbUsuarios getUser(int idUser) {
        return (tbUsuarios) dao.findOne(idUser);
    }

    @GetMapping("/deleteUser")
    public String deleteUser(int idUser) {

        dao.delete(idUser);
        return "Success";
    }

}
