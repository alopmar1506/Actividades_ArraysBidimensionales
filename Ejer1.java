/**
 * @author Ana Xiang
 * Fecha: 05/12/23
 * Propósito: programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
 * y luego muestre la matriz por pantalla.
 */

public class Ejer1{
    public static void main(String[] args) {
        int matriz[][]= new int[5][5];
        int valor=1;

        for(int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                matriz[i][j]=valor;
                valor++;
            }
        }

        System.out.println("La matriz formada es ");
        for(int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}