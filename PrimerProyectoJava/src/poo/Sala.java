package poo;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    
    private String nombre;
    private int capacidad;
    private boolean pizarra;
    private String tipo;
    private boolean disponible;
    private List <PersonaPOO> personas;

    public Sala (String nombre, int capacidad, boolean pizarra, String tipo, boolean disponible) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.pizarra = pizarra;
        this.tipo = tipo;
        this.disponible = disponible;
        this.personas = new ArrayList<>();
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

    public List<PersonaPOO> getPersonas() {
        return personas;
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

    public void entrarPersona(PersonaPOO p) {
        if (personas.size() < capacidad) {
            personas.add(p);
            System.out.println(p.getNombre() + " ha entrado a la sala " + nombre);
        } else {
            System.out.println("No se puede añadir a " + p.getNombre() + " a la sala " + nombre + ". Sala llena.");
        }
    }

    public void salirPersona(PersonaPOO p) {
        if (personas.contains(p)) {
            personas.remove(p);
            System.out.println(p.getNombre() + " ha salido de la sala " + nombre);
        } else {
            System.out.println(p.getNombre() + " no está en la sala " + nombre);
        }
    }

    public void mostrarPersonas() {
        System.out.println("Personas en la sala " + nombre + ":");
        if (personas.isEmpty()) {
            System.out.println("  La sala está vacía.");
        } else {
            for (PersonaPOO p : personas) {
                System.out.println("- " + p);
            }
        }
    }
}
