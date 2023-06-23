
package proyectoestructuradedatos;

public class Matricula {
    private String nombre;
    private String apellidos;
    private String cedula;
    private String curso;
    private String horario;
    
    public Matricula(){
        this.nombre="";
        this.apellidos="";
        this.cedula="";
        this.curso="";
        this.horario="";
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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
}
