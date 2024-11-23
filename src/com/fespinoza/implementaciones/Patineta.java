/**
 * Clase que representa un vehículo del tipo Patineta.
 * Implementa la interfaz IVehiculo y proporciona implementaciones específicas
 * para los métodos definidos en la interfaz.
 *
 * Detalles de la implementación:
 * - Marca: Xiaomi
 * - Color: Negro
 * - Velocidad máxima: 120 km/h
 * - Método mover(): Imprime que la patineta está en movimiento.
 * - Método detener(): Imprime que la patineta se ha detenido.
 *
 * @author Felipe Espinoza
 * @version 1.0
 * @since 2024-11-23
 */

package com.fespinoza.implementaciones;

import com.fespinoza.interfaces.IVehiculo;

public class Patineta implements IVehiculo {
    @Override
    public String getMarca() {
        return "Xiaomi";
    }

    @Override
    public String getColor() {
        return "Negro";
    }

    @Override
    public void mover() {
        System.out.println("La " + getClass().getSimpleName() + " esta en movimiento.");
    }

    @Override
    public void detener() {
        System.out.println("La " + getClass().getSimpleName() + " se ha detenido.");
    }

    @Override
    public int velocidad() {
        return 12;
    }
}
