
package clases;


public class ClaseHijaConsulta extends ClasePadreAbstracta{
   
    public ClaseHijaConsulta(){}


 
    @Override
    public void Transacciones(){
        System.out.println("--------------------------------");
        System.out.println("Tu saldo actual es: "+getSaldo());
        System.out.println("---------------------------------");
        
    
    }
    
}
