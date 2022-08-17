import java.util.Scanner;

public class Credit {
    public Scanner scanner;

    public Credit(Scanner scanner) {
        this.scanner = scanner;
    }

    public int enterCreditAmount() {
        System.out.println("ENTER THE AMOUNT: ");
        return scanner.nextInt();
    }
}
