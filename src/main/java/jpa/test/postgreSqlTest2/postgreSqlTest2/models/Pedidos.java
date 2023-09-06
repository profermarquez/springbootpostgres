/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpa.test.postgreSqlTest2.postgreSqlTest2.models;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sebastian
 */
class Pedidos {
    public int codigo;
    public int codigoDeBarras;
    public String estado;// almacenado, transito, entregado
    public Ruta ruta;
    public ArrayList<Producto> productos = new ArrayList<Producto>();
    public boolean entregado;
    public String direccionDestino;
    public String tipoEntrega;// casa, departamento, barrio cerrado
    public String ciudad;
    public String barrio;
    public Date fechaPedido;

    public Pedidos(int codigo, int codigoDeBarras, String estado, Ruta ruta, boolean entregado, String direccionDestino, String tipoEntrega, String ciudad, String barrio, Date fechaPedido) {
        this.codigo = codigo;
        this.codigoDeBarras = codigoDeBarras;
        this.estado = estado;
        this.ruta = ruta;
        this.entregado = entregado;
        this.direccionDestino = direccionDestino;
        this.tipoEntrega = tipoEntrega;
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.fechaPedido = fechaPedido;
    }
    
    
    /*
    TO DO
    
    getListadoProductos()
    getTiempoDeLlegadaPedido()
    */

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(int codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public void setDireccionDestino(String direccionDestino) {
        this.direccionDestino = direccionDestino;
    }

    public String getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(String tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
    
    
}
