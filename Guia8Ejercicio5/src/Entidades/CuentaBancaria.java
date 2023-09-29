/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
 */
package Entidades;

/**
 *
 * @author Rafael
 */
public class CuentaBancaria {
//a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
//b) Agregar los métodos getters y setters correspondientes
    private int numeroCuenta;
    private long DNI;
    private int saldo;

    public CuentaBancaria() {
    }
    public int getNumeroCuenta(){
        return numeroCuenta;
    }
    public long getDNI(){
        return DNI;
    }
    public int getSaldo(){
        return saldo;
    }

    public void setNumeroCuenta(int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    public void setDNI(long DNI){
        this.DNI = DNI;
    }
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
}