
package polimorfismo;


public class ClasePrincipal {
 public static void main(String args[]){
     OperacionesClasePadre object = new ClaseHijaSuma();
     
     object.pedirDatos();
     object.Operaciones();
     object.MostrarResultado();
     
     OperacionesClasePadre object2 = new ClaseHijaResta();
      object2.pedirDatos();
      object.Operaciones();
      object.MostrarResultado();
     
     
 }   
}
