public class Main {

    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        if (singleton1 == singleton2) {
            System.out.println("singleton1与singleton2是相同实例。");
        } else {
            System.out.println("singleton1与singleton2不是相同实例。");
        }
        System.out.println("End.");
    }
}
