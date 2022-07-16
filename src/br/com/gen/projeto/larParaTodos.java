package br.com.gen.projeto;
import java.util.Scanner;

public class larParaTodos {

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
			System.out.println("\nComo vc gostaria de contribuir? \nDigite 1 - Adocao; 2 - Doacao; 3 - Denuncia." );
			contribuicao = input.nextInt(); 
			
			
			switch (contribuicao) {
			case 1: //laco adocao
				
				
				
				
				 
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
				
			case 3://laco denuncia
				
				
				break;
				
			default:
				t =0;
			}
			
		
		
		} while (t != 0);
		input.close();
	}

}

