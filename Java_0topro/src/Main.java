import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Hello Student");
//        System.out.println("Press 1: Factorial");
//        System.out.println("Press 2: Armstrong");
//        System.out.println("Press 3: Palindrome");
//        System.out.println("Press 4: Prime");
//        System.out.println("Press 5: Fib series");
//
//        int menu=in.nextInt();
        int x=0;
        do {
            System.out.println("Hello Student");
            System.out.println("Press 1: Factorial");
            System.out.println("Press 2: Armstrong");
            System.out.println("Press 3: Palindrome");
            System.out.println("Press 4: Prime");
            System.out.println("Press 5: Fib series");
            int menu=in.nextInt();
            switch (menu) {

                case 1:
                    System.out.print("Enter the number whose fact you want to find");
                    int num = in.nextInt();
                    System.out.println("FActorial of the number is: " + fact(num));
                    break;
                case 2:
                    System.out.println("Enter the number to check wether armstrong or not");
                    int arm = in.nextInt();
                    armstrong(arm);
                    break;
                case 3:
                    System.out.println("Enter number to find its Palindrome");
                    int rev = in.nextInt();
                    System.out.println("Palindrome is: " + palindrome(rev));
                    break;
                case 4:
                    System.out.println("Enter number to check wether prime or not ");
                    int prime = in.nextInt();
                    prime(prime);
                    break;
                case 5:
                    System.out.println("Enter number to find fib");
                    int fi = in.nextInt();
                    fib(fi);
                    break;
                default:
                    System.out.println("Please enter valid input");
            }
            System.out.println("Press 1 to continue else any other key to exit ");
            x=in.nextInt();
        }
        while(x==1);

    }

    static int fact(int a) {
        if (a == 0) {
            return 1;
        } else {
            return a * fact(a - 1);
        }
    }

    static void armstrong(int num) {
        int ognum=num;
        int num1, rev = 0;
        while (num > 0) {
            num1 = num % 10;
            rev = rev * 10 + num1;
            num /= 10;

        }
        if(ognum==rev){
            System.out.println("It is armstrong");
        }
        else {
            System.out.println("It is not armstrong");
        }

    }

    static int palindrome(int num) {
        int num1, rev = 0;
        while (num > 0) {
            num1 = num % 10;
            rev = rev * 10 + num1;
            num /= 10;

        }
        return rev;
    }
    static void prime(int num){
        int c=2;
        while(c<num){
            if(num%c==0){
                System.out.println("The number is not prime");
            }
            c=c+1;
            break;
        }
        System.out.println("THe number is prime ");

    }
    static void fib(int n) {
        int a = 0;
        int b = 1;
        int fib;

        if (n > 0) {
            System.out.print(a); // print the first number

            for (int i = 1; i <= n; i++) {
                System.out.print(" " + b); // print the next number
                fib = a + b;
                a = b;
                b = fib;
            }
            System.out.println(); // add a newline after printing the sequence
        }
    }
}