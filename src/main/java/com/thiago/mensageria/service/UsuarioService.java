package com.thiago.mensageria.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.thiago.mensageria.modal.Usuario;
import com.thiago.mensageria.modal.dto.UsuarioDto;

@Service
public class UsuarioService {

	private static UsuarioService instance;
	private List<Usuario> usuarios;
	
	private UsuarioService() {
        usuarios = new ArrayList<>();  // Inicializando a lista de usuários
    }
	
	// Método para obter a instância única da classe
    public static UsuarioService getInstance() {
        if (instance == null) {
        	instance = new UsuarioService();
        }
        return instance;
    }
	
	public void cadastrar(UsuarioDto dto) throws Exception {
		if(dto == null) {
			throw new Exception("valores nulos");
		}
		usuarios.stream().filter(usuario -> usuario.getEmail().equalsIgnoreCase(dto.getEmail()))
		.findFirst()
		.ifPresent(usuario -> {
			throw new RuntimeException("Usuario já cadastrado: " + dto.getEmail());
			}
		);
		Usuario usu = Usuario.builder().nome(dto.getNome()).email(dto.getEmail()).build();
		usuarios.add(usu);
	}
}
