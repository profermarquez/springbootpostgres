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
public class Tramo {
    public String tipoTerreno;//tierra, asfalto, empedrado
    public int duracion;
    public ArrayList<Instruccion> instruciones = new ArrayList<Instruccion>();

    public Tramo(String tipoTerreno, int duracion, Manzana origen, Manzana destino) {
        this.tipoTerreno = tipoTerreno;
        this.duracion = duracion;
        this.origen = origen;
        this.destino = destino;
    }
    public Manzana origen;
    public Manzana destino;

    public String getTipoTerreno() {
        return tipoTerreno;
    }

    public void setTipoTerreno(String tipoTerreno) {
        this.tipoTerreno = tipoTerreno;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Instruccion> getInstruciones() {
        return instruciones;
    }

    public void setInstruciones(ArrayList<Instruccion> instruciones) {
        this.instruciones = instruciones;
    }

    public Manzana getOrigen() {
        return origen;
    }

    public void setOrigen(Manzana origen) {
        this.origen = origen;
    }

    public Manzana getDestino() {
        return destino;
    }

    public void setDestino(Manzana destino) {
        this.destino = destino;
    }
    
    
}
