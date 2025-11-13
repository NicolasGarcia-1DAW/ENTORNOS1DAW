package poo;

public class Biblioteca {
    
    String nombre;
    String direccion;
    int horaApertura;
    int horaCierre;

    public Biblioteca (String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horaApertura = 9;
        this.horaCierre = 22;
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
}
