import java.util.ArrayList;

class Moneda1000 extends Moneda{
    public Moneda1000(){
        super();
    }

    public int getValor() {
        return 1000;
    }
}

class Moneda500 extends Moneda{
    public Moneda500(){
        super();
    }

    public int getValor() {
        return 500;
    }

}

class Moneda100 extends Moneda{
    public Moneda100(){
        super();
    }

    public int getValor() {
        return 100;
    }

}

abstract class Bebida{
    private int serie;
    public Bebida(int numSerie){
        this.serie = numSerie;
    }

    public int getSerie(){
        return serie;
    }

    public abstract String beber();

}

class CocaCola extends Bebida{

    public CocaCola(int num){
        super(num);
    }

    public String beber(){
        return "cocacola";
    }

}

class Sprite extends Bebida{
    public Sprite(int num){
        super(num);
    }

    public String beber(){
        return "sprite";
    }

}


public class Main {
    public static void main(String[] args) {

    }
}
