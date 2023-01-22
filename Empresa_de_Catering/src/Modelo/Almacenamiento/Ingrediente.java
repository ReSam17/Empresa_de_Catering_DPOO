
package Modelo.Almacenamiento;

import java.io.Serializable;


public abstract class Ingrediente implements Serializable {
    //atributos
    protected String nombre;
    protected double precio;
    protected double cantidadDisponible;
    protected String unidadDeMedida;
    //constructores
    public Ingrediente(){
        this.nombre=null;
        this.precio=0;
        this.cantidadDisponible=0;
        this.unidadDeMedida=null;
    }
    public Ingrediente(String nombre, double precio, double cantidadDisponible, String unidadDeMedida){
        this.nombre=nombre;
        this.precio=precio;
        this.cantidadDisponible=cantidadDisponible;
        this.unidadDeMedida=unidadDeMedida;
    }
    //set y get
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
    public double getPrecio(){
        return this.precio;
    }    
    public void setCantidadDisponible(double cantidadDisponible){
        this.cantidadDisponible=cantidadDisponible;
    }
    public double getCantidadDisponible(){
        return this.cantidadDisponible;
    }
    public void setUnidadDeMedida(String unidadDeMedida){
        this.unidadDeMedida=unidadDeMedida;
    }
    public String getUnidadDeMedida(){
        return this.unidadDeMedida;
    }
}
