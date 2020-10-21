public class Main {

    public static void main(String[] args) {

        final int NUMBER_OF_THREADS = 3;
        Dice dice = new Dice();
        Thread[] threads = new Thread[NUMBER_OF_THREADS];

        System.out.println("The dice rolls");

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new DiceTask(dice));
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }

        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch(InterruptedException e) {
                System.out.printf("Thread %d has been interrupted", i);
            }
        }

        dice.showNumbers();
    }
}
