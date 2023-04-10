
public class OperadoresLogicos {
	
	public void testesLogicos() {
		
		/*
		&& - OPERADOR LÓGICO "E" OU "AND"
		|| - OPERADOR LÓGICO "OU" OU "OR"
		*/
		
		
		int idadeInicio = 18;
		int idadeFim = 90;
		boolean resultado;
		
		/*
		VERIFICA SE A IDADE DA PESSOA ESTÁ ENTRE 18 E 90 ANOS:
		*/
		resultado = (idadeInicio >= 18) && (idadeFim <= 90);
		System.out.println("RESULTADO: " + resultado);
		
		idadeInicio = 17;
		resultado = (idadeInicio >= 18) && (idadeFim <= 90);
		System.out.println("RESULTADO: " + resultado);
		
		/*
		VERIFICA SE A IDADE DA PESSOA ESTÁ ENTRE 18 OU 90 ANOS:
		*/
		
	    idadeInicio = 17;
		resultado = (idadeInicio >= 18) || (idadeFim <= 90);
		System.out.println("RESULTADO: " + resultado);
		
		idadeInicio = 17;
		idadeFim = 99;
		resultado = (idadeInicio >= 18) || (idadeFim <= 90);
		System.out.println("RESULTADO: " + resultado);
		
	}

}
