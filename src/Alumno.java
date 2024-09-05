/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Crisyippie
 * @version 05-09-2024
 * 
 */

public class Alumno {
    
    private String nombre,fechaNacimiento;
    private int edad,rut;

    public Alumno() {
    }

    public Alumno(String nombre, String fechaNacimiento, int edad, int rut) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", edad=" + edad + ", rut=" + rut + '}';
    }
    
    
}
