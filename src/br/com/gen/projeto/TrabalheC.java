package br.com.gen.projeto;

import java.util.Scanner;

public class TrabalheC{
		
		private String nome;
		private String telefone;
		private int animalPref;

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public int getAnimalPref() {
			return animalPref;
		}

		public void setAnimalPref(int animalPref) {
			this.animalPref = animalPref;
		}
		
		public void cadastro () {
			Scanner leia = new Scanner(System.in);
			System.out.println("Vamos começar fazendo seu cadastro... ");
			System.out.println("Digite seu nome: ");
			this.nome = leia.next();
			System.out.println("Digite seu telefone para contato: ");
			this.telefone = leia.next();
			System.out.println("Tem preferência de trabalhar com um animal específico? ");
			System.out.println("Digite 1 se prefere gato ou 2 pra cachorro");
			this.animalPref = leia.nextInt();
			leia.close();
		}
}
