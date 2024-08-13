import java.util.Scanner;
public class lec2 {
    public static void main(String[] args){
        //Type conversion
        //Conversion int to float. It happens when dest type > source type. For eg. float>int
        Scanner input=new Scanner(System.in);
        float num1= input.nextFloat();
        float num2= input.nextFloat();

        float num3=num1+num2;

        System.out.println("Sum= "+num3);

        //Type casting
        // conversion of one var to another
        //num3 which is float is shown as integer

        int num=(int)(num3);
        System.out.print("Sum which was as float before is not int "+num);

    }

}
