import java.util.*;
public class Question3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Select the type of cofee");
        int coffee=sc.nextInt();
        //System.out.println("Select the type of cofee");
        switch(coffee)
        {
            case 1:
            System.out.println("Cold coffee");
            break;
            case 2:
            System.out.println("Hot coffee");
            break;
            case 3:
            System.out.println("Ice coffee");
            break;
            case 4:
            System.out.println("Hot chocolate");
            break;
            case 5:
            System.out.println("Cappacino");
            default:
            System.out.println("No item available");
    }
    }
}
