
package proyectoestructuradedatos;

public class DatosAdmin {
    private String nombre;
    private String apellidos;
    private String usuario;
    private String contrasena;
    private boolean estado;
    
    
    public DatosAdmin(){
        this.nombre="";
        this.apellidos="";
        this.usuario="";
        this.contrasena="";
        this.estado=true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
