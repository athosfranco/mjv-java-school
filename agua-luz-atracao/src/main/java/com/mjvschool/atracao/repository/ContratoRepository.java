package com.mjvschool.atracao.repository;

import java.util.ArrayList;
import java.util.List;

import com.mjvschool.atracao.model.contrato.Contrato;

//ESTA CLASSE FUNCIONA COMO UM "BANCO DE DADOS FAKE". AQUI SERÃO ARMAZENADOS OS CONTRATOS CRIADOS PELA APLICAÇÃO DURANTE A SUA EXECUÇÃO.

public class ContratoRepository {

	// lista de contratos
	private List<Contrato> contratos = new ArrayList<Contrato>();

	// método pra gravar um contrato na lista
	public void gravar(Contrato contrato) {
		contratos.add(contrato);
	}

	// método para listar todos os contratos
	public List<Contrato> listarTodos() {
		return contratos;
	}
}
