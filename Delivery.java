import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Datos del vehículo
        System.out.println("=== Registro del Vehículo Repartidor ===");
        System.out.print("Ingrese Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Ingrese Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Ingrese Cilindrada: ");
        String cilindrada = scanner.nextLine();

        System.out.print("Ingrese Tipo de combustible: ");
        String combustible = scanner.nextLine();

        System.out.print("Ingrese Capacidad en pasajeros: ");
        int pasajeros = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        // Datos del cliente
        System.out.println("\n=== Registro del Cliente ===");
        System.out.print("Ingrese Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese Edad: ");
        int edad = scanner.nextInt();

        // Datos de la compra
        System.out.println("\n=== Datos de la Compra ===");
        System.out.print("Ingrese Monto de la compra: ");
        int montoCompra = scanner.nextInt();

        System.out.print("Ingrese Kilómetros de distancia: ");
        int km = scanner.nextInt();

        // Cálculo del delivery
        int costoDelivery = 0;
        if (montoCompra < 25000) {
            costoDelivery = km * 300;
        } else if (montoCompra >= 25000 && montoCompra <= 49999) {
            costoDelivery = km * 150;
        } else if (montoCompra >= 50000) {
            costoDelivery = 0;
        }

        int totalPagar = montoCompra + costoDelivery;

        // Mostrar resultados
        System.out.println("\n=== RESUMEN DEL PEDIDO ===");
        System.out.println("Cliente: " + nombre + " | Edad: " + edad);
        System.out.println("Vehículo: " + marca + " " + modelo + 
                           " | Cilindrada: " + cilindrada + 
                           " | Combustible: " + combustible + 
                           " | Capacidad: " + pasajeros + " pasajeros");
        System.out.println("Monto de la compra: $" + montoCompra);
        System.out.println("Kilómetros recorridos: " + km + " km");
        System.out.println("Costo por delivery: $" + costoDelivery);
        System.out.println("TOTAL A PAGAR: $" + totalPagar);
    }
}
