/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Crisyippie
 * @version 05-09-2024
 */
public class main {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int opcion,edad,rut, nroDocente;
        String nombreAlumno,fechaNacimiento,fechaIngreso,nombreDocente,sede,nroAsignatura;
        Alumno alumno1 = new Alumno();
        Docente docente1 = new Docente();
        Asignatura asignatura1 = new Asignatura();
        
        
        do {         
            System.out.println("1. Registro Estudiante");
            System.out.println("2. Registro Docente");
            System.out.println("3. Registro Clase ");
            System.out.println("4. Salir");
            opcion = leer.nextInt();
            
            if (opcion == 1) {
                System.out.println("[- Ingresar Datos Alumno -]\n");
                System.out.println("Nombre: ");
                nombreAlumno = leer.next();
                alumno1.setNombre(nombreAlumno);
                
                System.out.println("Fecha Nacimiento: ");
                fechaNacimiento = leer.next();
                alumno1.setFechaNacimiento(fechaNacimiento);
                
                System.out.println("Edad: ");
                edad = leer.nextInt();
                alumno1.setEdad(edad);
                
                System.out.println("Rut: ");
                rut = leer.nextInt();
                alumno1.setRut(rut);
                
                System.out.println("Nombre: " +alumno1.getNombre() + " Fecha Nacimiento: " + alumno1.getFechaNacimiento() + " Edad: " + alumno1.getEdad() + " Rut: " + alumno1.getRut());
            }
            else if (opcion == 2) {
                System.out.println("[- Ingresar Datos Docente -]\n");
                System.out.println("Nombre: ");
                nombreDocente = leer.next();
                docente1.setNombre(nombreDocente);
                
                System.out.println("Fecha Nacimiento: ");
                fechaIngreso = leer.next();
                docente1.setFechaIngreso(fechaIngreso);
                
                System.out.println("Rut: ");
                rut = leer.nextInt();
                docente1.setRut(rut);
                
                System.out.println("N° Docente: ");
                nroDocente = leer.nextInt();
                docente1.setNroDocente(nroDocente);
               
            }
            else if (opcion == 3) {
                System.out.println("[- Ingresar Datos Asignatura -]");
                
            }
        } while (opcion != 4);
        
    }
}
