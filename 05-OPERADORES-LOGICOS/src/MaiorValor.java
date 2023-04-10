
public class MaiorValor {
	
	int n1 = 5;
	int n2 = 3;
	int n3 = 8;
	
	public void testaMaior1(){
		
		if(n1 > n2){
			if(n1 > n3) {
				System.out.println("O maior valor é " + n1);
			}
		}
		
		if(n2 > n1){
			if(n2 > n3) {
				System.out.println("O maior valor é " + n2);
			}
		}
		
		if(n3 > n1){
			if(n3 > n1) {
				System.out.println("O maior valor é " + n3);
			}
		}
		
	}
	
	public void testaMaior2(){
		
		if( (n1 > n2) && (n1 > n3)) {
			System.out.println("O maior valor é " + n1);
		}
		
		if( (n2 > n1) && (n2 > n3)) {
			System.out.println("O maior valor é " + n2);
		}
		
		if( (n3 > n1) && (n3 > n2)) {
			System.out.println("O maior valor é " + n3);
		}
		
	}

}
