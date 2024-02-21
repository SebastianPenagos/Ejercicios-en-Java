

package com.mycompany.ejemploifrestante;

import java.util.Scanner;

public class EjemploIfRestante {

    public static void main(String[] args) {
        
        //variables
        float numero;
        //teclado virtual
        Scanner teclado = new Scanner(System.in);
        //Ingreso de datos
        System.out.println("Digite el numero: ");
        numero = teclado.nextFloat();
        
        //Validaciones
        if (numero == 0){
            System.out.println("Es un numero null");
            System.out.println("Fin del programa");
            System.exit(0);
        }
        if (numero % 1 == 0){
            System.out.println("Es un numero entero");
        }
        else{
            System.out.println("Es numero compuesto");
        }
        if (numero > 0){
            System.out.println("Es numero positivo");
        }
        else{
            System.out.println("Es numero negativo");
        }    
    }
}
