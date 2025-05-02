import java.util.Scanner;
import java.util.ArrayList;

public class MainInteractivo{
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(5);
        Scanner scanner = new Scanner(System.in);
        boolean comprar = true;


        label:
        while (comprar) {
            System.out.println("-------- Bienvenido --------\n\n");

            ArrayList<Moneda> monedas = new ArrayList<>();
            monedas.add(new Moneda100());
            monedas.add(new Moneda500());
            monedas.add(new Moneda1000());
            monedas.sort(Moneda::compareTo);

            for (int i = 0; i < monedas.size(); i++) {
                System.out.println((i + 1) + ". Moneda de " + monedas.get(i).getValor());
            }
            System.out.print("Ingresa una moneda: ");

            Moneda moneda;
            try {
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1 -> moneda = new Moneda100();
                    case 2 -> moneda = new Moneda500();
                    case 3 -> moneda = new Moneda1000();
                    default -> throw new PagoIncorrectoException();
                }

                System.out.println("Se ingresa una moneda de " + moneda.getValor() + "...\n\n");

                System.out.println("Seleccione un producto:");
                System.out.println("1. Coca-Cola");
                System.out.println("2. Sprite");
                System.out.println("3. Fanta");
                System.out.println("4. Snickers");
                System.out.println("5. Super8");

                int select = scanner.nextInt();
                Productos producto = null;

                for (Productos p : Productos.values()) {
                    if (select == p.getOpcion()) {
                        producto = p;
                        break;
                    }
                }

                Comprador comprador = new Comprador(moneda, producto, exp);
                String compra = comprador.queConsumiste();
                int vuelto = comprador.cuantoVuelto();
                System.out.println("Compré " + compra + " y tuve " + vuelto + " de vuelto.");


            } catch (Exception e) {
                switch (e) {
                    case PagoIncorrectoException pagoIncorrectoException:
                        System.out.println("La moneda ingresada no es válida\n");
                        break;
                    case PagoInsuficienteException pagoInsuficienteException:
                        System.out.println("Saldo insuficiente, compra cancelada\n");
                        break;
                    case NoHayProductoException noHayProductoException:
                        System.out.println("Producto no disponible, compra cancelada\n");
                        break;
                    default:
                        break;
                }
            }

            System.out.println("¿Desea realizar otra compra?");
            System.out.println("1. Sí\n2. No");
            int nuevaCompra = scanner.nextInt();

            while (nuevaCompra != 1 && nuevaCompra != 2) {
                System.out.println("Opción no válida, intente nuevamente.\n");
                nuevaCompra = scanner.nextInt();
            }

            if (nuevaCompra == 2) comprar = false;
        }
        System.out.println("Muchas gracias por su preferencia, vuelva pronto!!\n\n");
        scanner.close();
        System.exit(0);
    }
}