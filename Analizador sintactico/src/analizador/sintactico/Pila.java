
package analizador.sintactico;


public class Pila {
    private Nodo ultimoValorIngresado;
    
    public Pila(){
        ultimoValorIngresado = null;
    }

public void Insertar(char valor){
    Nodo nuevoNodo = new Nodo();
    
    nuevoNodo.informacion = valor;
    
    if(ultimoValorIngresado == null){
        nuevoNodo.siguiente = null;
        ultimoValorIngresado = nuevoNodo;
      
    }else{
    nuevoNodo.siguiente = ultimoValorIngresado;
    ultimoValorIngresado = nuevoNodo;
    }
}

public char Extraer(){
    if(ultimoValorIngresado != null){
        
        char informacion = ultimoValorIngresado.informacion;
        ultimoValorIngresado = ultimoValorIngresado.siguiente;
        return informacion;
    }else{
        return Character.MAX_VALUE; }
    
}

public boolean PilaVacia(){
    return ultimoValorIngresado == null;
}
}
