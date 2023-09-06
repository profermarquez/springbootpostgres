/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpa.test.postgreSqlTest2.postgreSqlTest2.models;

import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */
public class Almacenes {
    public ArrayList<Personas> personal = new ArrayList<Personas>();
    public ArrayList<Movil> moviles = new ArrayList<Movil>();
    public ArrayList<OrdenDeCompra> pedidosAProveedores = new ArrayList<OrdenDeCompra>();
    public ArrayList<Pedidos> inventarioPedidos = new ArrayList<Pedidos>();
    public ArrayList<SolicitudReparto> repartos = new ArrayList<SolicitudReparto>();
    public ArrayList<Manzana> manzanas = new ArrayList<Manzana>();
    
    
    public ArrayList<Pedidos> getPedidos()
    { return this.inventarioPedidos;}
    
    /*
    TODO
    revisarPedidosDiarios()
    getTransportistas()
    asignarPedidosTransportista()
    asignarMovilTransportista()
    crearSolicitudEntrega()
    asignarAuxiliarTrasportistas()
    
    */
    
}
