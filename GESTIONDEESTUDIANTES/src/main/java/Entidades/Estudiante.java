/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author PC
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    private int añoEstudio;

    public Estudiante(String nombre, String apellido, String dni, int edad, int anioEstudio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.añoEstudio = anioEstudio;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAñoEstudio() {
        return añoEstudio;
    }

    public void setAñoEstudio(int anioEstudio) {
        this.añoEstudio = anioEstudio;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " - DNI: " + dni + " - Año: " + añoEstudio;
    }
}
