
package clases;

import javax.swing.JOptionPane;

public class Cola {
    private Nodo inicioCola, finalCola;
    
    String Cola = "";
    
    public Cola(){
        inicioCola = null;
        finalCola = null;
    }

public boolean ColaVacia(){
    if (inicioCola == null) {
           return true;
        
    }else{
        return false;
    }
}

//metodo insertar a la cola

public void Insertar(int informacion){
    Nodo nuevoNodo = new Nodo();
    
    nuevoNodo.informacion = informacion;
    nuevoNodo.siguiente = null;

    if (ColaVacia()) {
        inicioCola = nuevoNodo;
        finalCola = nuevoNodo;
        
    } else { finalCola.siguiente = nuevoNodo;
        finalCola = nuevoNodo;
    }
}

// metodo para extraer de la cola
   public int Extraer(){
       if(!ColaVacia()){
           int informacion = inicioCola.informacion;
           
           if (inicioCola == finalCola) {
               inicioCola = null;
               finalCola = null;
           }else{
               inicioCola = inicioCola.siguiente;
           }
           return informacion;
       }else{
       return Integer.MAX_VALUE;
       }
   }
public void MostrarContenido(){
    Nodo recorrido = inicioCola;
    String colaInvertida =" ";
    
    while(recorrido != null){
        Cola += recorrido.informacion+" ";
        recorrido = recorrido.siguiente;
    }
    String cadena[] = Cola.split(" ");
    
    for(int i = cadena.length -1; i >= 0; i--){
        colaInvertida += " "+cadena[i];    
    }

    JOptionPane.showMessageDialog(null, colaInvertida );
    Cola="";
}

}
