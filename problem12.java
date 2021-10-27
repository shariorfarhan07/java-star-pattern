import java.util.Scanner;
public class problem12{
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number" );
        int line=sc.nextInt();
        for(int l=1;l<=line;l++){
            for(int space=1;space<=line-l;space++){
                System.out.print(' ');
            }
            for(int star=1;star<=2*l-1;star++){
                System.out.print('*');
            }
            System.out.println();
        }
        for(int l=line-1;l>0;l--){
            for(int space=1;space<=line-l;space++){
                System.out.print(' ');
            }
            for(int star=1;star<=2*l-1;star++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}