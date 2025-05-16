import com.alura.conversordemonedas.historial.Historial;
import com.alura.conversordemonedas.logica.CalcularConversion;
import com.alura.conversordemonedas.logica.BuscarMoneda;
import com.alura.conversordemonedas.logica.FiltroDeMonedas;
import com.alura.conversordemonedas.modelo.Moneda;

import java.util.Scanner;

public class Principal {
    public static String MORADO = "\u001B[35m";
    public static String AZUL = "\u001B[34m";
    public static String AMARILLO = "\u001B[33m";
    public static String RESET = "\u001B[0m";
    public static String ROJO = "\u001B[31m";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BuscarMoneda buscar = new BuscarMoneda();
        Historial historial = new Historial();

        int opcion;
        do {
            System.out.println(MORADO + "\n💰 ---- Conversor de Monedas ---- 💰" + RESET);
            System.out.println(AZUL + "1️⃣ Convertir moneda" + RESET);
            System.out.println(AZUL + "2️⃣ Historial de conversiones" + RESET);
            System.out.println(AZUL + "3️⃣ Salir" + RESET);
            System.out.println(AMARILLO + "🖱️ Selecciona alguna opción: " + RESET);
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(MORADO + "\n💲 Seleccione la moneda base: " + RESET);
                    System.out.println(AMARILLO + "🔢 Ingrese la cantidad a convertir: " + RESET);
                    FiltroDeMonedas.opciones();
                    int opcionBase = scanner.nextInt();
                    String base = FiltroDeMonedas.codigoMoneda(opcionBase, scanner);

                    System.out.println(MORADO + "\n🌎 Seleccione la moneda destino: " + RESET);
                    FiltroDeMonedas.opciones();
                    int opcionDestino = scanner.nextInt();
                    String destino = FiltroDeMonedas.codigoMoneda(opcionDestino, scanner);

                    System.out.println(AMARILLO + "🔢 Ingrese la cantidad a convertir: " + RESET);
                    double cantidad = scanner.nextDouble();

                    try {
                        Moneda moneda = buscar.moneda(base, destino);
                        double resultado = CalcularConversion.convertir(cantidad, moneda.conversion_rate());
                        CalcularConversion.resultadoMoneda(cantidad, base, destino, resultado, moneda.time_last_update_utc());
                        historial.agregarRegistro(base, destino, cantidad, resultado);
                    } catch (IllegalArgumentException e){
                        System.out.println(ROJO + "❌ Error en los valores ingresados: " + e.getMessage() + RESET);
                    } catch (Exception e) {
                        System.out.println(ROJO + "⚠️ Error en la conversión: " + e.getMessage() + RESET);
                    }
                    break;
                case 2:
                    historial.mostrarRegistro();
                    break;
                case 3:
                    System.out.println(MORADO + "✨ Gracias por usar el conversor. ¡Hasta la próxima! ✨" + RESET);
                    break;
                default:
                    System.out.println(ROJO + "⚠️ Opción no válida. Intente de nuevo." + RESET);
                    break;
            }
        } while (opcion != 3);

        System.out.println(MORADO + "🔚 Cerrando la aplicación... Por favor espere." + RESET);
        scanner.close();
    }
}
