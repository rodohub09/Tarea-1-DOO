/**
 * Programa interactivo que permite simular la compra de productos de una máquina expendedora.
 * El usuario puede ingresar una moneda, elegir un producto y recibir el vuelto correspondiente.
 */

import java.util.Scanner;

public class MainInteractivo{
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(5); // Se crea el expendedor con 5 unidades de cada producto.
        Scanner scanner = new Scanner(System.in);
        boolean comprar = true;

        while (comprar) {
            System.out.println("-------- Bienvenido --------\n\n");

            // Muestra las opciones de monedas al usuario para escoger.
            System.out.println("1. Moneda de 100.");
            System.out.println("2. Moneda de 500.");
            System.out.println("3. Moneda de 1000.");
            System.out.print("Ingresa una moneda: ");

            try {
                // Se crea una moneda que toma el valor que escoja el usuario.
                Moneda moneda;
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1 -> moneda = new Moneda100();
                    case 2 -> moneda = new Moneda500();
                    case 3 -> moneda = new Moneda1000();
                    default -> throw new PagoIncorrectoException(); // Opción inválida.
                }

                // Se imprime el valor de la moneda.
                System.out.println("Se ingresa una moneda de " + moneda.getValor() + "...\n\n");

                // Se muestran el menú de productos.
                System.out.println("Seleccione un producto:");
                System.out.println("1. Coca-Cola");
                System.out.println("2. Sprite");
                System.out.println("3. Fanta");
                System.out.println("4. Snickers");
                System.out.println("5. Super8");

                // Se busca el producto según la seleccion del usuario en el enum Productos, en base a p.getOpcion().
                int select = scanner.nextInt();
                Productos producto = null;

                for (Productos p : Productos.values()) {
                    if (select == p.getOpcion()) {
                        producto = p;
                        break;
                    }
                }

                // Se realiza la compra y se imprimen los resultados.
                Comprador comprador = new Comprador(moneda, producto, exp);
                String compra = comprador.queConsumiste();
                int vuelto = comprador.cuantoVuelto();
                System.out.println("Compré " + compra + " y tuve " + vuelto + " de vuelto.\n");


            } catch (Exception e) {
                // Muestra el manejo de excepciones de errores de pago y de disponibilidad de productos.
                switch (e) {
                    case PagoIncorrectoException pagoIncorrectoException ->
                            System.out.println("La moneda ingresada no es válida\n");
                    case PagoInsuficienteException pagoInsuficienteException ->
                            System.out.println("Saldo insuficiente, compra cancelada\n");
                    case NoHayProductoException noHayProductoException ->
                            System.out.println("Producto no disponible, compra cancelada\n");
                    default -> {
                    }
                }
            }

            // Consulta al usuario si desea realizar otra compra.
            System.out.println("¿Desea realizar otra compra?");
            System.out.println("1. Sí\n2. No");
            int nuevaCompra = scanner.nextInt();

            while (nuevaCompra != 1 && nuevaCompra != 2) {
                System.out.println("Opción no válida, intente nuevamente.\n");
                nuevaCompra = scanner.nextInt();
            }

            if (nuevaCompra == 2) comprar = false;
        }

        // Se imprime un mensaje de despedida y se cierran los recursos utilizados (Scanner).
        System.out.println("Muchas gracias por su preferencia, vuelva pronto!!\n");
        scanner.close();
        System.exit(0);
    }
}