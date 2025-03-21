
import java.util.*;

public class practical24 extends Thread {
    public void run() {
        try {
            int num;
            System.out.println("Enter number : ");
            Scanner s = new Scanner(System.in);
            num = s.nextInt();
            if (num == 2 || num == 3 || num == 5 || num % 2 != 0 && num % 3 != 0 && num % 5 != 0) {
                System.out.println("Number is prime");
            } else {
                System.out.println("Number is not prime");
                Thread.sleep(500);
            }
        } catch (Exception e) {
        };
    }   
}
class prime{
    public static void main(String[] args) {
        new practical24().start();
    }
}
