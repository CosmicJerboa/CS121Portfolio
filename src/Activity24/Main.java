package Activity24;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        ArrayList<Double> doubleArrayList = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8));
        ArrayList<Character> characterArrayList = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'));
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h"));
        GenericArrayList printing = new GenericArrayList();
        printing.printMultipleArrayLists(integerArrayList);
        printing.printMultipleArrayLists(doubleArrayList);
        printing.printMultipleArrayLists(characterArrayList);
        printing.printMultipleArrayLists(stringArrayList);
    }
}
