import java.util.Scanner;
public class problem5{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of row:");
        int r =sc.nextInt();
        
        for(int c=1;c<=r;c++){
            for(int s=1;s<=c;s++){
                System.out.print('*');
            }
            System.out.println();
        }
    sc.close();
    }
}