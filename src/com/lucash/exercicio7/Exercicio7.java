package com.lucash.exercicio7;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Variaveis var = new Variaveis();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("===== Convers�o de Celsius para Farenheit =====");
		
		System.out.println("Digite a temperatura em C�: ");
		var.setCelsius(scanner.nextDouble());
		
		var.setFarenheit((9 * var.getCelsius() + 160) / 5);
		System.out.println("A temperatura em F� �: " + var.getFarenheit());
		
	}

}
