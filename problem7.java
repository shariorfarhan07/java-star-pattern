import java.util.Scanner;
public class problem7{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        int a =sc.nextInt();
        for(int lc=1;lc<=a;lc++){
            for(int c=1;c<=a-lc;c++){
                System.out.print(' ');
                
            }
            for(int c=1;c<=lc;c++){
                System.out.print('*');
            }
            System.out.println();
        }
        sc.close();    
    }
}