package clases;

public class ClaseHijaDeposito extends ClasePadreAbstracta{
    
    public ClaseHijaDeposito(){}
   
    @Override
    public void Transacciones(){
        System.out.println("Cuanto vas a depositar.?: ");
        Deposito();
        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        System.out.println("--------------------------------");
        System.out.println("Depositaste: "+deposito);
        System.out.println("Tu saldo actual es: "+getSaldo());
        System.out.println("--------------------------------");
    }
    
}
