
package com.mycompany.num_digitos;

import java.util.Scanner;


public class Num_digitos {

    public static void main(String[] args) {
        
             Scanner teclado = new Scanner(System.in);
        
        int numero =0;
        
        System.out.println("Ingrese un número: ");
        numero = teclado.nextInt();
        
        if (numero >= 1 && numero <= 9){
            
            System.out.println("Este número contiene un digito: " + numero);
            
        }
        else if (numero >= 10 && numero <= 99){
            
            System.out.println("Este número contiene dos digitos: " + numero);
            
        }
        else {
            
            System.out.println("El número no contiene uno ni dos digitos: " + numero);
            
        }
        
    }
}
