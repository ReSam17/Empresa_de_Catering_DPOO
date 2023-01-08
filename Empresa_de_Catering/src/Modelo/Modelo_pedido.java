/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eddy Espinosa
 */
public class Modelo_pedido {

    //crea un fichero pedidos.txt si no existe el fichero de lo contrario inserta una fila cada vez que se haga un pedido en el sistema.
     public void InsertarPedido(String pedido) throws FileNotFoundException, IOException {

        File archivo;
        FileWriter escribir;
        PrintWriter escribir_linea;

        //Preparo el documento
        archivo = new File("pedidos.txt");

        //Si no existe el documento lo creo nuevo
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                escribir = new FileWriter(archivo, true);
                escribir_linea = new PrintWriter(escribir);
                //Escribimos en el fichero
                escribir_linea.write(pedido + "\r\n");
                //Guardamos los cambios del fichero
                escribir_linea.flush();
                escribir_linea.close();
                escribir.close();
                JOptionPane.showMessageDialog(null, "Pedido insertado satisfactoriamente. ", "Felicitaciones", JOptionPane.OK_OPTION);

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Imposible insertar el pedido. ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } //Si ya existe el documento escribo sobre el actual
        else {

            try {
                escribir = new FileWriter(archivo, true);
                escribir_linea = new PrintWriter(escribir);
                //Escribimos en el fichero
                escribir_linea.write(pedido + "\r\n");
                //  escribir_linea.newLine();
                //Guardamos los cambios del fichero
                escribir_linea.flush();
                escribir_linea.close();
                escribir.close();

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Imposible crear el pedido. ", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }

    }
        
    //lista el menu
    public String[] lista() {
    
        ArrayList<String> listatxt = new ArrayList<String>();

        try {
            FileInputStream fis = new FileInputStream(new File("menu.txt"));
            InputStreamReader isr = new InputStreamReader(fis, "UTF8");
            BufferedReader br = new BufferedReader(isr);

            String linea = br.readLine();
            
            while (linea != null) {
                listatxt.add(linea);
                linea = br.readLine();
            }
            
            br.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Modelo_pedido.class.getName()).log(Level.SEVERE, null, ex);
        }

        String[] arreglo = new String[listatxt.size()];
        arreglo = listatxt.toArray(arreglo);
       
        return arreglo;
    }

    
     public void MostrarPedidos(DefaultTableModel modelo) {
        FileReader archivo;
        //flujo de lectura
        BufferedReader lector;
        try {
            archivo = new FileReader("pedidos.txt");

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
    
     
     public void EliminarUnPedido(String linea_a_borrar) throws IOException {

        File archivo_viejo = new File("pedidos.txt");
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
                archivo_nuevo.renameTo(new File("pedidos.txt"));
                
            } else {
                JOptionPane.showMessageDialog(null, "Imposible leer el archivo. ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Imposible leer el archivo. ", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
     
     
     public void ModificarUnPedido(String linea_a_borrar, String linea_nueva) throws IOException {

        File archivo_viejo = new File("pedidos.txt");
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
                archivo_nuevo.renameTo(new File("pedidos.txt"));
                
            } else {
                JOptionPane.showMessageDialog(null, "Imposible leer el archivo. ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Imposible leer el archivo. ", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
     
     
     
}
