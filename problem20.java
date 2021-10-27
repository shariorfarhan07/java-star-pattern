import java.util.Scanner;
public class problem20{
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        int line =sc.nextInt();
        for(int l=1;l<=line;l++){
            for(int c=1;c<line*2;c++){ 
                if(line==l||c==line-l+1||c==l+line-1){
                    System.out.print('*');
                }else{
                    System.out.print(' ');
                }
               
            } 
            System.out.println();
        }
    }
}