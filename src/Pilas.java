import java.util.ArrayList;

public class Pilas<T> {

    private final int CAPACITY=10;
    private final int TOP=3;

    private ArrayList<T> pila = new ArrayList<>();

    public void anadir(T element){
        pila.add(pila.size(), element);
    }
    public void quitar(T element){
        pila.remove(TOP);
    }


}
