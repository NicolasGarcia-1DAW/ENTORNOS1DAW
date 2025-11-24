
import java.util.Date;
import java.util.List;

public class Estudiante extends Persona {

    private boolean repetidor;

    private List<Matricula> matriculas;

    public Estudiante(String dni, String nombre, Date fechaNacimiento, boolean repetidor) {
        super(dni, nombre, fechaNacimiento);
        this.repetidor = repetidor;
    }

    public Matricula inscribirse(Curso c) {
        return null;
    }
}
