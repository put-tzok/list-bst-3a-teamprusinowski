package pl.prusinowski;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Experiment {
    private LinkedList linkedList;
    private List<Integer> numbers;
    private Bst bst;

    public Experiment(LinkedList linkedList , Bst bst) {
        this.linkedList = linkedList;
        this.numbers = new ArrayList<>();
        this.bst = bst;
    }

    public void addNumbersWithShuffle(int n , boolean shuffle){
        for (int i  = 0  ; i < n ; i++){
            linkedList.add(i);
            bst.insert(i);
            numbers.add(i);
        }

        if (shuffle){
            Collections.shuffle(this.numbers);
        }

    }


    public void searchList(){
        long time = System.currentTimeMillis();
        numbers.forEach(number ->{
            linkedList.search(number);
        });

        System.out.println("List Searching Time in Millis " + (System.currentTimeMillis() - time) );
    }
    public void searchBst(){
        long time = System.currentTimeMillis();
        numbers.forEach(number ->{
            bst.search(number);
        });

        System.out.println("Bst Searching Time in Millis " + (System.currentTimeMillis() - time) );
    }
    public void deleteList(){
        long time = System.currentTimeMillis();
        numbers.forEach(number ->{
            linkedList.delete(number);
        });
        System.out.println("List Deleting Time in Millis " + (System.currentTimeMillis() - time) );
    }
}
