
public class EstruturaDecisaoTexto {
	
	//É VAZIO
	public void testeVazio(String texto) {
		if(texto.isEmpty()){
			System.out.println("DIGITE UM TEXTO");
		}else {
			System.out.println("OBRIGADO POR DIGITAR O TEXTO");
		}
	}
	
	//É IGUAL
	public void testeIgual(String texto1, String texto2) {
		if(texto1.equalsIgnoreCase(texto2)) {
			System.out.println("OS TEXTOS SÃO IGUAIS");
		}else {
			System.out.println("OS TEXTOS SÃO DIFERENTES");
		}
	}
	
	//QUAL O TAMANHO
	public void contador(String texto) {
		
		int tamanho = texto.length();
		
		if(tamanho >= 8) {
			System.out.println("A SENHA É VALIDA");
		}else {
			System.out.println("A SENHA NÃO É VALIDA");
		}
		
	}

}
