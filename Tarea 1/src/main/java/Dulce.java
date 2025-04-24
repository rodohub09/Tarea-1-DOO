public abstract class Dulce extends Producto {
    public Dulce (Productos p) {
        super(p);
    }

    @Override
    public String consumir() {
        return getNombre();
    }
}
