package com.alura.conversordemonedas.historial;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Registros {
    public static String MORADO = "\u001B[35m";
    public static String RESET = "\u001B[0m";

    private final String base;
    private final String destino;
    private final double cantidad;
    private final double resultado;
    private final String marcaDeTiempo;

    public Registros(String base, String destino, double cantidad, double resultado) {
        this.base = base;
        this.destino = destino;
        this.cantidad = cantidad;
        this.resultado = resultado;

        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.marcaDeTiempo = fechaHoraActual.format(formatter);
    }

    @Override
    public String toString() {
        return MORADO + "🔄 Conversión realizada el " + marcaDeTiempo + " | " +
                cantidad + " " + base +
                " ➡️ " + resultado + " " + destino + RESET;
    }
}