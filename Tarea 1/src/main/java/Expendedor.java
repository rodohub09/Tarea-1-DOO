public class Expendedor {
    public static final int COCA=1;
    public static final int SPRITE=2;

    private int precio;
    private Deposito<Bebida> coca;
    private Deposito<Bebida> sprite;
    private Deposito<Moneda> monVu;

    public Expendedor(int num, int valor){
        coca = new Deposito<>();
        sprite = new Deposito<>();
        monVu = new Deposito<>();
        this.precio = valor;

        for (int i = 0; i < num; i++) {
            coca.addItem(new CocaCola(100+i));
            sprite.addItem(new Sprite(200+i));
        }
    }

    public Bebida comprarBebida(Moneda moneda, int select){
        if (moneda != null) return null;

        Bebida bebida = null;
        switch (select) {
            case COCA:
                bebida = coca.getItem();
                break;
            case SPRITE:
                bebida = sprite.getItem();
                break;
            default:
                break;
        }
        if (bebida != null){
            for (int i = 0; i < (moneda.getValor() - precio)/100 ; i++) {
                monVu.addItem(new Moneda100());
            }
        } else {
            monVu.addItem(moneda);
        }
        return bebida;
    }

    public Moneda getVuelto(){
        return monVu.getItem();
    }
}
