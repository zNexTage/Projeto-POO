/*Autor: Christian de Oliveira Bueno
 * Data Inicio: 19/11/2019
 * Data Fim:
 * */
package com.br.projetocadastrodecliente;

//Classe Principal
public class Main {

	public static void main(String[] args) {
		// Instancia a classe pessoa fisica
		PessoaFisica pessoaFisica = new PessoaFisica();
		
		//Instancia a classe pessoa fisica
		ClienteFisica clienteFisica = new ClienteFisica();
		ClienteJuridico clienteJuridico = new ClienteJuridico();
		
		//Instancia a classe dos fornecedores
		FornecedorFisica fornecedorFisica = new FornecedorFisica();
		ForncedorJuridico forncedorJuridico = new ForncedorJuridico();
	}

}
