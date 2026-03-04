package com.example;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    public Libro() {
        this.titulo = "Desconocido";
        this.autor = "Anónimo";
        this.paginas = 0;
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = 0;
    }

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void mostrarDetalles() {
        System.out.println("Libro: " + titulo + " | Autor: " + autor + " | Páginas: " + paginas);
    }
}