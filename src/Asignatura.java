/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Crisyippie
 * @version 05-09-2024
 */
public class Asignatura {
    
    private int codAsignatura,nota1,nota2,nota3;
    private String nombreAsignatura,nombreEstudiante,nombreDocente;

    public Asignatura() {
    }

    public Asignatura(int codAsignatura, int nota1, int nota2, int nota3, String nombreAsignatura, String nombreEstudiante, String nombreDocente) {
        this.codAsignatura = codAsignatura;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nombreAsignatura = nombreAsignatura;
        this.nombreEstudiante = nombreEstudiante;
        this.nombreDocente = nombreDocente;
    }

    public int getCodAsignatura() {
        return codAsignatura;
    }

    public void setCodAsignatura(int codAsignatura) {
        this.codAsignatura = codAsignatura;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getNombreDocente() {
        return nombreDocente;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }
    
    
}
