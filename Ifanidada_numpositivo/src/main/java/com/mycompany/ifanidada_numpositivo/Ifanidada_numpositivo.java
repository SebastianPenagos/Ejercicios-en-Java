
package com.mycompany.ifanidada_numpositivo;

import java.util.Scanner;

public class Ifanidada_numpositivo {

    public static void main(String[] args) {

        float numero;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite el numero: ");
        numero = teclado.nextFloat();
        
        if(numero == 0){
           System.out.println("Es un numero null ");
	   System.out.println("Fin del programa...!! ");
           System.exit(0);
        }        
        if(numero % 1 == 0){
           System.out.println("Es un numero entero ");
        }
        else
        {
           System.out.println("Es un numero decimal ");   
        }
        
        if(numero > 0)
        {    
           System.out.println("Es un numero positivo ");
        }
        else
        {
           System.out.println("Es un numero negativo ");
        }
    }
}


