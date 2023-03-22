package ex1;

public class AppExercicio1 {

    public static void main(String[] args) {
        var collectionFactory = CollectionFactory.getInstance();

        var result = collectionFactory.getCollection(100, true, true, false);

    }
}
