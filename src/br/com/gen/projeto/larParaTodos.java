package br.com.gen.projeto;
import java.util.Scanner;

public class larParaTodos {

	public static void main(String[] args) {
		
		int t = 1;
		
		do {
			int contribuicao = 0, animal = 0 ;
			Scanner input = new Scanner(System.in);
			
			System.out.println("\n===================================================================");
			System.out.println("=                       LAR PARA TODOS                /)-/)       =");
			System.out.println("=                 Seu novo companheirinho esta aqui  (>^.^<)      =");
			System.out.println("===================================================================");
			
		 
			System.out.println("\nOlá, bem vinde ao Lar para todos! \nDigite '0' para sair.");
			System.out.println("\nComo vc gostaria de contribuir? \nDigite 1 - Adocao; 2 - Doacao; 3 - Denuncia." );
			contribuicao = input.nextInt(); 
			
			
			switch ( contribuicao) {
			case 1:
				//adocao gato e cachorro
				//classe ADO�ÇO ---> 
				//CLASSE CADASTRO ---> Cadastro(); --- > roda a classe cadastro
				
				System.out.println("Voce gostaria de adotar um ? Digite 1 - dog;  2 - cat.");
				 animal = input.nextInt(); 
				 if (animal == 1) {
					 //Classe dogs ---> Cachorro();
					 
				 } else {
					 //CLASSE GATO --> Gato();			 }
				 }
				 
				 break;
				
			case 2: // inicio laco doacao
				//cria objeto d1
				
				Doacao d1 = new Doacao();
				
				//imprime pergunta forma contribuir
	            System.out.println("\nDe que forma voce gostaria de contribuir? \nDigite 1 - Brinquedos; 2 - Racao; 3 - Dinheiro: ");
	            d1.setTipoDoacao(input.nextInt()); //utiliza o Scanner e setter para inputar dado Inteiro

	            int i = (Integer) d1.getTipoDoacao(); // transforma inteiro em String (método é String)

	            System.out.println(Doacao.tipo(i)); // imprime return da Classe Doacao método 'tipo'
	            
				break;
				
			case 3:
				//denuncia
				
				//CLASSE DENUNCIA
				// cai em uma mensagem com informa��es pra denuncia
				break;
			default:
				t =0;
			}
			
		} while (t != 0);
		
		   
	}

}

