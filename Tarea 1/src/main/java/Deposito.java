import java.util.ArrayList;

public class Deposito<T>{
    public ArrayList<T> dep = new ArrayList<>();

    public void addItem(T item){
        dep.add(item);
    }

    public T getItem(){
        if (dep.isEmpty())
            return null;
        else
            return dep.removeFirst();
    }

}
