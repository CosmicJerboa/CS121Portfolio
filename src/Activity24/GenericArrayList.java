package Activity24;

import java.util.ArrayList;

public class GenericArrayList {
    public <E> void printMultipleArrayLists(ArrayList<E> multiArrayList) {
        System.out.println("\nArray List");
        for (E value : multiArrayList) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
