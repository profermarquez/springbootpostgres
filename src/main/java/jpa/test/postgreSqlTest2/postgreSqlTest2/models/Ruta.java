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
public class Ruta {
    public String nombre;
    public ArrayList<Tramo> tramos = new ArrayList<Tramo>();

    public Ruta() {
    }
    
    public int getDuracionRuta()
    {// TO DO
        return 1;}
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Tramo> getTramos() {
        return tramos;
    }

    public void setTramos(ArrayList<Tramo> tramos) {
        this.tramos = tramos;
    }
    
    
}
