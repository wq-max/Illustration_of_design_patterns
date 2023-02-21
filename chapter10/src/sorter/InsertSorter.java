package sorter;

public class InsertSorter implements Sorter{
    @Override
    public void sort(Comparable[] data) {
        for (int i = 1; i < data.length; i++) {
            for (int j = i; j > 0; j--) {
                if (data[j].compareTo(data[j - 1]) < 0) {
                    Comparable tmp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = tmp;
                }
                else {
                    break;
                }
            }
        }
    }
}
