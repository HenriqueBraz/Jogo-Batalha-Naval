
/**
 * Escreva a descrição da classe Navio aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Random;
public class Navio
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int nx0;
    private int nx1;
    private int nx2;
    private int ny0;
    private int ny1;
    private int ny2;
    private int nd;

    /**
     * COnstrutor para objetos da classe Navio
     */
    public Navio()
    {
        // inicializa variáveis de instância
        nx0 = 0;
        nx1 = 0;
        nx2 = 0;
        ny0 = 0;
        ny1 = 0;
        ny2 = 0;
        nd = 0;
    }
    
    
    //setters
    /**
     * Coloca Navio no tabuleiro
     */
    
    public void setNavio(){
    
            
                  Random gerador = new Random();
                  nx0 = gerador.nextInt(10)+3;  
                  ny0 = gerador.nextInt(10)+3;
                  nd = gerador.nextInt(4); 
                  
                  if (nd == 0){nx1 = nx0; ny1 = ny0+1; nx2 = nx0; ny2 = ny0+2;}
                  else if (nd == 1){nx1 = nx0; ny1 = ny0-1; nx2 = nx0; ny2 = ny0-2;}
                  else if (nd == 2){ny1 = ny0; nx1 = nx0+1; ny2 = ny0; nx2 = nx0+2;}
                  else if (nd == 3){ny1 = ny0; nx1 = nx0-1; ny2 = ny0; nx2 = nx0-2;}
                       
    }
    
    // getters
    
    public int getNd(){
    
         return nd;
    
    }
    
    public int getNavio ( int n){
    
             int lista[] = new int[6];
             
             lista [0] = nx0;
             lista [1] = ny0;
             lista [2] = nx1;
             lista [3] = ny1;
             lista [4] = nx2;
             lista [5] = ny2;
             
    
             return lista[n];
    
    } 
}
