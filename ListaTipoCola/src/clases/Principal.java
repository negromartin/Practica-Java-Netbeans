
package clases;

import javax.swing.JOptionPane;


public class Principal {
 
 public static void main(String [] args){   
 int opcion=0, nodoinformacion = 0;
 
 Cola cola = new Cola();
 
 do{
     try{
         opcion = Integer.parseInt(JOptionPane.showInputDialog(null," 1) Para insertar\n\n"
                                                               +"2) Para eliminar\n\n"
                                                               +"1) Para mostrar valores\n\n"
                                                               + "4)Salir\n\n"));
    
     switch(opcion){
         case 1: nodoinformacion = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el valor"));
         cola.Insertar(nodoinformacion);
         
            break;
         case 2:
             if(!cola.ColaVacia()){
                 JOptionPane.showMessageDialog(null,"Se elimino el nodo : "+cola.Extraer());
             
             }else{ JOptionPane.showMessageDialog(null, "La cola esta vacia");}
             break;
         case 3: 
             cola.MostrarContenido();
             break;
         case 4:
             opcion = 4;
             break;
         default:
             JOptionPane.showMessageDialog(null,"Opcion No Disponible");
             break;
     
     
     }
     
     }catch(NumberFormatException e){
     
     }
    
    
}while(opcion != 4);
 }
 
}