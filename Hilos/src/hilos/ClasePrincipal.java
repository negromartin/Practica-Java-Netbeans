
package hilos;


public class ClasePrincipal {
    public static void main(String args[]){
       Proceso1 hilo1 = new Proceso1();
       Thread hilo2 = new Thread(new Proceso2());
       Proceso1 hilo3 = new Proceso1();
       hilo1.ValorDeLaCondicion(5);
       hilo3.ValorDeLaCondicion(10);
       
       hilo1.start();
       
   // el meotod sleep necesita de un try{} catch(InterruptedException e){}    
       try{
        hilo1.sleep(1000);
    }catch(InterruptedException e){
           System.out.println("Error en el hilo1");
    }
       hilo3.start();
       hilo3.stop();// mata el hilo y se deja de ejecutar 
       try{
        hilo3.sleep(1000);
       }catch(InterruptedException e){
           System.out.println("Error en el hilo3");
       }
            
            
        

    }       


}
