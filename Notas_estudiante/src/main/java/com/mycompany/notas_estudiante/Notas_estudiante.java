package com.mycompany.notas_estudiante;

import java.util.Scanner; 

public class Notas_estudiante {

    public static void main(String[] args) {
        
        String Nombre, apellido;
        float nota1, nota2, nota3, promedio=0;
        float porcentaje15, porcentaje30, porcentaje50=0;
        
      
      
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        Nombre = teclado.nextLine();
        System.out.println("Apellido");
        apellido = teclado.nextLine();
        
        System.out.println("Ingrese su primera nota: ");
        nota1 = teclado.nextFloat();
        System.out.println("Ingrese su segunda nota: ");
        nota2 = teclado.nextFloat();
        System.out.println("Ingrese su tercera nota: ");
        nota3 = teclado.nextFloat();
        
        porcentaje15= (nota1*15)/100;
        porcentaje30= (nota2*30)/100;
        porcentaje50= (nota3*50)/100;

        promedio = (porcentaje15+porcentaje30+porcentaje50);
        
        System.out.println("El promedio del alumno: " + Nombre + " " + apellido + "es: " + promedio);
        
        if(promedio >= 3){          
            System.out.println("Usted paso la materia con: " + Nombre + " " + apellido + "es: "  + promedio);
           
            
        }
        else if (promedio < 3) {
            
            System.out.println("Usted perdio la materia con: " + Nombre + " " + apellido + "es: " + promedio);
            
        }
        
    }
}
