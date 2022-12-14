
package Modelo.Almacenamiento;

import java.io.Serializable;


public class IngredienteEmpresa extends Ingrediente implements Serializable{
    //atributos
    private double cantidadMinima;
    private double cantidadCompra;
    private double cantidadMaxima;
    //constructores
    public IngredienteEmpresa(){
        this.nombre=null;
        this.precio=0;
        this.cantidadDisponible=0;
        this.unidadDeMedida=null;
        this.cantidadMinima=0;
        this.cantidadCompra=0;
        this.cantidadMaxima=0;
    }
    public IngredienteEmpresa(String nombre, double precio, double cantidadDisponible, String unidadDeMedida,double cantidadMinima, double cantidadCompra, double cantidadMaxima) {
        this.nombre=nombre;
        this.precio=precio;
        this.cantidadDisponible=cantidadDisponible;
        this.unidadDeMedida=unidadDeMedida;
        this.cantidadMinima=cantidadMinima;
        this.cantidadCompra=cantidadCompra;
        this.cantidadMaxima=cantidadMaxima; 
    }
    //set y get
    public void setCantidadMinima(double cantidadMinima){
        this.cantidadMinima=cantidadMinima;
    }
    public double getCantidadMinima(){
        return this.cantidadMinima;
    }
    public void setCantidadCompra(double cantidadCompra){
        this.cantidadCompra=cantidadCompra;
    }
    public double getCantidadCompra(){
        return this.cantidadCompra;
    }
    public void setCantidadMaxima(double cantidadMaxima){
        this.cantidadMaxima=cantidadMaxima;
    }
    public double getCantidadMaxima(){
        return this.cantidadMaxima;
    }
}
