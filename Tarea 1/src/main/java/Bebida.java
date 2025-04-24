public abstract class Bebida extends Producto{
    public Bebida (Productos p) {
        super(p);
    }

    @Override
    public String consumir() {
        return getNombre();
    }
}
