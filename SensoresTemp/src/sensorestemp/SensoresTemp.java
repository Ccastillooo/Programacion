/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sensorestemp;

import java.util.Scanner;

/**
 *
 * @author cesar
 */
public class SensoresTemp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        double temperatura;
        double suma = 0;
        int contador = 0;

        double tempMax = Double.NEGATIVE_INFINITY;
        double tempMin = Double.POSITIVE_INFINITY;

        System.out.println("Ingrese temperaturas en °C (−999 para terminar):");

        System.out.print("Temperatura: ");
        temperatura = sc.nextDouble();

        while (temperatura != -999) {

            // Validación del cero absoluto
            if (temperatura < -273.15) {
                System.out.println("ERROR: La temperatura no puede ser menor al cero absoluto (-273.15 °C).");
            } else {
                // Acumular datos válidos
                suma += temperatura;
                contador++;

                // Actualizar máximos y mínimos
                if (temperatura > tempMax) {
                    tempMax = temperatura;
                }
                if (temperatura < tempMin) {
                    tempMin = temperatura;
                }
            }

            System.out.print("Temperatura: ");
            temperatura = sc.nextDouble();
        }

        // Verificar si hubo datos válidos
        if (contador > 0) {
            double promedio = suma / contador;
            double diferencia = tempMax - tempMin;

            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Promedio de temperaturas válidas: " + promedio + " °C");
            System.out.println("Temperatura más alta: " + tempMax + " °C");
            System.out.println("Temperatura más baja: " + tempMin + " °C");
            System.out.println("Diferencia térmica: " + diferencia + " °C");
        } else {
            System.out.println("No se ingresaron temperaturas válidas.");
    }
    
}
}
