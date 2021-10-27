import java.util.Scanner;
public class Problem24{
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a =sc.nextInt();
        int c;
        for( c=1;c<=a;c++){
            System.out.print(c);
        }c-=2;
        while(c>0){
            System.out.print(c);
            c--;
        }
        sc.close();
    }
}