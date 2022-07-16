package br.com.gen.projeto;

public class Doacao {

private int tipoDoacao;

//getters and setters

public int getTipoDoacao() {
	return tipoDoacao;
}

public void setTipoDoacao(int tipoDoacao) {
	this.tipoDoacao = tipoDoacao;
}

// funcao - metodo

    static String tipo (int b) {
    	String resposta = "";
    	
    	if (b != 1 && b != 2 && b != 3 ) {
		resposta = "Número inválido. Por favor, reinice o programa.";
		}
		
		if (b == 1) {
			resposta = "\nToda forma de contribuir e valida, temos certeza que seu brinquedo fará a vida de um Pet mais feliz." + "\nPara entregar o brinquedo visite nossa sede no endereço X, das 8h00 as 17h00."
						+ "\nMuito Obrigade pela sua contribuicao! Continue navegando pelo nosso programa!";
		} else if (b == 2) {
			resposta = "\nTodos precisam se alimentar e temos certeza que os Pets ficarão muito felizes com esta refeição!" + "\nPara entregar a ração visite nossa sede no endereço X, das 8h00 as 17h00."
						+ "\nMuito Obrigade pela sua contribuicao! Continue navegando pelo nosso programa!";
		} else if (b == 3){
			resposta = "\nSua contribuicao é muito importante para a manutencao do nosso trabalho!" 
					+  "\nPara doar voce pode fazer uma transferencia para a nossa conta bancaria ou pix no QR ao fim da pagina:"
					+ "\n" +"\nTitular: Lar Para Todos \nDados Bancarios: \nC.C. 0000001 \nAgencia 00001 "
					+ "\nMuito Obrigade pela sua contribuicao! Continue navegando pelo nosso programa!";;
		}
		 
		return resposta; 
		 
    }  	
}

