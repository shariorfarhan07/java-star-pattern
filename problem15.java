import java.util.Scanner;
public class problem15{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 number");
        int line =sc.nextInt();
        int row  =sc.nextInt();
        for(int l=1;l<=line;l++){  //line
            for(int number=1;number<=row;number++){
                if((l==1||l==line)||(number==1||number==row)){ 
                    System.out.print(number);
                }else{
                   System.out.print(' ');
                }
            }
                
            System.out.println();
        }
    }
}