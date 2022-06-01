package application;

import java.util.Locale;
import java.util.Scanner;

import util.Bill;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Sexo [M / F]: ");
		char gender = sc.next().charAt(0);
		while (gender != 'F' && gender != 'M') {
			System.out.print("Opção invalida! Digite novamente [M / F]: ");
			 gender = sc.next().charAt(0);
		}
		System.out.print("Quantidade de cerveja: ");
		int beer = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		int softDrink = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		int barbecue = sc.nextInt();
		
		
		double totalConsumption = Bill.feeding(beer, barbecue, softDrink);
		double coverValue = Bill.cover(totalConsumption);
		double titcketValue = Bill.ticket(gender);
		double amount = Bill.total(totalConsumption, coverValue, titcketValue);
		
		System.out.println();
		System.out.printf("Consumo = R$%.2f%n", totalConsumption);
		if (coverValue == 0.0) {
			System.out.println("Isento de Couvert");	
		}else {
			System.out.printf("Couvert = R$ %.2f%n", coverValue);
		}
		System.out.printf("Ingresso = R$ %.2f%n ", titcketValue);
		System.out.println();
		System.out.printf("Valor a pagar = R$ %.2f%n ", amount);
		
		
		sc.close();

	}

}
