import java.util.Scanner;
public class problem11{
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int line =sc.nextInt();
        for(int l=1;l<=line;l++){
            for(int space=1;space<=line-l;space++){
            System.out.print(' ');
            }
            for(int number=line-l+1;number<=line;number++){
            System.out.print(number);
            }
            System.out.println();
        }
    
    }
}