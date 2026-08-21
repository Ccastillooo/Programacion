/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulaciontrayecbal;

import java.util.Scanner;

/**
 *
 * @author cesar
 */
public class SimulacionTrayecBal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        


        Scanner sc = new Scanner(System.in);

        double velocidad, angulo;

        // Entrada y validación de velocidad
        System.out.print("Ingrese la velocidad inicial (m/s): ");
        velocidad = sc.nextDouble();
        while (velocidad <= 0) {
            System.out.println("ERROR: La velocidad debe ser mayor a 0.");
            System.out.print("Ingrese la velocidad inicial (m/s): ");
            velocidad = sc.nextDouble();
        }

        // Entrada y validación de ángulo
        System.out.print("Ingrese el ángulo de lanzamiento (grados): ");
        angulo = sc.nextDouble();
        while (angulo <= 1 || angulo >= 89) {
            System.out.println("ERROR: El ángulo debe estar entre 1 y 89 grados.");
            System.out.print("Ingrese el ángulo de lanzamiento (grados): ");
            angulo = sc.nextDouble();
        }

        // Conversión de ángulo a radianes
        double rad = Math.toRadians(angulo);

        // Componentes de velocidad
        double vy = velocidad * Math.sin(rad);

        // Constante de gravedad
        final double g = 9.81;

        double alturaMax = Double.NEGATIVE_INFINITY;
        int segundoMax = -1;

        System.out.println("\n--- SIMULACIÓN DE ALTURA POR SEGUNDO ---");

        // Ciclo estricto for
        for (int t = 1; t <= 10; t++) {

            // Fórmula de posición vertical: y(t) = vy*t - (1/2)*g*t^2
            double altura = vy * t - 0.5 * g * t * t;

            System.out.printf("Segundo %d: Altura = %.2f metros%n", t, altura);

            // Detectar altura máxima
            if (altura > alturaMax) {
                alturaMax = altura;
                segundoMax = t;
                System.out.println("→ Altura máxima alcanzada en este segundo.");
            } else {
                System.out.println("→ Altura menor que la máxima previa.");
            }

            // Detectar impacto contra el suelo
            if (altura < 0) {
                System.out.println("→ El proyectil ha impactado el suelo. Fin de la simulación.");
                break;
            }
        }

        System.out.println("\nAltura máxima registrada: " + String.format("%.2f", alturaMax) +
                           " metros en el segundo " + segundoMax);
    }
}
    
    

