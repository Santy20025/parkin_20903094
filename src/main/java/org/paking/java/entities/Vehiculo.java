package org.paking.java.entities;

public class Vehiculo {

    //los atributos de una clase
    //para cumplir con encapsulamientos
    //deben ser privados
    //atributos de clase
    //1. Modificador de acceso
    //2. Tipo de atributo
    //3. Nombre del atributo
    private String placa;
    private TipoVehiculo tipoVehiculo; 

    //constructor
    //sin parametros: constructor por defecto
    public Vehiculo() {
    }

    //constructor parametrizado
    public Vehiculo(String placa, TipoVehiculo tipoVehiculo) {
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }




    
}
