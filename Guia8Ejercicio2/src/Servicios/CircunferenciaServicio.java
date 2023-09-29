/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class CircunferenciaServicio {
    Scanner leer = new Scanner(System.in);
    
    //Metodo para guardar el valor ingresado en el atributo del objeto.
    public Circunferencia crearCircunferencia(){
        
        Circunferencia c1 = new Circunferencia();
        
        System.out.println("Ingrese el radio: ");
        c1.setRadio(leer.nextDouble());
        
        return c1;
    }
    //Metodo para calcular el area= pi  multiplicado por radio al cuadrado.
    public void area(Circunferencia l1){
        
        Double area = Math.PI * (Math.pow(l1.getRadio(), 2));
        System.out.println("El area del circulo es: " + area);
        
    }
    //Metodo para calcular y mostrar el perimetro.
    public void perimetro(Circunferencia l1){
        
        Double diametro = l1.getRadio() * 2;
        Double perimetro = Math.PI * diametro;
        System.out.println("El perimetro del circulo es: " + perimetro);
    }
    
    
    
}
