import java.util.ArrayList;

class Comprador{
    private int vuelto;
    private String sonido;

    public Comprador(Moneda m, int cualBebida, Expendedor exp){
        Bebida b = exp.comprarBebida(m,cualBebida);
        if(b!=null)
            sonido = b.beber();
        else
            sonido=null;
        Moneda mon;
        while((mon=exp.getVuelto())!=null){
            vuelto+= mon.getValor();
        }


    }

    public int cuantoVuelto(){
        return vuelto;
    }

    public String queBebiste(){
        return sonido;
    }
}

class Expendedor{
    public static final int COCA=1;
    public static final int SPRITE=2;
    private final int precio;
    Deposito coca;
    Deposito sprite;
    DepositoMoneda monVu;

    public Expendedor(int num, int valor){
        this.coca=new Deposito();
        this.sprite=new Deposito();
        this.monVu=new DepositoMoneda();
        this.precio= valor;
        for(int i=0;i<num;i++){
            coca.addBebida(new CocaCola(100+i));
            sprite.addBebida(new Sprite(200+i));
        }


    }

    public Bebida comprarBebida(Moneda moneda, int select){
        if(moneda!=null) {
            switch (select) {
                case COCA: {
                    if((moneda.getValor()>=precio)&&(!coca.dep.isEmpty())) {
                        for(int i = 0; i < (moneda.getValor() - precio)/100; i++) {
                            monVu.addMoneda(new Moneda100());
                        }
                        return coca.getBebida();
                    }
                    else{
                        monVu.addMoneda(moneda);
                        return null;
                    }
                }
                case SPRITE: {
                    if((moneda.getValor()>=precio)&&(!sprite.dep.isEmpty())){
                        for(int i = 0; i < (moneda.getValor() - precio)/100; i++) {
                            monVu.addMoneda(new Moneda100());
                        }
                        return sprite.getBebida();
                    }
                    else{
                        monVu.addMoneda(moneda);
                        return null;
                    }
                }
            }
            monVu.addMoneda(moneda);
            return null;
        }
        return null;
    }

    public Moneda getVuelto(){
        return monVu.getMoneda();
    }
}


class Deposito{
    public ArrayList<Bebida> dep;

    public Deposito(){
        dep= new ArrayList<Bebida>();
    }

    public void addBebida(Bebida bebida){
        dep.add(bebida);
    }

    public Bebida getBebida(){
        if(dep.isEmpty())
            return null;
        else
            return dep.remove(0);
    }

}

class DepositoMoneda{
    private ArrayList<Moneda> dep;

    public DepositoMoneda(){
        dep = new ArrayList<Moneda>();
    }

    public void addMoneda(Moneda moneda){
        dep.add(moneda);
    }


    public Moneda getMoneda(){
        if(dep.isEmpty())
            return null;
        else
            return dep.remove(0);
    }


}

abstract class Moneda{
    public Moneda(){
    }

    public Moneda getSerie(){
        return this;
    }

    public abstract int getValor();

}

class Moneda1500 extends Moneda{
    public Moneda1500(){
        super();
    }

    public int getValor() {
        return 1500;
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
