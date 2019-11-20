package com.br.projetocadastrodecliente;

public class Endereco {
//Atributos
	private String TipoLogradouro;
	private String Logradouro;
	private int Numero;
	private String Bairro;
	private String Complemento;
	private String Cidade;
	private String Estado;
	private String CEP;
	private String LatitudeMaps;
	private String LongitudeMaps;
	
	//Metodos get e set
	public String getTipoLogradouro() {
		return TipoLogradouro;
	}
	public void setTipoLogradouro(String tipoLogradouro) {
		TipoLogradouro = tipoLogradouro;
	}
	public String getLogradouro() {
		return Logradouro;
	}
	public void setLogradouro(String logradouro) {
		Logradouro = logradouro;
	}
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	public String getComplemento() {
		return Complemento;
	}
	public void setComplemento(String complemento) {
		Complemento = complemento;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	public String getLatitudeMaps() {
		return LatitudeMaps;
	}
	public void setLatitudeMaps(String latitudeMaps) {
		LatitudeMaps = latitudeMaps;
	}
	public String getLongitudeMaps() {
		return LongitudeMaps;
	}
	public void setLongitudeMaps(String longitudeMaps) {
		LongitudeMaps = longitudeMaps;
	}
}
