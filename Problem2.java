import java.util.Scanner;
public class Problem2{
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number of row");
        int b =sc.nextInt();
        
        System.out.println("Enter a number of column");
        int a =sc.nextInt();
        
        for(int N=1;N<=b;N++){
            for(int c=1;c<=a;c++){
                System.out.print('*');
            } 
            System.out.println();
        }
        sc.close();
        
    }
}

