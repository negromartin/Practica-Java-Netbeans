
package listaTipoPila;

import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {
        int opcion = 0, nodo = 0;
        Pila pila =new Pila();
         do {            
             try{
             
             opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "\n"
                     + "1 Insetar un nodo\n"
                     + "2 Eliminar un nodo\n"
                     + "3 ¿La pila esta vacia?\n"
                     + "4 ¿Cual es el ultimo valor ingresado en la pila? \n"
                     + "5 ¿Cuantos nodos tiene la pila?\n"
                     + "6 Vaciar Pila\n"
                     + "7 Mostrar contenido de la pila\n"
                     + "8 Salir\n\n"));
             
             switch(opcion){
                 case 1:
                     nodo = Integer.parseInt(JOptionPane.showInputDialog(pila));
                     pila.InsertarNodo(nodo);
                     break;
                 case 2:
                     if (!pila.PilaVacia()) {
                         
                         JOptionPane.showInputDialog(null,"Se ha eliminado un nodo de la pila"
                         
                                        +pila.EliminarNodo());
                         
                     }
                     
                     break;
                 case 3:
                     
                     if(pila.PilaVacia()){
                         JOptionPane.showInputDialog(null,"La pila esta Vacia");
                     
                     }else{
                     JOptionPane.showInputDialog(null,"La pila no esta vacia");
                     }
                     break;
                 case 4:
                     if(!pila.PilaVacia()){
                         JOptionPane.showInputDialog(null,"El ultimo elemento de la pila: "+pila.MostrarUValor());
                     
                     }
                     break;
                 case 5:
                     JOptionPane.showInputDialog(null,"La pila contiene: "+pila.TamañoPila());
                     break;
                 case 6:
                     if(!pila.PilaVacia()){
                         pila.VaciarPila();
                         JOptionPane.showInputDialog(null,"Se ha vaciado la pila");
                     
                     }else{
                        JOptionPane.showInputDialog(null,"la pila ya esta vacia");
                     }
                     break;
                 case 7:
                     pila.MostrarValores();
                     break;
                 case 8:
                     opcion = 8;
                     break;
                 default:
                     JOptionPane.showInputDialog(null,"Opcion incorrecta");
                     break;
                     
             }        
             
             }catch(NumberFormatException e){
             
             }
             
             
        } while (opcion != 8);
    }
    
}
