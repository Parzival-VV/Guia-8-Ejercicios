/*
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, 

 */
package guia8ejercicio13;
import Entidades.Curso;
import Servicios.CursoServicio;
import java.util.Arrays;
/**
 *
 * @author Rafael
 */
public class Guia8Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CursoServicio Cs = new CursoServicio();
        
        Curso C1 = Cs.crearCurso();
        
        System.out.println("------------------------------------------");
        
        Cs.calcularGananciaSemanal(C1);
        
        System.out.println("\n" + "-------------------------------------------------");
        System.out.println(C1.toString());
        System.out.println(Arrays.toString(C1.getAlumnos()));
    }
    
}
