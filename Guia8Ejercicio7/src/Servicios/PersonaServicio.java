
package Servicios;
import java.util.Scanner;
import Entidades.Persona;
/**
 *
 * @author Rafael
 */
public class PersonaServicio {
    Scanner leer = new Scanner(System.in);
    
//      Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
//al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
//O. Si no es correcto se deberá mostrar un mensaje
    
    public Persona crearPersona(){
        
        Persona P1 = new Persona();
        String sex = "";
        
        System.out.println("\n" + "Ingrese su nombre: ");
        P1.setNombre(leer.next());
        
        do{
            System.out.println("\n" + "Ingrese su sexo, (H) para hombre, (M) para mujer, u (O) para otro:");
            sex = leer.next();
            
            if(sex.equalsIgnoreCase("H") || sex.equalsIgnoreCase("M") || sex.equalsIgnoreCase("O")){
            P1.setSexo(sex);
            }else{
            System.out.println( "\n"+ "El valor ingresado es incorrecto, intentelo nuevamente." + "\n");
            }
        }while(!sex.equalsIgnoreCase("H") && !sex.equalsIgnoreCase("M") && !sex.equalsIgnoreCase("O"));
        
        System.out.println("\n" + "Digite su edad: ");
        P1.setEdad(leer.nextInt());
        
        System.out.println("\n" + "Ingrese su peso: ");
        P1.setPeso(leer.nextInt());
        
        System.out.println("\n" + "Ingrese su altura: ");
        P1.setAltura(leer.nextDouble());
        
        return P1;       
    }
    
//     Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
//significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
//Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
//persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
//de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
//función devuelve un 1.
    
    public int calcularIMC(Persona P1){
        
       Double IMC = (double) P1.getPeso() / (Math.pow(P1.getAltura(), 2));
       int retorno;
       if(IMC < 20){
           retorno = -1;
       }else if(IMC >= 20 && IMC <= 25){
           retorno = 0;
       }else{
           retorno = 1;
       }
       return retorno;
    }
    
//     Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
//devuelve un booleano.
    
    public boolean esMayorDeEdad(Persona P1){
        boolean mayorDeEdad = false;
        if(P1.getEdad() >= 18){
            mayorDeEdad = true;
        }
        return mayorDeEdad;
    }
    
}
