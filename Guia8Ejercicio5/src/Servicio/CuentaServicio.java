
package Servicio;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class CuentaServicio {
    Scanner leer = new Scanner(System.in);
//    c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    public CuentaBancaria crearCuenta(){
        
        CuentaBancaria C1 = new CuentaBancaria();
        
        System.out.println("Ingrese numero de cuenta: ");
        C1.setNumeroCuenta(leer.nextInt());
        System.out.println( "\n"+"Ingrese su numero de identificacion 'DNI': ");
        C1.setDNI(leer.nextLong());
        System.out.println("\n" + "Ingrese su saldo: ");
        C1.setSaldo(leer.nextInt());
        return C1;
    }
//     e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
//la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
//pondrá el saldo actual en 0.
    public void retiro(CuentaBancaria C1, double retirar){
        if(C1.getSaldo() < retirar){
            C1.setSaldo(0);
        }else{
            C1.setSaldo((int) (C1.getSaldo() - retirar));
        }
    }
//     d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
//y se la sumara a saldo actual.
    public void ingresar(CuentaBancaria C1, double ingreso){
        C1.setSaldo((int) (C1.getSaldo() + ingreso));
    }
//    f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
//usuario no saque más del 20%.
    public void extraccionRapida(CuentaBancaria C1, int retiro){
        int limite = (int) (C1.getSaldo() * 0.2);
        if(retiro > limite){
            System.out.println("El valor ingresado supera el limite de extraccion.");
        }else{
            C1.setSaldo(C1.getSaldo() - retiro);
        }
    }
//    g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo(CuentaBancaria C1){
        System.out.println("Su saldo es : $" + C1.getSaldo());
    }
//    h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    public void consultarDatos(CuentaBancaria C1){
        System.out.println("\n" + "******************************************" + "\n" + 
                "LOS DATOS DE SU CUENTA SON LOS SIGUIENTES: " + "\n\n" + 
                "NUMERO DE CUENTA: " + C1.getNumeroCuenta() + "\n" + 
                "NUMERO DE IDENTIFICACION D.N.I: " + C1.getDNI() + "\n" + 
                "SU SALDO ES DE : $" + C1.getSaldo() + "\n");
    }
   
}
//    private int numeroCuenta;
//    private long DNI;
//    private int saldo;
//    private int interes;