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
	 resposta = "\nToda forma de contribuir é válida, temos certeza que seu brinquedo fará a vida de um Pet mais feliz." + "\nPara entregar o brinquedo visite nossa sede no endereço X, das 8h00 ãs 17h00";
	} else if (b == 2) {
	 resposta = "\nTodos precisam se alimentar e temos certeza que os Pets ficarão muito felizes com esta refeição!" + "\nPara entregar a ração visite nossa sede no endereço X, das 8h00 às 17h00";
	} else if (b == 3){
	resposta = "\nSua contribuição é muito importante para a manutenção do nosso trabalho!" 
			+  "\nPara doar você pode fazer uma transferência para a nossa conta bancária ou pix no QR ao fim da página:"
			+ "\n" +"\nDados Bancários: \nC.C. 0000001 \nAgência 00001 \nTitular: Lar Para Todos";
	}
		 
	return resposta; 
		 
    }  	
}

