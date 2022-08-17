import java.util.Scanner;

public class Utils {

    public static int arunBalance = 1000;
    public static int kumarBalance = 90000;

    public static int balance = 0;
    public static int arunPin = 1234;
    public static int kumarPin = 4321;
    public static int pin;

    public static void welcomeMessage() {
        System.out.println("WELCOME TO ATM");
    }

    public static void showBalance(int currentBalance) {
        System.out.println("YOUR AVAILABLE BALANCE IS : " + currentBalance);
    }

    public static int enterYourPin(Scanner scanner) {
        System.out.println("Enter your pin:");
        int pin = scanner.nextInt();
        if (pin == arunPin) {
            balance = arunBalance;
        } else if (pin == kumarPin) {
            balance = kumarBalance;
        } else {
            System.out.println("Invalid Pin!!!");
        }
        return pin;
    }
}
