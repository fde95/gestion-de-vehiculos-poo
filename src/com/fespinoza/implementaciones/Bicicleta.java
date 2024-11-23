/**
 * Clase que representa un vehículo del tipo Bicicleta.
 * Implementa la interfaz IVehiculo y proporciona implementaciones específicas
 * para los métodos definidos en la interfaz.
 *
 * Detalles de la implementación:
 * - Marca: Caloi
 * - Color: Morada
 * - Velocidad máxima: 12 km/h
 * - Método mover(): Imprime que la bicicleta está en movimiento.
 * - Método detener(): Imprime que la bicicleta se ha detenido.
 *
 * @author Felipe
 * @version 1.0
 * @since 2024-11-23
 */

package com.fespinoza.implementaciones;

import com.fespinoza.interfaces.IVehiculo;

public class Bicicleta implements IVehiculo {

    @Override
    public String getMarca() {
        return "Caloi";
    }

    @Override
    public String getColor() {
        return "Morada";
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
