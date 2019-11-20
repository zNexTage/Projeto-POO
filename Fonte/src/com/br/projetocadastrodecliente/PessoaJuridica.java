package com.br.projetocadastrodecliente;

import java.util.Date;

public class PessoaJuridica extends DadosAdicionais {
	//Atributos
	private String RazaoSocial;
	private String NomeFantasia;
	private String CNPJ;
	private String InscricaoEstadual;
	private boolean IsentoInscricaoEstadual;
	private String AtividadePrincipal;
	private String NomeAdministrador;
	private Date DataAberturaEmpresa;
	private String Anotacoes;
	
	//Metodos get e set
	public String getRazaoSocial() {
		return RazaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		RazaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return NomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		NomeFantasia = nomeFantasia;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public String getInscricaoEstadual() {
		return InscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		InscricaoEstadual = inscricaoEstadual;
	}
	public boolean isIsentoInscricaoEstadual() {
		return IsentoInscricaoEstadual;
	}
	public void setIsentoInscricaoEstadual(boolean isentoInscricaoEstadual) {
		IsentoInscricaoEstadual = isentoInscricaoEstadual;
	}
	public String getAtividadePrincipal() {
		return AtividadePrincipal;
	}
	public void setAtividadePrincipal(String atividadePrincipal) {
		AtividadePrincipal = atividadePrincipal;
	}
	public String getNomeAdministrador() {
		return NomeAdministrador;
	}
	public void setNomeAdministrador(String nomeAdministrador) {
		NomeAdministrador = nomeAdministrador;
	}
	public Date getDataAberturaEmpresa() {
		return DataAberturaEmpresa;
	}
	public void setDataAberturaEmpresa(Date dataAberturaEmpresa) {
		DataAberturaEmpresa = dataAberturaEmpresa;
	}
	public String getAnotacoes() {
		return Anotacoes;
	}
	public void setAnotacoes(String anotacoes) {
		Anotacoes = anotacoes;
	}
}
