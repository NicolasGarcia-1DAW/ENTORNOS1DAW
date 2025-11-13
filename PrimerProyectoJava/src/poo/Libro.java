package poo;

public class Libro {
    
    private String titulo;
    private String isbn;
    private String editorial;
    private String idioma;
    private int numPaginas;
    private int anyo;
    private boolean disponible;

    public Libro (String titulo, String isbn, String editorial, String idioma, int numPaginas, int anyo, boolean disponible) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
        this.idioma = idioma;
        this.numPaginas = numPaginas;
        this.anyo = anyo;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getNumeroPaginas() {
        return numPaginas;
    }

    public void setNumeroPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getanyo() {
        return anyo;
    }

    public void setanyo(int anyo) {
        this.anyo = anyo;
    }

    public void estaDisponible() {
        if (disponible) {
            System.out.println("El libro " + titulo + " está disponible para reservar");
        } else {
            System.out.println("El libro " + titulo + " no está disponible para reservar");
        }
    }

    public void esExtranjero() {
        if (idioma.equalsIgnoreCase("español") || idioma.equalsIgnoreCase("castellano")) {
            System.out.println("El libro " + titulo + " está escrito en español");
        } else {
            System.out.println("El libro " + titulo + " está escrito en: " + idioma);
        }
    }

    public void disponibleSysout() {
        if (disponible) {
            System.out.println("Está disponible");
        }
        else {
            System.out.println("No está disponible");
        }
    }

    public void informacion() {
    System.out.print("\nLibro: " + titulo + " - " + editorial + " (" + anyo + "). " + idioma + ", " + numPaginas + " páginas. ");
        if (disponible) {
            System.out.println("Está disponible.");
        }
        else {
            System.out.println("No está disponible.");
        } 
    }
}
