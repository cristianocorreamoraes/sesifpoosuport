
public class LoopDoWhile {
	
	public void loopDo1() {
	
		int cont = 0;
		
		do {
			System.out.println("VALOR DO CONTADOR: " + cont);
			cont++;
		}while(cont < 10);
	
	}
	
	public void loopDo2(int limite) {
		
		int cont = 1;
		
		do {
			System.out.println("VALOR DO CONTADOR: " + cont);
			cont++;
		}while(cont < limite);
	
	}
}
