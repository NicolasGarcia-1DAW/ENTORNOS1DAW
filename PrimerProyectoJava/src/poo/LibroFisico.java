package poo;

public class LibroFisico extends Libro {

    private String ubicacion;

    public LibroFisico(String titulo, String isbn, String editorial, String idioma, int numPaginas, int anyo, boolean disponible, String ubicacion) {
        super(titulo, isbn, editorial, idioma, numPaginas, anyo, disponible);
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
