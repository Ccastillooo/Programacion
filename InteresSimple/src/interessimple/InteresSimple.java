/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interessimple;

import java.util.Scanner;

/**
 *
 * @author cesar
 */
public class InteresSimple {

    /**
     *  Interés simple Escriba un programa que calcule el interés simple de un préstamo. El sistema
debe solicitar el capital inicial, la tasa de interés anual (en formato de número entero) y el tiempo
en años. Aplique la fórmula (Capital * Tasa * Tiempo) / 100 y muestre el interés generado.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese el capital inicial: ");
        double capital = sc.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (en número entero): ");
        double tasa = sc.nextDouble();

        System.out.print("Ingrese el tiempo en años: ");
        double tiempo = sc.nextDouble();

        // Cálculo del interés simple
        double interes = (capital * tasa * tiempo) / 100;

        // Mostrar resultado
        System.out.println("El interés generado es: " + interes);
    }
    
}
