package poo;

public class PersonaPOO {
    
    /*
     * Definición de atributos de la persona
    /*/

    private String nombre;
    private int edad;
    private String direccion;
    private String apellidos;
    private String DNI;
    private String email;
    private int telefono;
    private String profesion;
    private int añosExperiencia;

    /*
     * Definición del comportamiento de la persona
    /*/

    public PersonaPOO (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre + " y edad: " + this.edad + ", en la dirección: " + this.direccion);
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion (String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad (int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDNI() {
        return this.DNI;
    }

    public void setAños_experiencia (int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public boolean estaJubilado() {
        if (this.edad >= 65) {
            System.out.println("La persona en cuestión se encuentra jubilada.");
            return true;
        } else {
            if (this.edad >= 18) {
                System.out.println("La persona en cuestión está en edad de trabajar");
            } else {
                System.out.println("La persona es menor y no puede trabajar");
            }
            return false;
        }
    }
}
