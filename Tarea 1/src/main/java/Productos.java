/*
* Enum que contiene todos los tipos de productos, los cuales tienen sus respectivos
* precios y se referencian con un numero
* */

public enum Productos {
    CocaCola(1, 700),
    Sprite(2, 700),
    Fanta(3, 700),
    Snickers(4, 1000),
    Super8(5, 400);

    private final int opcion;
    private final int precio;

    Productos (int opcion, int precio) {
        this.opcion = opcion;
        this.precio = precio;
    }

    public int getOpcion() {
        return opcion;
    }

    public int getPrecio() {
        return precio;
    }
}