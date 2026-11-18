package EjerciciosHerencia.Ejercicio2;

public class Libro {
    public String titulo;
    public String autor;
    public int anio;

    public Libro(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public void mostrarInfo() {
        System.out.println("=== Informacion del Libro ===");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Anio: " + this.anio);
    }
}
