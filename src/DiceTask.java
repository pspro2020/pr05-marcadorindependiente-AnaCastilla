import java.util.Random;

public class DiceTask implements Runnable {

    private Dice dice;


    public DiceTask(Dice dice) {
        this.dice = dice;
    }

    @Override
    public void run() {
        Random rnd = new Random();
        int diceNumber = 0;

        for (int i = 0; i < 10000; i++) {
            diceNumber = rnd.nextInt(6)+1;
            dice.throwDice(diceNumber);
        }
    }
}
