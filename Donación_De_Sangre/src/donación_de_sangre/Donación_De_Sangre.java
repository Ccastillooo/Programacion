/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donación_de_sangre;

import java.util.Scanner;

/**
 *
 * @author cesar
 */
public class Donación_De_Sangre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner entrada = new Scanner(System.in);
     int edad = 0;
     int peso = 0;
     int comio = 0;
     int niveles = 0;
     String genero = "x";
     
     System.out.println("Ingrese la edad");
     edad = entrada.nextInt();
     
     System.out.println("Ingrese el peso");
     peso = entrada.nextInt();
     
     System.out.println(edad);
     System.out.println(peso);   
     
     entrada.nextLine();
     
     if (edad>=18 && edad<=65 && peso>=110){
       
         System.out.println("Si se puede donar");
         System.out.println("¿Ya comio?");
         comio = entrada.nextLine().charAt(0);
         
         if (comio =='s' || comio == 's'){
            System.out.println("Si se puede donar");
         } else{ 
                System.out.println ("Necesita comer");
                        
          }      
         
     } else{ 
         System.out.println("No se puede donar");
         
     } 
      System.out.println("Cuales son sus niveles de hierro");
      niveles = entrada.nextInt();
      
      System.out.println("Eres hombre o mujer?");
      genero = entrada.nextLine().toUpperCase();
      
      if ((niveles>=14 && genero.equals("hombre"))||
         (niveles>=12 && genero.equals("mujer"))){
          System.out.println("Si se puede donar sangre");
        }else  {
          System.out.println("No se puede donar sangre");
          
      }     
      
        
        
        
        
        
        
        
        
        
        
    }
    
}
