import java.util.Scanner;
public class fib {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.println("Please enter till where you want to print the fib numbers: ");
        int n=in.nextInt();
        System.out.println(0);
        for(int i=2;i<n;i++){
            int ans= a+b;
            a=b;
            b=ans;
            System.out.println(ans);
        }
    }
}
