import framework.ConCreateProduct;
import framework.Product;

public class UnderlinePen extends ConCreateProduct {
    private char ulChar;

    public UnderlinePen(char ulChar) {
        this.ulChar = ulChar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.print(" ");
        for (int i = 0; i < length; i++) {
            System.out.print(ulChar);
        }
        System.out.println("");
    }
}
