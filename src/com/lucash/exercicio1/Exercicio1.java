package com.lucash.exercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Variaveis var = new Variaveis();
		
		
		System.out.println("=== Calcular soma de dois n�meros ===");
		System.out.println("Digite um n�mero: ");
		var.setNumber1(scanner.nextFloat()); 
		
		System.out.println("Digite outro n�mero: ");
		var.setNumber2(scanner.nextFloat());
		
		var.setResult(var.getNumber1() + var.getNumber2());
		System.out.println("O resultado da soma foi: " + var.getResult());

	}

}
