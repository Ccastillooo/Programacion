/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usodelalibreriamath;

import java.util.Scanner;

/**
 *
 * @author cesar
 */
public class UsodelaLibreriaMath {

    /**
     * Uso de la librería Math Desarrolle un programa que pida al usuario el radio de un círculo.
Utilizando la constante Math.PI y la función Math.pow() de la librería matemática de Java, calcule
el área y circunferencia de dicho círculo y muestre el resultado al usuario.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        // Solicitar el radio al usuario
        System.out.print("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();

        // Cálculo del área y circunferencia usando Math.PI y Math.pow()
        double area = Math.PI * Math.pow(radio, 2);
        double circunferencia = 2 * Math.PI * radio;

        // Mostrar resultados
        System.out.println("El área del círculo es: " + area);
        System.out.println("La circunferencia del círculo es: " + circunferencia);
    }
    
}
