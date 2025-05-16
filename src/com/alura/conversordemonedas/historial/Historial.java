package com.alura.conversordemonedas.historial;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Historial {
    public static String MORADO = "\u001B[35m";
    public static String ROJO = "\u001B[31m";
    public static String RESET = "\u001B[0m";

    private final List<Registros> registros = new ArrayList<>();
    private static final String archivoJson = "Historial.json";

    public void agregarRegistro(String base, String destino, double cantidad, double resultado) {
        Registros registro = new Registros(base, destino, cantidad, resultado);
        registros.add(registro);
        guardarHistorial();
    }
    public void mostrarRegistro() {
        System.out.println(MORADO + "\n📜 ---- Historial de conversiones ---- 📜" + RESET);
        for (Registros registro : registros) {
            System.out.println(registro);
        }
    }

    private void guardarHistorial() {
        try (FileWriter writer = new FileWriter(archivoJson)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(registros, writer);
        } catch (IOException e) {
            System.out.println(ROJO + "❌ Error al guardar el archivo: " + e.getMessage() + RESET);
        }
    }
    private void cargarHistorial() {
        try (FileReader fileReader = new FileReader(archivoJson)){
            Gson gson = new Gson();
            Registros[] registrosArray = gson.fromJson(fileReader, Registros[].class);
            registros.clear();

            if (registrosArray != null) {
                registros.addAll(Arrays.asList(registrosArray));
            }
        } catch (IOException e) {
            System.out.println(MORADO + "⚠️ Historial no previo" + RESET);
        }
    }
}
