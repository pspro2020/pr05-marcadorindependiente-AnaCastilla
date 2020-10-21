import java.util.Random;

public class Dice {

    private int[] numbers = new int[6];
    private Object[] watcher = {new Object(), new Object(), new Object(), new Object(), new Object(), new Object()};

    public void throwDice(int num) {
        synchronized (watcher[num - 1]) {
            numbers[num - 1]++;
        }

        System.out.printf("Number %d has been thrown\n", num);
    }

    public void showNumbers() {
        int totalTimes = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("\nNumber %d: %d times\n", i+1, numbers[i]);
            totalTimes += numbers[i];
        }

        System.out.printf("\nTotal: %d + %d + %d + %d + %d + %d = %d\n", numbers[0], numbers[1],
                numbers[2], numbers[3], numbers[4], numbers[5], totalTimes);
    }


}
