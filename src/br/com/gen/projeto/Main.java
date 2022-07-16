package br.com.gen.projeto;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		//variaveis e classe Scanner
		int t = 1;
		int contribuicao = 0 ;

		Scanner input = new Scanner(System.in);
		
		//do-while do programa
		do {
			System.out.println("\n===================================================================");
			System.out.println("=                       LAR PARA TODOS                /)-/)       =");
			System.out.println("=                 Seu novo companheirinho esta aqui  (>^.^<)      =");
			System.out.println("===================================================================");
			

			System.out.println("\nOla, bem vinde ao Lar para todos! \nDigite '0' para sair.");
			System.out.println("\nComo vc gostaria de contribuir? \nDigite 1 - Adocao; 2 - Doacao; 3 - Lar Temporário; 4 - Denuncia." );
			contribuicao = input.nextInt(); 
			
			
			switch (contribuicao) {
			case 1: //laco adocao
				
				System.out.println("Voce gostaria de adotar um ? Digite 1 - cachorro;  2 - gato");
				int animal = input.nextInt(); 
				System.out.println("Qual seu tipo de moradia ? Digite 1 - apartamento; 2 - casa");
				int moradia = input.nextInt();
				System.out.println("Voce prefere um animal? Digite 1 - filhote; 2 - adulto");
				int filhoteAdulto = input.nextInt();
				
				Adocao ad = new Adocao();
				System.out.println(ad.tipoAnimalMoradia(moradia, animal, filhoteAdulto)); 
				
				 break;
				
			case 2: // laco doacao
				//cria objeto d1
				
				Doacao d1 = new Doacao();
				
				//imprime pergunta forma contribuir
	            System.out.println("\nDe que forma voce gostaria de contribuir? \nDigite 1 - Brinquedos; 2 - Racao; 3 - Dinheiro: ");
	            d1.setTipoDoacao(input.nextInt()); //utiliza o Scanner e setter para inputar dado Inteiro


	            int i = (Integer) d1.getTipoDoacao(); // transforma inteiro em String (metodo e String)

	            System.out.println(Doacao.tipo(i)); // imprime return da Classe Doacao metodo 'tipo'
	            
				break;
				
			case 3://laco lar temporario
				
				Scanner tc = new Scanner(System.in);
				Usuario usuarioVariavel = new Usuario();
				
				System.out.println("Qual seu nome?\n");
				usuarioVariavel.setNomeUsuario(tc.nextLine());
				System.out.println("Voce deseja adotar um gato ou cachorro? \n");
				usuarioVariavel.setTipoAnimal(tc.nextLine());
				System.out.println("Digite o local seguro que voçê provera \n ");
				usuarioVariavel.setLocalSeguro(tc.nextLine());
				
				
				System.out.println("Seu nome e: " + usuarioVariavel.getNomeUsuario());
				System.out.println("Voce deseja um " + usuarioVariavel.getTipoAnimal());
				System.out.println(" O seu local sera: " + usuarioVariavel.getLocalSeguro());
				
				
				
				break;
				
			default:
				t =0;
			}
			
		
		
		} while (t != 0);
		input.close();
	}

}

