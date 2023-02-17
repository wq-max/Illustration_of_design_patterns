package bridge;

import java.util.Random;

public class RandomDisplay extends Display{
    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        open();
        Random random = new Random();
        int k = random.nextInt(times);
        for (int i = 0; i < k; i++) {
            print();
        }
        close();
    }
}
