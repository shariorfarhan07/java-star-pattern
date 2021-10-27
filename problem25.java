import java.util.Scanner;
public class problem25{
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a =sc.nextInt();
        for(int l=1;l<=a;l++){
            for(int i=1;i<=a-l;i++){
                System.out.print(' ');
            }
            int c;
            for( c=1;c<=l;c++){
                System.out.print(c);
            }c-=2;
            while(c>0){
                System.out.print(c);
                c--;
            }
            System.out.println(); 
        }
        
    }
}