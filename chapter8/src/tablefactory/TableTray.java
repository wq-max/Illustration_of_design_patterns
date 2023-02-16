package tablefactory;

import factory.Item;
import factory.Tray;

public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();
        builder.append("<td>");
        builder.append("<table width=\"100%\" border=\"1\"><tr>");
        builder.append("<td bgcolor=\"#cccccc\" aligin=\"center\" colspan=\"").
                append(tray.size()).append("\"><b>").append(caption).append("</b></td>");
        builder.append("</tr>\n");
        builder.append("<tr>\n");
        for (Object o : tray) {
            Item item = (Item) o;
            builder.append(item.makeHTML());
        }
        builder.append("</tr></table>");
        builder.append("</td>");
        return builder.toString();
    }
}
