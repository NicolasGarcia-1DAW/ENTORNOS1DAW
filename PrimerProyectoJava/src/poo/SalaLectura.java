package poo;

import java.util.ArrayList;
import java.util.List;

public class SalaLectura extends Sala {

    private List<Libro> listaLibros;

    public SalaLectura(String nombre, int capacidad, boolean pizarra, String tipo, boolean disponible) {
        super(nombre, capacidad, pizarra, tipo, disponible);
        this.listaLibros = new ArrayList<>();
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }
}
