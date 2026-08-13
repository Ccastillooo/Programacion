/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadeaprovacion;
import java.util.Scanner;
/**
 *
 * @author cesar
 */
public class SistemadeAprobacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la calificación del primer parcial: ");
        double parcial1 = sc.nextDouble();

        System.out.print("Ingrese la calificación del segundo parcial: ");
        double parcial2 = sc.nextDouble();

        double promedio = (parcial1 + parcial2) / 2.0;

        if (promedio >= 65.0) {
            System.out.println(nombre + " está Aprobado con promedio de " + promedio);
        } else {
            System.out.println(nombre + " está Reprobado con promedio de " + promedio);
        }
    }
}

    
    

