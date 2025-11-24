
import java.util.Date;
import java.util.List;

public class Profesor extends Persona {

    private double salario;

    private List<Curso> cursosDictados;


    public Profesor(String dni, String nombre, Date fechaNacimiento, double salario) {
        super(dni, nombre, fechaNacimiento);
        this.salario = salario;
    }

    public void asignarCurso(Curso c) {
        
    }
}
