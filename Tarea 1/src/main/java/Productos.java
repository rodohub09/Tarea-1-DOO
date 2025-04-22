public enum Productos {
    CocaCola(1, 1000),
    Sprite(2, 1000),
    Fanta(3, 1000),
    Snickers(4, 1300),
    Super8(5, 600);

    private final int num;
    private final int precio;

    Productos (int opcion, int precio) {
        this.num = opcion;
        this.precio = precio;
    }

    public int getNum() {
        return num;
    }

    public int getPrecio() {
        return precio;
    }
}
