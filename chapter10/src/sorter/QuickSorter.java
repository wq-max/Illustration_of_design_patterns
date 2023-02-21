package sorter;

public class QuickSorter implements Sorter{
    @Override
    public void sort(Comparable[] data) {
        qsort(data, 0, data.length - 1);
    }

    private void qsort(Comparable[] data, int pre, int post) {
        int saved_pre = pre;
        int saved_post = post;
        Comparable mid = data[(pre + post) / 2];
        do {
            while (data[pre].compareTo(mid) < 0) {
                pre++;
            }
            while (mid.compareTo(data[post]) < 0) {
                post--;
            }
            if (pre <= post) {
                Comparable tmp = data[pre];
                data[pre] = data[post];
                data[post] = tmp;
                pre++;
                post--;
            }
        } while (pre <= post);
        if (saved_pre < post) {
            qsort(data, saved_pre, post);
        }
        if (pre < saved_post) {
            qsort(data, pre, saved_post);
        }
    }

}
