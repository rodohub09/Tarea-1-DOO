public class Comprador {
    private int vuelto = 0;
    private String sonido;

    public Comprador(Moneda m, Productos p, Expendedor exp) throws Exception{
        Producto product = exp.comprarProducto(m, p);
        if (product != null)
            sonido = product.consumir();
        else
            sonido = null;

        Moneda mon;
        while ((mon=exp.getVuelto()) != null){
            vuelto += mon.getValor();
        }
    }

    public int cuantoVuelto() {
        return vuelto;
    }

    public String queConsumiste() {
        return sonido;
    }
}