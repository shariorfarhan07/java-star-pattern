import java.util.Scanner;
public class problem10{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int line=sc.nextInt();
        for(int l=1;l<=line;l++){  //line 
            for(int space=1;space<=line-l;space++){ // Space
                System.out.print(' ');
            }
            for(int number=1;number<=2*l-1;number++){  //number
                System.out.print(number);
            }
            System.out.println();
        }
        sc.close();
        
    }
}