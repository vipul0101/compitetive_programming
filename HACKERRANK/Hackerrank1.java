package HACKERRANK;
import java.util.Scanner;
public class Hackerrank1 {
    public static void main(String[] args) {
        //// TODO Auto-generated method stub

        System.out.println("Enter your name:");
        Scanner scan = new Scanner(System.in);
        String name="";

        name+=scan.nextLine();
        scan.close();

        System.out.println("Your name is :"+name);

    }
}
