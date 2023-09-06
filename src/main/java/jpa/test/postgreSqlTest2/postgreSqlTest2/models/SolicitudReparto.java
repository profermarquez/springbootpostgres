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
public class SolicitudReparto extends Documentos{
    public Transportista transp;
    public String direccion;
    public Manzana manzana;
    public int codigoReparto;
    public boolean entregado;

    public SolicitudReparto() {
    }

    public SolicitudReparto(Transportista transp, String direccion, Manzana manzana, int codigoReparto, boolean entregado) {
        this.transp = transp;
        this.direccion = direccion;
        this.manzana = manzana;
        this.codigoReparto = codigoReparto;
        this.entregado = entregado;
    }

    public SolicitudReparto(Transportista transp, String direccion, Manzana manzana, int codigoReparto, boolean entregado, String titulo, String descripcionDocumento, Date fechaHora) {
        super(titulo, descripcionDocumento, fechaHora);
        this.transp = transp;
        this.direccion = direccion;
        this.manzana = manzana;
        this.codigoReparto = codigoReparto;
        this.entregado = entregado;
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
