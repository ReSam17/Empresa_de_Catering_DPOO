package Controlador;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;
import Modelo.Almacenamiento.IngredienteEmpresa;
import Modelo.Almacenamiento.Stock;
import Modelo.Gestion.Propuesta;


public class GestorRecursos implements Serializable{
    private LinkedList <Propuesta> propuestas;
    private Stock stock;
    //Constructor
    public GestorRecursos(Stock stock){
        this.propuestas=new LinkedList<Propuesta>();
        this.stock=stock;
    }
    public GestorRecursos(){
        this.propuestas=new LinkedList<Propuesta>();
        this.stock=new Stock();
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
    
    public void cargarStock(String ruta) throws IOException, ClassNotFoundException {
        
        File file = new File(ruta);
        FileInputStream cargar = new FileInputStream(file);
        ObjectInputStream reader = new ObjectInputStream(cargar);
        int x = reader.readInt();
        this.stock.setCantidadIngredientes(x);
        System.out.println(x);

        for (int i = 0; i < x; i++) {
            Object o = reader.readObject();
            this.stock.getIngrediente().add((IngredienteEmpresa) o);
        }

        reader.close();

    }
    
    public void guardarStock(String ruta) throws IOException{
        
        File file = new File(ruta);
        FileOutputStream guardar = new FileOutputStream(file);
        ObjectOutputStream writer = new ObjectOutputStream(guardar);
        
        writer.writeInt(this.stock.getIngrediente().size());
        
        for (int i = 0; i < this.stock.getIngrediente().size(); i++){
            writer.writeObject(this.stock.getIngrediente().get(i));
        }
        
        writer.flush();
        writer.close();
    }

    public void cargarPropuestas(String ruta) throws IOException, ClassNotFoundException {
        
        File file = new File(ruta);
        FileInputStream cargar = new FileInputStream(file);
        ObjectInputStream reader = new ObjectInputStream(cargar);

        int tam = reader.readInt();

        for (int i = 0; i < tam; i++) {
            Object o = reader.readObject();
            this.propuestas.add((Propuesta) o);
        }
        
        reader.close();
        
    }

    public void guardarPropuestas(String ruta) throws IOException{

        File file = new File(ruta);
        FileOutputStream guardar = new FileOutputStream(file);
        ObjectOutputStream writer = new ObjectOutputStream(guardar);

        writer.writeInt(this.propuestas.size());

        for (int i = 0; i < this.propuestas.size(); i++) {
            writer.writeObject(this.propuestas.get(i));
        }

        writer.flush();
        writer.close();

    }
    
    public int buscarEnStock(String s){
        int pos = -1;
        for(int i = 0; i < this.stock.getIngrediente().size(); i++){
            if(this.stock.getIngrediente().get(i).getNombre().equals(s)){
                pos = i;
                return pos;
            }
        }
        return pos;
    }
    
    public int hacerCompara(String s, int cantidad){
        int pos = buscarEnStock(s);
        if (pos == -1){
            return pos;
        }
        double cantidadNueva = this.stock.getIngrediente().get(pos).getCantidadDisponible() + cantidad;
        this.stock.getIngrediente().get(pos).setCantidadDisponible(cantidadNueva);
        
        return pos;
        
    }
}