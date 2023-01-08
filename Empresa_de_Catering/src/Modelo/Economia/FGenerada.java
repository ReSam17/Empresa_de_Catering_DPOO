/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Economia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import Modelo.Almacenamiento.IngredienteProveedor;

public class FGenerada extends Factura implements Serializable {
    
    private IngredienteProveedor[] compra;

    public FGenerada(IngredienteProveedor[] compra) {
        super(calcular(compra));
        this.compra=compra;
    }

    public IngredienteProveedor[] getCompra() {
        return compra;
    }

    public void setCompra(IngredienteProveedor[] compra) {
        this.compra = compra;
    }

    private static double calcular(final IngredienteProveedor[] compra) {
        double p = 0;

        for (int i = 0; i < compra.length; i++) {
            p += compra[i].getPrecio();
        }

        return p;
    }

    public void cargar(String ruta) throws IOException, ClassNotFoundException{
        
        File file = new File( ruta);
        FileInputStream entrada = new FileInputStream(file);
        ObjectInputStream cargar = new ObjectInputStream(entrada);

        int tam = cargar.readInt();
        this.compra = new IngredienteProveedor[tam];
        for (int i = 0; i < compra.length; i++) {
            Object o = cargar.readObject();
            this.compra[i] =(IngredienteProveedor) o;
        }

        cargar.close();
        
    }

    public void guardar(String ruta) throws IOException {
        
        File file = new File(ruta);
        FileOutputStream salida = new FileOutputStream(file);
        ObjectOutputStream guardar = new ObjectOutputStream(salida);
        guardar.writeInt(this.compra.length);

        for (int i = 0; i < compra.length; i++) {
            guardar.writeObject(this.compra[i]);
        }
        

        guardar.flush();
        guardar.close();

    }

}
