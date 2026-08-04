/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiemporelax;

import java.util.Scanner;

/**
 *
 * @author cesar
 */
public class TiempoRelax {

    /**
     * Desarrollar algoritmo que me permita escoger un pais a visitar.
     * Posterior a ello, debemos nosotros escoger las posibles ciudades 
     * a recorrer, sin embargo, solo se puede elegir una ciudad.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
         
        int seleccionMenu = 0;
        char seleccionSubMenu ='@';
                
        System.out.println("Agencia de Viajes");
        System.out.printf("|%20s| |%-20s| \n", "Taniha's Travel", "Buen Viaje");
        System.out.println("----------------------");
        System.out.println("1. Japon");
        System.out.println("2. Francia");
        System.out.println("3. Nueva Zelanda");
        System.out.println("4. Canada");
        System.out.println("Respuesta");
        seleccionMenu = sc.nextInt();
        
        /* if/else = Rango de valores
        swicht = Igualdad/ Todas opciones estan mismo nivel
        */
        switch (seleccionMenu){
            case 1:
                System.out.println("Bienvenido a Japon");
                System.out.println("----------------");
                System.out.println("A. Osaka");
                System.out.println("B. Tokio");
                System.out.println("C. Kyoto");
                System.out.println("Respuesta");
                
                sc.nextLine();// Limpieza de buffer
                seleccionSubMenu = sc.nextLine(). toUpperCase(). charAt(0);
                switch(seleccionSubMenu){
                   case 'A':
                System.out.println("Super Nintendo World Tour");
                break;
                   case 'B':
                System.out.println("Car Meet");
                break;
                case 'C':
                System.out.println("Pabellon Dorado");
                break;
                default:
                    System.out.println(" Cualquier ciudad");
                    System.out.println("Porque no esta ");
                    System.out.println("la que escogiste");
        }
                break;
            case 2:
                System.out.println("Bienvenido a francia");
                 System.out.println("----------------");
                System.out.println("1. Paris");
                System.out.println("2.Marsella");
                System.out.println("3. Lyon");
                System.out.println("Respuesta");
                sc.nextLine();
                seleccionSubMenu = sc.nextLine().charAt(0);
                
                switch(seleccionSubMenu){
                    case '1':
                        System.out.println("Torre Eiffel");
                        break;
                    case '2':
                        System.out.println("Palacio de Marshella");
                        break;
                    case '3':
                        System.out.println("El Estadio");
                    default: 
                        System.out.println("Lea ombe... no esta la opcion esa");
                        break;    
                }
                
                break; 
            case 3:
                System.out.println("Bienvenido a Nueva Zelanda");
                System.out.println("----------------");
                System.out.println("1. Sky Tower");
                System.out.println("2.Hogbbiton");
                System.out.println("3. Mildford Sound");
                System.out.println("Respuesta");
                 sc.nextLine();
                seleccionSubMenu = sc.nextLine().toUpperCase().charAt(0);
                
                if(seleccionSubMenu == 'A'){
                    System.out.printf("%s Sky Tower %s","\u001B[31m","\u001B[0m");
                    
                }else if(seleccionSubMenu =='B'){
                    System.out.printf("%s Hogbbiton %s","\u001B[32m","\u001B[0m");
                    
                }else if(seleccionSubMenu =='C'){
                    System.out.printf("%s Mildford Sound %s","\u001B[34m","\u001B[0m");
                }
                else{
                    System.out.println("Usted no lee va?!!!");
                }
                
                break;    
            case 4:
                System.out.println("Bienvenido a Canada");
                break;    
                
                
                
                
                
                
                
                
                
        }
    
    
    
    
    
    }
    
    
}
