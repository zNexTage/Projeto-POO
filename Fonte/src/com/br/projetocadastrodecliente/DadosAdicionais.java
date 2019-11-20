package com.br.projetocadastrodecliente;

public class DadosAdicionais extends Endereco {
	//Atributos
	private String TelefoneResidencial;
	private String TelefoneComercial;
	private String CelularPessoal;
	private String CelularComercial;
	private boolean PossuiWhatsapp;
	private String EmailPessoal;
	private String EmailComercial;
	private String Site;
	private boolean PossuiWhatsappComercial;
	
	//Metodos get e set	
	public String getTelefoneResidencial() {
		return TelefoneResidencial;
	}
	public void setTelefoneResidencial(String telefoneResidencial) {
		TelefoneResidencial = telefoneResidencial;
	}
	public String getTelefoneComercial() {
		return TelefoneComercial;
	}
	public void setTelefoneComercial(String telefoneComercial) {
		TelefoneComercial = telefoneComercial;
	}
	public String getCelularPessoal() {
		return CelularPessoal;
	}
	public void setCelularPessoal(String celularPessoal) {
		CelularPessoal = celularPessoal;
	}
	public String getCelularComercial() {
		return CelularComercial;
	}
	public void setCelularComercial(String celularComercial) {
		CelularComercial = celularComercial;
	}
	public boolean isPossuiWhatsapp() {
		return PossuiWhatsapp;
	}
	public void setPossuiWhatsapp(boolean possuiWhatsapp) {
		PossuiWhatsapp = possuiWhatsapp;
	}
	public String getEmailPessoal() {
		return EmailPessoal;
	}
	public void setEmailPessoal(String emailPessoal) {
		EmailPessoal = emailPessoal;
	}
	public String getEmailComercial() {
		return EmailComercial;
	}
	public void setEmailComercial(String emailComercial) {
		EmailComercial = emailComercial;
	}
	public String getSite() {
		return Site;
	}
	public void setSite(String site) {
		Site = site;
	}
	public boolean isPossuiWhatsappComercial() {
		return PossuiWhatsappComercial;
	}
	public void setPossuiWhatsappComercial(boolean possuiWhatsappComercial) {
		PossuiWhatsappComercial = possuiWhatsappComercial;
	}
}
