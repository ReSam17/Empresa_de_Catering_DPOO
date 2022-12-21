/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Gestion;
import Modelo.Almacenamiento.Ingrediente;

public class Producto {
    
    private double Precio;
    private Ingrediente Ingrediente[];

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public Ingrediente[] getIngrediente() {
        return Ingrediente;
    }

    public void setIngrediente(Ingrediente[] Ingrediente) {
        this.Ingrediente = Ingrediente;
    }

    public Producto(double Precio, Ingrediente[] Ingrediente) {
        this.Precio = Precio;
        this.Ingrediente = Ingrediente;
    }
    
    
    
}
