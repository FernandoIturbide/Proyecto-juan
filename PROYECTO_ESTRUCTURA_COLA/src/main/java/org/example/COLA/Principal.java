package org.example.COLA;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        int opcion = 0,nodo_informacion = 0;
        Cola cola = new Cola();

        do {
            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menu de Opciones\n\n"
                        + "1. Insertar un nodo\n"
                        + "2. Extraer un nodo\n"
                        + "3. Mostrar contenido de la Cola\n"
                        + "4. Salir.\n\n"));

                switch (opcion){
                    case 1:
                        nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el nodo a guardar en el nodo"));
                        cola.Insertar(nodo_informacion);
                        break;
                    case 2:
                        if(!cola.ColaVacia()){
                            JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el valor: " + cola.Extraer());
                        }else{
                            JOptionPane.showMessageDialog(null, "La cola está vacía");
                        }
                        break;
                    case 3:
                        cola.MostrarCola();
                        break;
                    case 4:
                        opcion = 4;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no disponible");
                        break;
                }

            }catch(NumberFormatException e){
            }
        } while (opcion !=4);
    }
}
