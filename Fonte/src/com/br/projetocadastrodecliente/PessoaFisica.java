package com.br.projetocadastrodecliente;

import java.util.Date;

public class PessoaFisica extends DadosAdicionais {
	//Atributos
	private String Nome;
	private String Sobrenome;
	private String Email;
	private String CPF;
	private String RG;
	private String EstadoCivil;
	private String Naturalidade;
	private String EstadoNaturalidade;
	private String NomeDoPai;
	private String NomeDaMae;
	private char Sexo;
	private String Escolaridade;
	private String Profissao;
	private String RegimeDeBens;
	private String Anotacoes;
	private Date DataNascimento;
	
	//Metodos get e set.
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getSobrenome() {
		return Sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getEstadoCivil() {
		return EstadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		EstadoCivil = estadoCivil;
	}
	public String getNaturalidade() {
		return Naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		Naturalidade = naturalidade;
	}
	public String getEstadoNaturalidade() {
		return EstadoNaturalidade;
	}
	public void setEstadoNaturalidade(String estadoNaturalidade) {
		EstadoNaturalidade = estadoNaturalidade;
	}
	public String getNomeDoPai() {
		return NomeDoPai;
	}
	public void setNomeDoPai(String nomeDoPai) {
		NomeDoPai = nomeDoPai;
	}
	public String getNomeDaMae() {
		return NomeDaMae;
	}
	public void setNomeDaMae(String nomeDaMae) {
		NomeDaMae = nomeDaMae;
	}
	public char getSexo() {
		return Sexo;
	}
	public void setSexo(char sexo) {
		Sexo = sexo;
	}
	public String getEscolaridade() {
		return Escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		Escolaridade = escolaridade;
	}
	public String getProfissao() {
		return Profissao;
	}
	public void setProfissao(String profissao) {
		Profissao = profissao;
	}
	public String getRegimeDeBens() {
		return RegimeDeBens;
	}
	public void setRegimeDeBens(String regimeDeBens) {
		RegimeDeBens = regimeDeBens;
	}
	public String getAnotacoes() {
		return Anotacoes;
	}
	public void setAnotacoes(String anotacoes) {
		Anotacoes = anotacoes;
	}
	public Date getDataNascimento() {
		return DataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		DataNascimento = dataNascimento;
	}
}
