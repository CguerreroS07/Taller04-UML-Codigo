public class Usuario{
    protected String usuario;
    protected String contrasena;
    protected String nombre;
    protected String apellido;
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsaurio(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }
    
    public void setConstrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    protected boolean logIn() {
        return true;
    }
    protected boolean logOut() {
        return true;
    }
}