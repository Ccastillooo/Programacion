/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclorepeticionfor;

import java.util.Scanner;

/**
 *
 * oBJETIVOS
 * 1. Implementar ciclo de repeticion FOR
 * 2. Uso de CONSTANTES 
 */
public class CicloRepeticionFOR {

    /**
     * Se quier contabiliar la cantidad de minutas que se entregan a los ninos
     * y ninas en una fiesta. con ello sacar 
     * el porcentaje de cuantos fueron ninos y ninas.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        /*
          1.variable Control= Valor Inicial
          2. Condicion  = Limite
          3. Modficiador = Incremento/Decremento
        */
        for(int i = 0; i <10 ; i ++){
        System.out.printf("Valor: %d\n",i );
    }// Fin de ciclo FOR
            System.out.println("");
            System.out.println("2do CICLO FOR");
            
            for(int i = 2; i< 10; i +=2 ){
                System.out.printf("Valor: %d\n",i );
            }
            
            // Declaracion de Variables
            Scanner sc = new Scanner (System.in);
            final int TOTAL = 10;
            int numVarones = 0;
            int numMujeres = 0;
            char seleccion = 'a';
            double porcentaje = 0.0;
            
            for(int i = 0; i <TOTAL ; i ++){
                System.out.printf("%d viene x Minuta\n",i+1);
                System.out.println("V:Varon / M:Mujer");
                System.out.print("Respuesta:");
                seleccion = sc.next().toUpperCase().charAt(0);
                
             switch(seleccion){
                 case 'V':
                     System.out.println("Varon comiendo minuta");
                     numVarones++;
                     break;
                 case 'M':
                     System.out.println("Mujer comiendo minuta");
                     numMujeres++;
                     break;  
                     
                 default:
                     System.out.println("Seleccion no valida");
                     break;
                    
             }// Fin de switch   
              
            }// Fin de ciclo FOR 
             
            System.out.println("Porcentaje de Varones");
            porcentaje = (double)numVarones / TOTAL;
            System.out.printf("Porcentaje:%.2f\n", porcentaje);
            
            System.out.println("Porcentaje de Mujeres");
            porcentaje = (double)numMujeres / TOTAL;
            System.out.printf("Porcentaje:%.2f\n", porcentaje);
            
            
            
            
            
            
} 
}