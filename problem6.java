import java.util.Scanner;
public class problem6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of row");
        int r=sc.nextInt();
        
        for(int b=1;b<=r;b++){
            for(int c=1;c<=b;c++){
                System.out.print(c);
            }
            System.out.println();
        }
        sc.close();
    }
}