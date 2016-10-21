/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg03;
import java.util.*;
/**
 *
 * @author Alumno
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calculador de factorial de cierto numero
        int n, r;
        n = pedirNumero();
        r = calcularFactorial(n);
        mostrarResultado(r, n);
    }
    
    public static int pedirNumero(){
        int n;
        System.out.println("Introduce cualquier numero entero:");
        Scanner entradaNumero = new Scanner(System.in);
        n = entradaNumero.nextInt();
        return n;
    }
    
    public static int calcularFactorial(int n){
        int r = 1;
        for (int i=n; i>0; i--){
        r = r*i;
        }
        return r;
    }
    
      
    public static void mostrarResultado(int n, int r){
        System.out.println("El factorial de " +  r + " es: " + n);
    }
}
