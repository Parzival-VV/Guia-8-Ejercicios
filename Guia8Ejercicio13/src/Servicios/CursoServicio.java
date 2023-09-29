/*


 */
package Servicios;
import java.util.Scanner;
import Entidades.Curso;
/**
 *
 * @author Rafael
 */
public class CursoServicio {
    Scanner leer = new Scanner(System.in);
    
    Curso C1 = new Curso();
//    método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
//que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
//en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
//nombre de cada alumno. 
    /**
     * 
     * @param C1 
     */
    private void cargarAlumnos(Curso C1){
        String alumnosAux[] = new String[5];
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < alumnosAux.length; i++) {
            System.out.println("\n" + "Ingrese el nombre del alumno " + i + " :");
            alumnosAux[i] = leer.next();
        }
        C1.setAlumnos(alumnosAux);
        System.out.println("");
    }

// Método crearCurso(): el método crear curso, le pide los valores de los atributos al
//usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
//al atributo alumnos

    public Curso crearCurso() {
        
        cargarAlumnos(C1);
        System.out.println("\n" + "Ingrese turno mañana o tarde: ");
        C1.setTurno(leer.next());
        System.out.println("\n" + "Ingrese cantidad de horas por dia: ");
        C1.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("\n" + "Ingrese cantidad de dias por semana: ");
        C1.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("\n" + "Ingrese el precio por hora: ");
        C1.setPrecioPorHora(leer.nextDouble());
        return C1;
    }
//     Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
//en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
//día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
//se repite el encuentro.   
    public void calcularGananciaSemanal(Curso C1){
        double ganancias;
        
        ganancias = ((C1.getPrecioPorHora() * C1.getCantidadHorasPorDia()) * C1.getCantidadDiasPorSemana()) * C1.getAlumnos().length;
        
        System.out.println("La ganancia semanal fue de : $" + ganancias);
    }

    
}

