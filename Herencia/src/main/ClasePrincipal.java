
package main;
   import operaciones.ClaseHijaResta;
   import operaciones.ClaseHijaSuma;
    

public class ClasePrincipal {
    
    public static void main(String args[]){
    
        ClaseHijaSuma object = new ClaseHijaSuma();
    
     object.pedirDatos();  
     object.Sumar();
       System.out.println("El resultado de la suma es: ");
    
     object.MostrarResultado();  
    
    ClaseHijaResta object2 = new ClaseHijaResta();
    1
    object2.Restar();
        System.out.println("El resultado de la resta es:");
     object2.MostrarResultado();
    }
    
}
