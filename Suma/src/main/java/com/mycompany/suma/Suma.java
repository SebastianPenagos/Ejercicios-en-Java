
package com.mycompany.suma;

import java.util.Scanner;


public class Suma {

    public static void main(String[] args) {
                
        int Suma, num1, num2;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce tu primer número: ");
        num1 = teclado.nextInt();
        
        System.out.print("Introduce tu segundo número: ");
        num2 = teclado.nextInt();
       
        Suma = (num1 + num2);
        
        System.out.println("Esta es la suma de los números: " + Suma);
        
    }
}
