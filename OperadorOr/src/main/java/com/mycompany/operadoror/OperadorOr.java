

package com.mycompany.operadoror;

import java.util.Scanner;

public class OperadorOr {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int Dia, Mes, Año;
        
        System.out.println("Ingrese el dia: ");
        Dia = teclado.nextInt();
        System.out.println("Ingrese el número del mes: ");
        Mes = teclado.nextInt();
        System.out.println("Ingrese el año: ");
        Año = teclado.nextInt();
        
        if (Mes == 1 || Mes == 2 || Mes == 3){
            System.out.println("Esta fecha corresponde al primer trimestre");
        }
        else {
            System.out.println("Esta fecha no corresponde al primer trimestre");
        }
    }
}
