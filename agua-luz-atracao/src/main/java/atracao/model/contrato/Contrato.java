package atracao.model.contrato;

import java.util.Date;

import atracao.model.cadastro.Pessoa;
import atracao.model.cadastro.Servico;

//java beans
public class Contrato {
	private long numeroProtocolo;
	private Pessoa cadastro;
	private Date dataHora;

	private Servico servico; // aqui será armazenado o enum do Serviço (água ou luz)

	// getter do Serviço
	public Servico getServico() {
		return servico;
	}

	// setter do Serviço
	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public long getNumeroProtocolo() {
		return numeroProtocolo;
	}

	public void setNumeroProtocolo(long numeroProtocolo) {
		this.numeroProtocolo = numeroProtocolo;
	}

	public Pessoa getCadastro() {
		return cadastro;
	}

	public void setCadastro(Pessoa cadastro) {
		this.cadastro = cadastro;
	}

	@Override
	public String toString() {
		return "Contrato [numeroProtocolo=" + numeroProtocolo + ", dataHora=" + dataHora + "]";
	}

}
