package org.paking.java.entities;
import java.time.LocalDateTime;

public class Pago {

    //Atributos intrinsecos
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraSalida;
    private Double valor;

    //Atributos de relacion:
    private Vehiculo vehiculo;
    private Cupo cupo;
    private Empleado empleado;

    //Constructor 
    public Pago() {
    }

    public Pago(LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraSalida, Double valor, Vehiculo vehiculo,
            Cupo cupo, Empleado empleado) {
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraSalida = fechaHoraSalida;
        this.valor = valor;
        this.vehiculo = vehiculo;
        this.cupo = cupo;
        this.empleado = empleado;
    }

    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public LocalDateTime getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public void setFechaHoraSalida(LocalDateTime fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cupo getCupo() {
        return cupo;
    }

    public void setCupo(Cupo cupo) {
        this.cupo = cupo;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    //Constructor parametrizado
    

    
    

}
