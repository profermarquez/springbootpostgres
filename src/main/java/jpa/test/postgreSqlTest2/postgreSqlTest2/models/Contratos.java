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
class Contratos extends Documentos{
    public int nroExpediente;
    public String estudioAcargo;

    public Contratos() {
    }

    public Contratos(int nroExpediente, String estudioAcargo) {
        this.nroExpediente = nroExpediente;
        this.estudioAcargo = estudioAcargo;
    }

    public Contratos(int nroExpediente, String estudioAcargo, String titulo, String descripcionDocumento, Date fechaHora) {
        super(titulo, descripcionDocumento, fechaHora);
        this.nroExpediente = nroExpediente;
        this.estudioAcargo = estudioAcargo;
    }

    public int getNroExpediente() {
        return nroExpediente;
    }

    public void setNroExpediente(int nroExpediente) {
        this.nroExpediente = nroExpediente;
    }

    public String getEstudioAcargo() {
        return estudioAcargo;
    }

    public void setEstudioAcargo(String estudioAcargo) {
        this.estudioAcargo = estudioAcargo;
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
