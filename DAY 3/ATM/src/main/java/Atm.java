import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuOptions menuObj = new MenuOptions(scanner);

        Utils.welcomeMessage();
        Utils.pin = Utils.enterYourPin(scanner);

        if (Utils.pin != Utils.arunPin || Utils.pin != Utils.kumarPin) {
            System.out.println("INVALID PIN!!!");
            System.exit(0);
        }
        while (true) {
            menuObj.displayMenu();
            int userChoice = menuObj.getUserOption();
            if (userChoice == 1) {
                Withdrawal withDrawal = new Withdrawal(scanner);
                int amount = withDrawal.enterWithdrawalAmount();
                int newBalance = Utils.balance - amount;
                if (newBalance < 0) {
                    System.out.println("INSUFFICIENT BALANCE");
                } else {
                    Utils.balance = newBalance;
                    Utils.showBalance(newBalance);
                }
            } else if (userChoice == 2) {
                Credit credit = new Credit(scanner);
                int amount = credit.enterCreditAmount();
                int newBalance = Utils.balance + amount;
                Utils.showBalance(newBalance);
                credit.enterCreditAmount();
            } else if (userChoice == 3) {
                Utils.showBalance(Utils.balance);
            } else if (userChoice == 4) {
                System.out.println("Exit!!!");
                System.exit(0);
            } else {
                System.out.println("INVALID!!!");
            }

        }
    }
}

