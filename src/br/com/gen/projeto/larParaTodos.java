package br.com.generation.projetojava;
import java.util.Scanner;

public class larParaTodos {

	public static void main(String[] args) {
		
		int contribuicao = 0, animal = 0 ;
		int tipoDoacao = 0;
		Scanner input = new Scanner(System.in);
		
		//
		
		System.out.println("Como vc gostartia de contribuir? Digite 1 - Adoção; 2 - Doação; 3 - Denúncia.");
		contribuicao = input.nextInt(); 
		if ( contribuicao == 1) {
			//adocao gato e cachorro
			//classe ADOÇAO ---> 
			//CLASSE CADASTRO ---> Cadastro(); --- > roda a classe cadastro
			
			System.out.println("Você gostaria de adotar um cat ou dog? Digite 1 - dog; 2 - cat.");
			 animal = input.nextInt(); 
			 if (animal == 1) {
				 //Classe dogs ---> Cachorro();
				 
			 } else {
				 //CLASSE GATO --> Gato();			 }
			 }
			
		} else if (contribuicao == 2) {
			
			Doacao d1 = new Doacao();
			
			System.out.println("De que forma você gostaria de contribuir? Digite 1 para Brinquedos, 2 para Ração e 3 para Dinheiro: ");
			d1.setTipoDoacao(input.nextInt());
	
			int i = (Integer) d1.getTipoDoacao();
	
			System.out.println(Doacao.tipo(i));
			
		}
		
		else {
			//denuncia
			
			//CLASSE DENUNCIA
		}
		
				
	}

}
