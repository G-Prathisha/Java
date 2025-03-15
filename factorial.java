import java.util.*;
public class factorial{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        sc.close();
        long factorial=1;
        for(int i=1;i<n;i++)
        {
            factorial*=1;
        }
        System.out.println("Factorial of "+n+"is:"+factorial);
    }
}

