class Animals{
    public void runs(){
        System.out.println("Character of the animal");
    }
}
class dog extends Animals{
    public void runs()
    {
        System.out.println("Dog barks");
    }
}
class cat extends Animals{
    public void runs()
    {
        System.out.println("cat meows");
    }
}
public class exampleinherit1{
    public static void main(String[]args){
        Animals Animals=new Animals();
        dog dog=new dog();
        cat cat=new cat();
        Animals.runs();
        dog.runs();
        cat.runs();    
    }
}
