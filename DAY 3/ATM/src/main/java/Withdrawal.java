import java.util.Scanner;

public class Withdrawal {

    private Scanner scanner;

    public Withdrawal(Scanner scanner) {
        this.scanner = scanner;
    }

    public int enterWithdrawalAmount() {
        System.out.println("ENTER THE AMOUNT: ");
        return scanner.nextInt();

    }
}
