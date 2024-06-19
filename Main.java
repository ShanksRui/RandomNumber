package Application;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int randomN = (int) (Math.random()* 11); 
        
        System.out.print("Enter a number between 0 and 10: ");
        int number = sc.nextInt();
        int i = 0;
        while (number != randomN) {
            if (number < randomN) {
                System.out.println("Up number");
            } else if (number > randomN) {
                System.out.println("Down number");
            }
             i++;
            System.out.print("Wrong number, enter a new number: ");
            number = sc.nextInt();
        }
        System.out.println("wrong numbers entered "+i);
        System.out.println("Successful! The number was " + randomN);
        sc.close();
    }
}
