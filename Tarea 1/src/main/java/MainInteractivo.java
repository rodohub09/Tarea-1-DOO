import java.util.Scanner;
import java.util.ArrayList;

public class MainInteractivo{
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(5);
        Scanner scanner = new Scanner(System.in);

        ArrayList<Moneda> monedas = new ArrayList<>();
        monedas.add(new Moneda100());
        monedas.add(new Moneda500());
        monedas.add(new Moneda1000());
        monedas.sort(Moneda::compareTo);

        Productos producto = null;

        boolean comprar = true;
        int opcion = -1;
        String compra;
        int vuelto;

        while (comprar) {
            System.out.println("-------- Bienvenido a la vaina loca mi xanxi --------\n\n");

            for (int i = 0; i < monedas.size(); i++) {
                System.out.println((i + 1) + ". Moneda de " + monedas.get(i).getValor());
            }
            System.out.print("Ingresa una moneda: ");

            Moneda moneda = null;
            try {
                opcion = scanner.nextInt() - 1;

                if (opcion < 0 || opcion >= monedas.size()) {
                    throw new PagoIncorrectoException();
                }

                int valor = monedas.get(opcion).getValor();

                if (valor == 100) moneda = new Moneda100();
                else if (valor == 500) moneda = new Moneda500();
                else if (valor == 1000) moneda = new Moneda1000();
                else throw new PagoIncorrectoException();

                System.out.println("Se ingresa una moneda de " + moneda.getValor() + "...\n\n");

                System.out.println("Seleccione un producto:");
                System.out.println("1. Coca-Cola");
                System.out.println("2. Sprite");
                System.out.println("3. Fanta");
                System.out.println("4. Snickers");
                System.out.println("5. Super8");
                int select = scanner.nextInt();

                for (Productos p : Productos.values()) {
                    if (select == p.getOpcion()) {
                        producto = p;
                        break;
                    }
                }

                Comprador comprador = new Comprador(moneda, producto, exp);
                compra = comprador.queConsumiste();
                vuelto = comprador.cuantoVuelto();

                System.out.println("¿Desea realizar otra compra?");
                System.out.println("1. Sí\n2. No");
                int nuevaCompra = scanner.nextInt();
                if (nuevaCompra == 1)
                    continue;
                else {
                    System.out.println("Muchas gracias por su preferencia, vuelva pronto!!\n\n");
                    System.out.println("Compré " + compra + " y tuve " + vuelto + " de vuelto.");
                    comprar = false;
                    break;
                }

            } catch (Exception e) {
                if (e instanceof PagoIncorrectoException) {
                    System.out.println("La moneda ingresada no es válida");
                    System.exit(0);
                    break;
                }
                else if (e instanceof PagoInsuficienteException) {
                    System.out.println("Saldo insuficiente, compra cancelada");
                    break;
                }
                else if (e instanceof NoHayProductoException) {
                    System.out.println("Producto no disponible, compra cancelada");
                    break;
                }
            }
        }
        scanner.close();
        System.exit(0);
    }
}
