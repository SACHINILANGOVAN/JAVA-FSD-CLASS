import java.util.Scanner;

public class Credit {
    public Scanner scanner;

    public void enterCreditAmount() {
        System.out.println("ENTER YOUR AMOUNT :");
        int amount = scanner.nextInt();
        int balance = Utils.bal + amount;
        System.out.println(balance);


    }
}
