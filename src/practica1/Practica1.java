/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;


public class Practica1 {
    
        private static int factorial(int num){
        System.out.println("Estoy en factorial, num vale: "+num);
        if (num==0){
            return 1;
        }
        else {
            return num* factorial(num-1);
}
        }
    
    
    
    public static void main(String[] args) {
        
    int numero=5;
    int resultado;
    
    System.out.println("");
    resultado = factorial(numero);
    System.out.println("El factorial de "+numero+" es: "+resultado);
    
    }
}
        
    