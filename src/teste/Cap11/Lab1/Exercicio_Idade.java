package teste.Cap11.Lab1;

import java.util.Scanner;

public class Exercicio_Idade {

	public static void main(String[] args) {
		
		try {
		Scanner sc = new Scanner(System.in);		// método nextLine
		System.out.print("Digite o ano do seu Nascimento : ");
		String datanasc = sc.nextLine();
		
					
		int ano = Integer.parseInt(datanasc);
		int idade = 2022 - ano;	
		System.out.println("Parabens pelos seus " + idade + " anos de idade");
		
		}catch(NumberFormatException e){
			System.out.println("valor digitado Invalido");
			e.printStackTrace();
		}
	}
}
