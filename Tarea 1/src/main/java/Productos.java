public enum Productos {
    CocaCola(1, 700),
    Sprite(2, 700),
    Fanta(3, 700),
    Snickers(4, 1000),
    Super8(5, 400);

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