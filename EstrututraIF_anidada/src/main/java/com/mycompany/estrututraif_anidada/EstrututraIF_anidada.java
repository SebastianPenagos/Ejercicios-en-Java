
package com.mycompany.estrututraif_anidada;

import java.util.Scanner;

public class EstrututraIF_anidada {

    public static void main(String[] args) {
  
        Scanner teclado = new Scanner(System.in);
        
        
        int nota1, nota2, nota3;
        
        System.out.print("Ingrese su primer número: ");
        nota1=teclado.nextInt();
        System.out.print("Ingrese su segundo número: ");
        nota2=teclado.nextInt();
        System.out.print("Ingrese su tercer número: ");
        nota3=teclado.nextInt();
        
        int promedio = (nota1 + nota2 + nota3)/3;
        
        if (promedio >= 7){
            System.out.println("Excelente");
        }
        else if (promedio >= 4) {
            System.out.println("Regular");
        }
            else {
                    System.out.println("Reprobado");
                 }
        }
    }

