
/**
 * Escreva a descrição da classe AppBatalhaNaval aqui.
 * 
 * @author Henrique Keller Braz 
 * @version 05/11/2017
 */
import java.util.Scanner;
public class AppBatalhaNaval{
    
    public static void main (String Args[]){
        
        Scanner in = new Scanner ( System.in);
        
        System.out.print ("\f");
        
          Tabuleiro jogo = new Tabuleiro();
           
          jogo.setNavio();
          jogo.setNavio();
          jogo.setAviao();
          jogo.setAviao();
          jogo.setAviao();
          jogo.setSub();
          jogo.setSub();
          jogo.setSub();
          jogo.setSub();
        
    
        System.out.print ( jogo.getTabuleiro (15,15));
          
        
          System.out.print (jogo);
          
          
          
        
          
    
    
    
    
    }

}
