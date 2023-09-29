
package guia8ejercicio5;
import java.util.Scanner;
import Entidades.CuentaBancaria;
import Servicio.CuentaServicio;
/**
 *
 * @author Rafael
 */
public class Guia8Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("**********************************************" + "\n" + 
                "Cree una cuenta para comenzar." + "\n");
        CuentaServicio Cs = new CuentaServicio();
        CuentaBancaria C1 = Cs.crearCuenta();
        
        int recurrencias;
        
       do{ 
        System.out.println("**********************************************" + "\n"
                + "Bienvenido a su cajero virtual." + "n" + "\n"
                + "Por favor elija alguna de las siguientes opciones: " + "\n" + "\n"
                + "1- INGRESAR DINERO A LA CUENTA." + "\n"
                + "2- RETIRAR DINERO DE LA CUENTA." + "\n"
                + "3- EXTRACCIOM RAPIDA." + "\n"
                + "4- CONSULTAR SALDO." + "\n"
                + "5- CONSULTAR DATOS" + "\n"
                + "6- SALIR." + "\n\n"
                + "OPCION: ");
        int opc = leer.nextInt();
        
  
        
            
        switch(opc){
                case 1:
                    //     d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
                    //y se la sumara a saldo actual.
                    System.out.println("\n" + "Ingrese cantidad de dinero que desa depositar: ");
                    double ingreso = leer.nextDouble();
                    Cs.ingresar(C1, ingreso);
                    recurrencias = 1;
                    break;
                  
                case 2:
                    //     e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
                    //la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
                    //pondrá el saldo actual en 0.         
                    System.out.println("\n" + "Ingrese la cantidad de dinero que desea retirar: ");
                    double retiro = leer.nextDouble();
                    Cs.retiro(C1, retiro);
                    recurrencias = 1;
                    break;
                case 3:
                    //    f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
                    //usuario no saque más del 20%.
                    System.out.println("\n" + "Ingrese la cantidad de dinero que desea retirar: ");
                    int retiroRapido = leer.nextInt();
                    Cs.extraccionRapida(C1, retiroRapido);
                    recurrencias = 1;
                    break;
                case 4:
                    System.out.println("");
                    Cs.consultarSaldo(C1);
                    System.out.println("");
                    recurrencias = 1;
                    break;
                case 5:
                    Cs.consultarDatos(C1);
                    System.out.println("");
                    recurrencias = 1;
                    break;
                case 6:
                   recurrencias = 0;
                    
                    break;
                default:
                    System.out.println("\n" + "La opcion ingresada es invalida por favor intente nuevamente.");                   
                    recurrencias = 1;
                    break;
                    
        }
        }while(recurrencias != 0);
        
        
    }
    
}
