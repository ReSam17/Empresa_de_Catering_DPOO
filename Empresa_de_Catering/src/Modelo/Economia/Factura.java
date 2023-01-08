/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Economia;



public class Factura {

    private double precio;
    
    //Constructores

    public Factura(double precio) {
    this.precio=precio;
    }

    //geter y seter
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
