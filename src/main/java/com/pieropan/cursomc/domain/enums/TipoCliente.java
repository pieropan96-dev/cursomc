package com.pieropan.cursomc.domain.enums;

import java.util.Objects;

public enum TipoCliente {
	PESSOAFISICA(1, "Pessoa Física"), PESSOAJURIDICA(2, "Pessoa Jurídica");

	private TipoCliente(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	private int codigo;
	private String descricao;

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public static TipoCliente toEnum(Integer cod) {
		if (Objects.isNull(cod)) {
			return null;
		}

		for (TipoCliente tipo : TipoCliente.values()) {
			if (cod.equals(tipo.getCodigo())) {
				return tipo;
			}
		}
		return null;
	}
}