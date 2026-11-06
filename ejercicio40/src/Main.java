import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacidadMaxima = 18000.0;
        double pesoTotalAcumulado = 0;
        int totalBultos = 0;
        double pesoMasPesado = -1;
        double pesoMasLiviano = Double.MAX_VALUE;
        double ingresoPesosTotal = 0;

        // Tasa de cambio hipotética para dólares (ej. 1 USD = 4000 pesos)
        double tasaCambioDolar = 4000.0;

        System.out.println("--- CONTROL DE EQUIPAJE BOING 747 ---");
        System.out.println("Límite de carga: 18,000 Kg. (Escriba -1 para finalizar el ingreso)");

        while (true) {
            System.out.print("\nIngrese el peso del bulto (Kg): ");
            double pesoBulto = scanner.nextDouble();

            if (pesoBulto == -1) {
                break; // Condición para salir de la carga
            }

            // Validaciones del bulto
            if (pesoBulto <= 0) {
                System.out.println("Error: El peso debe ser mayor a 0.");
                continue;
            }
            if (pesoBulto > 500) {
                System.out.println("Error: Un bulto no puede exceder los 500 Kg.");
                continue;
            }
            if ((pesoTotalAcumulado + pesoBulto) > capacidadMaxima) {
                System.out.println("¡Alerta! Capacidad máxima del avión excedida (18,000 Kg). No se puede cargar este bulto.");
                continue;
            }

            // Procesar bulto válido
            pesoTotalAcumulado += pesoBulto;
            totalBultos++;

            // Determinar más pesado y más liviano
            if (pesoBulto > pesoMasPesado) {
                pesoMasPesado = pesoBulto;
            }
            if (pesoBulto < pesoMasLiviano) {
                pesoMasLiviano = pesoBulto;
            }

            // Calcular costo según tarifas
            double costoBulto = 0;
            if (pesoBulto > 25 && pesoBulto <= 300) {
                costoBulto = pesoBulto * 1500;
            } else if (pesoBulto > 300) { // Ya no hace falta evaluar <= 500 porque ya fue filtrado antes
                costoBulto = pesoBulto * 2500;
            }
// Si está entre 0 y 25, se queda en 0 automáticamente.
            ingresoPesosTotal += costoBulto;
            System.out.println("Bulto aceptado. Costo de este bulto: $" + costoBulto + " pesos.");
        }

        // Resultados finales
        double pesoPromedio = (totalBultos > 0) ? (pesoTotalAcumulado / totalBultos) : 0;
        double ingresoDolaresTotal = ingresoPesosTotal / tasaCambioDolar;

        System.out.println("\n========================================");
        System.out.println("        REPORTE FINAL DEL VUELO         ");
        System.out.println("========================================");
        System.out.println("a. Número total de bultos ingresados: " + totalBultos);
        System.out.println("b. Peso del bulto más pesado: " + (totalBultos > 0 ? pesoMasPesado + " Kg" : "N/A"));
        System.out.println("   Peso del bulto más liviano: " + (totalBultos > 0 ? pesoMasLiviano + " Kg" : "N/A"));
        System.out.println("c. Peso promedio de los bultos: " + pesoPromedio + " Kg");
        System.out.println("d. Ingreso total en pesos: $" + ingresoPesosTotal);
        System.out.println("   Ingreso total en dólares: $" + ingresoDolaresTotal + " USD");
        System.out.println("========================================");

        scanner.close();
    }
}