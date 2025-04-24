public class Expendedor {
    private int precio;
    private Deposito<Bebida> coca;
    private Deposito<Bebida> sprite;
    private Deposito<Bebida> fanta;
    private Deposito<Dulce> snickers;
    private Deposito<Dulce> super8;
    private Deposito<Moneda> monVu;

    public Expendedor(int num, int valor){
        coca = new Deposito<>();
        sprite = new Deposito<>();
        fanta = new Deposito<>();
        snickers = new Deposito<>();
        super8 = new Deposito<>();
        monVu = new Deposito<>();
        this.precio = valor;

        for (int i = 0; i < num; i++) {
            coca.addItem(new CocaCola());
            sprite.addItem(new Sprite());
            fanta.addItem(new Fanta());
            snickers.addItem(new Snickers());
            super8.addItem(new Super8());
        }
    }

    public Producto comprarProducto(Moneda moneda, Productos p){
        if (moneda == null) return null;

        Producto product = null;
        switch (p.getOpcion()) {
            case 1:
                product = coca.getItem();
                break;
            case 2:
                product = sprite.getItem();
                break;
            case 3:
                product = fanta.getItem();
                break;
            case 4:
                product = snickers.getItem();
                break;
            case 5:
                product = super8.getItem();
                break;
            default:
                break;
        }
        if (product != null){
            for (int i = 0; i < (moneda.getValor() - precio)/100 ; i++) {
                monVu.addItem(new Moneda100());
            }
        } else {
            monVu.addItem(moneda);
        }
        return product;
    }

    public Moneda getVuelto(){
        return monVu.getItem();
    }
}
