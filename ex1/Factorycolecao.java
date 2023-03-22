package ex1;

import java.util.*;

public class Factorycolecao {
    private static Factorycolecao factorycolecao=null;

    public <T extends Comparable<T>>  Collection<T> getcollection(int tamanho, boolean ordem, boolean repetido ) {
        if (tamanho != 0 && ordem && repetido) {
            return new ArrayList<T>(tamanho);
        }
        else if (tamanho == 0 && ordem && repetido) {
            return new LinkedList<T>();
        }
        else if (tamanho == 0 && !ordem && !repetido) {
            return new HashSet<T>();
        }
        else if (tamanho == 0 && ordem && !repetido) {
            return new TreeSet<T>();
        }
        return null;
    }

    public static Factorycolecao getInstance() {
        if (factorycolecao == null) factorycolecao = new Factorycolecao();
        return factorycolecao;
    }
}

