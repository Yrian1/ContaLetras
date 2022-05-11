package negocio;

public class Texto {
	private String texto;
	private int vogais,
		consoantes, 
		outros;
	
	public Texto(String texto) {
		this.texto=texto.toLowerCase();
		this.vogais=this.consoantes=this.outros=0;
		contaLetras();
	}
	
	private void contaLetras(){
		for(int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if(Character.isLetter(c)) {
				if(c=='a' || c=='e' || c=='i' || c=='o' || c=='o') {
					vogais++;
				}
					else {
						consoantes++;
					}
			}
			else {
				outros++;
			}
		
		}
	}
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public int getVogais() {
		return vogais;
	}
	public void setVogais(int vogais) {
		this.vogais = vogais;
	}
	public int getConsoantes() {
		return consoantes;
	}
	public void setConsoantes(int consoantes) {
		this.consoantes = consoantes;
	}
	public int getOutros() {
		return outros;
	}
	public void setOutros(int outros) {
		this.outros = outros;
	}
	
}
