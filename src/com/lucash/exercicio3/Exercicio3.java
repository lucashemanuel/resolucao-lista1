package com.lucash.exercicio3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Variaveis var = new Variaveis();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a distância total percorrida: ");
		var.setDistancia(scanner.nextFloat());
		
		System.out.println("Digite o total de combustível gasto: ");
		var.setCombustivel(scanner.nextFloat());
		
		
		var.setConsumo(var.getDistancia() / var.getCombustivel());
		System.out.println("O consumo médio do veículo foi: " + var.getConsumo());
		
	}

}
