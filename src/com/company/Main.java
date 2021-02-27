package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //
        int numero1 = 87;
        System.out.println("Valor de numero 1 es: " + numero1);
        int numero2 = 25;
        System.out.println("Valor de número 2 es: " + numero2 + "\n");

        //Operaciones
        int Suma = numero1 + numero2;
        System.out.println("Suma: " + Suma);
        int Resta = numero1 - numero2;
        System.out.println("Resta: " + Resta);
        int Multiplicación = numero1 * numero2;
        System.out.println("Multiplicación: " + Multiplicación);
        float División = (float) numero1 / (float) numero2;
        System.out.println("División: " + División);
        float Módulo = (float) numero1 % (float) numero2;
        System.out.println("Módulo: " + Módulo);

    }
}
