/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Economia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Modelo.Gestion.Menu;
import Modelo.Gestion.Producto;

public class FEmitida extends Factura{
    
    private Menu venta;

    public FEmitida(Menu venta) {
        super(venta.getPrecio());
        this.venta=venta;
    }

    public Menu getVenta() {
        return venta;
    }

    public void setVenta(Menu venta) {
        this.venta = venta;
    }

    public Producto[] emitir() {
        Producto []p = new Producto[this.venta.getMenu().length];

        for (int i = 0; i < p.length; i++) {
            p[i] = this.venta.getMenu()[i];
        }
        return p;
    }

    public void guardar(String ruta) throws IOException {
        
        File file = new File(ruta);
        FileOutputStream salida = new FileOutputStream(file);
        ObjectOutputStream guardar = new ObjectOutputStream(salida);

        guardar.writeObject(this.venta);

        guardar.flush();
        guardar.close();
    }

    public void cargar (String ruta) throws IOException, ClassNotFoundException {

        File file = new File( ruta);
        FileInputStream entrada = new FileInputStream(file);
        ObjectInputStream cargar = new ObjectInputStream(entrada);

        Object o = cargar.readObject();
        this.venta = (Menu) o;

        cargar.close();
    }
}
