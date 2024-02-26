package org.paking.java.entities;
import java.time.LocalDateTime;

public class Pago {

    //Atributos intrinsecos
    public LocalDateTime fechaHoraInicio;
    public LocalDateTime fechaHoraSalida;
    public Double valor;

    //Atributos de relacion:
    public Vehiculo vehiculo;
    public Cupo cupo;

    //Constructor 
    public Pago() {
    }

    //Constructor parametrizado
    public Pago(LocalDateTime fechaHoraInicio, 
                LocalDateTime fechaHoraSalida, 
                Double valor, 
                Vehiculo vehiculo,
                Cupo cupo) {
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraSalida = fechaHoraSalida;
        this.valor = valor;
        this.vehiculo = vehiculo;
        this.cupo = cupo;
    } 

    
    

}
