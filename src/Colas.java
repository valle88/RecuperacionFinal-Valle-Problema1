import java.util.ArrayList;

public class Colas <T>{

    private final int  TOP = 3;
    private final int CAPACITY=10;

    private ArrayList<T> cola = new ArrayList<>();


    public   void enqueue(T element){
        cola.add(cola.size(), element);
    }

    public  T queue( ){
        return cola.remove(TOP);
    }


}
