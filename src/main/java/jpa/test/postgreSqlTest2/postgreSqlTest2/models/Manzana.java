/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpa.test.postgreSqlTest2.postgreSqlTest2.models;

/**
 *
 * @author Sebastian
 */
class Manzana {
    public String nombre;
    public String limiteavcalle1;
    public String limiteavcalle2;
    public String limiteavcalle3;
    public String limiteavcalle4;
    public int latitudCentroManzana;
    public int longitudCentroManzana;

    public Manzana(String nombre, String limiteavcalle1, String limiteavcalle2, String limiteavcalle3, String limiteavcalle4, int latitudCentroManzana, int longitudCentroManzana) {
        this.nombre = nombre;
        this.limiteavcalle1 = limiteavcalle1;
        this.limiteavcalle2 = limiteavcalle2;
        this.limiteavcalle3 = limiteavcalle3;
        this.limiteavcalle4 = limiteavcalle4;
        this.latitudCentroManzana = latitudCentroManzana;
        this.longitudCentroManzana = longitudCentroManzana;
    }
    
    public boolean compareTo(Manzana m)
    {//TO DO
        return true;}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLimiteavcalle1() {
        return limiteavcalle1;
    }

    public void setLimiteavcalle1(String limiteavcalle1) {
        this.limiteavcalle1 = limiteavcalle1;
    }

    public String getLimiteavcalle2() {
        return limiteavcalle2;
    }

    public void setLimiteavcalle2(String limiteavcalle2) {
        this.limiteavcalle2 = limiteavcalle2;
    }

    public String getLimiteavcalle3() {
        return limiteavcalle3;
    }

    public void setLimiteavcalle3(String limiteavcalle3) {
        this.limiteavcalle3 = limiteavcalle3;
    }

    public String getLimiteavcalle4() {
        return limiteavcalle4;
    }

    public void setLimiteavcalle4(String limiteavcalle4) {
        this.limiteavcalle4 = limiteavcalle4;
    }

    public int getLatitudCentroManzana() {
        return latitudCentroManzana;
    }

    public void setLatitudCentroManzana(int latitudCentroManzana) {
        this.latitudCentroManzana = latitudCentroManzana;
    }

    public int getLongitudCentroManzana() {
        return longitudCentroManzana;
    }

    public void setLongitudCentroManzana(int longitudCentroManzana) {
        this.longitudCentroManzana = longitudCentroManzana;
    }
    
}
