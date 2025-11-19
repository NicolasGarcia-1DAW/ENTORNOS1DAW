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
        biblioteca1.mostrarInformacion();

        Sala sala1 = new Sala("Estudio", 5000, true, "estudio", true);
        sala1.informacion();

        //Biblioteca central
        Biblioteca central = new Biblioteca("Central", "Calle Mayor, 1");

        LibroFisico libroFisico1 = new LibroFisico("Don Quijote de la Mancha", "978-84-123456-7", "Alianza", "Español", 1056, 1605, true, "Estantería 1");
        LibroDigital libroDigital1 = new LibroDigital("Java para todos", "978-84-987654-3", "Pearson", "Español", 350, 2020, true, "PDF", 5.2);

        central.addLibro(libroFisico1);
        central.addLibro(libroDigital1);

        SalaEstudio salaEstudio = new SalaEstudio("Sala de Estudio 1", 20, true, "Estudio", true, 10);
        SalaInformatica salaInformatica = new SalaInformatica("Sala de Informática", 15, false, "Informática", true, 15);
        SalaLectura salaLectura = new SalaLectura("Sala de Lectura", 25, true, "Lectura", true);

        central.addSala(salaEstudio);
        central.addSala(salaInformatica);
        central.addSala(salaLectura);

        Usuario usuario1 = new Usuario("Ana", 22, 1001);
        Usuario usuario2 = new Usuario("Luis", 30, 1002);
        Empleado empleado1 = new Empleado("María", 40, "Bibliotecaria", 1352.4);

        salaEstudio.entrarPersona(usuario1);
        salaEstudio.entrarPersona(usuario2);
        salaEstudio.entrarPersona(empleado1);
        central.asignarResponsable(salaEstudio, empleado1);

        salaLectura.getListaLibros().add(libroFisico1);
        salaLectura.getListaLibros().add(libroDigital1);

        System.out.println("\nBiblioteca central:");
        central.mostrarInformacion();

        System.out.println("\nPersonas en la sala de estudios");
        salaEstudio.mostrarPersonas();

        System.out.println("\nLibros en la sala de lectura");
        for (Libro libro : salaLectura.getListaLibros()) {
            libro.informacion();
        }

    }
}
