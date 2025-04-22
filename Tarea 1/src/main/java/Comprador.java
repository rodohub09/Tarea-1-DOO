public class Comprador {
    private int vuelto = 0;
    private String sonido;

    public Comprador(Moneda m, int cualBebida, Expendedor exp){
        Bebida b = exp.comprarBebida(m, cualBebida);
        if(b != null)
            sonido = b.consumir();
        else
            sonido = null;

        Moneda mon;
        while ((mon=exp.getVuelto()) != null){
            vuelto += mon.getValor();
        }
    }

    public int cuantoVuelto(){
        return vuelto;
    }

    public String queBebiste(){
        return sonido;
    }
}