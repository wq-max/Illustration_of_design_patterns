package decorator;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display{
    private List<String> list;
    private int maxColumns;
    MultiStringDisplay() {
        list = new ArrayList<>();
        maxColumns = 0;
    }

    @Override
    public int getColumns() {
        return maxColumns;
    }

    @Override
    public int getRows() {
        return list.size();
    }

    @Override
    public String getRowText(int row) {
        return list.get(row);
    }

    public void add(String s) {
        list.add(s);
        maxColumns = Math.max(maxColumns, s.getBytes(StandardCharsets.UTF_8).length);
    }
}
