import java.util.ArrayList;

class Expendedor{
    public static final int COCA=1;
    public static final int SPRITE=2;
    private final int precio;
    Deposito<Bebida> coca;
    Deposito<Bebida> sprite;
    Deposito<Moneda> monVu;

    public Expendedor(int num, int valor){
        this.coca=new Deposito<Bebida>();
        this.sprite=new Deposito<Bebida>();
        this.monVu=new Deposito<Moneda>();
        this.precio= valor;
        for(int i=0;i<num;i++){
            coca.addItem(new CocaCola(100+i));
            sprite.addItem(new Sprite(200+i));
        }


    }

    public Bebida comprarBebida(Moneda moneda, int select){
        if(moneda!=null) {
            switch (select) {
                case COCA: {
                    if((moneda.getValor()>=precio)&&(!coca.dep.isEmpty())) {
                        for(int i = 0; i < (moneda.getValor() - precio)/100; i++) {
                            monVu.addItem(new Moneda100());
                        }
                        return coca.getItem();
                    }
                    else{
                        monVu.addItem(moneda);
                        return null;
                    }
                }
                case SPRITE: {
                    if((moneda.getValor()>=precio)&&(!sprite.dep.isEmpty())){
                        for(int i = 0; i < (moneda.getValor() - precio)/100; i++) {
                            monVu.addItem(new Moneda100());
                        }
                        return sprite.getItem();
                    }
                    else{
                        monVu.addItem(moneda);
                        return null;
                    }
                }
            }
            monVu.addItem(moneda);
            return null;
        }
        return null;
    }

    public Moneda getVuelto(){
        return monVu.getItem();
    }
}


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
