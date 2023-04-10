
import java.util.Scanner;

public class LoopWhileSentinela {
	
		public void loopWhile1() {
			
			String sentinela = "";
			Scanner objScanner = new Scanner(System.in);
			
			while (!sentinela.equalsIgnoreCase("sair")){
				System.out.println("Digite sair para encerrar o programa");
				sentinela = objScanner.next();
				System.out.println("Você digitou:" + sentinela);
			}
			
			System.out.println("Obrigado por usar o programa!");
			objScanner.close();
			System.exit(0);
			
		}
		
}
