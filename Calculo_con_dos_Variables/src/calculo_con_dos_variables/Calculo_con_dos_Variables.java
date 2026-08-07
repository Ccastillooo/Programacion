/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculo_con_dos_variables;

import java.util.Scanner;

/**
 *Cálculo con dos variables: Escribir un programa que solicite al usuario la base y la altura de un
rectángulo. Utilice estas dos variables para calcular el área del rectángulo (Base X Altura) y el
perímetro (suma de todos sus lados). Imprimir ambos resultados en pantalla.
 * @author cesar
 */
public class Calculo_con_dos_Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese la base del rectangulo: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese la altura del rectangulo: ");
        double altura = sc.nextDouble();

        // Cálculos
        double area = base * altura;
        double perimetro = 2 * (base + altura);

        // Resultados
        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
        
        
        
         
       
                
        
        
        
    }
    
}
