package com.lucash.exercicio6;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Variaveis var = new Variaveis();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		var.setA(scanner.nextInt());
		
		System.out.println("Digite o valor de B: ");
		var.setB(scanner.nextInt());
		
		var.setFalsoA(var.getB());
		var.setFalsoB(var.getA());
		
		System.out.println("========================");
		
		
		System.out.println("Novo valor de A é: " + var.getFalsoA());
	
		System.out.println("Novo valor de B é: " + var.getFalsoB());
	}

}
