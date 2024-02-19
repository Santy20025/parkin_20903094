package org.paking.java;

import org.paking.java.entities.TipoVehiculo;
import org.paking.java.entities.Vehiculo;
import org.paking.java.entities.Cliente;

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

        //Crear (instanciar) un cliente 
        Cliente cliente1 = new Cliente("Santiago", "Borda", 1021667827L);
        
        //invocar el metodo addCar
        cliente1.addVehicle(carrito1);
        cliente1.addVehicle(carrito2);
        cliente1.addVehicle("WWW ERT", TipoVehiculo.MOTO);
        //recorrer la lista de vehiculos 
        //del cliente
        for(Vehiculo v:cliente1.misVehiculos){
           System.out.println(v.placa);
           System.out.println(v.tipoVehiculo);
           System.out.println("-----------");
        }
    }
}