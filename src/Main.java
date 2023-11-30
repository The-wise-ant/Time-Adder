import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the console
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter the current time
        System.out.println("Enter current hour: ");
        int currentHour = scan.nextInt();

        System.out.println("Enter current minute: ");
        int currentMinute = scan.nextInt();

        System.out.println("Enter current second : ");
        int currentSecond = scan.nextInt();

        // Prompt the user to enter the time to go forward
        System.out.println("Enter hour to go forward: ");
        int forwardHour = scan.nextInt();

        System.out.println("Enter minute to go forward: ");
        int forwardMinute = scan.nextInt();

        System.out.println("Enter second to go forward : ");
        int forwardSecond = scan.nextInt();

        // Initialize variables to store the answer
        int answerHour = 0;
        int answerMinute = 0;
        int answerSecond = 0;

        // Initialize variables to handle carrying over excess time
        int carrySecond = 0;
        int carryMinute = 0;
        boolean isNextDay = false;

        // Calculate the new seconds, minutes, and hours
        answerSecond = currentSecond + forwardSecond;
        if (answerSecond >= 60) {
            answerSecond -= 60;
            carrySecond = 1;
        }

        answerMinute = currentMinute + forwardMinute + carrySecond;
        if (answerMinute >= 60) {
            answerMinute -= 60;
            carryMinute = 1;
        }

        answerHour = currentHour + forwardHour + carryMinute;
        if (answerHour >= 24) {
            answerHour -= 24;
            isNextDay = true;
        }

        // Display the result, considering whether it's the next day
        if (isNextDay) {
            System.out.println("The answer is " + answerHour + ":" + answerMinute + ":" + answerSecond + " on the next day");
        } else {
            System.out.println("The answer is " + answerHour + ":" + answerMinute + ":" + answerSecond);
        }
    }
}
