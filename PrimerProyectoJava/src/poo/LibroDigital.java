package poo;

public class LibroDigital extends Libro {
    private String formato;
    private double tamañoMB;

    public LibroDigital(String titulo, String isbn, String editorial, String idioma, int numPaginas, int anyo, boolean disponible, String formato, double tamañoMB) {
        super(titulo, isbn, editorial, idioma, numPaginas, anyo, disponible);
        this.formato = formato;
        this.tamañoMB = tamañoMB;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public double getTamañoMB() {
        return tamañoMB;
    }

    public void setTamañoMB(double tamañoMB) {
        this.tamañoMB = tamañoMB;
    }
}
