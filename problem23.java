import java.util.Scanner;
public class problem23{
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        int line =sc.nextInt();
        for(int l=1;l<=line;l++){
            int c=1,i=1;
            while(c<line*2){ 
                
                if(c==line-l+1||c==l+line-1){
                    System.out.print(i);
                    
                }else{
                    System.out.print(' ');
                    
                } if(line-l+1<=c){
                    i++;
                }
                c++;} 
            System.out.println();
        }
            for(int l=line-1;l>0;l--){
            int c=1,i=1;
            while(c<line*2){ 
                
                if(c==line-l+1||c==l+line-1){
                    System.out.print(i);
                    
                }else{
                    System.out.print(' ');
                    
                } if(line-l+1<=c){
                    i++;
                }
                c++;} 
            System.out.println();
        }
    }
}