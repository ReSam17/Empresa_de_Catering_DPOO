package Controlador;

import java.util.LinkedList;
import Modelo.Almacenamiento.Ingrediente;
import Modelo.Almacenamiento.Proveedor;
import Modelo.Almacenamiento.Stock;
import Modelo.Gestion.Pedido;
import Modelo.Gestion.Propuesta;


public class GestorRecursos {
    private LinkedList <Propuesta> propuestas;
    private Stock stock;
    //Constructor
    public GestorRecursos(Stock stock){
        this.propuestas=new LinkedList<Propuesta>();
        this.stock=stock;
    }
    //Geter And Seter
    public LinkedList<Propuesta> getPropuestas() {
        return propuestas;
    }
    public void setPropuestas(LinkedList<Propuesta> propuestas) {
        this.propuestas = propuestas;
    }
    public Stock getStock() {
        return stock;
    }
    public void setStock(Stock stock) {
        this.stock = stock;
    }
    //Metódos específicos
    public void enviarPropuesta(Propuesta propuesta) {
        //IMplementar
    }
    public Ingrediente hacerCompra(Proveedor proveedor) {
        //Implementar
        return null;
    }
    public Pedido formalizarPedido(Propuesta propuesta){
        //Implementar
        return null;
    }
}