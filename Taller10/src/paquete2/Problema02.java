/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Problema02 {
    public static void main(String[] args) {
        int[][] ventas = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        int sumaVentas = 0;
        int suma;
        String mensaje = "";
        
        for (int i = 0; i < ventas.length; i++) {
            suma = 0;
            for (int j = 0; j < ventas[i].length; j++) {
                suma = suma + ventas[i][j];
                sumaVentas = suma;
            }
        }
            mensaje = String.format("%sVendedor(a) %s\nVendedor(a) %s\n"
                    + "Han realizado un total de %d ventas\n", 
                    mensaje, 
                    vendedores[0], 
                    vendedores[1], 
                    sumaVentas);
        
        System.out.printf("%s\n", mensaje);
        
    }
}
