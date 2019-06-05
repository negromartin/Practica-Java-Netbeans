
package clases;
import java.util.Scanner;


public abstract class ClasePadreAbstracta{
  protected int transacciones, retiro , deposito;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);
    
    public void Operaciones(){
        int bandera = 0;
        int seleccion = 0;
        do{
        do{
            System.out.println("Porfavor selecciones una opcon:");
            System.out.println("    1. Consulta de saldo");
            System.out.println("    2. Retiro de efectivo");
            System.out.println("    3. Deposito de efectivo");
            System.out.println("    4. Salir");
            seleccion = entrada.nextInt();
            if(seleccion >= 1 && seleccion <= 4){
                bandera = 1;
            
            
            
            } else{
                System.out.println("--------------------------------------");
                System.out.println("Opcion no disponible, eliga uno nuevo");}
           
            
        }while(bandera == 0);
        if(seleccion == 1){ 
            ClasePadreAbstracta consulta = new ClaseHijaConsulta();
                consulta.Transacciones();
            
        
            
        } else if(seleccion == 2){
           ClasePadreAbstracta retiro1 = new ClaseHijaRetiro();
           retiro1.Transacciones();
        }else if(seleccion == 3){
        
            ClasePadreAbstracta deposito1 = new ClaseHijaDeposito();
            deposito1.Transacciones();
        } else if(seleccion == 4){ 
            System.out.println("---------------------");
            System.out.println("Gracias vuelva pronto");
            System.out.println("---------------------");
            bandera = 2;}
        
        }while(bandera != 2);        
    }
    
// Metodo para retiro    
public void Retiro(){
    retiro = entrada.nextInt();
    
}

// Metodo para Deposito
public void Deposito(){
    deposito = entrada.nextInt();
    
}

// Metodo abstracto para el polimorfismo
public abstract void Transacciones();

//Metodos setter y getter de saldo

public int getSaldo(){
return saldo;
}

public void setSaldo(int saldo){
    this.saldo = saldo;
    
  
}
}
