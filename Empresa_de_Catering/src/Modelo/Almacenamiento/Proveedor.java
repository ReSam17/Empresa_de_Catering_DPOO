
package Controlador.Almacenamiento;
import java.util.ArrayList;

public class Proveedor {
    //atributos
    
    private String nombre;
    private ArrayList<IngredienteProveedor> ingredientes;
    private ArrayList<IngredienteProveedor> ingredientesRecomendados;
    
    //constructor
    public Proveedor(){
        this.nombre=null;
        this.ingredientes=new ArrayList<IngredienteProveedor>();
        this.ingredientesRecomendados=new ArrayList<IngredienteProveedor>();
    }
    public Proveedor(String nombre, ArrayList<IngredienteProveedor> ingredientes, ArrayList<IngredienteProveedor> ingredientesRecomendados){
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.ingredientesRecomendados = ingredientesRecomendados;
    }
    // get y set
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setIngrdientes(ArrayList<IngredienteProveedor> ingredientes){
        this.ingredientes=ingredientes;
    }
    public ArrayList<IngredienteProveedor> getIngredientes(){
            return this.ingredientes;
    }
    public void setIngredientesRecomendados(ArrayList<IngredienteProveedor> ingredientesRecomendados){
        this.ingredientesRecomendados=ingredientesRecomendados;
    }
    public ArrayList<IngredienteProveedor> getIngredientesRecomentados(){
        return this.ingredientesRecomendados;
    }
    //metodos
    public double generarFactura(ArrayList<IngredienteProveedor> ingredienteComprar){
        double factura=0;
        for (int i = 0; i < ingredienteComprar.size(); i++) {
            factura=ingredienteComprar.get(i).getPrecio()+factura;
        }
        return factura;
    }
            
}
