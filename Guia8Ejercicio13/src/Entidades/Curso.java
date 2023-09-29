/*
crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 */
package Entidades;

import java.util.Arrays;

/**
 *
 * @author Rafael
 */
public class Curso {
    
    private String nombreCurso;
    private Integer cantidadHorasPorDia;
    private Integer cantidadDiasPorSemana;
    private String turno; //mañana o tarde.
    private Double precioPorHora;
    private String alumnos[] = new String[5];
    
    public Curso(){
        
    }
    public void Curso(String nombreCurso, Integer cantidadHorasPorDia, Integer cantidadDiasPorSemana, String turno, Double precioPorHora, String alumnos[]){
        this.alumnos = alumnos;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.nombreCurso = nombreCurso;
        this.precioPorHora = precioPorHora;
        this.turno = turno;    
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public Integer getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public Integer getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public Double getPrecioPorHora() {
        return precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setCantidadHorasPorDia(Integer cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public void setCantidadDiasPorSemana(Integer cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setPrecioPorHora(Double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombreCurso=" + nombreCurso + ", cantidadHorasPorDia=" + cantidadHorasPorDia + ", cantidadDiasPorSemana=" + cantidadDiasPorSemana + ", turno=" + turno + ", precioPorHora=" + precioPorHora + ", alumnos=" + Arrays.toString(alumnos) + '}';
    }
    
    
}
