import java.util.List;
import java.util.ArrayList;

public class PersonalAcademico extends Usuario {
    private List<Incidente> incidentesIngresados = new ArrayList<>();

    public List<Incidente> getIncidentesIngresados() {
        return incidentesIngresados;
    }

    public void setIncidentesIngresados(List<Incidente> incidentesIngresados) {
        this.incidentesIngresados = incidentesIngresados;
    }

    public void reportarError(String email, String contenido) {
    }

    public void solicitarAsesoramientoDelSistema(String email, String contenido) {
    }

    public void comentarEnForo(Foro foro, String comentario) {
    }
}