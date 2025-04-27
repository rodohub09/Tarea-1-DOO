public class Moneda1000 extends Moneda{
    public Moneda1000(){
        super();
    }

    public int compareTo(Moneda moneda){
        return this.getSerie().compareTo(moneda.getSerie());
    }

    public int getValor() {
        return 1000;
    }
}