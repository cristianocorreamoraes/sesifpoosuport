
package mediaarraylist;

import java.util.ArrayList;

public class Media {

    ArrayList lista = new ArrayList();
    double soma = 0;
    double media = 0;
    
    public double calculaMedia(){
    
        lista.add(3.0);
        lista.add(5.0);
        lista.add(7.0);
        lista.add(10.0);
        
        int cont = 0;
        
        while(cont < lista.size()){
        
            soma += (double) lista.get(cont);
            cont++;
            
        }
        
        media = soma / 4; 
    
        return media;
        
    }
    
}