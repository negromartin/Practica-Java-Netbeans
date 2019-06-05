/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class ClasePadre {
    protected int valor1, valor2, resultado;
    Scanner entrada = new Scanner(System.in);
    
// este metodo pide los valores al usuario 
   
    public void pedirDatos(){
         System.out.print("Dame el primer valor: ");
         valor1 = entrada.nextInt();
         
         System.out.println("Dame el segundo valor: ");
         valor2 = entrada.nextInt();
         
     
     }

     // este metodo muestra el resultado
    
    public void MostrarResultado(){
        System.out.println(resultado);
    } 
}
