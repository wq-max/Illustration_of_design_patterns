package decorator;

public class UpDownBorder extends Border{
    private char ch;

    public UpDownBorder(Display display, char ch) {
        super(display);
        this.ch = ch;
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return display.getRows() + 2;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return String.valueOf(ch).repeat(Math.max(0, display.getColumns()));
        } else if (row == display.getRows() + 1) {
            return String.valueOf(ch).repeat(Math.max(0, display.getColumns()));
        } else {
            return display.getRowText(row - 1);
        }
    }
}
