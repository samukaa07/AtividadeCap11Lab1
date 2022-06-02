package teste.Cap11.Lab1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class gravacao {

	public static void main(String[] args) {

		
		try { 
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite uma frase qualquer");
			String texto = sc.nextLine();
			
		
			PrintWriter writer = new PrintWriter("C:\\doc1.txt");
			writer.println(texto);
			writer.close();
			
			
		}catch(IOException e){
			System.out.println("Falha ao carregar as informações");
			e.printStackTrace();
			
		}

	}

}
