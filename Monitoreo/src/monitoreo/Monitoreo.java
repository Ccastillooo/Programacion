/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monitoreo;

import java.util.Random;
import java.util.Scanner;

/**
 *  * Desarrolla un programa en Java que simule la lectura de sensores de 
     * temperatura en un cuarto de servidores. El programa debe solicitar 
     * el nombre del operador encargado y cuántas lecturas de sensores se 
     * van a simular. Debe validar que la cantidad de lecturas sea mayor a 0 
     * y menor o igual a 50. Por cada lectura, el sistema generará una temperatura 
     * aleatoria en grados Celsius. El programa debe convertir cada lectura a 
     * Fahrenheit, determinar si hay una alerta de sobrecalentamiento y, al final, 
     * mostrar un resumen estadístico.
     * 
     * 
     * 1. Comprender el problema que se esta abordando
     *   a.Que datos de entrada necesito?
     *   b. Transformacion/ Calculos Necesarios
     *   c. Que resultados se presentan?
     * 
     * 2. Visualizacion / Diseño de la Solucion
     *   a. Diagrama de Flujo
     *   b. Pseudocodigo
     * 
     * 3. Programacion Incremental
     *   a. Listado de tareas a cumplir
     *     i. Declaracion de Variables
     *     ii. Estructura de Seleccion
     *     iii. Ciclos de Repeticion
     *     iv. Validacion de Datos
     *   b. Validacion
     * 
     * 4. Prueba de Escritorio
     *   a. Casos
     *   b. Escenarios
     *   c. ResultadosPatrones Definidos
 * @author cesar
 */
public class Monitoreo {

    /**
     * 1.Entradas:
     *         Nombre de Usuario
     *         Numero de Lectura
     *         Ingreso de Temperatura(Ramdom)
     * 
     * 2.Calculos/Transformaciones:
     *         Formula Celsius - Farenheit
     *         Definicion de Sobrecalentamiento
     *         Validacion de Lectura ( mayor a 0 y menor a 50)
     *         Contabilizar el numero de calentamiento
     *         Promedia el monitoreo
     *         Validacion de temperatura
     * 
     * 3.Salida:
     *     Resumen Estadistico
     *     Alerta de Sobrecalentamiento
     * 
     * Lista de Tarea 
     * 1.Capturar el nombre del usuario
     *   a.Definicion de Libreria/Instancia
     *   b. Declaracion de Variables para el usuario
     * 
     * 2. Capturar el numero de lecturas
     *   a. Declaracion de variable para numeor de lectura
     * 
     * 3. Generacion de Temperatura
     *   a. Definicion de Libreria Ramdonm
     *   b. Declaracion de Variable
     *   c. Mostrar el numero Ramdom generado temporalmente
     *   d. Rango de Temp 200 - 400
     *   e. Establecer un ciclo de Repeticion ( WHILE )
     *
     * 4. Formula: F= ( C * 9/5 ) + 32
     * 5. Limite de Sobrecalentamiento 350 C (662 F)
     *      Estructura de Seleccion (IF/ELSE)
     * 6. Validacion de Lecturas (DO WHILE) - 0-50
     * 7. Sumar los numeros de sobrecalentamiento
     * 8. Calcular el promedio
     * 9. Mostrar el resumen
     *     Promedio
     *      # de sobrecalentamiento
     * 10. Genrar una alerta de Sobrecalentamiento
     *     
     *
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        Random rd = new Random();
         
        String nombreUsuario = "John Doe";
        int numLectura =0;
        int ciclo = 0;
        double tempC = 0;
        double tempF = 0;
        int numSobreCalentamiento = 0;
        double promedio = 0;
        double numTEMP = 0;
        
                
        System.out.print("Nombre de Operacion:");
        nombreUsuario = sc.nextLine().toUpperCase();
        System.out.printf("Validar la Captura %s\n",nombreUsuario);
        
        do{
        System.out.print("Numero de Lecturas: ");
        numLectura = sc.nextInt();
        System.out.printf("Validacion Captura : %d\n",numLectura);
        //if(!(NumLectura>0 && numLectura<50))
        if (numLectura>0 || numLectura<50){
            System.out.println("Valor NO VALIDO");
            System.out.println("Tiene que ser entre 0 y 50");
        }
        }while(numLectura>0 || numLectura<50 );
        
        tempC = rd.nextDouble(200,400);
        System.out.printf("Validacion Random : %.2f\n", tempC);
        
        while(ciclo < numLectura){
            tempC = rd.nextDouble (200,500);
            tempF = (tempC*9/5)+32;
            
           // System.out.printf("Validacion Random : %d\n",tempC);
           System.out.printf("Num Lec: %d\tTemp C: %.2f\n", ciclo+1,tempC);
           System.out.printf("Temp en Faren: %.2f\n",tempF);
           
           if(tempF>662){
               System.out.println("Alerta..... SobreCalentamiento");
           }else{
                 numTEMP += tempF;
                       }
           
           ciclo++;
           
           
}//Fin de While

        promedio = numTEMP/numLectura;
        
        
       
        
       
        
    }// Fin de Main
    }
//Fin de Class
