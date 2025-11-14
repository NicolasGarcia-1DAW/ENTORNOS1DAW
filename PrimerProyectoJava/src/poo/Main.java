package poo;

public class Main {
    public static void main(String[] args) {

        PersonaPOO persona1 = new PersonaPOO("Kylian", 26);
        PersonaPOO persona2 = new PersonaPOO("Lamine", 18);

        persona1.setDireccion("Madrid, 10");

        persona1.mostrarInformacion();
        persona2.mostrarInformacion();

        System.out.println("Para la persona 1 sabemos que tiene " + persona1.getEdad() + " años.");

        Libro libro1 = new Libro("Cien años de soledad", "978-84-376-0494-7", "Santillana", "Español", 471, 1967, true);

        libro1.estaDisponible();
        libro1.informacion();

        Biblioteca biblioteca1 = new Biblioteca("María Teresa León", "Av. de Menesteo, 16 - 11150 El Puerto de Santa María, Cádiz");
        biblioteca1.informacion();

        Sala sala1 = new Sala("Estudio", 5000, true, "estudio", true);
        sala1.informacion();

    }
}
