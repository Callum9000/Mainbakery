package factoryClass;

public class croissant implements productType{
    @Override
    public void create(){
        System.out.println("inside croissant::pastryType() method");
    }
}
