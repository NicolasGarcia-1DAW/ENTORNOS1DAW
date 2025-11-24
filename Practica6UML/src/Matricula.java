
import java.util.Date;

public class Matricula {

    private Date fecha;
    private double notaFinal;

    private Estudiante estudiante;
    private Curso curso;

    public Matricula(Date fecha, Estudiante estudiante, Curso curso) {
        this.fecha = fecha;
        this.estudiante = estudiante;
        this.curso = curso;
    }

    public double calcularNotaFinal() {
        return 5.0;
    }
}
