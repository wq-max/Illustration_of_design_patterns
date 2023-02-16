package listfactory;

import factory.Item;
import factory.Tray;

import java.util.Iterator;

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();
        builder.append("<li>\n");
        builder.append(caption).append("\n");
        builder.append("<ul>\n");
        for (Object o : tray) {
            Item item = (Item) o;
            builder.append(item.makeHTML());
        }
        builder.append("</ul>\n");
        builder.append("</li>\n");
        return builder.toString();
    }
}
