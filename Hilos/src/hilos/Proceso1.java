
package hilos;

public class Proceso1 extends Thread {
    int condicion;
    @Override
        public void run(){
            for(int i=0; i<= condicion; i++){
                System.out.println("Proceso1");
                
                try{
                Proceso1.sleep(1000);
                }catch(InterruptedException e){
                    System.out.println("Error dentro la clase Proceso1");
                }
                
            
            }
            System.out.println(" ");
        }
        public void ValorDeLaCondicion(int valor){
        this.condicion = valor;
        
            
        }
    
}
