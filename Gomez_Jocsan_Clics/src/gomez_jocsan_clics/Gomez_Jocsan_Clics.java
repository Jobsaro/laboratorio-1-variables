/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gomez_jocsan_clics;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Gomez_Jocsan_Clics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada desde el teclado
        Scanner input = new Scanner(System.in);

        // Variables para la cantidad de clics y costo por clic
        int clics = 0;
        double costoClic = 0.0;

        // Solicitar la cantidad de clics
        System.out.print("Ingresa la cantidad de clics: ");
        clics = input.nextInt();

        // Determinar el costo por clic según la cantidad de clics
        if (clics == 60) {
            costoClic = 0.30;
        } else if (clics == 100) {
            costoClic = 0.25;
        } else if (clics == 20) {
            costoClic = 0.80;
        } else {
            System.out.println("Cantidad de clics no válida para los costos especificados.");
            input.close();
            return; // Salir del programa si no es una cantidad válida
        }

        // Calcular el costo total
        double costoTotal = clics * costoClic;

        // Calcular el costo promedio por clic (en este caso es el mismo que el costo por clic)
        double costoPromedio = costoTotal / clics;

        // Calcular el ISV (16%)
        double ISV = costoTotal * 0.16;
        double totalConISV = costoTotal + ISV;

        // Imprimir los resultados con dos decimales
        System.out.println("Costo total: $" + String.format("%.2f", costoTotal));
        System.out.println("Costo promedio por clic: $" + String.format("%.2f", costoPromedio));
        System.out.println("Total con ISV (16%): $" + String.format("%.2f", totalConISV));

        // Cerrar el escáner
        input.close();
    }
}