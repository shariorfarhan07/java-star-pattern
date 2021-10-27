import java.util.Scanner;
public class problem13{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int line =sc.nextInt();
        for(int l=1;l<=line;l++){
            for(int space=1;space<=line-l;space++){
                System.out.print(' ');
            }
            for(int number=1;number<=2*l-1;number++){
                System.out.print(number);
            }
            System.out.println();
        }
         for(int l=line-1;l>0;l--){
            for(int space=1;space<=line-l;space++){
                System.out.print(' ');
            }
            for(int number=1;number<=2*l-1;number++){
                System.out.print(number);
            }
            System.out.println();
        }
        
    }
}