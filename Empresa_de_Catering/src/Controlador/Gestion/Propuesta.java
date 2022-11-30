/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Gestion;


public class Propuesta {
    private Menu Menu;
    private Mobiliario Mobiliario;

    public Menu getMenu() {
        return Menu;
    }

    public void setMenu(Menu Menu) {
        this.Menu = Menu;
    }

    public Mobiliario getMobiliario() {
        return Mobiliario;
    }

    public void setMobiliario(Mobiliario Mobiliario) {
        this.Mobiliario = Mobiliario;
    }

    public Propuesta(Menu Menu, Mobiliario Mobiliario) {
        this.Menu = Menu;
        this.Mobiliario = Mobiliario;
    }
    
    
    
}
