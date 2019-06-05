
package lavadora1;
import Libreria.LLFunciones;
import java.util.Scanner;
/**
 *
 * @author Martin
 */
public class Lavadora_Uno {
    public static void main(String args[]){
       Scanner entrada = new Scanner(System.in);
       System.out.println("La rompa es blanca o de locor");
        System.out.println("Presiona 1 - ropa blanca / 2 -ropa color");
      int tiporopa = entrada.nextInt();
       
        
        
       
        System.out.println("Cuantos kilos de ropa?");
         int kilos = entrada.nextInt();
     
       LLFunciones lavadora = new LLFunciones(0,0);
       lavadora.setKilos(kilos);
       lavadora.settipoDeRopa(tiporopa);
        System.out.println("el tipo de ropa: "+lavadora.gettipoDeRopa());
        System.out.println("los kilos de ropas son: "+lavadora.getKilos());
        lavadora.CicloFinalizado();
    }
}
