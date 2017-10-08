
package numeros_positivos;

import java.util.Scanner;


public class Numeros_positivos {

        public static void main(String arg[])
      {  // Abre metodo main
          Scanner entrada = new Scanner(System.in);
          int numero1;
          int numero2;
          int numero3;
          int numero4;
          int numero5;
          int numero6;
          int numero7;
          int numero8;
          int numero9;
          int numero10;

          System.out.println("\nINGRESE 10 NUMEROS y VEREMOS CUANTOS SON POSITIVOS.");
          System.out.println("Introduzca el primer numero:");
          numero1 = entrada.nextInt();

          System.out.println("Introduzca el segundo numero:");
          numero2 = entrada.nextInt();

          System.out.println("Introduzca el tercer numero:");
          numero3 = entrada.nextInt();

          System.out.println("Introduzca el cuarto numero:");
          numero4 = entrada.nextInt();

          System.out.println("Introduzca el quinto numero:");
          numero5 = entrada.nextInt();

          System.out.println("Introduzca el sexto numero:");
          numero6 = entrada.nextInt();

          System.out.println("Introduzca el setimo numero:");
          numero7 = entrada.nextInt();

          System.out.println("Introduzca el octavo numero:");
          numero8 = entrada.nextInt();

          System.out.println("Introduzca el noveno numero:");
          numero9 = entrada.nextInt();

          System.out.println("Introduzca el decimo numero:");
          numero10 = entrada.nextInt();


          /*
          // Ahora se cuentan los positivos
          */
          int positivos = 0;


          if ( numero1 > 0)
          positivos = positivos + 1;

          if ( numero2 > 0)
          positivos = positivos + 1;

          if ( numero3 > 0)
          positivos = positivos + 1;

          if ( numero4 > 0)
          positivos = positivos + 1;

          if ( numero5 > 0)
          positivos = positivos + 1;

          if(numero6 >0)
              positivos=positivos+1;

          if(numero7>0)
              positivos = positivos + 1;

          if (numero8 > 0)
              positivos = positivos + 1;

          if (numero9 > 0)
              positivos = positivos + 1;

          if (numero10 > 0)
              positivos = positivos +1;



          /*
          //Imprime los resultados
          */

          System.out.printf("\nDE LOS NUMEROS INGRESADOS , %d SON POSITIVOS \n", positivos);

       } // Cierra metodo main
}

