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
		
	 
		
		System.out.println("Como vc gostaria de contribuir? Digite 1 - ado��o; 2 - doa��o; 3 - den�ncia." );
		
		
		contribuicao = input.nextInt(); 
		if ( contribuicao == 1) {
			//adocao gato e cachorro
			//classe ADO�ÇO ---> 
			//CLASSE CADASTRO ---> Cadastro(); --- > roda a classe cadastro
			
			System.out.println("Voc� gostaria de adotar um ? Digite 1 - dog;  2 - cat.");
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

            System.out.println("De que forma voc� gostaria de contribuir? Digite 1 para Brinquedos, 2 para Ra��o e 3 para Dinheiro: ");
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

