
package listaTipoPila;

import javax.swing.JOptionPane;

public class Pila {
  
    private Nodo ultimoValorIngresado;
    int tamaño = 0;
    String Lista = "";
    
    public Pila(){
        ultimoValorIngresado = null;
        tamaño = 0;
    }

    // metodo para saber cuando la pila esta vacia
    
    public boolean PilaVacia(){
        return ultimoValorIngresado == null;
    }
    // meotodo para insertar un nodo
    public void InsertarNodo(int nodo){
        Nodo nuevoNodo = new Nodo(nodo);
        nuevoNodo.siguiente = ultimoValorIngresado;
        ultimoValorIngresado = nuevoNodo;
    
    }
    //metodo para eliminar un nodo
    public int EliminarNodo(){
        int auxiliar = ultimoValorIngresado.informacion;
        ultimoValorIngresado = ultimoValorIngresado.siguiente;
        tamaño--;
        return auxiliar;
    }

    public int MostrarUValor(){
        return ultimoValorIngresado.informacion;
    }

    public int TamañoPila(){
        return tamaño;
    }

    public void VaciarPila(){
        while(!PilaVacia()){
            EliminarNodo();
        
        }
    }

    public void MostrarValores(){
        Nodo recorrido = ultimoValorIngresado;
        
        while(recorrido != null){
            Lista += recorrido.informacion + "\n";
            recorrido = recorrido.siguiente;
        }
    JOptionPane.showMessageDialog(null, Lista);
    Lista = "";    
         
    }
    
}
