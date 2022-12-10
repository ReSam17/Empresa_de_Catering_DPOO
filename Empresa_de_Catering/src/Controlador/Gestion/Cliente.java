/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Gestion;


public class Cliente {
    private String Nombre;
    private Pedido Pedido;
    private Pedido[]PedidoRealizados;
    private String EmailLLL;
    private Boolean Nuevo;
    private String Estado;
    public Cliente(){
    this.Nombre= " ";
    this.Pedido= Pedido;
    this. PedidosRealizados= Pedido[];
    this.Email=" " ;
    this.Nuevo= " ";
    this.Estado=" " ;
    }
    public Cliente(String Nombre, Pedido Pedido,Pedido[]PedidosRealizados,String Email, Boolean Nuevo,String Estado){
    this.Nombre=Nombre;
    this.Pedido=Pedido;
    this.PedidosRealizados=PedidosRealizados;
    this.Email=Email;
    this.Nuevo=Nuevo;
    this.Estado=Estado;
    }
    public String get Nombre(){
    return this.Nombre;
    }
    public void set Nombre (String Nuevo Nombre){
    this.Nombre=Nombre;
    }
    public Pedido get Pedido(){
    return this.Pedido;
    }
    public void set Pedido(Pedido Nuevo Pedido){
    this.Pedido=Pedido;
    }
    public Pedido[] get PedidosRealizados(){
    return this.PedidosRealizados;}
    public void PedidosRealizados(Pedido[] Nuevo PedidosRealizados){
    this.PedidosRealizados=PedidosRealizados;
    }
    public String get Email (){
    return this.Email;
    }
    public void set Email(String Nuevo Email){
    this.Email=Email;
    }
    public Boolean get Nuevo (){
    return this.Nuevo;
    }
    public void set Nuevo(Boolean Nuevo Nuevo){
    this.Nuevo=Nuevo;
    }
    public String get Estado (){
    return this. Estado;
    }
    public void set Estado(String Nuevo Estado){
    this.Estado;
    }
    public RealizarPedido(Pedido){
    return this.Pedido;
    }
    public Boolean AceptacionPropuesta(Propuesta Propuesta){
    return this.Propuesta;
    }
}
