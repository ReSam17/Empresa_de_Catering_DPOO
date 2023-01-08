/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Gestion;

import java.io.Serializable;

public class Cliente implements Serializable{
    
    private String Nombre;
    private String Apellidos;
    private String CI;
    private Pedido Pedido;
    private Pedido[] PedidoRealizados;
    private String Email;
    private String Estado;
    private Boolean Propuesta;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Pedido getPedido() {
        return Pedido;
    }

    public void setPedido(Pedido Pedido) {
        this.Pedido = Pedido;
    }

    public Pedido[] getPedidoRealizados() {
        return PedidoRealizados;
    }

    public void setPedidoRealizados(Pedido[] PedidoRealizados) {
        this.PedidoRealizados = PedidoRealizados;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Boolean getPropuesta() {
        return Propuesta;
    }

    public void setPropuesta(Boolean Propuesta) {
        this.Propuesta = Propuesta;
    } 
    
    
public Cliente(String Nombre, Pedido Pedido, Pedido[] PedidoRealizados, String Email, Boolean Nuevo, String Estado, Boolean Propuesta) {
        this.Nombre = Nombre;
        this.Pedido = Pedido;
        this.PedidoRealizados = PedidoRealizados;
        this.Email = Email;
        this.Estado = Estado;
        this.Propuesta = Propuesta;
    }
    public Boolean AceptacionPropuesta(Propuesta Propuesta){
    return this.Propuesta;
    }
}
