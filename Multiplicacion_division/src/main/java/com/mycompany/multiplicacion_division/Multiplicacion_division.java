/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multiplicacion_division;

import java.util.Scanner;

public class Multiplicacion_division {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int numero1, numero2 =0;
        int suma, resta, multiplicacion, division = 0;
        
        
        System.out.println("Ingrese su primer número: ");
        numero1 = teclado.nextInt();
        
        System.out.println("Ingrese su segundo número: ");
        numero2 = teclado.nextInt();
        
        if (numero1 > numero2){
            
            suma = numero1 + numero2;
            resta = numero1 - numero2;
            System.out.println("Este es el número mayor: " + numero1);
            System.out.println("Esta es la suma de los números: " + suma);
            System.out.println("Esta es la diferencia entre los dos números: " + resta);
            
        }
        else if (numero2 > numero1){
        
         multiplicacion = numero2 * numero1;
         division = (numero2/numero1);
         System.out.println("Esta es la multiplicacion de los números: " + multiplicacion);
         System.out.println("Esta es la division de los números: " + division);
         
        } 
    }
}
