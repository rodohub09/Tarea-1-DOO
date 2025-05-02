/**
 * Main de prueba principal para el {@link Expendedor} de 6 productos con stock de 5. Este recibira unos {@link Comprador}es, que querran comprar un {@link Producto}
 * */

public class Main {
    public static void main(String[] args) {

        //Se instancia el expendedor con una capacidad de 5 productos por deposito.
        Expendedor exp = new Expendedor(5);
        //Se crea puntero de tipo Moneda.
        Moneda m;
        //Se crea puntero de tipo Comprador.
        Comprador c = null;

        System.out.println("----Demostración de funcionamiento----");
        System.out.println();
        System.out.println("-Compra de cada producto-");
        System.out.println();

        //Se instancia una moneda de valor 1000 en el puntero
        m = new Moneda1000();

        /*Se instancia un comprador que tiene como parametros el puntero m, el producto que quiere adquirir y la maquina
         de la cual quiere adquirir dicho producto. Posteriormente se revisa si no cumple con alguna excepcion*/
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

        //Se instancia una moneda de valor 1000 en el puntero.
        m = new Moneda1000();

        /*Se instancia un comprador que tiene como parametros el puntero m, el producto que quiere adquirir y la maquina
         de la cual quiere adquirir dicho producto. Posteriormente se revisa si no cumple con alguna excepcion*/
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

        //Se instancia una moneda de valor 1000 en el puntero.
        m = new Moneda1000();

        /*Se instancia un comprador que tiene como parametros el puntero m, el producto que quiere adquirir y la maquina
         de la cual quiere adquirir dicho producto. Posteriormente se revisa si no cumple con alguna excepcion*/
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

        //Se instancia una moneda de valor 1000 en el puntero.
        m = new Moneda1000();

        /*Se instancia un comprador que tiene como parametros el puntero m, el producto que quiere adquirir y la maquina
         de la cual quiere adquirir dicho producto. Posteriormente se revisa si no cumple con alguna excepcion*/
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

        //Se instancia una moneda de valor 1000 en el puntero.
        m = new Moneda1000();

        /*Se instancia un comprador que tiene como parametros el puntero m, el producto que quiere adquirir y la maquina
         de la cual quiere adquirir dicho producto. Posteriormente se revisa si no cumple con alguna excepcion*/
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

        //Se asigna el valor null en el puntero.
        m = null;
        /*Se instancia un comprador que tiene como parametros el puntero m, el producto que quiere adquirir y la maquina
         de la cual quiere adquirir dicho producto. Posteriormente se revisa si no cumple con alguna excepcion*/
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

        //Se instancia una moneda de valor 100 en el puntero.
        m = new Moneda100();
        /*Se instancia un comprador que tiene como parametros el puntero m, el producto que quiere adquirir y la maquina
         de la cual quiere adquirir dicho producto. Posteriormente se revisa si no cumple con alguna excepcion*/
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

        //Se instancia el expendedor con una capacidad de 0 productos por deposito.
        exp = new Expendedor(0);
        //Se instancia una moneda de valor 100 en el puntero.
        m = new Moneda1000();
        /*Se instancia un comprador que tiene como parametros el puntero m, el producto que quiere adquirir y la maquina
         de la cual quiere adquirir dicho producto. Posteriormente se revisa si no cumple con alguna excepcion*/
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

        //Se instancia el expendedor con una capacidad de 2 productos por deposito.
        exp = new Expendedor(2);

        //Se intenta comprar un prodcto hasta que este no tenga stock en la expendedora mediante un for.
        for (int i = 1; i <= 3; i++) {
            //Se instancia una moneda de valor 1000 en el puntero.
            m = new Moneda1000();
            /*Se instancia un comprador que tiene como parametros el puntero m, el producto que quiere adquirir y la
            maquina de la cual quiere adquirir dicho producto. Posteriormente se revisa si no cumple con alguna
            excepcion*/
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

        //Se instancia una moneda de valor 1000 en el puntero.
        m = new Moneda1000();
        //Se crea puntero de tipo Moneda, instanciando una moneda de valor 100.
        Moneda n = new Moneda100();

        System.out.println("Moneda mayor que otra: " + m.compareTo(n));
        System.out.println("Moneda menor que otra: " + n.compareTo(m));
        //Se instancia una moneda de valor 1000 en el puntero.
        m = new Moneda100();
        System.out.println("Monedas iguales: " + m.compareTo(n));

    }
}
