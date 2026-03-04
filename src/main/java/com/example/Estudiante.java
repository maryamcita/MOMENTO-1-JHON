package com.example;

public class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;

    // Constructor vacío
    public Estudiante() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.promedio = 0.0;
    }

    // Constructor completo
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        setEdad(edad);
        this.promedio = promedio;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("Error: la edad debe ser mayor a 0.");
        }
    }

    public double getPromedio() { return promedio; }
    public void setPromedio(double promedio) { this.promedio = promedio; }

    public boolean haAprobado() {
        return promedio >= 3.0;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad + " | Promedio: " + promedio
                + " | Estado: " + (haAprobado() ? "APROBADO" : "REPROBADO"));
    }
}
