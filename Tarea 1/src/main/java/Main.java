
public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(1,300);
        Moneda m = null;
        Comprador c=null;
        m = new Moneda1000();
        try{
            c = new Comprador(m,Productos.CocaCola,exp);
        }
        catch (Exception e){
            if (e instanceof PagoIncorrectoException)
                System.out.println("La moneda ingresada no es válida");

            else if (e instanceof PagoInsuficienteException)
                System.out.println("Saldo insuficiente, compra cancelada");

            else if (e instanceof NoHayProductoException)
                System.out.println("Producto no disponible, compra cancelada");

        }

        if(c!=null)
            System.out.println(c.queBebiste()+", "+c.cuantoVuelto());

        Moneda n = new Moneda500();

        System.out.println(m.compareTo(n));

    }
}
