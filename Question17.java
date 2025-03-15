import java.util.*;
public class Question17 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the student id:");
        int stuid=sc.nextInt();
        System.out.println("Enter the mark:");
        int marks=sc.nextInt();
        for(int i=0;i<=5;i++);
        if(marks>=90)
        {
            System.out.println("Grade:A");
        }
        else if(marks>=75)
        {
            System.out.println("Grade:B");
        }
        else if(marks>=50)
        {
            System.out.println("Grade:C");
        }
        else
        {
            System.out.println("Grade:F");
        }
        


        
    }
}
