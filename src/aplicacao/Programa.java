package aplicacao;

import java.util.Scanner;

import utilitarios.ConversorDeMoeda;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Preço atual do dolar: $ ");
		double precoDolar = sc.nextDouble();
		System.out.print("Quantidade de dolares desejada: $ ");
		double quantidadeDeDolaresDesejada = sc.nextDouble();
		System.out.printf("Valor a ser pago em reais: R$ %.2f%n", 
				ConversorDeMoeda.conversorDeReaisParaDolares(precoDolar,
				quantidadeDeDolaresDesejada));
		sc.close();
	}
}
