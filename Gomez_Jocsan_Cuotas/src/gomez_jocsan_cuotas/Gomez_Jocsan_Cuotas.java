/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gomez_jocsan_cuotas;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Gomez_Jocsan_Cuotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ingreso de datos
        System.out.print("Ingrese el monto del prestamo (HNL): ");
        double montoPrestamo = input.nextDouble();

        System.out.print("Ingrese el plazo de pago en meses: ");
        int plazoMeses = input.nextInt();

        System.out.print("Ingrese el interes mensual (en porcentaje): ");
        double interesMensual = input.nextDouble() / 100; 

        System.out.print("Ingrese la comision por cuota (HNL): ");
        double comisionCuota = input.nextDouble();

        System.out.print("Ingrese el porcentaje de seguro mensual (en porcentaje): ");
        double porcentajeSeguro = input.nextDouble() / 100; 

        //cuota mensual
        double seguroMensual = montoPrestamo * porcentajeSeguro; 
        double cuotaMensual = (montoPrestamo * (1 + interesMensual) / plazoMeses) + comisionCuota + seguroMensual;

        //total a pagar
        double totalPagar = cuotaMensual * plazoMeses;

        // resultados
        System.out.printf("\n**** CUOTAS MENSUALES ******\n");
        System.out.printf("Cuota de Pago Mensual: HNL %.2f\n", cuotaMensual);
        System.out.printf("Total a Pagar: HNL %.2f\n", totalPagar);
        
        input.close();
    }
}
