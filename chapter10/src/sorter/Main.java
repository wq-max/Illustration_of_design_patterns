package sorter;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] data = {
                "Dumpty", "Bowman", "Carroll", "Elfland", "Alice"
        };
        String[] data1 = {
                "Dumpty", "Bowman", "Carroll", "Elfland", "Alice"
        };
        String[] data2 = {
                "Dumpty", "Bowman", "Carroll", "Elfland", "Alice"
        };
        String[] data3 = {
                "Dumpty", "Bowman", "Carroll", "Elfland", "Alice"
        };
        SortAndPrint sap = new SortAndPrint(data, new SelectionSorter());
        sap.execute();
        SortAndPrint sap1 = new SortAndPrint(data1, new BubbleSorter());
        sap1.execute();
        SortAndPrint sap2 = new SortAndPrint(data2, new InsertSorter());
        sap2.execute();
        SortAndPrint sap3 = new SortAndPrint(data3, new QuickSorter());
        sap3.execute();
    }
}
