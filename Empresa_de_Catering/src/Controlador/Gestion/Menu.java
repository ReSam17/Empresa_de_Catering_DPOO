/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Gestion;


public class Menu {
   private double Precio;
    private Producto Menu[];

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public Producto[] getMenu() {
        return Menu;
    }

    public void setMenu(Producto[] Menu) {
        this.Menu = Menu;
    }

    public Menu(double Precio, Producto[] Menu) {
        this.Precio = Precio;
        this.Menu = Menu;
    }

    
    
    
}
