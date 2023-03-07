public class ComparandoTextos {
	
	String nome1 = "CRISTIANO CORREA DE MORAES";
	String nome2 = "Carlos DRUMMOND DE ANDRADE";
	String nome3 = "";
	String nome4 = "Cristiano Correa de Moraes";
	
	public void TestesLogicos1(){
		
		boolean resultado;
		
		System.out.println("TESTE LÓGICO - STRINGS - isEmpty");
		resultado = this.nome1.isEmpty();
		System.out.println(resultado);
		
		resultado = this.nome3.isEmpty();
		System.out.println(resultado);
		
		System.out.println("");
		
		System.out.println("TESTE LÓGICO - STRINGS - equals");
		resultado = nome2.equals(nome1);
		System.out.println(resultado);
		
		System.out.println("");
		
		System.out.println("TESTE LÓGICO - STRINGS - equals e equalsIgnoreCase");
		System.out.println("equals");
		resultado = nome1.equals(nome4);
		System.out.println(resultado);

		System.out.println("equalsIgnoreCase");
		resultado = nome1.equalsIgnoreCase(nome4);
		System.out.println(resultado);
		
		System.out.println("");
		
	}
			
}
