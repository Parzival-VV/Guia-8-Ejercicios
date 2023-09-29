
package Servicios;

import Entidades.Operacion;
import java.util.Scanner;

/**
 * @author Rafael
 */
public class OperadorServicio {
    Scanner leer = new Scanner(System.in);
    
    //) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
    public Operacion crearOperacion (){
        //instansacion objeto Operacion.
        Operacion O1 = new Operacion();
        
        System.out.println("Ingrese el primer numero: ");
        O1.setNumero1(leer.nextDouble());
        System.out.println("");
        System.out.println("Ingrese el segundo numero: ");
        O1.setNumero2(leer.nextDouble());
        return O1;
    }
//    e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
    public void sumar(Operacion O1){
        int suma;
        suma = (int) (O1.getNumero1() + O1.getNumero2());
        System.out.println("");
        System.out.println("La suma de los numeros ingresados es: " + suma);
    }
//    f) Método restar(): calcular la resta de los números y devolver el resultado al main
    public void resta(Operacion O1){
        int resta;
        resta = (int) (O1.getNumero1() - O1.getNumero2());
        System.out.println("");
        System.out.println("La resta de los numeros ingresados es: " + resta);
    }
//g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
//fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
//Si no, se hace la multiplicación y se devuelve el resultado al main
    public void multiplicacion(Operacion O1){
        int resultado;
        if(O1.getNumero1() == 0 || O1.getNumero2() == 0){
            resultado = 0;
            System.out.println("");
            System.out.println("ERROR no esposiboe multiplicar por 0." + "\n" + "RESULTADO = " + resultado);
        }else{
            resultado =(int) (O1.getNumero1() * O1.getNumero2());
            System.out.println("");
            System.out.println("La multiplicacion de los numeros ingresados es: " + resultado);
        }
    }
    
//h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
//una división por cero, el método devuelve 0 y se le informa al usuario el error se le
//informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
    public void division(Operacion O1){
        int resultado;
        if(O1.getNumero1() == 0 || O1.getNumero2() == 0){
            resultado = 0;
            System.out.println("");
            System.out.println("ERROR no es posible dividir por 0." + "\n" + "RESULTADO = " + resultado);
        }else{
            resultado = (int) (O1.getNumero1() / O1.getNumero2());
            System.out.println("");
            System.out.println("La division de los numeros ingresados es: " + resultado + "\n");
        }
    }
}
