package com.mycompany.traductorjava;

import java.util.Scanner;

public class TraductorJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los números
        System.out.println("Ingresa el primer número (0-100): ");
        int num1 = scanner.nextInt();

        System.out.println("Ingresa el segundo número (0-100): ");
        int num2 = scanner.nextInt();

        // Calcular la suma
        int suma = num1 + num2;

        // Convertir los números a palabras
        String num1Palabra = convertirNumeroAPalabra(num1);
        String num2Palabra = convertirNumeroAPalabra(num2);
        String sumaPalabra = convertirNumeroAPalabra(suma);

        // Imprimir los mensajes
        System.out.println("La suma de " + num1Palabra + " más " + num2Palabra + " es " + sumaPalabra);
        System.out.println("The sum of " + num1Palabra + " plus " + num2Palabra + " is " + sumaPalabra);
    }

    // Método para convertir un número en palabra (hasta 100)
    public static String convertirNumeroAPalabra(int numero) {
        if (numero < 0 || numero > 100) {
            throw new IllegalArgumentException("El número debe estar entre 0 y 100");
        }

        String[] unidades = {"", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String[] especiales = {"diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"};
        String[] decenas = {"", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
        
        if (numero == 100) {
            return "cien";
        } else if (numero >= 20) {
            return decenas[numero / 10] + (numero % 10 != 0 ? " y " + unidades[numero % 10] : "");
        } else if (numero >= 10) {
            return especiales[numero - 10];
        } else {
            return unidades[numero];
        }
    }
}
