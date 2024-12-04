package com.thiago.mensageria.modal.dto;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class MensagemDto {

	@Nonnull
	private Long usuarioId;
	@Nonnull
	private String mensagem;
}
