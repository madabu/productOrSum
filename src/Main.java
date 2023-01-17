import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello! If you give me a number (n) I will give you the option to calculate the sum from 1 to the number (n) or the product of 1,...,n.");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        System.out.println("Ready? Give me your number: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("What do you want to know?" + "\n" +
                "1. The sum." + "\n" +
                "2. The product.");
        int choice = sc.nextInt();

        int sum = 0;
        int product = 1;

        if (choice == 1){
            for (int i = 0;i <= n; i++){
                sum += i;}
            System.out.println("The sum is: " + sum);
            } else {
            for (int i = 1; i <= n; i++){
                product *= i;}
            System.out.println("The product is: " + product);
        }


        }

    }

