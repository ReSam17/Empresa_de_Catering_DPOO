package Controlador.Contr;

import java.util.LinkedList;

import Controlador.Almacenamiento.Ingrediente;
import Controlador.Almacenamiento.Proveedor;
import Controlador.Gestion.Cliente;

public class GestorPersonal {
    private LinkedList <Cliente> clientes;
    private LinkedList <Proveedor> proveedores;
    //COnstructor
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
    public void cambiarCliente(Cliente cliente) {
        //Implementar
    }
    public Cliente generarCliente(String Nname,String email) {
        //Implementar
        return null;
    }
    public Proveedor generarProveedor(String name, Ingrediente oferta) {
        //Implementar
        return null;
    }
    public void provedorSinIngredientes(Proveedor proveedor) {
        //implementar
    }
}