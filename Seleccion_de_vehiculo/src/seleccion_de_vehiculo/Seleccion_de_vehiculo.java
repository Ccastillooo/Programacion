/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seleccion_de_vehiculo;

import java.util.Scanner;

/**
 *
 * @author cesar
 */
public class Seleccion_de_vehiculo {

    /**
     * @param args the command line arguments
     * Desarollar un algoritmo que me permita determinar los siguientes elementos:
     * a. Si el tamaño del tanque de combustible agarra mas de 30 litros (Dato Numerico)
     * b. El tipo de combustible es o no Diesel ( dato Numerico)
     * c. Si es energeticamente eficiente y ecologico ( Dato Cadena)
     */
    public static void main(String[] args) {
  Scanner entrada = new Scanner (System.in);
            int cantidadLitros = 0;
            char respuestaTipo = 'a';
            String respuestaCadena = "John Doe";
            
     System.out.println ("Me dijeron que eres dueño de un vehiculo \"Verde\" ");
     System.out.println ("Tienes que echarle biodiesel");
     System.out.print ("Cuantos Litros agarra?");
     cantidadLitros = entrada.nextInt();
     
     if(cantidadLitros>30)
         System.out.println ("Es un vehiculo con:");
     System.out.println("grandes capacidades");
     System.out.println("seguro la factura es alta");
     
     entrada.nextLine();
     System.out.println("Tu vehiculo es diesel verde? ( x= si, y = no)");
     respuestaTipo = entrada.nextLine().charAt(0);
     
      if (respuestaTipo == 'x'){        
     System.out.println ("Si es Diesel verde");
     System.out.println ("Diesel combinado con etanol");
     System.out.println("Se saca del maiz");
   }
     
     else
     {
     System.out.println ("uyyyy...eres anticlimatico");
     System.out.println("Calentamiento Global");
     }
      System.out.println();
      System.out.println ("Tu carro es energeticamente eficiente");
      respuestaCadena = entrada.nextLine();
      System.out.printf("Respuesta ingresada: %s",respuestaCadena);
      
      System.out.println ("\nSeguro que es asi?");
      respuestaCadena = entrada.nextLine().toUpperCase ();
      System.out.printf("Respuesta ingresada: %s",respuestaCadena);
      
      System.out.println ("\n100% Seguro?");
      respuestaCadena = entrada.nextLine(). toLowerCase();
      System.out.printf("Respuesta ingresada: %s",respuestaCadena);
      
      if(respuestaCadena.equals("si")){
          System.out.println("Excelente");
          System.out.println("Amigable con el ambiente");
        
      }
      else{
          System.out.println("Uyy...busca que se puede hacer");
      }
      }
    
    }

     
            

     
   
    

