import java.util.Scanner;
public class problem16{
    public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int line=sc.nextInt();
    for(int l=1;l<=line;l++){
        for(int star=1;star<=line;star++){
            if(l==star||star==1||l==line){ 
                System.out.print('*');
            } else{
               System.out.print(' ');
            }
        }
        System.out.println();
    }
    
    }
}