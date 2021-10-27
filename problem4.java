import java.util.Scanner;
public class problem4{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter row number:");
    int r=sc.nextInt();
    System.out.print("Enter number");
    int a=sc.nextInt();
    for(int t=1;t<=r;t++){
        for(int c=1;c<=a;c++){
        System.out.print(c);
        }
        System.out.println();
    }
    sc.close();
    
    }
}