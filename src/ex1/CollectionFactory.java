package ex1;

import java.util.*;

public class CollectionFactory{

    public static CollectionFactory factory = null;

    private CollectionFactory(){

    }

    //se passar 0 eh porque nao importa o tamanho
    public <T extends Comparable<T>> Collection<T> getCollection(int size, boolean order, boolean canRepeat, boolean naturalOrder) {
        if (size != 0 && order && canRepeat && !naturalOrder) {
            return new ArrayList<T>();
        } else if (size == 0 && order && canRepeat && !naturalOrder) {
            return new LinkedList<T>();
        } else if (size <= 0 && !order && !canRepeat && !naturalOrder) {
            return new HashSet<T>();
        } else if (size <= 0 && !order && !canRepeat) {
            return new TreeSet<T>();
        }
        return null;
    }

    public static CollectionFactory getInstance(){
        if(factory == null){
            factory = new CollectionFactory();
        }
        return factory;
    }

}
