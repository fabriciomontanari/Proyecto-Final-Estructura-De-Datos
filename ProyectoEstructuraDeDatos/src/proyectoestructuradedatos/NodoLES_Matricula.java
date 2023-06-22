
package proyectoestructuradedatos;

public class NodoLES_Matricula {
    private Matricula dato;
    private NodoLES_Matricula siguiente;
    
    public NodoLES_Matricula(){
        this.siguiente=null;
    }

    public Matricula getDato() {
        return dato;
    }

    public void setDato(Matricula dato) {
        this.dato = dato;
    }

    public NodoLES_Matricula getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLES_Matricula siguiente) {
        this.siguiente = siguiente;
    }
    
}
