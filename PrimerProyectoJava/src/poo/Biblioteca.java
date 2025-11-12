package poo;

public class Biblioteca {
    
    String nombre;
    String direccion;
    int horaApertura;
    int horaCierre;

    public Biblioteca (String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horaApertura = 9;  // 12-11 (en clase)  |  Revisar si como ya le he dado el valor 9, tengo que poner igualmente el get y set
        this.horaCierre = 22;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void estaAbierta(int hora) {
        if (hora > this.horaApertura && hora < this.horaCierre) {
            System.out.println("La biblioteca está abierta");
        } else {
            System.out.println("La biblioteca está cerrada");
        }
    }
}
