package br.com.gen.projeto;
import java.util.Scanner;

public class larParaTodos {

	public static void main(String[] args) {
		
		int contribuicao = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("===================================================================");
		System.out.println("=                       LAR PARA TODOS                /)-/)       =");
		System.out.println("=                 Seu novo companheirinho esta aqui  (>^.^<)      =");
		System.out.println("===================================================================");
		
	 
		
		System.out.println("\nComo vc gostaria de contribuir? \nDigite 1 - adoção; 2 - doação; 3 - denúncia." );
		
		
		contribuicao = input.nextInt(); 
		if ( contribuicao == 1) {
			//adocao gato e cachorro
			//classe ADO�ÇO ---> 
			//CLASSE CADASTRO ---> Cadastro(); --- > roda a classe cadastro
			
			System.out.println("Voce gostaria de adotar um ? Digite 1 - cachorro;  2 - gato");
			int animal = input.nextInt(); 
			System.out.println("Qual seu tipo de moradia ? Digite 1 - apartamento; 2 - casa");
			int moradia = input.nextInt();
			System.out.println("Voce prefere um animal? Digite 1 - filhote; 2 - adulto");
			int filhoteAdulto = input.nextInt();
			
			Adocao ad = new Adocao();
			System.out.println(ad.tipoAnimalMoradia(moradia, animal, filhoteAdulto)); 
			
		} else if (contribuicao == 2) {
			//doa��o
			// CLASSE DOA�ÇO ---> METODOS
			
			Doacao d1 = new Doacao();

            System.out.println("\nDe que forma você gostaria de contribuir? \nDigite 1 - Brinquedos; 2 - Ração; 3 - Dinheiro: ");
            d1.setTipoDoacao(input.nextInt());

            int i = (Integer) d1.getTipoDoacao();

            System.out.println(Doacao.tipo(i));
			
		}
		
		else {
			//denuncia
			
			//CLASSE DENUNCIA
			// cai em uma mensagem com informa��es pra denuncia 
		}
		
		   
	}

}

