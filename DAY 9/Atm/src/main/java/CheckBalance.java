import java.util.Scanner;

public class CheckBalance {

    public void enterCheckBalance(int i){

        Scanner scanner = new Scanner(System.in);
        Utils utils = new Utils();
        utils.valid();
        int bal = Utils.bal;
        System.out.println(bal);


    }
}
