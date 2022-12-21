/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Gestion;


public class Mobiliario {
    private String TipoDeEvento;
    private String Utencilios[];

    public String getTipoDeEvento() {
        return TipoDeEvento;
    }

    public void setTipoDeEvento(String TipoDeEvento) {
        this.TipoDeEvento = TipoDeEvento;
    }

    public String[] getUtencilios() {
        return Utencilios;
    }

    public void setUtencilios(String[] Utencilios) {
        this.Utencilios = Utencilios;
    }

    public Mobiliario(String TipoDeEvento, String[] Utencilios) {
        this.TipoDeEvento = TipoDeEvento;
        this.Utencilios = Utencilios;
    }
    
    
}
