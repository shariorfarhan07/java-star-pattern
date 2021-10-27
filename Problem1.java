import java.util.Scanner;
public class Problem1{
    public static  void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
       int a =sc.nextInt();
       for(int c=1;c<=a;c++){
        System.out.print('*');
       }
      sc.close();
    }
}