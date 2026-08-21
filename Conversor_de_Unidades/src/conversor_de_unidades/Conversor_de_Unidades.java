/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversor_de_unidades;

import java.util.Scanner;

/**
 *
 * @author cesar
 */
public class Conversor_de_Unidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== CONVERSOR DE UNIDADES FÍSICAS ===");
            System.out.println("1) Metros a Pies");
            System.out.println("2) Kilogramos a Libras");
            System.out.println("3) Centímetros a Pulgadas");
            System.out.println("4) Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: {
                    double metros = pedirValorNoNegativo(sc, "metros");
                    double pies = metros * 3.28084;
                    System.out.printf("%.2f metros equivalen a %.2f pies.%n", metros, pies);
                    break;
                }
                case 2: {
                    double kg = pedirValorNoNegativo(sc, "kilogramos");
                    double libras = kg * 2.20462;
                    System.out.printf("%.2f kilogramos equivalen a %.2f libras.%n", kg, libras);
                    break;
                }
                case 3: {
                    double cm = pedirValorNoNegativo(sc, "centímetros");
                    double pulgadas = cm * 0.393701;
                    System.out.printf("%.2f centímetros equivalen a %.2f pulgadas.%n", cm, pulgadas);
                    break;
                }
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

        } while (opcion != 4);

        sc.close();
    }

    // Función para pedir un valor no negativo con validación
    private static double pedirValorNoNegativo(Scanner sc, String etiqueta) {
        double valor;
        do {
            System.out.print("Ingrese la cantidad en " + etiqueta + ": ");
            valor = sc.nextDouble();
            if (valor < 0) {
                System.out.println("ERROR: El valor no puede ser negativo. Intente nuevamente.");
            }
        } while (valor < 0);
        return valor;
    }
}
    
    

