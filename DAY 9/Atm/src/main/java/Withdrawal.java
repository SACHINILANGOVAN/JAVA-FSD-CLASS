import java.util.Scanner;

public class Withdrawal {

Scanner scanner = new Scanner(System.in);
    public void enterWithdrawalAmount() {
        System.out.println("ENTER YOUR AMOUNT :");
        int amount = scanner.nextInt();
        int balance = Utils.bal - amount;
        System.out.println(balance);
        balance = Utils.bal;


    }
}
