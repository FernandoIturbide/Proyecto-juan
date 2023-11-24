package org.example.COLA;

import javax.swing.*;

public class Cola {
    private Nodo inicioCola;
    private Nodo finalCola;
    String Cola = "";

    public Cola(){
        inicioCola = null;
        finalCola = null;
    }

    public boolean ColaVacia(){
        if (inicioCola == null){
            return true;
        }else{
            return false;
        }
    }

    public void Insertar(int info){
        Nodo new_nodo = new Nodo();
        new_nodo.info = info;
        new_nodo.sig = null;

        if(ColaVacia()){
            inicioCola = new_nodo;
            finalCola = new_nodo;
        }else{
            finalCola.sig = new_nodo;
            finalCola = new_nodo;
        }
    }

    public int Extraer(){
        if(!ColaVacia()){
            int info = inicioCola.info;

            if(inicioCola == finalCola){
                inicioCola = null;
                finalCola = null;
            }else{
                inicioCola = inicioCola.sig;
            }
            return info;
        }else {
            return Integer.MAX_VALUE;
        }
    }

    public void MostrarCola(){
        Nodo recorrido = inicioCola;
        String ColaInvertida = "";

        while (recorrido != null){
            Cola += recorrido.info + " ";
            recorrido = recorrido.sig;
        }

        String cadena [] = Cola.split(" ");


        for(int i = cadena.length - 1; i >= 0; i--){
            ColaInvertida += " " + cadena[i];
        }

        JOptionPane.showMessageDialog(null, ColaInvertida);
        Cola = "";
    }
}
