/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package guia8ejercicio10;

import java.util.Arrays;

/**
 *
 * @author Rafael
 */
public class Guia8Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Double arregloA[] = new Double[50];
        Double arregloB[] = new Double[20];
        double decimales = 2;
        System.out.println("\n" + "El arreglo A original: " + "\n");
        for (int i = 0; i < arregloA.length; i++) {

            double aleatorio = Math.random() * 50;
            double aleatorioLim = Math.round(aleatorio * Math.pow(10, decimales)) / Math.pow(10, decimales);
            //lo que sucede en la linea 33 es para limitar el numero de decimales a 2.
            arregloA[i] = aleatorioLim;
            System.out.print(arregloA[i] + "-");

            if ((i + 1) % 10 == 0) {
                System.out.println("");
            }
        }
        System.out.println("\n" + "-----------------------------------------------------" + "\n");

        Arrays.sort(arregloA);
        //El metodo Arrays.sort recibe por parametro un arreglo y ordena sus valores de menos a mayor.
        
        Arrays.fill(arregloB, 10, 20, 0.5);
        //Arrays.fill, le pasamos por parametro el arreglo a completar, el primer paramatro es el indice de inicio, el segundo es el indice final
        //y por ultimo el valor, esto completa los indices especificados con el valor especificado.
        
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
        /*Este metodo de la clase System copia los valores desde el inice del arreglo A 
        al arreglo B desde el inidice 0 hasta el 10, en resumen copia los 10 primeros valores del array A al B*/
        
        System.out.println("El arreglo A modificado:" + "\n");

        for (int i = 0; i < arregloA.length; i++) {
            System.out.print(arregloA[i] + "-");

            if ((i + 1) % 10 == 0) {
                System.out.println("");
            }
        }
        System.out.println("\n" + "-----------------------------------------------------" + "\n\n"
                + "El arreglo B completado: " + "\n");

        for (int i = 0; i < arregloB.length; i++) {
            System.out.print(arregloB[i] + "-");

            if ((i + 1) % 10 == 0) {
                System.out.println("");
            }

        }

    }

}
