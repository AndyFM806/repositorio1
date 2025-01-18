/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author PC
 */
public class SistemaGestion {
    private static final int CAPACIDAD_MAXIMA = 100; 
    private static final Estudiante[] Estudiantes = new Estudiante[CAPACIDAD_MAXIMA];
    private static int contador = 0;

    public static boolean agregarAlumno(Estudiante alumno) {
        if (contador < CAPACIDAD_MAXIMA) {
            Estudiantes[contador] = alumno;
            contador++;
            return true;
        }
        return false;
    }

    public static Estudiante[] obtenerAlumnosPorAño(int anioEstudio) {
        Estudiante[] resultado = new Estudiante[CAPACIDAD_MAXIMA];
        int index = 0;
        for (int i = 0; i < contador; i++) {
            if (Estudiantes[i].getAñoEstudio() == anioEstudio) {
                resultado[index] = Estudiantes[i];
                index++;
            }
        }
        return resultado;
    }

    public static Estudiante buscarAlumnoPorDni(String dni) {
        for (int i = 0; i < contador; i++) {
            if (Estudiantes[i].getDni().equals(dni)) {
                return Estudiantes[i];
            }
        }
        return null;
    }

    public static boolean eliminarAlumno(String dni) {
        for (int i = 0; i < contador; i++) {
            if (Estudiantes[i].getDni().equals(dni)) {
                for (int j = i; j < contador - 1; j++) {
                    Estudiantes[j] = Estudiantes[j + 1];
                }
                Estudiantes[contador - 1] = null;
                return true;
            }
        }
        return false;
    }

    public static Estudiante[] obtenerTodosLosAlumnos() {
        Estudiante[] resultado = new Estudiante[contador];
        for (int i = 0; i < contador; i++) {
            resultado[i] = Estudiantes[i];
        }
        return resultado;
    }
}
