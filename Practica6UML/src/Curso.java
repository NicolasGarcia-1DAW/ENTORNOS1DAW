
import java.util.List;
 
public class Curso {

    private String codigo;
    private String nombre;
    private int cupoMaximo;

    private Profesor profesor;
    private List<Horario> horarios;
    private List<Matricula> inscripciones;
    private List<Departamento> departamentos;

    public Curso(String codigo, String nombre, int cupoMaximo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cupoMaximo = cupoMaximo;
    }

    public Matricula inscribir(Estudiante e) {
        return null;
    }
}
