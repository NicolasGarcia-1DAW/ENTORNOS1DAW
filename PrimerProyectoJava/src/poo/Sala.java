package poo;

public class Sala {
    
    String nombre;
    int capacidad;
    boolean pizarra;
    String tipo;
    boolean disponible;

    public Sala (String nombre, int capacidad, boolean pizarra, String tipo, boolean disponible) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.pizarra = pizarra;
        this.tipo = tipo;
        this.disponible = disponible;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean getPizarra() {
        return this.pizarra;
    }

    public void setPizarra(boolean pizarra) {
        this.pizarra = pizarra;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean getDisponible() {
        return this.disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public void estaDisponible(boolean disponible) {
        if (disponible) {
            System.out.println("La sala está disponible para reserva");
        } else {
            System.out.println("La sala no está disponible para reserva");
        }
    }

    public void tienePizarra(boolean pizarra) {
        if (pizarra) {
            System.out.println("La sala tiene pizarra");
        } else {
            System.out.println("La sala no tiene pizarra");
        }
    }

    public void informacion() {
        String textoPizarra;
        String textoDisponible;

        if (pizarra) {
            textoPizarra = "dispone";
        } else {
            textoPizarra = "no dispone";
        }

        if (disponible) {
            textoDisponible = "está";
        } else {
            textoDisponible = "no está";
        }

        System.out.println("Sala: " + nombre + " - " + capacidad + ". Se utiliza para " + tipo + ", " + textoPizarra + " de pizarra y " + textoDisponible + " disponible para su reserva");
        
    }
}
