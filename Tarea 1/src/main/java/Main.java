import java.net.SocketTimeoutException;

public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(5);
        Moneda m;
        Comprador c = null;

        System.out.println("----Demostración de funcionamiento----");
        System.out.println();
        System.out.println("-Compra de cada producto-");
        System.out.println();

        m = new Moneda1000();

        try {
            c = new Comprador(m, Productos.CocaCola, exp);
        } catch (PagoIncorrectoException e) {
            System.out.println("La moneda ingresada no es válida");
        } catch (PagoInsuficienteException e) {
            System.out.println("Saldo insuficiente, compra cancelada - Dinero devuelto: " + m.getValor());
        } catch (NoHayProductoException e) {
            System.out.println("Producto no disponible, compra cancelada - Dinero devuelto: " + m.getValor());
        }

        System.out.println("Producto: " + c.queConsumiste() + " - Vuelto: " + c.cuantoVuelto());

        m = new Moneda1000();

        try {
            c = new Comprador(m, Productos.Sprite, exp);
        } catch (PagoIncorrectoException e) {
            System.out.println("La moneda ingresada no es válida");
        } catch (PagoInsuficienteException e) {
            System.out.println("Saldo insuficiente, compra cancelada - Dinero devuelto: " + m.getValor());
        } catch (NoHayProductoException e) {
            System.out.println("Producto no disponible, compra cancelada - Dinero devuelto: " + m.getValor());
        }

        System.out.println("Producto: " + c.queConsumiste() + " - Vuelto: " + c.cuantoVuelto());

        m = new Moneda1000();

        try {
            c = new Comprador(m, Productos.Fanta, exp);
        } catch (PagoIncorrectoException e) {
            System.out.println("La moneda ingresada no es válida");
        } catch (PagoInsuficienteException e) {
            System.out.println("Saldo insuficiente, compra cancelada - Dinero devuelto: " + m.getValor());
        } catch (NoHayProductoException e) {
            System.out.println("Producto no disponible, compra cancelada - Dinero devuelto: " + m.getValor());
        }

        System.out.println("Producto: " + c.queConsumiste() + " - Vuelto: " + c.cuantoVuelto());

        m = new Moneda1000();

        try {
            c = new Comprador(m, Productos.Snickers, exp);
        } catch (PagoIncorrectoException e) {
            System.out.println("La moneda ingresada no es válida");
        } catch (PagoInsuficienteException e) {
            System.out.println("Saldo insuficiente, compra cancelada - Dinero devuelto: " + m.getValor());
        } catch (NoHayProductoException e) {
            System.out.println("Producto no disponible, compra cancelada - Dinero devuelto: " + m.getValor());
        }

        System.out.println("Producto: " + c.queConsumiste() + " - Vuelto: " + c.cuantoVuelto());

        m = new Moneda1000();

        try {
            c = new Comprador(m, Productos.Super8, exp);
        } catch (PagoIncorrectoException e) {
            System.out.println("La moneda ingresada no es válida");
        } catch (PagoInsuficienteException e) {
            System.out.println("Saldo insuficiente, compra cancelada - Dinero devuelto: " + m.getValor());
        } catch (NoHayProductoException e) {
            System.out.println("Producto no disponible, compra cancelada - Dinero devuelto: " + m.getValor());
        }

        System.out.println("Producto: " + c.queConsumiste() + " - Vuelto: " + c.cuantoVuelto());
        System.out.println();
        System.out.println("-Prueba de excepciones-");
        System.out.println();
        System.out.print("PagoIncorrectoException: ");

        m = null;
        try {
            c = new Comprador(m, Productos.Super8, exp);
        } catch (PagoIncorrectoException e) {
            System.out.println("La moneda ingresada no es válida");
        } catch (PagoInsuficienteException e) {
            System.out.println("Saldo insuficiente, compra cancelada - Dinero devuelto: " + m.getValor());
        } catch (NoHayProductoException e) {
            System.out.println("Producto no disponible, compra cancelada - Dinero devuelto: " + m.getValor());
        }

        System.out.print("PagoInsuficienteException: ");

        m = new Moneda100();
        try {
            c = new Comprador(m, Productos.Super8, exp);
        } catch (PagoIncorrectoException e) {
            System.out.println("La moneda ingresada no es válida");
        } catch (PagoInsuficienteException e) {
            System.out.println("Saldo insuficiente, compra cancelada - Dinero devuelto: " + m.getValor());
        } catch (NoHayProductoException e) {
            System.out.println("Producto no disponible, compra cancelada - Dinero devuelto: " + m.getValor());
        }

        System.out.print("NoHayProductoException: ");

        exp = new Expendedor(0);
        m = new Moneda1000();

        try {
            c = new Comprador(m, Productos.Super8, exp);
        } catch (PagoIncorrectoException e) {
            System.out.println("La moneda ingresada no es válida");
        } catch (PagoInsuficienteException e) {
            System.out.println("Saldo insuficiente, compra cancelada - Dinero devuelto: " + m.getValor());
        } catch (NoHayProductoException e) {
            System.out.println("Producto no disponible, compra cancelada - Dinero devuelto: " + m.getValor());
        }
        System.out.println("Vaciar depósito (forzar NoHayProductoException):");

        exp = new Expendedor(2);
        for (int i = 1; i <= 3; i++) {
            m = new Moneda1000();
            try {
                c = new Comprador(m, Productos.Super8, exp);
            } catch (PagoIncorrectoException e) {
                System.out.println("La moneda ingresada no es válida");
                break;
            } catch (PagoInsuficienteException e) {
                System.out.println("Saldo insuficiente, compra cancelada - Dinero devuelto: " + m.getValor());
                break;
            } catch (NoHayProductoException e) {
                System.out.println("Producto no disponible, compra cancelada - Dinero devuelto: " + m.getValor());
                break;
            }

            System.out.println(c.queConsumiste() + " - Vuelto: " + c.cuantoVuelto());

        }

        System.out.println();
        System.out.println("-Implementación Comparable-");
        System.out.println();

        m = new Moneda1000();
        Moneda n = new Moneda100();

        System.out.println("Moneda mayor que otra: " + m.compareTo(n));
        System.out.println("Moneda menor que otra: " + n.compareTo(m));
        m = new Moneda100();
        System.out.println("Monedas iguales: " + m.compareTo(n));

    }
}
