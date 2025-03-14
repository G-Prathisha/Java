public class Vowles {
    public static void main(String[]args){
        String name="Prathisha";
        if(name !=null && !name.isEmpty())
        {
            char firstChar = Character.toLowerCase(name.charAt(0));
            if("aeiou".indexOf(firstChar) != -1)
            {
                System.out.println("Starts with a vowel");
            }
            else
            {
                System.out.println("Does not Start with a vowel");
            }
         } else
            {
                System.out.println("String is Empty or null");
            }
            
       }
    }



