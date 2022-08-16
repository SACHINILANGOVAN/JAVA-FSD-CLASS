import java.util.Scanner;

public class Calculations {

    public int add() {
        Scanner scanner = new Scanner(System.in);
        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();
        return numOne + numTwo;
    }

    public int sub() {
        Scanner scanner = new Scanner(System.in);
        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();
        return numOne - numTwo;
    }

    public int mul() {
        Scanner scanner = new Scanner(System.in);
        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();
        return numOne * numTwo;
    }

    public int div() {
        Scanner scanner = new Scanner(System.in);
        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();
        return numOne / numTwo;
    }

    public int mod() {
        Scanner scanner = new Scanner(System.in);
        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();
        return numOne % numTwo;
    }
}
