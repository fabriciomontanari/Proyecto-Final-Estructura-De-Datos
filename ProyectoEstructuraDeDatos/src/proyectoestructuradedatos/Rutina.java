
package proyectoestructuradedatos;

import javax.swing.JOptionPane;

public class Rutina {
    
    private NodoLES_Matricula inicio;
    
    public Rutina(){
        this.inicio=null;
    }
    
    public boolean esVacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }
    public void agregarMatricula(){
        Matricula m = new Matricula();
        m.setNombre(JOptionPane.showInputDialog(null,"Digite el nombre del estudiante:"));
        m.setApellidos(JOptionPane.showInputDialog(null,"Digite los apellidos del estudiante:"));
        m.setCedula(JOptionPane.showInputDialog(null,"Digite el numero de cedula del estudiante:"));
        m.setCurso(JOptionPane.showInputDialog(null,"Digite el curso que desea matricular el estudiante:"));
        m.setHorario(JOptionPane.showInputDialog(null,"Digite el horario del curso matriculado:"));
        
        NodoLES_Matricula nuevo = new NodoLES_Matricula();
        nuevo.setDato(m);
        if(esVacia()){
            inicio=nuevo;
        }else if(m.getNombre().compareTo(inicio.getDato().getNombre())<0){
            nuevo.setSiguiente(inicio);
            inicio=nuevo;
        }else if(inicio.getSiguiente()==null){
            inicio.setSiguiente(nuevo);
        }else{
            NodoLES_Matricula aux=inicio;
            while((aux.getSiguiente()!=null)&&(aux.getSiguiente().getDato().getNombre().compareTo(m.getNombre())<0)){
                aux=aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }
    }
    public void eliminarMatricula(){
        if(!esVacia()){
            String cedula = JOptionPane.showInputDialog(null,"Digite la cedula del estudiante que desea eliminar la matricula:");
            if(cedula.equals(inicio.getDato().getCedula())){
                inicio=inicio.getSiguiente();
                JOptionPane.showMessageDialog(null,"Matricula eliminada correctamente!");
            }else{
                NodoLES_Matricula anterior;
                NodoLES_Matricula auxiliar;
                anterior = inicio;
                auxiliar = inicio.getSiguiente();
                while ((auxiliar!=null)&&(!auxiliar.getDato().getCedula().equals(cedula))){
                    anterior=anterior.getSiguiente();
                    auxiliar=auxiliar.getSiguiente();
                }
                if(auxiliar!=null){
                    anterior.setSiguiente(auxiliar.getSiguiente());
                }
                JOptionPane.showMessageDialog(null,"Matricula eliminada correctamente!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se puede eliminar, Matriculas vacias!");
        }
    }
    public void mostrarMatricula(){
        if(!esVacia()){
            String s="";
            NodoLES_Matricula aux=inicio;
            while(aux!=null){
                s=s+aux.getDato().getNombre()+" "+aux.getDato().getApellidos()+"\n"+
                        aux.getDato().getCurso()+"\n"+
                        aux.getDato().getHorario()+"\n"+"- - - - - - - - - -\n";
                aux=aux.getSiguiente();
        }
            JOptionPane.showMessageDialog(null,"Lista de Matriculas: \n"+s);
    }else{
            JOptionPane.showMessageDialog(null,"No se puede mostrar, matriculas vacias!");
        }
}
}