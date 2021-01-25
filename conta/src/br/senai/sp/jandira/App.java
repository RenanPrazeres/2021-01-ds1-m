package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {

		
		Conta contaDaAna = new Conta();
		Conta contaDoJoao = new Conta();
		
//		contaDaAna.setTitular("Ana Gomes");
		contaDaAna.setNumero("111-0");
		contaDaAna.setTipo("abobora");
		contaDaAna.setAtiva (true);
		contaDaAna.setChequeEspecial (200);
		contaDaAna.depositar(100);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.depositar(30);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.sacar(50);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.sacar(500);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.sacar(50);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.sacar(80);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.depositar(100);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.getSaldo();
		
		double saldoDaConta = contaDaAna.getSaldo();
		
		System.out.println("**** O saldo da conta é " + saldoDaConta);
//		System.out.println("Nome: " + contaDaAna.getTitular());
		System.out.println("Numero: " + contaDaAna.getNumero());
		System.out.println("Tipo: " + contaDaAna.getTipo());
		System.out.println("Limite: " +contaDaAna.getChequeEspecial());
		
		Cliente Cliente = new Cliente();
		
		
		
		
		//*** ContaDoJoao
		
		contaDoJoao.setTipo("Corrente");
		
		
		
		
	}
	
	

}
