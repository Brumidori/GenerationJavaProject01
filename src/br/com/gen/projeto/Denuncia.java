package br.com.gen.projeto;





	import java.util.Random;
	import javax.swing.JOptionPane;

	public class Denuncia {
		int aux;

		void dados() {

			String nome = JOptionPane.showInputDialog("digite seu nome");
			System.out.println(nome);
			System.out.println(nome);
			String endereco = JOptionPane.showInputDialog("digite endereço da denuncia");
			System.out.println(endereco);

			String fatos = JOptionPane.showInputDialog("resuma os fatos ");
			System.out.println(fatos);
			String fimDenuncia = JOptionPane.showInputDialog("se estiver tudo certo com sua denuncia digite 1 ");
			aux = Integer.parseInt(fimDenuncia);
		}

		void status() {
			System.out.println("Maus-tratos aos animais é crime:");
			System.out.println("ligue 181 ou 0800-600-6428 ou utilize o site da Depa  ");
			System.out.println(" Delegacia Eletrônica de Proteção Animal");

		}

		void protocolo() {

			Random aleatorio = new Random();
			int valor = aleatorio.nextInt(50000);

			if (aux == 1) {

				System.out.println("seu protocolo é " + valor);

			}

		}

	}





