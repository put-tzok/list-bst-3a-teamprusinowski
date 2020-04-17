package pl.prusinowski;

public class Main {

    public static void main(String[] args) {
        Bst bst = new Bst();
        LinkedList linkedList = new LinkedList();
        Experiment experiment = new Experiment(linkedList,bst);
        experiment.addNumbersWithShuffle(200,true);
        experiment.searchBst();
        experiment.searchList();
        experiment.deleteList();
    }
}
