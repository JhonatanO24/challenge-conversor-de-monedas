package com.alura.conversordemonedas.logica;

import java.util.Scanner;

public class FiltroDeMonedas {
    public static String ROJO = "\u001B[31m";
    public static String VERDE = "\u001B[32m";
    public static String AZUL = "\u001B[34m";
    public static String CYAN = "\u001B[36m";
    public static String AMARILLO = "\u001B[33m";
    public static String RESET = "\u001B[0m";

    public static void opciones() {
        System.out.println(AMARILLO + "💰 --- Monedas Disponibles --- 💰" + RESET);
        System.out.println(VERDE + "1️⃣ ARS - Peso Argentino" + RESET);
        System.out.println(VERDE + "2️⃣ BOB - Boliviano boliviano" + RESET);
        System.out.println(VERDE + "3️⃣ BRL - Real brasileño" + RESET);
        System.out.println(VERDE + "4️⃣ CLP - Peso chileno" + RESET);
        System.out.println(VERDE + "5️⃣ COP - Peso colombiano" + RESET);
        System.out.println(VERDE + "6️⃣ USD - Dólar estadounidense" + RESET);
        System.out.println(AZUL + "7️⃣ Otra moneda (escriba el código de la moneda que desea) 💱" + RESET);
    }

    public static String codigoMoneda (int opcion, Scanner scanner){
        String moneda = "";
        switch (opcion) {
            case 1:
                moneda = "ARS";
                break;
            case 2:
                moneda = "BOB";
                break;
            case 3:
                moneda = "BRL";
                break;
            case 4:
                moneda = "CLP";
                break;
            case 5:
                moneda = "COP";
                break;
            case 6:
                moneda = "USD";
                break;
            case 7:
                System.out.println(CYAN + "💱 Ingrese el código de la moneda: (por ejemplo EUR, MXN, JPY):" + RESET);
                moneda = scanner.next().toUpperCase();
                break;
            default:
                System.out.println(ROJO + "❌ Opción no válida. Intente nuevamente." + RESET);
                break;
        }
        return moneda;
    }
}
