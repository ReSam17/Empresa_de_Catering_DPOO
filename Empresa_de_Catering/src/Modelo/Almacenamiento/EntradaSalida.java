/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Almacenamiento;


import java.io.*;
import java.util.*;

public class EntradaSalida {
    public static ArrayList<IngredienteEmpresa> entrada() throws FileNotFoundException, IOException, ClassNotFoundException{
        String ruta=null;
        File archivoEntrada=new File(ruta);
        FileInputStream entrada=new FileInputStream(archivoEntrada);
        ObjectInputStream entradaObjeto=new ObjectInputStream(entrada);
        
        ArrayList<IngredienteEmpresa> ingredientesCargados=new ArrayList<IngredienteEmpresa>();
        int cantIngredientes=entradaObjeto.readInt();
        for (int i = 0; i < cantIngredientes; i++) {
            ingredientesCargados.add((IngredienteEmpresa) entradaObjeto.readObject());
        }
        entradaObjeto.close();
        return ingredientesCargados;
    }
    
    public static void salida(int cantidadIngredientes, ArrayList<IngredienteEmpresa> ingredientesGuardar) throws FileNotFoundException, IOException{
        String ruta=null;
        File archivoSalida=new File(ruta);
        FileOutputStream salida=new FileOutputStream(archivoSalida);
        ObjectOutputStream salidaObjeto=new ObjectOutputStream(salida);
        
        salidaObjeto.writeInt(cantidadIngredientes);
        
        for (int i = 0; i < cantidadIngredientes; i++) {
            salidaObjeto.writeObject(ingredientesGuardar.get(i));
        }
        salidaObjeto.flush();
        salidaObjeto.close();
    }
    
}
