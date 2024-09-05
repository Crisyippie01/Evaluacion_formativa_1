/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Crisyippie
 * @version 05-09-2024
 */
public class Docente {
    
    private String nombre,fechaIngreso,sede;
    private int nroDocente,rut;

    public Docente() {
    }

    public Docente(String nombre, String fechaIngreso, String sede, int nroDocente, int rut) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.sede = sede;
        this.nroDocente = nroDocente;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public int getNroDocente() {
        return nroDocente;
    }

    public void setNroDocente(int nroDocente) {
        this.nroDocente = nroDocente;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Docente{" + "nombre=" + nombre + ", fechaIngreso=" + fechaIngreso + ", sede=" + sede + ", nroDocente=" + nroDocente + ", rut=" + rut + '}';
    }
    
    
}
