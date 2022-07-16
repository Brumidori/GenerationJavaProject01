package br.com.gen.projeto;

public class Adocao {
	
	private String nomePessoa;
	private int moradia; // moradia 1 - apartamento , moradia 2 -casa
	private String filhoteAdulto[] = {"filhote", "adulto"};
	private String tipoDoAnimal[] = {"cachorro", "gato"};
	

	public String tipoAnimalMoradia(int moradia, int filhoteAdulto, int tipoDoAnimal) {
		this.moradia = moradia;
		
		
		return "Seu animal ideal é " + this.tipoDoAnimal[tipoDoAnimal -1] + " " + this.filhoteAdulto[filhoteAdulto - 1] + ".";
			
	}
	
	public String getNomePessoa() {
		return nomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	public int getMoradia() {
		return moradia;
	}
	public void setMoradia(int moradia) {
		this.moradia = moradia;
	}

	public String[] getFilhoteAdulto() {
		return filhoteAdulto;
	}

	public void setFilhoteAdulto(String[] filhoteAdulto) {
		this.filhoteAdulto = filhoteAdulto;
	}

	public String[] getTipoDoAnimal() {
		return tipoDoAnimal;
	}

	public void setTipoDoAnimal(String[] tipoDoAnimal) {
		this.tipoDoAnimal = tipoDoAnimal;
	}
	
	
	
	
	
	
}
