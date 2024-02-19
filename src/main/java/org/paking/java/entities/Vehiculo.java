package org.paking.java.entities;

public class Vehiculo {

    //atributos de clase
    //1. Modificador de acceso
    //2. Tipo de atributo
    //3. Nombre del atributo
    public String placa;
    public TipoVehiculo tipoVehiculo;

    //constructor
    //sin parametros: constructor por defecto
    public Vehiculo() {
    }

    //constructor parametrizado
    public Vehiculo(String placa, TipoVehiculo tipoVehiculo) {
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
    }

    
}
