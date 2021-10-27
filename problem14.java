import java.util.Scanner;
public class problem14{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 number");
        int line =sc.nextInt();
        int row  =sc.nextInt();
        for(int l=1;l<=line;l++){  //line
            for(int star=1;star<=row;star++){
                if((l==1||l==line)||(star==1||star==row)){ 
                    System.out.print('*');
                }else{
                   System.out.print(' ');
                }
            }
                
            System.out.println();
        }
    }
}