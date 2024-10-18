/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gomez_jocsan_formulas;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Gomez_Jocsan_Formulas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        
        System.out.print("Ingrese una opcion: ");
                System.out.println("1) (3)/(2) + (4)/(3)");
                System.out.println("2) (1)/(x-5) - (3xy)/(4)");
                System.out.println("3) (1)/(2) + 7");
                System.out.println("4) 7 + (1)/(2)");
                System.out.println("5) (a^2)/(b-c) + (d-e)/(f - (g^h)/(j))");
                System.out.println("6) (m)/(n) + p");
                System.out.println("7) (a^2)/(b^2) + (c^2)/(d^2)");
                System.out.println("8) (m + (n)/(p))/(q - (r)/(s))");
                System.out.println("9) (3a + b)/(c - (d + 5e)/(f + (g)/(2h)))");
                System.out.println("10) (a^2 + 2ab + b^2)/((1)/(x^2) + 2)");
                opcion = input.nextInt();
        switch (opcion) {
            case 1:
                double numero1=3;
                double numero2=2;
                double numero3=4;
                double numero4=3;
                double formula=(numero1/numero2)+(numero3/numero4);
                System.out.println("El resultado es: "+formula);
                break;
            case 2:
                System.out.print("Ingresa el valor de x: ");
                double x = input.nextDouble();
                System.out.print("Ingresa el valor de y: ");
                double y = input.nextDouble();
                double resultado = (1 / (x - 5)) - ((3 * x * y) / 4);
                System.out.println("El resultado es: " + resultado);
                input.close();
                break;
            case 3:
               // System.out.print("Numerador: ");
                //double numerador = input.nextDouble();
                //System.out.print("Denominador: ");
               // double denominador = input.nextDouble();
                //double resultado = (numerador / denominador)+ 7;
               // System.out.println("El resultado es: " + resultado);
                break;
            case 4:
                
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 0:


        }
    }
}
