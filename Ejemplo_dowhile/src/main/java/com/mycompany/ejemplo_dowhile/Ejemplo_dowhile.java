
package com.mycompany.ejemplo_dowhile;

import java.util.Scanner;

public class Ejemplo_dowhile {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int valor;
        
        do {
            System.out.print("Ingrese un valor entre 0 y 999 (0 para finalizar): ");
            valor = teclado.nextInt();
            
            if (valor >= 100){
                System.out.println("Tiene 3 digitos.");
            }
            else if (valor >= 10){
                System.out.println("Tiene 2 digitos.");
            }
            else{
                System.out.println("Tiene un digito.");
            }
        }
      
    } 
    while (valor != 0);
    {
    System.out.println("Termino el programa...");
    }
}
