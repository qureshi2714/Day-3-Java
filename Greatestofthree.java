import java.util.*;
public class Greatestofthree{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if((a>b)&&(a>c)){
            System.out.println("a is greater number");
        }
        else if((b>a)&&(b>c)){
            System.out.println("b is greater number");
        }
        else{
            System.out.println("c is greater number");
        }
    }
}
