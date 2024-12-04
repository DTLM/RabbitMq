package com.thiago.mensageria.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiago.mensageria.modal.dto.UsuarioDto;
import com.thiago.mensageria.service.UsuarioService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UsuarioController {

	private final UsuarioService service;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@PutMapping("/cadastrar")
	public ResponseEntity cadastrar(@RequestBody UsuarioDto dto) {
		try {
			service.cadastrar(dto);
			return ResponseEntity.ok("Usuário cadastrado com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity("Erro ao cadastrar usuário", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
