import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Commands commands = new Commands();
        commands.displayainenu();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("ENTER YOUR CHOICE");
            int choice = scanner.nextInt();
            if (choice == 1) {
                Withdrawal withdrawal = new Withdrawal();
                withdrawal.enterWithdrawalAmount();
                commands.displayainenu();
            } else if (choice == 2) {
                Credit credit = new Credit();
                credit.enterCreditAmount();
                commands.displayainenu();
            } else if (choice == 3) {
                CheckBalance checkBalance = new CheckBalance();
                checkBalance.enterCheckBalance(5000);
                commands.displayainenu();
            } else if (choice == 4) {
                System.exit(0);
            } else {
                System.out.println("!!!INVALID!!!");
            }
        }
    }
}
