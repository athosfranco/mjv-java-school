package com.mjvschool.atracao.repository;

import java.util.ArrayList;
import java.util.List;

import com.mjvschool.atracao.model.contrato.Contrato;

//ESTA CLASSE FUNCIONA COMO UM "BANCO DE DADOS FAKE". AQUI SER�O ARMAZENADOS OS CONTRATOS CRIADOS PELA APLICA��O DURANTE A SUA EXECU��O.

public class ContratoRepository {

	// lista de contratos
	private List<Contrato> contratos = new ArrayList<Contrato>();

	// m�todo pra gravar um contrato na lista
	public void gravar(Contrato contrato) {
		contratos.add(contrato);
	}

	// m�todo para listar todos os contratos
	public List<Contrato> listarTodos() {
		return contratos;
	}
}
