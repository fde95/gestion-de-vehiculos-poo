/**
 * Interfaz que define las funcionalidades básicas de un vehículo.
 * Todas las clases que implementen esta interfaz deben proporcionar
 * implementaciones concretas de los métodos definidos.
 *
 * Métodos abstractos:
 * - `getMarca()`: Devuelve la marca del vehículo.
 * - `getColor()`: Devuelve el color del vehículo.
 * - `mover()`: Define cómo el vehículo se mueve.
 * - `detener()`: Define cómo el vehículo se detiene.
 * - `velocidad()`: Devuelve la velocidad máxima del vehículo.
 *
 * Método default:
 * - `combustible()`: Devuelve información sobre el tipo de combustible usado por defecto.
 *   Las clases implementadoras pueden sobrescribir este método si es necesario.
 *
 * @author Felipe Espinoza
 * @version 1.0
 * @since 2024-11-23
 */

package com.fespinoza.interfaces;

public interface IVehiculo {

    public String getMarca();
    public String getColor();
    public void mover();
    public void detener();
    public int velocidad();


    default String combustible(){

        return "Todos los autos son movidos a Gasolina";
    }
}
