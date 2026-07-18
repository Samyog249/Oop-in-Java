import java.util.Scanner;
public class Student {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.print("Enter name: ");
String name = sc.nextLine();
System.out.print("Enter age: ");
int age = sc.nextInt();
System.out.print("Enter GPA: ");
double GPA = sc.nextDouble();
System.out.println("Name: "+name);
System.out.println("Age: "+age);
System.out.println("GPA: "+GPA);
}
}