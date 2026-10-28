import java.util.List;
import java.util.ArrayList;

public class Profesor extends PersonalAcademico {
    private List<Curso> cursosACargo = new ArrayList<>(); 

    public List<Curso> getCursosACargo() { return cursosACargo; }
    public void setCursosACargo(List<Curso> cursosACargo) { this.cursosACargo = cursosACargo; }

    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa) {}
    public void calificarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actividadSumativa) {}
    public void aceptarInscripcion(Curso curso, String usuarioEstudiante) {}
    public void crearNuevoForo(Foro foro) {}
}