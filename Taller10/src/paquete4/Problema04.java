/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double[][] datos = new double[2][2];
        int valor;
        
        for (int fila = 0; fila < datos.length; fila++) {
            for (int col = 0; col < datos.length; col++) {
                System.out.printf("Ingrese valor para la posición [%d][%d]\n:",
                        fila, col);
                valor = entrada.nextInt();
                datos[fila][col] = valor;
            }
        }
}
}    
