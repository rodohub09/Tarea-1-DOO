public class Comprador {
    private int vuelto = 0;
    private String producto;

    public Comprador(Moneda m, Productos p, Expendedor exp) throws Exception{
        Producto product = exp.comprarProducto(m, p);
        if (product != null)
            producto = product.consumir();
        else
            producto = null;

        Moneda mon;
        while ((mon=exp.getVuelto()) != null){
            vuelto += mon.getValor();
        }
    }

    public int cuantoVuelto(){
        return vuelto;
    }

    public String queConsumiste(){
        return producto;
    }
}