package poo;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    
    private String nombre;
    private String direccion;
    private int horaApertura;
    private int horaCierre;
    private List <Libro> libros;
    private List <Sala> salas;
    private int totalPersonasSala;

    public Biblioteca (String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horaApertura = 9;
        this.horaCierre = 22;
        this.libros = new ArrayList<>();
        this.salas = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getHoraApertura() {
        return this.horaApertura;
    }

    public void setHoraApertura(int horaApertura) {
        this.horaApertura = horaApertura;
    }

    public int getHoraCierre() {
        return this.horaCierre;
    }

    public void setHoraCierre(int horaCierre) {
        this.horaCierre = horaCierre;
    }

    public void estaAbierta (int hora) {
        if (hora > this.horaApertura && hora < this.horaCierre) {
            System.out.println("La biblioteca está abierta");
        } else {
            System.out.println("La biblioteca está cerrada");
        }
    }

    public void informacion () {
        System.out.println("Biblioteca: " + nombre + " - " + direccion + ". Abierto de " + horaApertura + " a " + horaCierre);
    }

    public void addLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro añadido: " + libro.getTitulo());
    }

    public void removeLibro(Libro libro) {
        libros.remove(libro);
        System.out.println("Libro eliminado: " + libro.getTitulo());
    }

    public void addSala(Sala sala) {
        salas.add(sala);
        System.out.println("Sala añadida: " + sala.getNombre());
    }

    public void removeSala(Sala sala) {
        salas.remove(sala);
        System.out.println("Sala eliminada: " + sala.getNombre());
    }

    //Considero mostrar los libros, luego mostrar salas y finalmente mostrar bilbioteca
    //De esta forma podemos usar los metodos mostrarLibros y mostrarSalas de forma independiente si nos hiciera falta
    //Los vamos a dejar public por si quisieramos usarlo, aunque en este momento podríamos ponerlas private y dejar public solo mostrarBiblioteca

    public void mostrarLibros() {
        System.out.println("Libros en la biblioteca:");
        for (Libro libro : libros) {
            System.out.println("- " + libro);
        }
    }

    public void mostrarSalas() {
        System.out.println("Salas de la biblioteca:");
        for (Sala sala : salas) {
            System.out.println("- " + sala);
        }
    }

    public void mostrarBiblioteca() {
        System.out.println("Contenido completo de la biblioteca:");
        mostrarLibros();
        mostrarSalas();
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public void mostrarSalasConPersonas() {
        System.out.println("Salas de la biblioteca:");
        for (Sala sala : salas) {
            System.out.println("- " + sala.getNombre() + " (" + sala.getPersonas().size() + " personas)");
        }
    }

    public void mostrarSalasDisponibles() {
        System.out.println("Salas disponibles (vacías):");
        for (Sala sala : salas) {
            if (sala.getPersonas().isEmpty()) {
                System.out.println("- " + sala.getNombre());
            }
        }
    }

    public void mostrarTotalPersonas() {
        for (Sala sala : salas) {
            totalPersonasSala = totalPersonasSala + sala.getPersonas().size();
        }
        System.out.println("Total de personas en todas las salas: " + totalPersonasSala);
    }
}
