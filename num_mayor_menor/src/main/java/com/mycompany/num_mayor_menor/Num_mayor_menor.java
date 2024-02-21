

package com.mycompany.num_mayor_menor;

import java.util.Scanner;

public class Num_mayor_menor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero1, numero2 =0;
        
        System.out.println("Ingrese su primer número: ");
        numero1 = teclado.nextInt();
        
        System.out.println("Ingrese su segundo número: ");
        numero2 = teclado.nextInt();
        
        
        if (numero1 > numero2){
            System.out.println("Este es el número mayor: " + numero1);
            System.out.println("Este es el número menor: " + numero2);

        }
        else if (numero2 > numero1){
            System.out.println("Este es el número mayor: " + numero2);
            System.out.println("Este es el número menor: " + numero1);

        }
        else if (numero1 == numero2){
            System.out.println("Estos números son iguales: " + numero1 + " , " + numero2);
        }   
    }
}

