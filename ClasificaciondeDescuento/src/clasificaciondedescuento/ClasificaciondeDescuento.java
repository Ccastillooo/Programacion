/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasificaciondedescuento;
import java.util.Scanner;
/**
 *
 * @author cesar
 */
public class ClasificaciondeDescuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la edad del cliente: ");
        int edad = sc.nextInt();

        System.out.print("¿Tiene membresía premium? (S/N): ");
        char membresia = sc.next().toUpperCase().charAt(0);

        System.out.print("Ingrese el precio original del software: ");
        double precioOriginal = sc.nextDouble();

        double descuento = 0.0;

        // Clasificación de descuentos
        if (edad >= 18) {
            // Mayor de edad
            if (edad > 65 || membresia == 'S') {
                descuento = 0.20; // 20%
            } else {
                descuento = 0.10; // 10%
            }
        } else {
            // Menor de edad
            if (membresia == 'S' && edad > 12) {
                descuento = 0.15; // 15%
            } else {
                descuento = 0.0; // Sin descuento
            }
        }

        double montoDescuento = precioOriginal * descuento;
        double totalPagar = precioOriginal - montoDescuento;

        System.out.println("\n--- Resultado ---");
        System.out.println("Precio original: $" + precioOriginal);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Monto descontado: $" + montoDescuento);
        System.out.println("Total a pagar: $" + totalPagar);
    }
}

    
    

