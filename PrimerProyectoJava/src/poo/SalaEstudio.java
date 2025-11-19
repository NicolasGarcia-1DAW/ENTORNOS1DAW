package poo;

public class SalaEstudio extends Sala {

    private int numMesas;

    public SalaEstudio(String nombre, int capacidad, boolean pizarra, String tipo, boolean disponible, int numMesas) {
        super(nombre, capacidad, pizarra, tipo, disponible);
        this.numMesas = numMesas;
    }

    public int getNumMesas() {
        return numMesas;
    }

    public void setNumMesas(int numMesas) {
        this.numMesas = numMesas;
    }
}
