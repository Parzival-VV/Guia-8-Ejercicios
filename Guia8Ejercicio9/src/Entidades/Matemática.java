/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

 */
package Entidades;

/**
 *
 * @author Rafael
 */
public class Matemática {
    private Double n1;
    private Double n2;
    
    public Matemática(){
        
    }
    public Matemática (Double n1, Double n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    public Double getN1() {
        return n1;
    }

    public Double getN2() {
        return n2;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }
    
}
