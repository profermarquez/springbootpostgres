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
public class AuxiliarCargaDescarga extends Personas{
    public ArrayList<SolicitudReparto> repartos = new ArrayList<SolicitudReparto>();

    public AuxiliarCargaDescarga(String nombreyApellido, String usuario, String contraseña, String domicilio, String correoElectronico, String cuil, String telefono2) {
        super(nombreyApellido, usuario, contraseña, domicilio, correoElectronico, cuil, telefono2);
    }
    
    
}
