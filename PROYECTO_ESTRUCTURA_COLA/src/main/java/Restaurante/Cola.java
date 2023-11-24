package Restaurante;

import javax.swing.*;

public class Cola {
    private Nodo node;
    public static class Nodo{
        Cliente info;
        Nodo sig;

        public Nodo(Cliente info){
            this.info = info;
        }
    }

    public boolean ColaVacia(){
        return node == null;
    }

    public void Agregar(Cliente info){
        Nodo nuevo = new Nodo(info);
        if(ColaVacia()){
            node = nuevo;
        }else{
            Nodo temp = node;
            while (temp.sig != null){
                temp = temp.sig;
            }
            temp.sig = nuevo;
        }
    }

    public boolean Eliminar() {
        if (!ColaVacia()) {
            node = node.sig;
            return true;
        } else {
            // La cola está vacía, no se puede eliminar ningún elemento
            return false;
        }
    }


    public void Visualizar(JList fila){
        Nodo temp = node;
        String[] strings = new String[15];
        int mirarycontar = 0;
        while (temp != null){
            strings[mirarycontar] = temp.info.Nombre + "--> $" + temp.info.Cobro;
            mirarycontar++;
            temp = temp.sig;
        }
        fila.setModel(new AbstractListModel() {
            @Override
            public int getSize() {
                return strings.length;
            }
            @Override
            public Object getElementAt(int index) {
                return strings [index];
            }
        });
    }

    public int Contar(){
        Nodo temp = node;
        int contar = 0;
        while (temp != null){
            contar++;
            temp = temp.sig;
        }
        return contar;
    }

    public int Cobro(){
        Nodo temp = node;
        int cobrar = 0;
        while (temp != null){
            cobrar += temp.info.Cobro;
            temp = temp.sig;
        }
        return cobrar;
    }

}
