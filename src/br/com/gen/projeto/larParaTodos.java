package br.com.gen.projeto;
import java.util.Scanner;

public class larParaTodos {

	public static void main(String[] args) {
		
		int contribuicao = 0, animal = 0 ;
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
			
			System.out.println("Você gostaria de adotar um ? Digite 1 - dog;  2 - cat.");
			 animal = input.nextInt(); 
			 if (animal == 1) {
				 //Classe dogs ---> Cachorro();
				 
			 } else {
				 //CLASSE GATO --> Gato();			 }
			 }
			
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

