package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crian��o do Cliente
		Cliente pedro = new Cliente();
		pedro.setNome("Pedro Alves Cabral");
		pedro.setCpf("522365365");
		pedro.setTelefone("(11)5262-6569");
		pedro.setCep("063656-120");
		
		//Criar conta Pedro
		Conta contaPedro = new Conta();
		contaPedro.setTitular(pedro);
		contaPedro.depositar(100);
		contaPedro.setNumero("111-0");
		
		System.out.println(contaPedro.getTitular().getTelefone());
		System.out.println(contaPedro.getTitular().getNome());
		contaPedro.getTitular().setNome("Pedro da Silva");
		System.out.println(contaPedro.getTitular().getNome());
	}

}
