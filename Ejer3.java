import java.util.Scanner;

/**
 * @author Ana Xiang
 * Fecha: 05/12/23
 * Propósito:programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e 
 * introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
 * matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
 * menores que cero y cuántos son igual a cero.
 */

public class Ejer3 {
    public static void main(String[] args) {
        int matriz[][]; 
        int fil=0;
        int col=0;
        int valor=0;
        int mayor=0; 
        int menor=0;
        int igual=0;
        Scanner sc= new Scanner(System.in);

        System.out.println("Introduce el número de filas de la matriz");
        fil=sc.nextInt();

        System.out.println("Introduce el número de columnas de la matriz");
        col=sc.nextInt();

        matriz=new int [fil][col];

        for(int i=0; i<fil; i++){
            for(int j=0; j<col; j++){
                System.out.println("Introduce un valor para la matriz");
                valor=sc.nextInt();
                matriz[i][j]=valor;
            }
        }

        System.out.println("La matriz formada es ");

        for(int i=0; i<fil; i++){
            for(int j=0; j<col; j++){
                System.out.print(matriz[i][j] +" ");
            }
            System.out.println();
        }

        for(int i=0; i<fil; i++){
            for(int j=0; j<col; j++){
                if(matriz[i][j]<0){
                    menor++;
                }else if(matriz[i][j]==0){
                    igual++;
                }else if(matriz[i][j]>0){
                    mayor++;
                }
            }
        }

        System.out.println("Los valores mayores de 0 son "+mayor);
        System.out.println("Los valores iguales de 0 son "+igual);
        System.out.println("Los valores menores de 0 son "+menor);
    }
}
