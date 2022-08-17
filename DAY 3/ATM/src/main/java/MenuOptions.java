import java.util.Scanner;

public class MenuOptions {
    private Scanner scanner;

    public MenuOptions(Scanner scanner) {
        this.scanner = scanner;
    }

    public void displayMenu() {
        System.out.println("1.Withdrawal");
        System.out.println("2.Credit");
        System.out.println("3.Check Balance");
        System.out.println("4.Exit");
    }

    public int getUserOption() {
        return scanner.nextInt();
    }
}
