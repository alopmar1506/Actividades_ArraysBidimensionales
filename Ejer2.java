/**
 * @author Ana Xiang
 * Fecha: 05/12/23
 * Propósito: programa que cree una matriz de 10x10 e introduzca los valores de las tablas de 
 * multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla.
 */

public class Ejer2 {
    public static void main(String[] args) {
        int matriz[][]=new int [10][10];
        int a=0; 
        int b=1;
        int x=1;
        int valor=0;

        /**
         * Este bucle suma a una vez cada vez que en el bucle de dentro la b llega a 10, ya que las tablas llegan a 10 y
         * al acabar el bucle de dentro, la a se suma 1 y la b vuelve a valer 1 y así hasta completar las 10 tablas
         */
        for(int i=0; i<10; i++){
            a++; 
            b=1;
            for (int j=0; j<10; j++){
                valor=a*b;
                matriz[i][j]=valor;
                b++;
            }
            
        }

        System.out.println("La matriz formada por las tablas de múltiplicar del 1 al 10 es ");
        for(int i=0; i<10; i++){
            System.out.print("Tabla del "+x+": ");
            for (int j=0; j<10; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
            x++;
        }
    }
}
