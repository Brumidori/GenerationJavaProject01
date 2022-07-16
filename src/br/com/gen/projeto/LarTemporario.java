package br.com.gen.projeto;

import java.util.Scanner;

public class LarTemporario {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		Usuario usuarioVariavel = new Usuario();
		
		System.out.println("Qual seu nome?\n");
		usuarioVariavel.setNomeUsuario(tc.nextLine());
		System.out.println("Você deseja adotar um gato ou cachorro? \n");
		usuarioVariavel.setTipoAnimal(tc.nextLine());
		System.out.println("Digite o local seguro que voçê proverá \n ");
		usuarioVariavel.setLocalSeguro(tc.nextLine());
		
		
		System.out.println("Seu nome é: " + usuarioVariavel.getNomeUsuario());
		System.out.println("Você deseja um " + usuarioVariavel.getTipoAnimal());
		System.out.println(" O seu local será: " + usuarioVariavel.getLocalSeguro());
		

	}

}
