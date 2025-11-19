package poo;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends PersonaPOO {

    private int numSocio;
    private List<Libro> listaLibrosPrestados;

    public Usuario(String nombre, int edad, int numSocio) {
        super(nombre, edad);
        this.numSocio = numSocio;
        this.listaLibrosPrestados = new ArrayList<>();
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    public List<Libro> getListaLibrosPrestados() {
        return listaLibrosPrestados;
    }
}
