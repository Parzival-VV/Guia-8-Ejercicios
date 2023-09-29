
package Servicios;
import java.util.Scanner;
import java.util.Date;
import Entidades.Persona;
/**
 *
 * @author Rafael
 */
public class PersonaServicio {
    Scanner leer = new Scanner(System.in);
//     Agregar un método de creación del objeto que respete la siguiente firma:
//crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
//usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
//fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
    
    
    public Persona crearPersona(){
        
        Persona P1 = new Persona();
        int anio, mes, dia;
        
        
        System.out.println("Ingrese su nombre: ");
        P1.setNombre(leer.next());
        
        System.out.println("\n" + "Ingrese su fecha de nacimiento, " + "\n"
                + "año: ");
        anio = leer.nextInt();
        System.out.println("\n" + "mes: ");
        mes = leer.nextInt();
        System.out.println("\n" + "dia: ");
        dia = leer.nextInt();
        
        Date fecha = new Date(anio  - 1900, mes - 1, dia);
        
        P1.setFechaNacimiento(fecha);
        
        return P1;
    }
    
    public void mostrar(Persona P1){
        System.out.println("fecha " + P1.getFechaNacimiento().getDay());
         
        
        
    }
    
//     Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
//en cuenta que para conocer la edad de la persona también se debe conocer la fecha
//actual.
    public int calcularEdad(Persona P1){
        
        int edad;
        Date fechaActual = new Date();
        
        edad = fechaActual.getYear() - P1.getFechaNacimiento().getYear();
        
        return edad;
    }
    
//     Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
//edad y retorna true en caso de que el receptor tenga menor edad que la persona que
//se recibe como parámetro, o false en caso contrario.
    public boolean menorQue(Persona P1, int edad){
        
        boolean retorno = false;
        int edadReceptor =  calcularEdad(P1);
        
        if(edad > edadReceptor){
            retorno = true;
        }
        
       return retorno;
    }
//     Metodo mostrarPersona(): este método muestra la persona creada en el método
//anterior.
    public void mostrarPersona(Persona P1){
        
        System.out.println("El nombre ingresado fue: " + P1.getNombre() + "\n"
                + "Su fecha de nacimiento es: " + P1.getFechaNacimiento() + "\n"
                + "Su edad es : " + calcularEdad(P1) + "\n");
    }
    
}
