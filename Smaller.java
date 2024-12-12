import java.util.*;
public class Smaller{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if((a<b)&&(a<c)){
            System.out.println("a is smaller");
        }
        else if((b<c)&&(a<c)){
            System.out.println("b is smaller");
        }
        else if((c<b)&&(c<a)){
            System.out.println("c is smaller");
        }
    }
}