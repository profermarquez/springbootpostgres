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
class Transportista extends Personas{
    public ArrayList<SolicitudReparto> repartos = new ArrayList<SolicitudReparto>();
    public ArrayList<Personas> auxiliarCargaDescarga = new ArrayList<Personas>();
    public Movil movil;

    public Transportista(Movil movil, String nombreyApellido, String usuario, String contraseña, String domicilio, String correoElectronico, String cuil, String telefono2) {
        super(nombreyApellido, usuario, contraseña, domicilio, correoElectronico, cuil, telefono2);
        this.movil = movil;
    }

    public ArrayList<SolicitudReparto> getRepartos() {
        return repartos;
    }

    public void setRepartos(ArrayList<SolicitudReparto> repartos) {
        this.repartos = repartos;
    }

    public ArrayList<Personas> getAuxiliarCargaDescarga() {
        return auxiliarCargaDescarga;
    }

    public void setAuxiliarCargaDescarga(ArrayList<Personas> auxiliarCargaDescarga) {
        this.auxiliarCargaDescarga = auxiliarCargaDescarga;
    }

    public Movil getMovil() {
        return movil;
    }

    public void setMovil(Movil movil) {
        this.movil = movil;
    }

    public String getNombreyApellido() {
        return nombreyApellido;
    }

    public void setNombreyApellido(String nombreyApellido) {
        this.nombreyApellido = nombreyApellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public ArrayList<Contratos> getContratos() {
        return contratos;
    }

    public void setContratos(ArrayList<Contratos> contratos) {
        this.contratos = contratos;
    }
    
}
