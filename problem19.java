import java.util.Scanner;
public class problem19{
    public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int line=sc.nextInt();
    for(int l=1;l<=line;l++){
        for(int star=1;star<=line;star++){
            if(l==line||star==line||l==line-star+1){
            System.out.print(star);
            }else{
             System.out.print(' ');
            }
        
        }
        System.out.println();
    }
    }
}