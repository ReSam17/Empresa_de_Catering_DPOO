package Controlador;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import Modelo.Almacenamiento.Proveedor;
import Modelo.Gestion.Cliente;

public class GestorPersonal {
    private LinkedList <Cliente> clientes;
    private LinkedList <Proveedor> proveedores;
    //Constructor
    public GestorPersonal(){
        this.clientes=new LinkedList<Cliente>();
        this.proveedores=new LinkedList<Proveedor>();
    }
    //Geter and Seter
    public LinkedList<Cliente> getClientes() {
        return clientes;
    }
    public void setClientes(LinkedList<Cliente> clientes) {
        this.clientes = clientes;
    }
    public LinkedList<Proveedor> getProveedores() {
        return proveedores;
    }
    public void setProveedores(LinkedList<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }
    //Metódos específicos
    
    private int buscarCliente(String s) {
        int posicion = -1;
        for (int i = 0; i < this.clientes.size(); i++) {
            if (clientes.get(i).getNombre().equals(s)) {
                posicion = i;
                return posicion;
                
            }
        }
        return posicion;
    }

    private int buscarProveedor(String s) {
        int posicion = -1;
        for (int i = 0; i < this.proveedores.size(); i++) {
            if (clientes.get(i).getNombre().equals(s)) {
                posicion = i;
                return posicion;
            }
        }
        return posicion;
    }
    
    public void deleteCleinte(String s) {
        this.clientes.remove(buscarCliente(s));
        
    }
    public void deleteProveedor(String s) {
        this.clientes.remove(buscarProveedor(s));
        
    }
    
    public void GuardarClientes(String ruta) throws IOException {
        
        File file=new File(ruta);
        FileOutputStream guardar = new FileOutputStream(file);
        ObjectOutputStream writer = new ObjectOutputStream(guardar);
        
        writer.writeInt(this.clientes.size());

        for (int i = 0; i < this.clientes.size(); i++) {
            writer.writeObject(this.clientes.get(i));
        }

        writer.flush();
        writer.close();
    }
    
    public void GuardarProvedores(String ruta) throws IOException {
        
        File file=new File(ruta);
        FileOutputStream guardar = new FileOutputStream(file);
        ObjectOutputStream writer = new ObjectOutputStream(guardar);
        
        writer.writeInt(this.proveedores.size());

        for (int i = 0; i < this.proveedores.size(); i++) {
            writer.writeObject(this.proveedores.get(i));
        }

        writer.flush();
        writer.close();
    }

    public void cargarClientes(String ruta) throws IOException, ClassNotFoundException {

        File file = new File(ruta);
        FileInputStream cargar = new FileInputStream(file);
        ObjectInputStream reader = new ObjectInputStream(cargar);

        int tam = reader.readInt();

        for (int i = 0; i < tam; i++) {
            Object o = reader.readObject();
            this.clientes.add((Cliente) o);
        }

        reader.close();

    }

    public void cargarProveedores(String ruta) throws IOException, ClassNotFoundException {

        File file = new File(ruta);
        FileInputStream cargar = new FileInputStream(file);
        ObjectInputStream reader = new ObjectInputStream(cargar);

        int tam = reader.readInt();

        for (int i = 0; i < tam; i++) {
            Object o = reader.readObject();
            this.proveedores.add((Proveedor) o);
        }

        reader.close();

    }
}