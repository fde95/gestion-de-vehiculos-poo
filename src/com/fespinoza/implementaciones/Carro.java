/**
 * Clase que representa un vehículo del tipo Carro.
 * Implementa la interfaz IVehiculo y proporciona implementaciones específicas
 * para los métodos definidos en la interfaz.
 *
 * Detalles de la implementación:
 * - Marca: Mercedes-Benz
 * - Color: Azul
 * - Velocidad máxima: 120 km/h
 * - Método mover(): Imprime que el carro está en movimiento.
 * - Método detener(): Imprime que el carro se ha detenido.
 *
 * @author Felipe
 * @version 1.0
 * @since 2024-11-23
 */

package com.fespinoza.implementaciones;

import com.fespinoza.interfaces.IVehiculo;

public class Carro implements IVehiculo {


    @Override
    public String getMarca() {
        return "Mercedes-Benz";
    }

    @Override
    public String getColor() {
        return "Azul";
    }

    @Override
    public void mover() {
        System.out.println("El " + getClass().getSimpleName() + " esta en movimiento.");
    }

    @Override
    public void detener() {
        System.out.println("El " + getClass().getSimpleName() + "se ha detenido.");
    }

    @Override
    public int velocidad() {
        return 120;
    }

}
