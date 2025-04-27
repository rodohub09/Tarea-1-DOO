public class Moneda100 extends Moneda{
    public Moneda100(){
        super();
    }

    public int compareTo(Moneda moneda){
        return this.getSerie().compareTo(moneda.getSerie());
    }

    public int getValor() {
        return 100;
    }
}
