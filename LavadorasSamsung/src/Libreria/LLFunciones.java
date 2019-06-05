/*
 * Clase en java de un labarropas
 */
package Libreria;

/**
 *
 * @author ®The BlackPeople
 */
public class LLFunciones {
   private int kilos = 0, tipoDeRopa = 0; 
   private boolean llenadoCompleto = false, lavadoCompleto = false;
   private boolean secadoCompleto = false;
    
    public LLFunciones(int kilos, int tipoDeRopa){
        this.kilos = kilos; 
        this.tipoDeRopa = tipoDeRopa;
        
        
   } 
    
    private void LLenado(){
        if(getKilos() <= 12){
               llenadoCompleto = true;
               System.out.println("LLenando..");
                System.out.println("Llenado Completo");
        
        } else{ System.out.println("La carga de ropa es muy pesada");
        }
    
    }
    
    private void Lavado(){
     LLenado();
     if(llenadoCompleto == true){
         if(tipoDeRopa == 1){
             System.out.println("Ropa blanca / Lavado suave");
             System.out.println("Lavando...");
             lavadoCompleto = true;
            }else if (tipoDeRopa == 2){
                System.out.println("Ropa de color/ lavado intenso");
                System.out.print("Lavando...");
                lavadoCompleto = true;
            } else { System.out.println("El tipo de ropa no esta disponible");
             System.out.println("Se lavara como Ropa de Color / Lavando..");
                        lavadoCompleto = true;
                        
                        }
        }

    }
    
    private void Secado(){
        Lavado();
        if(lavadoCompleto == true){
            System.out.println("Secando..");
            secadoCompleto = true;
        }
        
    }
    
    public void CicloFinalizado(){
        Secado();
        if(secadoCompleto == true){
            System.out.println("Tu ropa esta lista.!");
        }
    }
    
    public int gettipoDeRopa(){
        return tipoDeRopa; 
    
    } 
    public void settipoDeRopa(int tipoDeRopa){
        this.tipoDeRopa = tipoDeRopa;
        
    
    }

    /**
     * @return the kilos
     */
    public int getKilos() {
        return kilos;
    }

    /**
     * @param kilos the kilos to set
     */
    public void setKilos(int kilos) {
        this.kilos = kilos;
    }
}
