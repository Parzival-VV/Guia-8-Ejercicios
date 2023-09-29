/*


 */
package Servicios;
import java.util.Scanner;
import Entidades.Movil;
/**
 *
 * @author Rafael
 */
public class MovilServicio {
    Scanner leer = new Scanner(System.in);
//     Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
//instanciar un objeto Celular y poder cargarlo en nuestro programa.
    public Movil cargarCelular() {
        Movil M1 = new Movil();

        System.out.println("Ingrese marca: " + "\n");
        M1.setMarca(leer.next());
        System.out.println("Ingrese precio: " + "\n");
        M1.setPrecio(leer.nextDouble());
        System.out.println("Ingrese modelo: " + "\n");
        M1.setModelo(leer.next());
        System.out.println("Ingrese memoria RAM: " + "\n");
        M1.setRam(leer.nextInt());
        System.out.println("Ingrese almacenamiento: " + "\n");
        M1.setAlmacenamiento(leer.nextInt());
        ingresarcodigo(M1);


        return M1;
    }
//     Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
//números de un celular. Para ello, puede utilizarse un bucle repetitivo
    public void ingresarcodigo(Movil M1){
                int aux[] = new int[7];
        int control;
        for (int i = 0; i < 7; i++) {
            do {
                System.out.println("Ingrese el digito " + (i + 1) + ": " + "\n");
                control = leer.nextInt();
                if (control > 10) {
                    System.out.println("\n" + "ingrese de a un digito por vez." + "\n");
                } else {
                    aux[i] = control;
                }
            } while (control > 10);
        }
        M1.setCodigo(aux);    
    }
}
