import java.util.Scanner;

/**
 * @author Ana Xiang
 * Fecha: 05/12/23
 * Propósito: programa para registrar sueldos de hombres y mujeres de una
 * empresa y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la
 * información de N personas distintas (valor también introducido por teclado). Para cada
 * persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. Esta información debe
 * guardarse en una única matriz. Luego se mostrará por pantalla el sueldo medio de cada  género.
 */

public class Ejer5 {
    public static void main(String[] args) {
        int numPersonas=0;
        int genero=0;
        int sueldo=0;
        int sumaMujeres=0;
        int sumaHombres=0;
        int mediaMujeres=0;
        int mediaHombres=0;
        int contMujeres=0;
        int contHombres=0;
        int matrizSueldo[][];
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de personas que vas a introducir");
        numPersonas=sc.nextInt();

        matrizSueldo=new int [numPersonas][2];

        for(int i=0; i<numPersonas; i++){
            System.out.println("Introduce el género de la persona siendo 1 mujer y 0 hombre");
            genero=sc.nextInt();

            while(genero!=0 || genero!=1){
                System.out.println("El genero que has introducido no es válido.");
                System.out.println("Introduce el género de la persona siendo 1 mujer y 0 hombre");
                genero=sc.nextInt();
            }

            System.out.println("Introduce su sueldo");
            sueldo=sc.nextInt();

            matrizSueldo[i][0]=genero;
            matrizSueldo[i][1]=sueldo;
            if(genero==0){
                sumaHombres+=sueldo;
                contHombres++;
            }else if(genero==1){
                sumaMujeres+=sueldo;
                contMujeres++;
            }
        }

        mediaMujeres=sumaMujeres/contMujeres;
        mediaHombres=sumaHombres/contHombres;

        System.out.println("El sueldo medio de los hombres es "+mediaHombres);
        System.out.println("El sueldo medio de las mujeres es "+mediaMujeres);

        if(mediaHombres> mediaMujeres){
            System.out.println("Si existe brecha salarial entre hombres y mujeres.");
        }else if (mediaHombres==mediaMujeres){
            System.out.println("No existe brecha salarial entre hombre y mujeres.");
        }else if(mediaHombres<mediaMujeres){
            System.out.println("Si existe brecha salarial entre hombre y mujeres.");
        }
    }
}



