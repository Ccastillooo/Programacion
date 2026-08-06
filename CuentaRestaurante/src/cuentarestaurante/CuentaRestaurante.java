/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentarestaurante;

import java.util.Scanner;

/**
 *
 * 
 * Objetivo
 * 1. Conocer los diferentes tipos de ciclio repeticion
 * 2. Anañizar los componentes de todo ciclo repeticion
 * 3. Construir un algoritmo con un ciclo de repeticion
 * @author cesar
 */


public class CuentaRestaurante {

    /**
     * Desarrollar un algoritmo que simule la cuenta de un restaurante
     * que se tiene que pagar entre un grupo de amigos (7) dividido en partes 
     * iguales
     */
    /* 
    Ciclos de repeticion
       1. While
       2. Do- While
       3.For
       4. Foreach
    Componentes de Ciclos de Repeticion 
       1. Variables de Control = Valor de Inicio
       2. Condicion            = Limite de Repeticion
          Todo ciclo de repeticion se ejecuta y repite 
          siempre y cuandi la condicion se mantenga VERDADERA
       3. Modicador de la Variable de Control
    
    
    
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        
        double promedioPago = 0;
        int gastoIndividual = 0;
        
        int numPersona = 1; // Variable de Control
        int gastoAcumulado = 0; //Acumulador
        //Condicion = Variable de Control con Limite
        while(numPersona <7){
        // Instruciones a repetir
      
         System.out.printf("Persona %d) Cuanto consumiste? ",numPersona);
         gastoIndividual = sc.nextInt();
         
         gastoAcumulado += gastoIndividual; //Suma de los Gastos
         System.out.printf("P: %d\tGasto Ind:%d\tGasto ACUM:%d",
                 numPersona,
                 gastoIndividual,
                 gastoAcumulado);
         System.out.println("");   
         //Modificador
         //Opcion #1
         //numPersona +=; //numPersona + 1;
         
         //Opcion #2
         numPersona++;//numPersona = numPersona Incremento Unitario
    }//Fin de While
   
        //promedioPago = gastoAcumulado / 7;//Hardcoding
        numPersona--;
        System.out.printf("Total Personas: %d", numPersona);
        promedioPago = gastoAcumulado / numPersona;
        
        System.out.printf("\nGasto Promedio x Persona: %.2f", promedioPago);
       
   }// Fin de Main
   
    
    
}//Fin de Class
