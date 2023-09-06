/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpa.test.postgreSqlTest2.postgreSqlTest2.models;

/**
 *
 * @author Sebastian
 */
class Instruccion {
    public String nroInstruccion;
    public String instruccion;

    public Instruccion(String nroInstruccion, String instruccion) {
        this.nroInstruccion = nroInstruccion;
        this.instruccion = instruccion;
    }

    public String getNroInstruccion() {
        return nroInstruccion;
    }

    public void setNroInstruccion(String nroInstruccion) {
        this.nroInstruccion = nroInstruccion;
    }

    public String getInstruccion() {
        return instruccion;
    }

    public void setInstruccion(String instruccion) {
        this.instruccion = instruccion;
    }

    
    
    
    
}
