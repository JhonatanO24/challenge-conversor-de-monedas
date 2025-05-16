package com.alura.conversordemonedas.logica;

public class CalcularConversion {
    public static String MORADO = "\u001B[35m";
    public static String AMARILLO = "\u001B[33m";
    public static String RESET = "\u001B[0m";

    public static double convertir(double cantidad, double conversion) {
        return cantidad * conversion;
    }

    public static void resultadoMoneda(double cantidad,
                                       String base,
                                       String destino,
                                       double resultado,
                                       String actualizacion) {
        System.out.printf(MORADO + "💰 - %.2f %s equivale a %.2f %s%n" + RESET, cantidad, base, resultado, destino);
        System.out.println(AMARILLO + "📅 Última actualización de la moneda: " + actualizacion + RESET);
    }
}
