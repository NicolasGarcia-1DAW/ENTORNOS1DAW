package poo;

public class Main {
    public static void main(String[] args) {

        PersonaPOO persona1 = new PersonaPOO("Kylian", 26);
        PersonaPOO persona2 = new PersonaPOO("Lamine", 18);

        persona1.setDireccion("Madrid, 10");

        persona1.mostrarInformacion();
        persona2.mostrarInformacion();

        System.out.println("Para la persona 1 sabemos que tiene " + persona1.getEdad() + " años.");

    }
}
