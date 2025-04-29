public abstract class Producto {
    protected Productos tipo;

    public Producto(Productos tipo){
        this.tipo = tipo;
    }

    public String getNombre() {
        return tipo.name();
    }

    public abstract String consumir();
}
