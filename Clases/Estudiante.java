import java.util.List;
import java.util.ArrayList;

public class Estudiante extends PersonalAcademico {
    private List<Curso> cursosInscritos = new ArrayList<>();

    public List<Curso> getCursosInscritos() {
        return cursosInscritos;
    }

    public void setCursosInscritos(List<Curso> cursosInscritos) {
        this.cursosInscritos = cursosInscritos;
    }

    public void solicitarInscripcionCurso(Curso curso) {
    }

    public void realizarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa) {
    }
}