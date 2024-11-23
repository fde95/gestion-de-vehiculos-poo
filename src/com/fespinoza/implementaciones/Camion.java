/**
 * Clase que representa un vehículo del tipo Camion.
 * Implementa la interfaz IVehiculo y proporciona implementaciones específicas
 * para los métodos definidos en la interfaz.
 *
 * Detalles de la implementación:
 * - Marca: Man
 * - Color: Negro
 * - Velocidad máxima: 70 km/h
 * - Método mover(): Imprime que el camion está en movimiento.
 * - Método detener(): Imprime que el camion se ha detenido.
 *
 * @author Felipe Espinoza
 * @version 1.0
 * @since 2024-11-23
 */

package com.fespinoza.implementaciones;

import com.fespinoza.interfaces.IVehiculo;

public class Camion implements IVehiculo {
    @Override
    public String getMarca() {
        return "Man";
    }

    @Override
    public String getColor() {
        return "Negro";
    }

    @Override
    public void mover() {
        System.out.println("El " + getClass().getSimpleName() + " esta en movimiento.");
    }

    @Override
    public void detener() {
        System.out.println("El " + getClass().getSimpleName() + " se ha detenido.");
    }

    @Override
    public int velocidad() {
        return 70;
    }
}
