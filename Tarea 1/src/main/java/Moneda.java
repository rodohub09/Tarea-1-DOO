
public abstract class Moneda implements Comparable<Moneda>{
    public Moneda(){}

    public String getSerie(){
        return this.toString();
    }

    public abstract int getValor();

    @Override
    public int compareTo(Moneda moneda) {
        return Integer.compare(this.getValor(), moneda.getValor());
    }
}