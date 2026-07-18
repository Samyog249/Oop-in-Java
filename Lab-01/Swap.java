
public class Swap {

    public static void main(String[] args) {
        int a = 20, b = 30;
        System.out.println("The value of a is " + a + " and b is " + b + " before Swaping.");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("The value of a is " + a + " and b is " + b + " after Swaping.");
    }
}
