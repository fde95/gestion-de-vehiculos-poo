/**
 * Clase principal del sistma de getión de vegículos.
 * Este archivo sirve como punto de entrada para ejecutar la aplicación.
 *
 * @author Felipe Espinoza
 * @version 1.0
 * @since 2024-11-23
 */

package com.fespinoza;

import com.fespinoza.implementaciones.*;
import com.fespinoza.interfaces.IVehiculo;

public class Main {

    public static void main (String[] args) {

        IVehiculo carro = new Carro();
        IVehiculo moto = new Moto();
        IVehiculo bicicleta = new Bicicleta();
        IVehiculo camion = new Camion();
        IVehiculo patineta = new Patineta();

        System.out.println("---- Carro ----");
        System.out.println("El vehículo es de la marca " + carro.getMarca() + " y el color es " + carro.getColor());
        carro.mover();
        System.out.println("El vehículo se mueve a la velocidade de " + carro.velocidad() + "Km/h \n");

        System.out.println("---- Moto ----");
        System.out.println("El vehículo es de la marca " + moto.getMarca() + " y el color es " + moto.getColor());
        moto.mover();
        System.out.println("El vehículo se mueve a la velocidade de " + moto.velocidad() + "Km/h \n");

        System.out.println("---- Bicicleta ----");
        System.out.println("El vehículo es de la marca " + bicicleta.getMarca() + " y el color es " + bicicleta.getColor());
        bicicleta.mover();
        System.out.println("El vehículo se mueve a la velocidade de " + bicicleta.velocidad() + "Km/h \n");

        System.out.println("---- Camion ----");
        System.out.println("El vehículo es de la marca " + camion.getMarca() + " y el color es " + camion.getColor());
        camion.mover();
        System.out.println("El vehículo se mueve a la velocidade de " + camion.velocidad() + "Km/h \n");

        System.out.println("---- Patineta ----");
        System.out.println("El vehículo es de la marca " + patineta.getMarca() + " y el color es " + patineta.getColor());
        patineta.mover();
        System.out.println("El vehículo se mueve a la velocidade de " + patineta.velocidad() + "Km/h \n");
    }
}
