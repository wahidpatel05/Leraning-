import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number between 1 to 7: ");
        int a=in.nextInt();
        switch (a){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Pls enter a valid number");
        }
    }
}
