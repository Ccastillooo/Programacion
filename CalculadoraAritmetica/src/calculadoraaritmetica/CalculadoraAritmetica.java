/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraaritmetica;
 import java.util.Scanner;
/**
 *
 * @author cesar
 */
public class CalculadoraAritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = sc.nextInt();

        System.out.print("Ingrese la operación (+, -, *, /, %): ");
        char operador = sc.next().charAt(0);

        double resultado;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;

            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;

            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Error: División entre cero no permitida.");
                } else {
                    resultado = (double) num1 / num2;
                    System.out.println("Resultado: " + resultado);
                }
                break;

            case '%':
                if (num2 == 0) {
                    System.out.println("Error: Módulo entre cero no permitido.");
                } else {
                    resultado = num1 % num2;
                    System.out.println("Resultado: " + resultado);
                }
                break;

            default:
                System.out.println("Operador no reconocido");
        }
    }
}

    
    

