package com.thiago.mensageria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiago.mensageria.service.MensagemService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/mensagem")
@RequiredArgsConstructor
public class MensagemController {

	private final MensagemService service;
}
