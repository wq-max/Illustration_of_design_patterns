package factory;

import java.lang.reflect.InvocationTargetException;

public abstract class Factory {
    public static Factory getFactory(String classname) {
        Factory factory = null;
       try {
           factory = (Factory) Class.forName(classname).getDeclaredConstructor().newInstance();
       } catch (ClassNotFoundException e) {
           System.err.println(" 没有找到 " + classname + " 类。");
       } catch (InvocationTargetException | InstantiationException | IllegalAccessException | NoSuchMethodException e) {
           e.printStackTrace();
       }
        return factory;
    }

    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
}
