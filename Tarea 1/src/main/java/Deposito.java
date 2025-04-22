import java.util.ArrayList;

public class Deposito<T>{
    public ArrayList<T> dep;

    public Deposito(){
        dep= new ArrayList<T>();
    }

    public void addItem(T item){
        dep.add(item);
    }

    public T getItem(){
        if(dep.isEmpty())
            return null;
        else
            return dep.remove(0);
    }

}
