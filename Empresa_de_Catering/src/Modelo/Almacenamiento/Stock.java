
package Modelo.Almacenamiento;
import java.util.ArrayList;


public class Stock {
    //atributos  
    private static int cantidadIngredientes=0;
    private ArrayList<IngredienteEmpresa> ingredienteStock;
    //constructores
    public Stock(){
        this.ingredienteStock=new ArrayList<IngredienteEmpresa>();
    }
    public Stock(ArrayList<IngredienteEmpresa> ingrediente){
        this.ingredienteStock=ingrediente; 
    }
    //get y set
     public static int getCantidadIngredientes() {
        return cantidadIngredientes;
    }

    public static void setCantidadIngredientes(int cantidadIngredientes) {
        Stock.cantidadIngredientes = cantidadIngredientes;
    }
    
    public void setIngredienteStock(ArrayList<IngredienteEmpresa> ingrediente){
        this.ingredienteStock=ingrediente;
    }
    public ArrayList<IngredienteEmpresa> getIngrediente(){
        return this.ingredienteStock;
    }
    //metodos
    
    public static boolean validarAgrego(IngredienteProveedor ingredienteAdicionar, IngredienteEmpresa ingredienteVerificar){
        if((ingredienteAdicionar.getCantidadDisponible()+ingredienteVerificar.getCantidadDisponible())>ingredienteVerificar.getCantidadMaxima()){
            return false;
            //no se puede agregar
        }
        else{
            return true;
            //se puede agregar
        }
    }
    public static int encontrarElementoAgregar(IngredienteProveedor ingredienteAdicionar ,Stock stockActual){
        for (int i = 0; i < cantidadIngredientes; i++) {
            if(ingredienteAdicionar.getNombre().trim().equals(stockActual.getIngrediente().get(i).getNombre().trim())){
                return i;
            }
        }
        return -1;
    }
    public static int encontrarElementoEliminar(IngredienteEmpresa ingredienteEliminar ,Stock stockActual){
        for (int i = 0; i < cantidadIngredientes; i++) {
           if(ingredienteEliminar.getNombre().trim().equals(stockActual.getIngrediente().get(i).getNombre().trim())){
                return i;
            }
        }
        return -1;
    }
    public IngredienteEmpresa convertirProveedorEmpresa(IngredienteProveedor ingredienteConvertir){
        IngredienteEmpresa ingredienteNuevo=new IngredienteEmpresa(ingredienteConvertir.getNombre(), ingredienteConvertir.getPrecio(), ingredienteConvertir.getCantidadDisponible(), ingredienteConvertir.getUnidadDeMedida(),0 ,0 ,0);
        return ingredienteNuevo;
        //modificar cuando se haga la interfaz
    }
    public boolean agregarIngrediente(IngredienteProveedor ingredeienteAdicionar, Stock stockActual){
        if(encontrarElementoAgregar(ingredeienteAdicionar, stockActual)==-1){
            this.ingredienteStock.add(convertirProveedorEmpresa(ingredeienteAdicionar));
            cantidadIngredientes++;
            return true;
        }
        else{
        int pos=encontrarElementoAgregar(ingredeienteAdicionar, stockActual);
        if(validarAgrego(ingredeienteAdicionar, stockActual.getIngrediente().get(pos))){
            stockActual.getIngrediente().get(pos).setCantidadDisponible( stockActual.getIngrediente().get(pos).getCantidadDisponible()+ingredeienteAdicionar.getCantidadDisponible());
            return true;
            // se agrego
            }
        }
        return false;
        //no se pudo agragar
    }    
    public boolean eliminarIngrediente(IngredienteEmpresa ingredienteEliminar, Stock stockActual){
        if(encontrarElementoEliminar(ingredienteEliminar, stockActual)==-1){
                return false;
                //no esta el ingrediente
            }
        else{
            int pos=encontrarElementoEliminar(ingredienteEliminar, stockActual);
            stockActual.ingredienteStock.get(pos).setCantidadDisponible(stockActual.ingredienteStock.get(pos).getCantidadDisponible()-ingredienteEliminar.getCantidadDisponible());
            if(stockActual.ingredienteStock.get(pos).getCantidadDisponible()>=0){
                return true;
            //se elimino el ingrediente
            }
            else{
                return false;
                //no hay ingredientes suficientes
            }
            }
        
            
    }
    //avisa cuando queda poco de un ingrediente
    public boolean avisarCompra(IngredienteEmpresa ingrediente){
        if(ingrediente.getCantidadCompra()>ingrediente.getCantidadDisponible()){
            return true;
        }
        else{
            return false;
        }
    }
    //revisa si existe o no el ingrediente en el stock
    public boolean avisarFalta(IngredienteEmpresa ingrediente){
        if(ingrediente.getCantidadDisponible()==0){
            return true;
        }
        else{
            return false;
        }
    }
    //revisa si se pueden agregar mas ingredientes de un tipo dado
    public boolean stockLleno(IngredienteEmpresa ingrediente){
        if(ingrediente.getCantidadMaxima()<=ingrediente.getCantidadDisponible()){
            return true;
        }
        else{
            return false;
        }
    }
    //elimina por completo un ingrediente del stock 
    public void eliminarElemento(int pos){
        ingredienteStock.remove(pos);
    }
}
