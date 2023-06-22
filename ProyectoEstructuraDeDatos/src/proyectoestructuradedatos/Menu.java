
package proyectoestructuradedatos;

import javax.swing.JOptionPane;

public class Menu {
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
                +"1. Opciones de Administrador\n"
                +"2. Segunda Opcion\n"
                +"3. Tercera Opcion\n"
                +"4. Salir"));
            switch(opcion){
                case 1:
                    JOptionPane.showMessageDialog(null,"Opcion en proceso!");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Opcion en proceso!");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Opcion en proceso!");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Opcion en proceso!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opcion invalida!");
                    break;
            }
        }
    }

    }
