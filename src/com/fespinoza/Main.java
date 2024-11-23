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

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de gestión de vehículos!");

        while (true) {
            System.out.println("Por favor, selecciona una de las opciones para ver sus informaciones:");
            System.out.println("1. Carro");
            System.out.println("2. Moto");
            System.out.println("3. Camion");
            System.out.println("4. Bicicleta");
            System.out.println("5. Patineta");
            System.out.println("6. Salir");

            int opcion;
            try {
                System.out.print("Introduce el número de tu elección: ");
                opcion = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, introduce un número entre 1 y 6.");
                scanner.nextLine();
                continue;
            }

            if (opcion == 6) {
                System.out.println("Gracias por usar el sistema! Hasta luego.");
                break;
            }

            IVehiculo vehiculo;
            switch (opcion) {
                case 1 -> {
                    vehiculo = new Carro();
                    opcionSeleccionada("Carro");
                }
                case 2 -> {
                    vehiculo = new Moto();
                    opcionSeleccionada("Moto");
                }
                case 3 -> {
                    vehiculo = new Camion();
                    opcionSeleccionada("Camion");
                }
                case 4 -> {
                    vehiculo = new Bicicleta();
                    opcionSeleccionada("Bicicleta");
                }
                case 5 -> {
                    vehiculo = new Patineta();
                    opcionSeleccionada("Patineta");
                }
                default -> {
                    System.out.println("Opción inválida. Por favor, selecciona un número entre 1 y 5.");
                    continue;
                }
            }
            masInformacionesVehiculo(vehiculo);
        }
        scanner.close();
    }

    private static void opcionSeleccionada(String tipoVehiculo) {
        System.out.println("\n ---- Has selecionado la opción: " + tipoVehiculo + " ----");
    }

    private static void masInformacionesVehiculo (IVehiculo vehiculo) {
        System.out.println("La marca es: " + vehiculo.getMarca());
        System.out.println("El color es: " + vehiculo.getColor());
        System.out.println("La velocidad máxima es de: " + vehiculo.velocidad() + "Km/h");
        System.out.println("-------------------------------------------------");
    }
}
