/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Gestion;


public class Pedido {
    private String Fecha;
    private String TipoDeEvento;
    private int CantidadDePersonas;
    private Propuesta Propuesta;
    private FEmitida Factura;
    private Boolean Veganos;
    private String[] Alergias;
    public Pedido(){
    this. Fecha= " ";
    this. TipoDeEvento=" ";
    this.CantidadDePersonas=0;
    this. Propuesta="";
    this.Factura= 0;
    this. Veganos = " ";
    this.Alergias= [];
    }
    public Pedido(String Fecha,String TipoDeEvento, int CantidadDePersonas, Propuesta Propuesta,FEmitida Factura, Boolean Veganos,String[]Alergias){
    this.Fecha=Fecha;
    this.TipoDeEvento=TipoDeEvento;
    this.CantidadDePersonas=CantidadDePersonas;
    this.Propuesta=Propuesta;
    this.Factura=Factura;
    this.Veganos=Veganos;
    this.Alergias=Alergias;
    }
    public String get Fecha(){
    return this. Fecha;
    }
    public void set Fecha(String Nueva Fecha){
    this.Fecha=Nueva Fecha;
    }
    public String TipoDeEvento(){
    return this. TipoDeEvento;
    }
    public void set TipoDeEvento(String Nuevo TipoDeEvento){
    this.TipoDeEvento=Nuevo TipoDeEvento;
    }
    public int get CantidadDePersonas(){
    return this.CantidadDePersonas;
    }
    public void set CantidadDePersonas(int Nueva CantidadDePersonas){
    this.CantidadDePersonas=Nueva CantidadDePersonas;
    }
    public Propuesta get Propuesta(){
    return this.Propuesta;
    }
    public void set Propuesta (Propuesta nuevaPropuesta){
    this.Propuesta=nuevaPropuesta;
    }
    public FEmetida get Factura(){
    return this.Factura;
    }
    public void set Factura(FEmitida nuevaFactura){
    this.Factura=nuevaFactura;
    }
    public Boolean get Veganos (){
    return this.Veganos;
    }
    public void set Veganos(Boolean nuevoVeganos){
    this.Veganos=nuevoVeganos;
    }
    public String get Alergias(){
    return this.Alergias;
    }
    public void set Alergias(String NuevaAlergias){
    this.Alergias=NuevaAlergias;
    }


}
