/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tecnicos
 */
public class Modelo_clientes {

    /**
     * Método insertar cliente: copia los datos de la ventana cliente en un txt.
     * si existe el txt agrega la linea con los datos sino crea el txt nuevo
     * siempre en la carpeta padre del proyecto cpn los datos de la ventana
     * cliente.
     */
    public void InsertarClientes(String nombre, String apellidos, String ci, String correo, int telefono) throws FileNotFoundException, IOException {

        File archivo;
        FileWriter escribir;
        PrintWriter escribir_linea;

        //Preparo el documento
        archivo = new File("clientes.txt");

        //Si no existe el documento lo creo nuevo
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                escribir = new FileWriter(archivo, true);
                escribir_linea = new PrintWriter(escribir);
                //Escribimos en el fichero
                escribir_linea.write(nombre + "\t" + apellidos + "\t" + ci + "\t" + correo + "\t" + telefono + "\r\n");
                //Guardamos los cambios del fichero
                escribir_linea.flush();
                escribir_linea.close();
                escribir.close();
                JOptionPane.showMessageDialog(null, "Cliente insertado satisfactoriamente. ", "Felicitaciones", JOptionPane.OK_OPTION);

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Imposible insertar el cliente. ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } //Si ya existe el documento escribo sobre el actual
        else {

            try {
                escribir = new FileWriter(archivo, true);
                escribir_linea = new PrintWriter(escribir);
                //Escribimos en el fichero
                escribir_linea.write(nombre + "\t" + apellidos + "\t" + ci + "\t" + correo + "\t" + telefono + "\r\n");
                //  escribir_linea.newLine();
                //Guardamos los cambios del fichero
                escribir_linea.flush();
                escribir_linea.close();
                escribir.close();

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Imposible crear el cliente. ", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }

    }

    /**
     *
     * El método muestra en el jtable los datos que están recogidos en el txt
     * que se insertó los datos anteriormente.
     */
    public void MostrarClientes(DefaultTableModel modelo) {
        FileReader archivo;
        //flujo de lectura
        BufferedReader lector;
        try {
            archivo = new FileReader("clientes.txt");

            if (archivo.ready()) {

                lector = new BufferedReader(archivo);
                Object[] linea = lector.lines().toArray();
                for (int i = 0; i < linea.length; i++) {
                    String[] fila = linea[i].toString().split("\t");
                    modelo.addRow(fila);
                    lector.close();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Imposible leer el archivo. ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Imposible leer el archivo. ", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Borrar fichero
    public void EliminarFicheroTxt(File fichero) throws IOException {

        if (fichero.exists()) {
            fichero.delete();
            System.out.println("Fichero eliminado satisfactoriamente");
        }

    }

    //cambiar nombre del fichero
    public void CambiarNombrerFicheroTxt(File fichero) throws IOException {

        if (fichero.exists()) {
            fichero.renameTo(new File("Pepito.txt"));
        }

    }

    /*
    
    trabajo con dos archivos el que ya tengo que lo nombro archivo_viejo y uno nuevo
    si existe el archivo viejo paso las lineas para el nuevo archivo digase archico a los txt
    mientras no llegue a las lineas vacíaso o la linea sea la que quiero borrar.
    en fin cuando todo esto pase ya tengop en el nuevo archivo todas las lineas excepto la borrada
    borro el archivo viejo y al nuevo lo renombro con clientes.txt.
    
    */
    public void EliminarLineaDelArchivo(String linea_a_borrar) throws IOException {

        File archivo_viejo = new File("clientes.txt");
        File archivo_nuevo = new File("archivo_nuevo.txt");

        FileWriter escribir;
        PrintWriter escribir_linea;

        BufferedReader lector;
        try {

            if (archivo_viejo.exists()) {

                BufferedReader flee = new BufferedReader(new FileReader(archivo_viejo));
                String linea;
                //Recorro el fichero de texto linea a linea
                while ((linea = flee.readLine()) != null) {
                    if (!linea.contains(linea_a_borrar)) {
                        archivo_nuevo.createNewFile();
                        escribir = new FileWriter(archivo_nuevo, true);
                        escribir_linea = new PrintWriter(escribir);
                        //Escribimos en el fichero
                        escribir_linea.write(linea + "\r\n");
                        //Guardamos los cambios del fichero
                        escribir_linea.flush();
                        escribir_linea.close();
                        escribir.close();
                    }
                }

                flee.close();
                System.out.println(archivo_viejo.getName());
                archivo_viejo.delete();
                archivo_nuevo.renameTo(new File("clientes.txt"));
                
            } else {
                JOptionPane.showMessageDialog(null, "Imposible leer el archivo. ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Imposible leer el archivo. ", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public void ModificarLineaDelArchivo(String linea_a_borrar, String linea_nueva) throws IOException {

        File archivo_viejo = new File("clientes.txt");
        File archivo_nuevo = new File("archivo_nuevo.txt");

        FileWriter escribir;
        PrintWriter escribir_linea;

        BufferedReader lector;
        try {

            if (archivo_viejo.exists()) {

                BufferedReader flee = new BufferedReader(new FileReader(archivo_viejo));
                String linea;
                //Recorro el fichero de texto linea a linea
                while ((linea = flee.readLine()) != null) {
                    if (!linea.contains(linea_a_borrar)) {
                        archivo_nuevo.createNewFile();
                        escribir = new FileWriter(archivo_nuevo, true);
                        escribir_linea = new PrintWriter(escribir);
                        //Escribimos en el fichero
                        escribir_linea.write(linea + "\r\n");
                        //Guardamos los cambios del fichero
                        escribir_linea.flush();
                        escribir_linea.close();
                        escribir.close();
                    } else{
                
                archivo_nuevo.createNewFile();
                        escribir = new FileWriter(archivo_nuevo, true);
                        escribir_linea = new PrintWriter(escribir);
                        //Escribimos en el fichero
                        escribir_linea.write(linea_nueva + "\r\n");
                        //Guardamos los cambios del fichero
                        escribir_linea.flush();
                        escribir_linea.close();
                        escribir.close();
                    }
                }

                flee.close();
                System.out.println(archivo_viejo.getName());
                archivo_viejo.delete();
                archivo_nuevo.renameTo(new File("clientes.txt"));
                
            } else {
                JOptionPane.showMessageDialog(null, "Imposible leer el archivo. ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Imposible leer el archivo. ", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
    
     public boolean buscar_ci(String ci_cliente) throws IOException {

        File archivo_clientes = new File("clientes.txt");

        BufferedReader lector;
        
         try {

            if (archivo_clientes.exists()) {

                BufferedReader flee = new BufferedReader(new FileReader(archivo_clientes));
                String linea;
                //Recorro el fichero de texto linea a linea
                while ((linea = flee.readLine()) != null) {
                    if (linea.contains(ci_cliente)) {
                        return true;
                    }
                }

                flee.close();
                
            } else {
                JOptionPane.showMessageDialog(null, "Imposible leer el archivo. ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Imposible leer el archivo. ", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return false;

    }

}
