package Controlador;

import java.util.LinkedList;
import Controlador.Almacenamiento.Ingrediente;
import Controlador.Almacenamiento.Proveedor;
import Modelo.Gestion.Cliente;
//ESPERANDO POR MIS COMPAÑEROS;
public class GestorPersonal extends Gestor {
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
    public void cambiarCliente(Cliente cliente) {
        //Implementar
    }
    public void generarCliente(String Nname,String email) {
        Cliente nuevo = new Cliente(Nname, null, null, email, null, email, null);
        this.clientes.add(nuevo);
    }
    public void generarProveedor(String name, Ingrediente oferta) {
        Proveedor nuevo = new Proveedor(name, oferta);
        
    }
    public void provedorSinIngredientes(Proveedor proveedor) {
        /*String s=proveedor.getName();
        for (int i = 0; i < proveedores.size(); i++) {
            
        }*/
    }
    public int buscar(Object obj) {
        if (obj instanceof Proveedor) {
            for (int i = 0; i < this.proveedores.size(); i++) {
                
            }
        }else if(obj instanceof Cliente){

        }
        return 0;
        
    }

    @Override
    public int buscar(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void adds(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}