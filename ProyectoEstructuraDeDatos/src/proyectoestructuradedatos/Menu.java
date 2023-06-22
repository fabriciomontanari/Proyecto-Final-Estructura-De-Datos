
package proyectoestructuradedatos;

import javax.swing.JOptionPane;

public class Menu {
    Rutina r=new Rutina();
    private static String[] usuarios = {"admin1", "admin2", "admin3"};
    private static String[] contrasenas = {"contra1", "contra2", "contra3"};
    
    
    public void Menu1(){
        boolean autenticado = false;
        while(!autenticado){
            String usuario = JOptionPane.showInputDialog(null,"Introduzca el usuario:");
            String contrasena = JOptionPane.showInputDialog(null, "Introduzca la contraseña:");
            for(int i = 0;i < usuarios.length; i++){
                if(usuarios[i].equals(usuario)&&contrasenas[i].equals(contrasena)){
                    autenticado = true;
                    break;
                }
            }
            if(!autenticado){
                JOptionPane.showMessageDialog(null,"¡Usuario o contraseña incorrectos!");
            }
    }
        int opcion= 0;
        while(opcion !=4){
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Menu Principal\n"
                +"1. Agregar Matricula\n"
                +"2. Eliminar Matricula\n"
                +"3. Ver Matriculas\n"
                +"4. Salir"));
            switch(opcion){
                case 1:
                    r.agregarMatricula();
                    break;
                case 2:
                    r.eliminarMatricula();
                    break;
                case 3:
                    r.mostrarMatricula();
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opcion invalida!");
                    break;
            }
        }
    }

    }
