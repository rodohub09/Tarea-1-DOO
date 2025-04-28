
public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(1);
        Moneda m;
        Comprador c=null    ;

        System.out.println("----Demostración de funcionamiento----");
        System.out.println();
        System.out.println("-Compra de cada producto-");
        System.out.println();
        System.out.println("Bebidas:");
        System.out.print("Cocacola: ");
        m= new Moneda1000();
        try {
            c = new Comprador(m, Productos.CocaCola, exp);
        }
        catch (Exception e) {
            if (e instanceof PagoIncorrectoException) {
                System.out.println("La moneda ingresada no es válida");
            } else if (e instanceof PagoInsuficienteException) {
                System.out.println("Saldo insuficiente, compra cancelada");
            } else if (e instanceof NoHayProductoException) {
                System.out.println("Producto no disponible, compra cancelada");
            }
        }
        System.out.println("Producto: " + c.queConsumiste() + " - Vuelto: " + c.cuantoVuelto());

        m= new Moneda1000();
        try {
            c = new Comprador(m, Productos.Sprite, exp);
        }
        catch (Exception e) {
            if (e instanceof PagoIncorrectoException) {
                System.out.println("La moneda ingresada no es válida");
            } else if (e instanceof PagoInsuficienteException) {
                System.out.println("Saldo insuficiente, compra cancelada");
            } else if (e instanceof NoHayProductoException) {
                System.out.println("Producto no disponible, compra cancelada");
            }
        }
        System.out.println("Producto: " + c.queConsumiste() + " - Vuelto: " + c.cuantoVuelto());

        m= new Moneda1000();
        try {
            c = new Comprador(m, Productos.Fanta, exp);
        }
        catch (Exception e) {
            if (e instanceof PagoIncorrectoException) {
                System.out.println("La moneda ingresada no es válida");
            } else if (e instanceof PagoInsuficienteException) {
                System.out.println("Saldo insuficiente, compra cancelada");
            } else if (e instanceof NoHayProductoException) {
                System.out.println("Producto no disponible, compra cancelada");
            }
        }
        System.out.println("Producto: " + c.queConsumiste() + " - Vuelto: " + c.cuantoVuelto());

        m= new Moneda1000();
        try {
            c = new Comprador(m, Productos.Snickers, exp);
        }
        catch (Exception e) {
            if (e instanceof PagoIncorrectoException) {
                System.out.println("La moneda ingresada no es válida");
            } else if (e instanceof PagoInsuficienteException) {
                System.out.println("Saldo insuficiente, compra cancelada");
            } else if (e instanceof NoHayProductoException) {
                System.out.println("Producto no disponible, compra cancelada");
            }
        }
        System.out.println("Producto: " + c.queConsumiste() + " - Vuelto: " + c.cuantoVuelto());

        m= new Moneda1000();
        try {
            c = new Comprador(m, Productos.Super8, exp);
        }
        catch (Exception e) {
            if (e instanceof PagoIncorrectoException) {
                System.out.println("La moneda ingresada no es válida");
            } else if (e instanceof PagoInsuficienteException) {
                System.out.println("Saldo insuficiente, compra cancelada");
            } else if (e instanceof NoHayProductoException) {
                System.out.println("Producto no disponible, compra cancelada");
            }
        }
        System.out.println("Producto: " + c.queConsumiste() + " - Vuelto: " + c.cuantoVuelto());


        for(int i=1; i<=2;i++) {
            c=null;
            m = new Moneda100();
            try {
                c = new Comprador(m, Productos.CocaCola, exp);
            }
            catch (Exception e) {
                if (e instanceof PagoIncorrectoException) {
                    System.out.println("La moneda ingresada no es válida");
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

            if(c!=null)
                System.out.println(c.queConsumiste()+", "+c.cuantoVuelto());
        }


    }
}
