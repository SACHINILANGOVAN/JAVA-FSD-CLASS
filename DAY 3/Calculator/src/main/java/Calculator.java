import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculations calculations = new Calculations();
        Menu menuObj = new Menu();
        menuObj.displayMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your choice :");
        int choice = scanner.nextInt();
        if (choice > 0 || choice <= 5) {
            switch (choice) {
                case 1:
                    int result = calculations.add();
                    System.out.println("addition = " + result);
                    break;
                case 2:
                    result = calculations.sub();
                    System.out.println("subraction = " + result);
                    break;
                case 3:
                    result = calculations.mul();
                    System.out.println("multiplication = " + result);
                    break;
                case 4:
                    result = calculations.div();
                    System.out.println("division = " + result);
                    break;
                case 5:
                    result = calculations.mod();
                    System.out.println("modulous = " + result);
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("Invalid");
        }

    }
}

