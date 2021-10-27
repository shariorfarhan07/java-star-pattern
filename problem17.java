import java.util.Scanner;
public class problem17{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        int line =sc.nextInt();
        
        for(int l=1;l<=line;l++){
            for(int number=1;number<=line;number++){
                if(number==l||number==1||line==l){
                    System.out.print(number);}
                else{System.out.print(' ');}
            }
            System.out.println();
        }
    }
}