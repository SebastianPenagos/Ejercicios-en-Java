

package com.mycompany.ingreso_datos_personales;

//Librerias:
import java.util.Scanner;

public class Ingreso_datos_personales {

    public static void main(String[] args) {
        
         //Variables:  
        String Nombre1,Nombre2, Apellido1, Apellido2, NombreInstituto, Curso, Id, Edad;
        
        //Teclado Virtual:
        Scanner teclado = new Scanner(System.in);
        
        
        //Ingreso de datos:
        System.out.print("Introduce tu primer nombre :");
        Nombre1 = teclado.next();
        
        System.out.print("Introduce tu Segundo nombre :");
        Nombre2 = teclado.next();
        
        System.out.print("Introduce tu primer apellido :");
        Apellido1 = teclado.next();
        
        System.out.print("Introduce tu segundo apellido :");
        Apellido2 = teclado.next();
        
        System.out.print("Introduce tu documento :");
        Id = teclado.next();
        
        System.out.print("Introduce tu edad :");
        Edad = teclado.next();
        
        System.out.print("Introduce el nombre de tu instituto :");
        NombreInstituto = teclado.next();
        
        System.out.print("Introduce grado :");
        Curso = teclado.next();
        
        //Imprimir datos:
        System.out.println("Este es el primer nombre :" + Nombre1);
        System.out.println("Este es el segundo nombre :" + Nombre2);
        System.out.println("Este es el primer apellido :" + Apellido1);
        System.out.println("Este es el segundo apellido :" + Apellido2);
        System.out.println("Este es el documento :" + Id);
        System.out.println("Esta es la edad :" + Edad);
        System.out.println("Este es el nombre del instituto :" + NombreInstituto);
        System.out.println("Este es el grado :" + Curso);
        
    }
}
