/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversiones_java;

import java.util.Scanner;

/**
 *
 * @author cesar
 */
public class Conversiones_Java {

    /**
     * @param args the command line arguments
     */
    
  
           
    public static void main(String[] args) {
        // // Declarar Variables
int pulgadas = 0;
double resultadocm = 0;
double kilometros = 0;
double millas = 0;
double farenheit = 0;
double celsius = 0;

pulgadas = 35; // Los datos van de IZQ a DER
resultadocm = pulgadas * 2.54;
System.out.printf ("%.2f cm es igual a %d pulgadas",resultadocm,pulgadas);

pulgadas = 10; // Los datos van de IZQ a DER
resultadocm = pulgadas * 2.54;
System.out.printf ("%d pulgadas es igual a %.2f cm",pulgadas,resultadocm);

Scanner teclado = new Scanner(System.in);


System.out.println("");
System.out.println("Cuantos kilometros hay de TGU-SPS");
kilometros = teclado.nextDouble();
millas = kilometros/1.6;
System.out.printf(" %.2f km es igual a %.2f millas",kilometros,millas);

System.out.println("");
System.out.println("");


System.out.printf( "Ingrese la temperatura en grados farenheit");
farenheit = teclado.nextDouble();
celsius = (farenheit -32) *5/9;
System.out.printf( "%.2f farenheit equivale a %.2f grados celsius",farenheit,celsius );

       

    }
    
}
