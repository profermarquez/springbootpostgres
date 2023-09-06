/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpa.test.postgreSqlTest2.postgreSqlTest2.models;

import java.util.Date;

/**
 *
 * @author Sebastian
 */
public class RemitoEntrega extends SolicitudReparto{
    public Date fechaEntrega;
    public String quejas;
    public String calificacion;// de 1 a 5 estrellas

    public RemitoEntrega() {
    }

    public RemitoEntrega(Date fechaEntrega, String quejas, String calificacion) {
        this.fechaEntrega = fechaEntrega;
        this.quejas = quejas;
        this.calificacion = calificacion;
    }

    public RemitoEntrega(Date fechaEntrega, String quejas, String calificacion, Transportista transp, String direccion, Manzana manzana, int codigoReparto, boolean entregado) {
        super(transp, direccion, manzana, codigoReparto, entregado);
        this.fechaEntrega = fechaEntrega;
        this.quejas = quejas;
        this.calificacion = calificacion;
    }

    public RemitoEntrega(Date fechaEntrega, String quejas, String calificacion, Transportista transp, String direccion, Manzana manzana, int codigoReparto, boolean entregado, String titulo, String descripcionDocumento, Date fechaHora) {
        super(transp, direccion, manzana, codigoReparto, entregado, titulo, descripcionDocumento, fechaHora);
        this.fechaEntrega = fechaEntrega;
        this.quejas = quejas;
        this.calificacion = calificacion;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getQuejas() {
        return quejas;
    }

    public void setQuejas(String quejas) {
        this.quejas = quejas;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public Transportista getTransp() {
        return transp;
    }

    public void setTransp(Transportista transp) {
        this.transp = transp;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Manzana getManzana() {
        return manzana;
    }

    public void setManzana(Manzana manzana) {
        this.manzana = manzana;
    }

    public int getCodigoReparto() {
        return codigoReparto;
    }

    public void setCodigoReparto(int codigoReparto) {
        this.codigoReparto = codigoReparto;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcionDocumento() {
        return descripcionDocumento;
    }

    public void setDescripcionDocumento(String descripcionDocumento) {
        this.descripcionDocumento = descripcionDocumento;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }
    
}
