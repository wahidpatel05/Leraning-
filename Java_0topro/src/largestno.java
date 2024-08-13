import java.util.Scanner;
public class largestno {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter 3 number to find the largest: ");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        int max=a;

        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println("Largest of 3 number is: "+max);
    }
}
