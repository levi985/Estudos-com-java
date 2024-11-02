package com.mycompany.estudos;

import java.util.Scanner;

public class Estudos {

    public static void main(String[] args) {
        Scanner nada = new Scanner(System.in);

        // Solicita ao usuário entrada da temperatura em graus Celsius
        System.out.println("Insira a temperatura em graus Celsius: ");
        float C = nada.nextFloat();

        // Converte a temperatura para outras escalas
        float F = C * 1.8f + 32;
        float K = C + 273.15f; 
        float Re = C * 0.8f; 
        float Ra = C * 1.8f + 32 + 459.67f;

        // Imprime uma linha decorativa
        System.out.println("=".repeat(40));

        // Exibe a temperatura em várias escalas
        System.out.println("A temperatura em Fahrenheit é: " + F);
        System.out.println("A temperatura em Kelvin é: " + K);
        System.out.println("A temperatura em Réaumur é: " + Re);
        System.out.println("A temperatura em Rankine é: " + Ra);
        System.out.println("A temperatura inserida é: " + C + "°");

        // Imprime outra linha decorativa
        System.out.println("=".repeat(40));
    }
}
