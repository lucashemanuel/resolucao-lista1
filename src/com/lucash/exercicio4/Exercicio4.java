package com.lucash.exercicio4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Variaveis var = new Variaveis();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		var.setNome(scanner.nextLine());
		
		System.out.println("Digite seu sal�rio: ");
		var.setSalario(scanner.nextFloat());
		
		System.out.println("Digite o total de vendas feitas: ");
		var.setVendas(scanner.nextFloat());
		
		var.setSalarioFinal((var.getVendas() * 0.15) + var.getSalario());
		
		System.out.println("=========================================");
		
		System.out.println("Nome: " + var.getNome());
		System.out.println("Sal�rio sem comiss�o: " + var.getSalario());
		System.out.println("Sal�rio final: " + var.getSalarioFinal());

	}

}
