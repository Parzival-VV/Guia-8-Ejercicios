/*
 implementar los siguientes métodos:




 */
package Servicios;
import Entidades.Matemática;
/**
 *
 * @author Rafael
 */
public class MatemáticaServicio {
//    a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    Matemática M1 = new Matemática();

    public void devolverMayor(Matemática M1){
       
        System.out.println("\n" + "El numero mayor es: " + Math.max(M1.getN1(), M1.getN2()));     
    }
//    b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
//elevado al menor número. Previamente se deben redondear ambos valores.
    public void calcularPotencia(Matemática M1){
        
        long n1 = Math.round(M1.getN1());
        long n2 = Math.round(M1.getN2());
        System.out.println("\n" + "" + "El resultado de elevar a la potencia el numero mas grande por el numero mas chico es: " + "\n"
                + Math.pow(Math.max(n2, n1), Math.min(n2, n1)));
    }
//    c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    public void calcularRaiz(Matemática M1){
        double num = Math.min(M1.getN1(), M1.getN2());
        System.out.println("\n" + "La raiz cuadrada del menor de los dos numeros es: " + "\n"
                + Math.sqrt(Math.abs(num)));
    }
    
}
