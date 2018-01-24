
import java.util.Random;
import java.util.Scanner;


public class Tote {
    public static void main(String[] args) {
        //showing the big jacpot
        int jacpotMoney = 1;
        int generatedJacpot = jacpot(jacpotMoney);
        System.out.println("The big jacpot is " + generatedJacpot + " levas");

        //initialization
        Scanner input = new Scanner(System.in);

        int[] chosenNumbers = new int[6];
        int i = 0;
        boolean isWorking;
        boolean isWrong;
        int firstMatches = 0;
        int secondMatches = 0;
        int thirdMatches = 0;
        //input the chosen numbers
        System.out.println("Input 6 numbers [1, 49]: ");
        for (i = 0; i < chosenNumbers.length; i++) {
            do {
                chosenNumbers[i] = input.nextInt();
                isWorking = false;
                isWrong = false;
                if (chosenNumbers[i] < 1 || chosenNumbers[i] > 49) {
                    isWorking = true;
                    isWrong = true;
                }
                for (int j = 0; j < i; j++) {
                    if (i > 0 && chosenNumbers[j] == chosenNumbers[i]) {
                        isWorking = true;
                        isWrong = true;
                    }
                }

                if (isWrong) {
                    System.out.println("Wrong number. Input correct number: ");
                } else if (isWrong == false && i < 5) {
                    System.out.println("Correct input. Input next number: ");
                }
            }
            while (isWorking);
        }

        //first
        int[] randomNumbersFirst = new int[6];
        Random rand = new Random();
        randomNumbersFirst[0] = rand.nextInt(49) + 1;
        for (i = 1; i < randomNumbersFirst.length; i++) {
            do {
                isWorking = false;
                randomNumbersFirst[i] = rand.nextInt(49) + 1;
                for (int j = 0; j < i; j++) {
                    if (randomNumbersFirst[i] == randomNumbersFirst[j]) {
                        isWorking = true;
                    }
                }
            }
            while (isWorking == true);
        }
        for (i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (chosenNumbers[i] == randomNumbersFirst[j]) {
                    firstMatches++;
                }
            }
        }

        int[] randomNumbersSecond = new int[6];
        randomNumbersSecond[0] = rand.nextInt(49) + 1;
        for (i = 1; i < randomNumbersSecond.length; i++) {
            do {
                isWorking = false;
                randomNumbersSecond[i] = rand.nextInt(49) + 1;
                for (int j = 0; j < i; j++) {
                    if (randomNumbersSecond[i] == randomNumbersSecond[j]) {
                        isWorking = true;
                    }
                }
            }
            while (isWorking == true);
        }
        for (i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (chosenNumbers[i] == randomNumbersSecond[j]) {
                    secondMatches++;
                }
            }
        }

        int[] randomNumbersThird = new int[6];
        randomNumbersThird[0] = rand.nextInt(49) + 1;
        for (i = 1; i < randomNumbersThird.length; i++) {
            do {
                isWorking = false;
                randomNumbersThird[i] = rand.nextInt(49) + 1;
                for (int j = 0; j < i; j++) {
                    if (randomNumbersThird[i] == randomNumbersThird[j]) {
                        isWorking = true;
                    }
                }
            }
            while (isWorking == true);
        }
        for (i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (chosenNumbers[i] == randomNumbersThird[j]) {
                    thirdMatches++;
                }
            }
        }
        //first
        System.out.println();
        System.out.println("The first generated numbers are: ");
        for (i = 0; i < randomNumbersFirst.length; i++)

        {
            System.out.print(randomNumbersFirst[i] + " ");
        }
        System.out.print("and your matches are: " + firstMatches);
        System.out.println();
        switch (firstMatches) {
            case 3:
                System.out.println("Your jackpot first draw is: " + generatedJacpot * (1 / 100.0));
                break;
            case 4:
                System.out.println("Your jackpot first draw is: " + generatedJacpot * (5 / 100.0));
                break;
            case 5:
                System.out.println("Your jackpot first draw is: " + generatedJacpot * (20 / 100.0));
                break;
            case 6:
                System.out.println("Your jackpot first draw is: " + generatedJacpot);
                break;
            default:
                System.out.println("You don't win anything in the first draw!");
        }

        //second
        System.out.println();
        System.out.println("The second generated numbers are: ");
        for (i = 0; i < randomNumbersSecond.length; i++) {
            System.out.print(randomNumbersSecond[i] + " ");
        }
        System.out.print("and your matches are: " + secondMatches);
        System.out.println();
        switch (secondMatches) {
            case 3:
                System.out.println("Your jackpot second draw is: " + generatedJacpot * (1 / 100.0));
                break;
            case 4:
                System.out.println("Your jackpot second draw is: " + generatedJacpot * (5 / 100.0));
                break;
            case 5:
                System.out.println("Your jackpot second draw is: " + generatedJacpot * (20 / 100.0));
                break;
            case 6:
                System.out.println("Your jackpot second draw is: " + generatedJacpot);
                break;
            default:
                System.out.println("You don't win anything in the second draw!");
        }

        //third
        System.out.println();
        System.out.println("The third generated numbers are: ");
        for (i = 0; i < randomNumbersThird.length; i++) {
            System.out.print(randomNumbersThird[i] + " ");
        }
        System.out.print("and your matches are: " + thirdMatches);
        System.out.println();
        switch (thirdMatches) {
            case 3:
                System.out.println("Your jackpot third draw is: " + generatedJacpot * (1 / 100.0));
                break;
            case 4:
                System.out.println("Your jackpot third draw is: " + generatedJacpot * (5 / 100.0));
                break;
            case 5:
                System.out.println("Your jackpot third draw is: " + generatedJacpot * (20 / 100.0));
                break;
            case 6:
                System.out.println("Your jackpot third draw is: " + generatedJacpot);
                break;
            default:
                System.out.println("You don't win anything in the third draw!");
        }
    }

    //method for the jacpot
    public static int jacpot(int jacpotMoney) {
        Random rand = new Random();
        jacpotMoney = rand.nextInt(2000000) + 50000;
        return jacpotMoney;
    }
}