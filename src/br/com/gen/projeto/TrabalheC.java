package br.com.generation.projetojava;

import java.util.Scanner;

public class TrabalheC {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner leia = new Scanner(System.in);
			
	
		
		String nome;
		String senha;
		String cpf;
		String telefone;
		int animalPref;
		
		
		
		
		System.out.println("Olá bem vindo a 'Um lar para todos' ! ");
		Thread.sleep(2000);
		
		
		System.out.println("Vamos começar fazendo seu cadastro... ");
		Thread.sleep(2000);
		
		
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		
		
		System.out.println("Digite seu cpf: ");
		cpf = leia.next();
		
		
		System.out.println("Digite seu telefone para contato: ");
		telefone = leia.next();
		
		
		System.out.println("Tem preferência de trabalhar com um animal específico? ");
		System.out.println("Digite 1 se prefere gato ou 2 pra cachorro");
		animalPref = leia.nextInt();
		
		if(animalPref == 1) {
			
			
			System.out.println("Parabens " + nome + " Você escolheu trabalhar com gato");
			
		}
		
		else {
			
			System.out.println("Parabens " + nome + " Você escolheu trabalhar com cachorro");
			
		}
			
		
		System.out.println(nome + ", entraremos em contato através do numero de telefone: " + telefone);
			
		
		
		
		
		
	}

}
