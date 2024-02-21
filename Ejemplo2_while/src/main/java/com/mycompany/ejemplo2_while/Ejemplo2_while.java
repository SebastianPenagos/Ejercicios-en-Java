
package com.mycompany.ejemplo2_while;

import java.util.Scanner;

public class Ejemplo2_while {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int x, suma, valor, promedio;
        
        x = 1;
        suma = 0;
        
        while (x <= 10){
            System.out.print("Ingrese un valor: ");
            valor = teclado.nextInt();
            suma = suma + valor;
            x = x + 1;
        }
        
        promedio = suma / 10;
        System.out.println("La suma de los 10 valores es: " + suma);
        System.out.println("El promedio es: " + promedio);
    }
}
