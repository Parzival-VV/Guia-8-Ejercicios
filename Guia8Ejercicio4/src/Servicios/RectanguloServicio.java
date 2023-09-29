/*
//Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
//base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
//con los datos del Rectángulo dados por el usuario. También incluirá un método para
//calcular la superficie del rectángulo y un método para calcular el perímetro del
//rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
//asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
//setters y constructores correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class RectanguloServicio {
//    datos del Rectángulo dados por el usuario.
    public Rectangulo crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        Rectangulo R1 = new Rectangulo();
        System.out.println("Ingrese la base del rectangulo: ");
        R1.setBase(leer.nextDouble());
        System.out.println("\n" + "Ingrese la altura del rectangulo: ");
        R1.serAltura(leer.nextDouble());
        System.out.println("");  
        return R1;
    }
    public void perimetro(Rectangulo R1){
        double perimetro = (R1.getBase() + R1.getAltura()) * 2;
        System.out.println("\n" + "El perimetro del rectangulo especificado es: " + perimetro);
    }
    
    public void calcularSuperficie(Rectangulo R1){
        double superficie = (R1.getBase() * R1.getAltura());
        System.out.println("\n" + "La superficie del rectangulo especificado es: " + superficie);
    }
    public void dibujarRectangulo(Rectangulo R1){
        System.out.println("");
        System.out.println("Acontinuacion dibujado con tantos asteriscos como base y altura alla ingresado." + "\n");
        
        for (int i = 0; i < R1.getBase(); i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 0; i < R1.getAltura() - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < R1.getBase() - 2; j++) {
                System.out.print(" ");  
            }
            System.out.println("*");
        }
        for (int i = 0; i < R1.getBase(); i++) {
            System.out.print("*");
            
        }
    }
    
}
