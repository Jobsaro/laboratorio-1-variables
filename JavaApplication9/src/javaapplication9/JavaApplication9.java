/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

import java.util.Scanner;


/**
 *
 * @author DELL
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        String nombre;
        double horastrabajomensual;
        double tarifaH;
       
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = scanner.next();
        
        System.out.print("Ingrese las Horas de trabajo mensual: ");
        horastrabajomensual = scanner.nextDouble();
        
        System.out.print("Ingrese la tarifa por Hora: ");
        tarifaH = scanner.nextDouble();
        
         // Cálculo del salario semanal
        double salarioSemanal = (horastrabajomensual / 4) * tarifaH; 

        // Mostrar la boleta del empleado
        System.out.println("\n----- Boleta del Empleado -------");
        System.out.println("Nombre del Empleado: " + nombre);
        System.out.println("Horas de Trabajo Mensual: " + horastrabajomensual);
        System.out.printf("Tarifa por Hora: Lps. %.2f\n", tarifaH);
        System.out.printf("Salario del Empleado Semanal: Lps. %.2f\n", salarioSemanal);
    }
}
