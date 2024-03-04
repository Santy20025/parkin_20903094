package org.paking.java;

import org.paking.java.entities.Cliente;
import org.paking.java.entities.Cupo;
import org.paking.java.entities.Empleado;
import org.paking.java.entities.Pago;
import org.paking.java.entities.TipoVehiculo;
import org.paking.java.entities.Vehiculo;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        //sistema de gestion de entradas y salidas
        //de vehiculos en parking
        //1. dos carritos
        //objetos(instancias)
        //1. Tipo de clase
        //2. Nombre del objeto
        //3. asignacion y palabra reservada new
        //4. constructor del objeto
        Vehiculo carrito1 = new Vehiculo("ASD 398", TipoVehiculo.PARTICULAR);

        Vehiculo carrito2 = new Vehiculo("FMD 388", TipoVehiculo.TAXI );

        Vehiculo motico = new Vehiculo(); 
        motico.setPlaca("MMR 567");

        //Crear (instanciar) un cliente 
        Cliente cliente1 = new Cliente("Santiago", "Borda", 1021667827L);
        Cliente cliente2 = new Cliente("Paco", "Borda", 1021667829L);
        
        //invocar el metodo addCar
        cliente1.addVehicle(carrito2);
        cliente1.addVehicle("WWW ERT", TipoVehiculo.MOTO);

        cliente2.addVehicle(carrito2);
        cliente2.addVehicle("WER ERT", TipoVehiculo.MOTO);
        
        //instanciar cupos
        Cupo cupito1 = new Cupo('A');
        Cupo cupito2 = new Cupo('B');

        //crear las fechas
        LocalDateTime fechaHoraInicio = LocalDateTime.of(2024, 
                                                        Month.FEBRUARY, 
                                                        1, 
                                                        15, 
                                                        30,
                                                        9);
        LocalDateTime fechaHoraFin = LocalDateTime.of(2024, 
                                                      Month.FEBRUARY, 
                                                      10, 
                                                      6, 
                                                      15, 
                                                      0);

        //hacer el empleado 
        Empleado empleado1 = new Empleado("Juan","Rojas","001");
        //hacer pago
        Pago pago1 = new Pago( 
                                fechaHoraInicio,
                                fechaHoraFin,  
                                5000.0, 
                                cliente1.misVehiculos.get(0),
                                cupito1,
                                empleado1);

         Pago pago2 = new Pago( 
        fechaHoraInicio,
        fechaHoraFin,  
        10000.0, 
        cliente2.misVehiculos.get(1),
        cupito2,
        empleado1);


    //añadir pagos a una lsita de pagos
        List<Pago> misPagos = new ArrayList<Pago>();  
        misPagos.add(pago1);
        misPagos.add(pago2);  
        
    //recorrer los pagos para mostrar informacion
    for( Pago p : misPagos){
        //evidencia:
        //mostrar:
        //  - Placa del vehiculo
        //  - valor pagado
        //  - fecha y hora de inicio
        //  - fecha y horan de fin
        //  - cupo(nombre)
        System.out.println("|placa:" + p.getVehiculo().getPlaca() + "|" + 
                           "|valor:" + p.getValor() + "|" + 
                           "|fecha hora entrada:" 
                            + p.getFechaHoraInicio().toString() + "|" +
                            "|fecha hora de salida: " 
                            + p.getFechaHoraSalida().toString() + "|" + 
                            "|Cupo: " + p.getCupo().getNombre() + "|" +
                            "|empleado:" + p.getEmpleado().getCodigo() + "|"
        );
    }
    }
   

}