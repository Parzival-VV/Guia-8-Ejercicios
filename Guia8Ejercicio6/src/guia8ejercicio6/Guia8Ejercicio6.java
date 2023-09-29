/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual
 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package guia8ejercicio6;
import java.util.Scanner;
import Entidades.Cafetera;
/**
 *
 * @author Rafael
 */
public class Guia8Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantidad;
        Cafetera C1 = new Cafetera();
        do{
        System.out.println("\n" + "Ingrese la cantidad de cafe a la cafetera: ");
        cantidad = leer.nextInt();
        if(cantidad > C1.getCapacidadMaxima()){
            System.out.println("\n" + "El valor ingresado excede la capacidad maxima de la cafetera.");
        }else{
            C1.setCantidadActual(cantidad);
        }
        }while(cantidad > C1.getCapacidadMaxima());
        
        boolean match = false;
        do{
            int opc;
            System.out.println("\n"+"ELIGA UNA DE LAS SIGUIENTES OPCIONES: " + "\n"
                    + "1 - Servir taza de cafe." + "\n"
                    + "2 - Vaciar cafetera." + "\n"
                    + "3 - Agregar cafe a la cafetera." + "\n"
                    + "4 - Salir."
                    + "OPCION: ");
            opc = leer.nextInt();
            switch(opc){
                case 1:
                    int tamaño;
                    System.out.println("\n" + "Digite el tamaño de la taza: ");
                    tamaño = leer.nextInt();
                    C1.servirTaza(tamaño);
                    break;
                case 2:
                    System.out.println("VAciando cafetera....");
                    C1.vaciarCafetera();
                    System.out.println("\n" + "LA cantidad en su cafetera es de: " + C1.getCantidadActual());
                    break;
                case 3:
                    int cafe;
                    int control;
                    do{
                    System.out.println("\n" + "Ingrese la cantidad de cafe a la cafetera: ");
                    cafe = leer.nextInt();
                    control = cafe + C1.getCantidadActual();
                     if(cafe > C1.getCapacidadMaxima() || control > C1.getCapacidadMaxima()){
                     System.out.println("\n" + "El valor ingresado excede la capacidad maxima de la cafetera.");
                    }else{
                         C1.agregarCafe(cafe);
                    }
                        System.out.println("\n" + "Cafe en cafetera: " + C1.getCantidadActual());
                    }while(cafe > C1.getCapacidadMaxima() || control > C1.getCapacidadMaxima() );
                    break;
                case 4:
                    match = true;
                    break;
                default:
                    System.out.println("El valor ingresado esta fuera de parametros");
                    break;
        }
    }while(match == false);
    }
    
}
