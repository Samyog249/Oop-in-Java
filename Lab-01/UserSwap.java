
import java.util.Scanner;

public class UserSwap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second number: ");
        int b = sc.nextInt();
        System.out.println("The value of a is " + a + " and b is " + b + " before Swaping.");
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("The value of a is " + a + " and b is " + b + " after Swaping.");
    }
}
