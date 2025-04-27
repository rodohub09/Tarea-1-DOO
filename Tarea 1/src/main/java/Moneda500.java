public class Moneda500 extends Moneda{
    public Moneda500(){
        super();
    }

    public int compareTo(Moneda moneda){
        return this.getSerie().compareTo(moneda.getSerie());
    }

    public int getValor() {
        return 500;
    }
}
