package Controlador.Contr.Excepciones;

public class TypeNotMatch extends Exception {
    public TypeNotMatch(){
        super("Los tipos de clase no coinciden");
    }
    
}