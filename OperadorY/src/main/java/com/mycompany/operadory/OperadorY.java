

package com.mycompany.operadory;

import java.util.Scanner;

public class OperadorY {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int num1, num2, num3;
        
        System.out.println("Ingrese su primer valor: ");
        num1 = teclado.nextInt();
        System.out.println("Ingrese su segundo valor: ");
        num2 = teclado.nextInt();
        System.out.println("Ingrese su tercer valor: ");
        num3 = teclado.nextInt();
        
        if (num1 > num2 && num3 < num1)
        {
            
            System.out.println("Este es el número mayor: "+num1);
            
        }
        else if(num2 > num3)
        {
         
            System.out.println("Este es el número mayor: "+num2);
            
        }
        else{
            
            System.out.println("Este es el número mayor: "+num3);

        }
    }
}
