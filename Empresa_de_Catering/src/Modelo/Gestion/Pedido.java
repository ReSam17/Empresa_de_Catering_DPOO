/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Gestion;

import java.io.Serializable;

import Modelo.Economia.FEmitida;


public class Pedido implements Serializable{
    private String Fecha;
    private String TipoDeEvento;
    private int CantidadDePersonas;
    private Propuesta Propuesta;
    private FEmitida Factura;
    private Boolean Veganos;
    private String[] Alergias;

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getTipoDeEvento() {
        return TipoDeEvento;
    }

    public void setTipoDeEvento(String TipoDeEvento) {
        this.TipoDeEvento = TipoDeEvento;
    }

    public int getCantidadDePersonas() {
        return CantidadDePersonas;
    }

    public void setCantidadDePersonas(int CantidadDePersonas) {
        this.CantidadDePersonas = CantidadDePersonas;
    }

    public Propuesta getPropuesta() {
        return Propuesta;
    }

    public void setPropuesta(Propuesta Propuesta) {
        this.Propuesta = Propuesta;
    }

    public FEmitida getFactura() {
        return Factura;
    }

    public void setFactura(FEmitida Factura) {
        this.Factura = Factura;
    }

    public Boolean getVeganos() {
        return Veganos;
    }

    public void setVeganos(Boolean Veganos) {
        this.Veganos = Veganos;
    }

    public String[] getAlergias() {
        return Alergias;
    }

    public void setAlergias(String[] Alergias) {
        this.Alergias = Alergias;
    }

    public Pedido(){
    this.Fecha= " ";
    this.TipoDeEvento=" ";
    this.CantidadDePersonas=0;
    this.Propuesta=null;
    this.Factura= null;
    this.Veganos =null ;
    this.Alergias = null;
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
}
