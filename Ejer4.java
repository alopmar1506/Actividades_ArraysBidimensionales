import java.util.Scanner;

/**
 * @author Ana Xiang
 * Fecha: 05/12/23
 * Propósito: programa para almacenar las notas de 4 alumnos (llamados “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. 
 * El usuario introducirá las notas por teclado y luego el programa mostrará la nota mínima, máxima y media de cada alumno.
 */
 
public class Ejer4 {
    public static void main(String[] args) {
        int cuadrante[][]=new int [4][5];
        int nota=0;
        int notaMin=0;
        int notaMax=0;
        int media=0;
        int suma=0;
        
        Scanner sc=new Scanner(System.in);

        for(int i=0; i<4; i++){
            for(int j=0; j<5; j++){
                System.out.println("Introduce la nota");
                nota=sc.nextInt();
                cuadrante[i][j]=nota;
            }
        }

        System.out.println("El cuadrante de las notas es el siguiente");

        for(int i=0; i<4; i++){
            notaMax=cuadrante[i][0];//Se iguala a la primera nota para que a partir de ésta compare y vaya guardando en la variable.
            notaMin=cuadrante[i][0]; //Se iguala a la primera nota para que a partir de ésta compare y vaya guardando en la variable.
            suma=0; //Se iguala a 0 para que después de que realice cada media, la variable se inicialice a 0 y no guarde el resultado anterior.

            System.out.println("Notas de alumno"+i+ ": ");
            for(int j=0; j<5; j++){
                System.out.print(cuadrante[i][j]+ " ");

                if(cuadrante[i][j]<notaMin){
                    notaMin=cuadrante[i][j];
                }else if(cuadrante[i][j]>notaMax){
                    notaMax=cuadrante[i][j];
                }
            suma+=cuadrante[i][j];
            }
            media=suma/5;
            System.out.println();
            System.out.println("la suma "+suma);
            System.out.println("Su nota mínima es :"+notaMin);
            System.out.println("Su nota máxima es :"+notaMax);
            System.out.println("La media es :"+media);
            System.out.println();
            
        }
    }
}


