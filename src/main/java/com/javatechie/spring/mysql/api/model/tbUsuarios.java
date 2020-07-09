package com.javatechie.spring.mysql.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tbusuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class tbUsuarios {
	@Id
	@GeneratedValue
	private int idUser;
        private String nome;
        private String CPF;
        private String email;
        private String telefone;
        private String celular;
        private String cep;
        private double latitude;
        private double longitude;
        private String rua;
        private String numero;
        private String complemento;
        private String bairro;
        private String cidade;
        private String uf;
        private String password;
        private String dataCadastro;
        private boolean changePassword;
        private boolean ativo;
        private String token;
        

}
