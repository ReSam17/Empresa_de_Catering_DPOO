
package Modelo.Almacenamiento;


public class IngredienteProveedor extends Ingrediente{
    //atributos
    private boolean disponibilidad;//verificar con reyson, no tiene creado get y set (indica si el proveedor tiene el ingrediente)
    private boolean caducidad;
    //constructores
    public IngredienteProveedor(String nombre, double precio, double cantidadDisponible, String unidadDeMedida, boolean caducidad){
        this.nombre=nombre;
        this.precio=precio;
        this.cantidadDisponible=cantidadDisponible;
        this.unidadDeMedida=unidadDeMedida;
        this.caducidad=caducidad;
    }
    public IngredienteProveedor(){
        this.nombre=null;
        this.precio=0;
        this.cantidadDisponible=0;
        this.unidadDeMedida=null;
        this.caducidad=false;
    }
    // set y get
    public void setCaducidad(boolean caducidad){
        this.caducidad=caducidad;
    }
    public boolean getCaducidad(){
        return this.caducidad;
    }
}
