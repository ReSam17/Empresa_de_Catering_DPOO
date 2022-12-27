package Controlador;

import java.util.LinkedList;

public abstract class Gestor <T> {
    private LinkedList<T> elementos;
    
    public abstract int buscar(String s);
    public abstract void adds(T obj);
    public abstract void delete(String s);

}