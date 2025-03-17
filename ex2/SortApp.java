package ex2;

public class SortApp {
    public static void main(String[] args) {
        SortStrategy selectionSort = new SelectionSort();
        SortStrategy mergeSort = new MergeSort();
        SortStrategy insertionSort = new InsertionSort();

        // Test each sorting strategy
        selectionSort.sort();
        mergeSort.sort();
        insertionSort.sort();
    }
}

interface SortStrategy {
    void sort();
}

class SelectionSort implements SortStrategy {
    @Override
    public void sort() {
        System.out.println("Selection sort is sorting the items...");
    }
}

class MergeSort implements SortStrategy {
    @Override
    public void sort() {
        System.out.println("Merge sort is sorting the items...");
    }
}

class InsertionSort implements SortStrategy {
    @Override
    public void sort() {
        System.out.println("Insertion sort is sorting the items...");
    }
}

