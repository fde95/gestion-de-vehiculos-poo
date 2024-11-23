/**
 * Clase que representa un vehículo del tipo Moto.
 * Implementa la interfaz IVehiculo y proporciona implementaciones específicas
 * para los métodos definidos en la interfaz.
 *
 * Detalles de la implementación:
 * - Marca: Yamaha
 * - Color: Roja
 * - Velocidad máxima: 80 km/h
 * - Método mover(): Imprime que la moto está en movimiento.
 * - Método detener(): Imprime que la moto se ha detenido.
 *
 * @author Felipe Espinoza
 * @version 1.0
 * @since 2024-11-23
 */

package com.fespinoza.implementaciones;

import com.fespinoza.interfaces.IVehiculo;

public class Moto implements IVehiculo {
    @Override
    public String getMarca() {
        return "Yamaha";
    }

    @Override
    public String getColor() {
        return "Roja";
    }

    @Override
    public void mover() {
        System.out.println("La " + getClass().getSimpleName() + "esta en movimiento.");
    }

    @Override
    public void detener() {
        System.out.println("La " + getClass().getSimpleName() + " se ha detenido.");
    }

    @Override
    public int velocidad() {
        return 80;
    }
}
