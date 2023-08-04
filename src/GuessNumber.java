import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a quantity try");
        int turnQuantity = console.nextInt();
        System.out.println("Enter a lower bound");
        int lowerBound = console.nextInt();
        System.out.println("Enter a max bound");
        int maxBound = console.nextInt();

        Random rand = new Random();
        int randInt = lowerBound + rand.nextInt(maxBound - lowerBound);
        int counter = 1;

        boolean status = false;

        while (counter <= turnQuantity) {
            System.out.println("Enter your num");
            int userNum = console.nextInt();
            if (userNum == randInt) {
                System.out.println("You guessed a num");
                status = true;
                break;
            } else if (userNum > randInt) {
                System.out.println("Your num is more");
                status = false;
            } else {
                System.out.println("Your num is less than random");
                status = false;
            }
            counter++;
        }
            if (status == false)
                System.out.println("Game over");
                System.out.println("Rand num is: " + randInt);

        }
        String a;
    int ab;
    int g;

    }