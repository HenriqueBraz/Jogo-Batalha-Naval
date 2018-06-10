
/**
 * Escreva a descrição da classe Aviao1 aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Random;
public class Aviao
{
    Tabuleiro tabuleiro = new  Tabuleiro();
    private int  a1x;
    private int  a2x;
    private int  a1y;
    private int  a2y;
    private int  cx;
    private int  cy;
  

    /**
     * Construtor para objetos da classe Aviao1
     */
    public Aviao()
    {
        a1x=0;
        a2x=0;
        a1y=0;
        a2y=0;
        cx=0;
        cy=0;
    }
    
    //setters
    /**
     * Coloca Aviao no tabuleiro
     */
    
    public void setAviao(){
    
                   
                  Random gerador = new Random();
                  a1x = gerador.nextInt(11)+2;  
                  a1y = gerador.nextInt(11)+2;
                                            
                  a2x = a1x;
                  a2y = a1y +2;
                           
                  cx = a1x + 1;
                  cy = a1y + 1;                                 
                   
    }
    
    //geters
    public int getAviao(int n){
       
       int lista[] = new int[6];
       lista [0] = a1x;
       lista [1] = a1y;
       lista [2] = a2x;
       lista [3] = a2y;
       lista [4] = cx;
       lista [5] = cy;
                         
        return lista[n]; 
         
    
    }

}
