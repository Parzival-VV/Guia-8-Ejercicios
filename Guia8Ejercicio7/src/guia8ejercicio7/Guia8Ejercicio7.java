/*
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
PCLASES DE UTILIDAD EN JAVAP
Los métodos disponibles para las clases de utilidad Integer, Arrays y Date están en esta guía.
Recordar que la clase String y Math están explicadas en la guía anterior de Intro Java.
 */
package guia8ejercicio7;
import java.util.Scanner;
import Entidades.Persona;
import Servicios.PersonaServicio;
/**
 *
 * @author Rafael
 */
public class Guia8Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        PersonaServicio Ps = new PersonaServicio();
        
        Persona personas [] = new Persona [4];
        
        int pesoIdeal = 0, pesoBajo = 0, sobrepeso =0, mayor = 0, menor = 0;
        
        for (int i = 0; i < 4; i++) {
            personas[i] = Ps.crearPersona();
            switch (Ps.calcularIMC(personas[i])) {
                case -1:
                    pesoBajo ++;
                    break;
                case 0:
                    pesoIdeal ++;
                    break;
                default:
                    sobrepeso ++;
                    break;
            }
            
            if( Ps.esMayorDeEdad(personas[i]) == true){
                mayor ++;
            }else{
                menor ++;
            }
           
            
            
        }
        double partePIdeal = (pesoIdeal * 100) / 4;
        double partePBajo = (pesoBajo * 100) / 4;
        double parteSobrepeso = (sobrepeso * 100) / 4;
        double parteMayorEdad = (mayor * 100) / 4;
        double parteMenorEdad = (menor * 100) / 4;
        
        System.out.println("\n" + "El porcentaje de personas con peso ideal es de: %" + partePIdeal);
        System.out.println("\n" + "El porcentaje de personas por debajo de su peso ideal es de: %" + partePBajo);
        System.out.println("\n" + "El porcentaje de personas con sobrepeso es de: %" + parteSobrepeso);
        System.out.println("\n" + "El porcentaje de personas mayor de edad es de: %" + parteMayorEdad);
        System.out.println("\n" + "El porcentaje de personas menores de edad es de: %" + parteMenorEdad + "\n");
    }
    
}
