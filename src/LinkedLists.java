import java.util.LinkedList;

public class LinkedLists {
    private LinkedList<String> balanceHistory = new LinkedList<>();

    public void addToList(int index, String word) {
        balanceHistory.add(index,word);
    }
    public void removeFromList(int index) {
        balanceHistory.remove(index);
    }
    public void replaceList(int index, String word) {
        balanceHistory.set(index, word);
    }

}
