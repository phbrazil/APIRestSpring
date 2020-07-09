package com.javatechie.spring.mysql.api.dao;

import org.springframework.data.repository.CrudRepository;

import com.javatechie.spring.mysql.api.model.tbUsuarios;

public interface UsuariosDAO extends CrudRepository<tbUsuarios, Integer>{

}
