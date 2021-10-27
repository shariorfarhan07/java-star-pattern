import java.util.Scanner;
public class  task8{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int a =sc.nextInt();
        for(int lineCount=1;lineCount<=a;lineCount++){
            for(int space=1;space<=a-lineCount;space++){
                System.out.print(' ');
            }
            for(int number=1;number<=lineCount;number++){
                System.out.print(number);
            }
            System.out.println();
        }
        sc.close();
    }
}