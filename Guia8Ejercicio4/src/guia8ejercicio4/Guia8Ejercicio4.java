/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package guia8ejercicio4;

import Servicios.RectanguloServicio;
import Entidades.Rectangulo;

/**
 *
 * @author Rafael
 */
public class Guia8Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RectanguloServicio Rs = new RectanguloServicio();
        Rectangulo R1 = Rs.crearRectangulo();
        
        Rs.perimetro(R1);
        Rs.calcularSuperficie(R1);
        Rs.dibujarRectangulo(R1);
        System.out.println("");
    }
    
}
